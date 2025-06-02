package poc;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

@Configuration
@EnableJpaRepositories
@SpringBootApplication
@ComponentScan(basePackages = {"poc"})
@EnableTransactionManagement
public class Config {

	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    
	    //SQLServerDataSource ds = new SQLServerDataSource();
	    //ds.setURL("jdbc:sqlserver:Server=localhost;Database=jpapoc;Trusted_Connection=True;user=test;password=testpwd");
	    
	    dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    dataSource.setUsername("test");
	    dataSource.setPassword("testpwd");
	    dataSource.setUrl("jdbc:sqlserver:Server=localhost;Database=jpapoc;Trusted_Connection=True;"); 
	    
	    return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setDatabase(Database.SQL_SERVER);
		vendorAdapter.setGenerateDdl(true);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		//factory.setPackagesToScan(getClass().getPackage().getName());
		factory.setDataSource(dataSource());
		
		factory.setPersistenceXmlLocation("persistence.xml");

		return factory;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {

		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return txManager;
	}
}

package demo;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationExtensionsKt;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import poc.County;
import poc.CountyRepository;

@Transactional
@SpringBootTest
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CountyTest {
	
	@Autowired private DataSource dataSource;
	@Autowired private JdbcTemplate jdbcTemplate;
	@Autowired private EntityManager entityManager;
	@Autowired private CountyRepository repo;
	
	@Test
	public void findById() {
		County c =  repo.findById(Integer.valueOf(13)).get();
		
		Assert.assertNotNull(c);
		Assert.assertEquals("Dane", c.getName());
	}

}

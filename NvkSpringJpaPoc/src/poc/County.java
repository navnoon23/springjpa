package poc;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class County extends AbstractEntity{
	
	@Column(name="code")
	private String code, name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

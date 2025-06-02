package poc;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Offering extends AbstractEntity{
	
	@Column(name="code")
	private String code;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

package poc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OfferingDetail extends AbstractEntity{

	@OneToOne()
	@JoinColumn(name="offeringId")
	private Offering offering;
	
	@OneToOne()
	@JoinColumn(name="countyId")
	private County county;
	
	@OneToOne()
	@JoinColumn(name="statusId")
	private Status status;
	
	@OneToOne()
	@JoinColumn(name="directorId")
	private Director director;
	
	@Column(name="year")
	private int year;

	public Offering getOffering() {
		return offering;
	}

	public void setOffering(Offering offering) {
		this.offering = offering;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

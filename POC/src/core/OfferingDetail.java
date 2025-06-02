package core;

public class OfferingDetail {

	private int id;
	private int offeringId;
	private int countyId;
	private int statusId;
	private int directorId;
	private int year;
	
	public OfferingDetail() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(int offeringId) {
		this.offeringId = offeringId;
	}

	public int getCountyId() {
		return countyId;
	}

	public void setCountyId(int countyId) {
		this.countyId = countyId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
}

package com.redhat.cajun.navy.rules.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Incident implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;

	private Integer reporterId;
	
	private BigDecimal latitude;
	
	private BigDecimal longitude;
	
	private Integer numPeople;
	
	private Boolean medicalNeeded;
	
	private ZonedDateTime reportedTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public Integer getNumPeople() {
		return numPeople;
	}
	
	public void setNumPeople(Integer numPeople) {
		this.numPeople = numPeople;
	}
	
	public Boolean getMedicalNeeded() {
		return medicalNeeded;
	}
	
	public void setMedicalNeeded(Boolean medicalNeeded) {
		this.medicalNeeded = medicalNeeded;
	}
	
    public Integer getReporterId() {
        return reporterId;
    }

    public void setReporterId( Integer reporterId ) {
        this.reporterId = reporterId;
    }

    public ZonedDateTime getReportedTime() {
        return reportedTime;
    }

    public void setReportedTime( ZonedDateTime reportedTime ) {
        this.reportedTime = reportedTime;
    }

    @Override
	public String toString() {
		return "Incident [id=" + id + ", reporterId=" + reporterId + ", latitude=" + latitude + ", longitude="
				+ longitude + ", numPeople=" + numPeople + ", medicalNeeded=" + medicalNeeded + ", reportedTime="
				+ reportedTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((medicalNeeded == null) ? 0 : medicalNeeded.hashCode());
		result = prime * result + ((numPeople == null) ? 0 : numPeople.hashCode());
		result = prime * result + ((reportedTime == null) ? 0 : reportedTime.hashCode());
		result = prime * result + ((reporterId == null) ? 0 : reporterId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incident other = (Incident) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (medicalNeeded == null) {
			if (other.medicalNeeded != null)
				return false;
		} else if (!medicalNeeded.equals(other.medicalNeeded))
			return false;
		if (numPeople == null) {
			if (other.numPeople != null)
				return false;
		} else if (!numPeople.equals(other.numPeople))
			return false;
		if (reportedTime == null) {
			if (other.reportedTime != null)
				return false;
		} else if (!reportedTime.equals(other.reportedTime))
			return false;
		if (reporterId == null) {
			if (other.reporterId != null)
				return false;
		} else if (!reporterId.equals(other.reporterId))
			return false;
		return true;
	}
}
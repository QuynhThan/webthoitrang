package com.websitethoitrang.entities;
// Generated Dec 6, 2022, 2:28:47 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CtpnId generated by hbm2java
 */
@Embeddable
public class CtpnId implements java.io.Serializable {

	private String mapn;
	private String mamh;

	public CtpnId() {
	}

	public CtpnId(String mapn, String mamh) {
		this.mapn = mapn;
		this.mamh = mamh;
	}

	@Column(name = "MAPN", nullable = false, length = 10)
	public String getMapn() {
		return this.mapn;
	}

	public void setMapn(String mapn) {
		this.mapn = mapn;
	}

	@Column(name = "MAMH", nullable = false, length = 10)
	public String getMamh() {
		return this.mamh;
	}

	public void setMamh(String mamh) {
		this.mamh = mamh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CtpnId))
			return false;
		CtpnId castOther = (CtpnId) other;

		return ((this.getMapn() == castOther.getMapn()) || (this.getMapn() != null && castOther.getMapn() != null
				&& this.getMapn().equals(castOther.getMapn())))
				&& ((this.getMamh() == castOther.getMamh()) || (this.getMamh() != null && castOther.getMamh() != null
						&& this.getMamh().equals(castOther.getMamh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMapn() == null ? 0 : this.getMapn().hashCode());
		result = 37 * result + (getMamh() == null ? 0 : this.getMamh().hashCode());
		return result;
	}

}

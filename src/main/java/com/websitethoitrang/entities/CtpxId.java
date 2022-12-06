package com.websitethoitrang.entities;
// Generated Dec 6, 2022, 2:28:47 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CtpxId generated by hbm2java
 */
@Embeddable
public class CtpxId implements java.io.Serializable {

	private String mapx;
	private String mamh;

	public CtpxId() {
	}

	public CtpxId(String mapx, String mamh) {
		this.mapx = mapx;
		this.mamh = mamh;
	}

	@Column(name = "MAPX", nullable = false, length = 10)
	public String getMapx() {
		return this.mapx;
	}

	public void setMapx(String mapx) {
		this.mapx = mapx;
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
		if (!(other instanceof CtpxId))
			return false;
		CtpxId castOther = (CtpxId) other;

		return ((this.getMapx() == castOther.getMapx()) || (this.getMapx() != null && castOther.getMapx() != null
				&& this.getMapx().equals(castOther.getMapx())))
				&& ((this.getMamh() == castOther.getMamh()) || (this.getMamh() != null && castOther.getMamh() != null
						&& this.getMamh().equals(castOther.getMamh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMapx() == null ? 0 : this.getMapx().hashCode());
		result = 37 * result + (getMamh() == null ? 0 : this.getMamh().hashCode());
		return result;
	}

}
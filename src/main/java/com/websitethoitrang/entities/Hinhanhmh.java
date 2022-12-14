package com.websitethoitrang.entities;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Hinhanhmh generated by hbm2java
 */
@Entity
@Table(name = "hinhanhmh", catalog = "thoitrang")
public class Hinhanhmh implements java.io.Serializable {

	private String maha;
	private Mathang mathang;
	private String duongdan;

	public Hinhanhmh() {
	}

	public Hinhanhmh(String maha, Mathang mathang) {
		this.maha = maha;
		this.mathang = mathang;
	}

	public Hinhanhmh(String maha, Mathang mathang, String duongdan) {
		this.maha = maha;
		this.mathang = mathang;
		this.duongdan = duongdan;
	}

	@Id

	@Column(name = "MAHA", unique = true, nullable = false, length = 10)
	public String getMaha() {
		return this.maha;
	}

	public void setMaha(String maha) {
		this.maha = maha;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAMH", nullable = false)
	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	@Column(name = "DUONGDAN", length = 100)
	public String getDuongdan() {
		return this.duongdan;
	}

	public void setDuongdan(String duongdan) {
		this.duongdan = duongdan;
	}

}

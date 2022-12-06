package com.websitethoitrang.entities;
// Generated Dec 6, 2022, 2:28:47 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Ctpn generated by hbm2java
 */
@Entity
@Table(name = "ctpn", catalog = "thoitrang")
public class Ctpn implements java.io.Serializable {

	private CtpnId id;
	private Mathang mathang;
	private Phieunhap phieunhap;
	private int soluong;
	private int dongia;

	public Ctpn() {
	}

	public Ctpn(CtpnId id, Mathang mathang, Phieunhap phieunhap, int soluong, int dongia) {
		this.id = id;
		this.mathang = mathang;
		this.phieunhap = phieunhap;
		this.soluong = soluong;
		this.dongia = dongia;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "mapn", column = @Column(name = "MAPN", nullable = false, length = 10)),
			@AttributeOverride(name = "mamh", column = @Column(name = "MAMH", nullable = false, length = 10)) })
	public CtpnId getId() {
		return this.id;
	}

	public void setId(CtpnId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAMH", nullable = false, insertable = false, updatable = false)
	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAPN", nullable = false, insertable = false, updatable = false)
	public Phieunhap getPhieunhap() {
		return this.phieunhap;
	}

	public void setPhieunhap(Phieunhap phieunhap) {
		this.phieunhap = phieunhap;
	}

	@Column(name = "SOLUONG", nullable = false)
	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Column(name = "DONGIA", nullable = false)
	public int getDongia() {
		return this.dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

}

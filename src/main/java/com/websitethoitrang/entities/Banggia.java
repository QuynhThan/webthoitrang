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
 * Banggia generated by hbm2java
 */
@Entity
@Table(name = "banggia", catalog = "thoitrang")
public class Banggia implements java.io.Serializable {

	private BanggiaId id;
	private Mathang mathang;
	private Nhanvien nhanvien;
	private int giamoi;

	public Banggia() {
	}

	public Banggia(BanggiaId id, Mathang mathang, Nhanvien nhanvien, int giamoi) {
		this.id = id;
		this.mathang = mathang;
		this.nhanvien = nhanvien;
		this.giamoi = giamoi;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "mamh", column = @Column(name = "MAMH", nullable = false, length = 10)),
			@AttributeOverride(name = "manv", column = @Column(name = "MANV", nullable = false, length = 10)),
			@AttributeOverride(name = "ngayapdung", column = @Column(name = "NGAYAPDUNG", nullable = false, length = 10)) })
	public BanggiaId getId() {
		return this.id;
	}

	public void setId(BanggiaId id) {
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
	@JoinColumn(name = "MANV", nullable = false, insertable = false, updatable = false)
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Column(name = "GIAMOI", nullable = false)
	public int getGiamoi() {
		return this.giamoi;
	}

	public void setGiamoi(int giamoi) {
		this.giamoi = giamoi;
	}

}
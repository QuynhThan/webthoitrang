package com.websitethoitrang.entities;
// Generated Dec 6, 2022, 2:28:47 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Khachhang generated by hbm2java
 */
@Entity
@Table(name = "khachhang", catalog = "thoitrang", uniqueConstraints = { @UniqueConstraint(columnNames = "EMAIL"),
		@UniqueConstraint(columnNames = "MASOTHUE"), @UniqueConstraint(columnNames = "SDT"),
		@UniqueConstraint(columnNames = "SOCMND") })
public class Khachhang implements java.io.Serializable {

	private String makh;
	private String hotenkh;
	private String socmnd;
	private Boolean gioitinh;
	private Date ngaysinh;
	private String diachi;
	private String sdt;
	private String email;
	private String masothue;
	private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);
	private Set<Phieudat> phieudats = new HashSet<Phieudat>(0);
	private Set<Taikhoan> taikhoans = new HashSet<Taikhoan>(0);

	public Khachhang() {
	}

	public Khachhang(String makh, String hotenkh, String socmnd, Date ngaysinh, String diachi, String sdt, String email,
			String masothue) {
		this.makh = makh;
		this.hotenkh = hotenkh;
		this.socmnd = socmnd;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.masothue = masothue;
	}

	public Khachhang(String makh, String hotenkh, String socmnd, Boolean gioitinh, Date ngaysinh, String diachi,
			String sdt, String email, String masothue, Set<Hoadon> hoadons, Set<Phieudat> phieudats,
			Set<Taikhoan> taikhoans) {
		this.makh = makh;
		this.hotenkh = hotenkh;
		this.socmnd = socmnd;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.masothue = masothue;
		this.hoadons = hoadons;
		this.phieudats = phieudats;
		this.taikhoans = taikhoans;
	}

	@Id

	@Column(name = "MAKH", unique = true, nullable = false, length = 10)
	public String getMakh() {
		return this.makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	@Column(name = "HOTENKH", nullable = false, length = 50)
	public String getHotenkh() {
		return this.hotenkh;
	}

	public void setHotenkh(String hotenkh) {
		this.hotenkh = hotenkh;
	}

	@Column(name = "SOCMND", unique = true, nullable = false, length = 15)
	public String getSocmnd() {
		return this.socmnd;
	}

	public void setSocmnd(String socmnd) {
		this.socmnd = socmnd;
	}

	@Column(name = "GIOITINH")
	public Boolean getGioitinh() {
		return this.gioitinh;
	}

	public void setGioitinh(Boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NGAYSINH", nullable = false, length = 10)
	public Date getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	@Column(name = "DIACHI", nullable = false, length = 100)
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Column(name = "SDT", unique = true, nullable = false, length = 15)
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Column(name = "EMAIL", unique = true, nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "MASOTHUE", unique = true, nullable = false, length = 15)
	public String getMasothue() {
		return this.masothue;
	}

	public void setMasothue(String masothue) {
		this.masothue = masothue;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachhang")
	public Set<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachhang")
	public Set<Phieudat> getPhieudats() {
		return this.phieudats;
	}

	public void setPhieudats(Set<Phieudat> phieudats) {
		this.phieudats = phieudats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachhang")
	public Set<Taikhoan> getTaikhoans() {
		return this.taikhoans;
	}

	public void setTaikhoans(Set<Taikhoan> taikhoans) {
		this.taikhoans = taikhoans;
	}

}
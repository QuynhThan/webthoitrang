package com.websitethoitrang.entities;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

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
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name = "nhanvien", catalog = "thoitrang", uniqueConstraints = { @UniqueConstraint(columnNames = "EMAIL"),
		@UniqueConstraint(columnNames = "SDT") })
public class Nhanvien implements java.io.Serializable {

	private String manv;
	private String tennv;
	private Boolean gioitinh;
	private Date ngaysinh;
	private String diachi;
	private String sdt;
	private String email;
	private Set<Dondathang> dondathangs = new HashSet<Dondathang>(0);
	private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);
	private Set<Dotkhuyenmai> dotkhuyenmais = new HashSet<Dotkhuyenmai>(0);
	private Set<Phieunhap> phieunhaps = new HashSet<Phieunhap>(0);
	private Set<Phieudat> phieudats = new HashSet<Phieudat>(0);
	private Set<Banggia> banggias = new HashSet<Banggia>(0);
	private Set<Phieuxuat> phieuxuats = new HashSet<Phieuxuat>(0);

	public Nhanvien() {
	}

	public Nhanvien(String manv, String tennv, Date ngaysinh, String diachi, String sdt, String email) {
		this.manv = manv;
		this.tennv = tennv;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}

	public Nhanvien(String manv, String tennv, Boolean gioitinh, Date ngaysinh, String diachi, String sdt, String email,
			Set<Dondathang> dondathangs, Set<Hoadon> hoadons, Set<Dotkhuyenmai> dotkhuyenmais,
			Set<Phieunhap> phieunhaps, Set<Phieudat> phieudats, Set<Banggia> banggias, Set<Phieuxuat> phieuxuats) {
		this.manv = manv;
		this.tennv = tennv;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.dondathangs = dondathangs;
		this.hoadons = hoadons;
		this.dotkhuyenmais = dotkhuyenmais;
		this.phieunhaps = phieunhaps;
		this.phieudats = phieudats;
		this.banggias = banggias;
		this.phieuxuats = phieuxuats;
	}

	@Id

	@Column(name = "MANV", unique = true, nullable = false, length = 10)
	public String getManv() {
		return this.manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	@Column(name = "TENNV", nullable = false, length = 50)
	public String getTennv() {
		return this.tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Dondathang> getDondathangs() {
		return this.dondathangs;
	}

	public void setDondathangs(Set<Dondathang> dondathangs) {
		this.dondathangs = dondathangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Dotkhuyenmai> getDotkhuyenmais() {
		return this.dotkhuyenmais;
	}

	public void setDotkhuyenmais(Set<Dotkhuyenmai> dotkhuyenmais) {
		this.dotkhuyenmais = dotkhuyenmais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Phieunhap> getPhieunhaps() {
		return this.phieunhaps;
	}

	public void setPhieunhaps(Set<Phieunhap> phieunhaps) {
		this.phieunhaps = phieunhaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Phieudat> getPhieudats() {
		return this.phieudats;
	}

	public void setPhieudats(Set<Phieudat> phieudats) {
		this.phieudats = phieudats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Banggia> getBanggias() {
		return this.banggias;
	}

	public void setBanggias(Set<Banggia> banggias) {
		this.banggias = banggias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Phieuxuat> getPhieuxuats() {
		return this.phieuxuats;
	}

	public void setPhieuxuats(Set<Phieuxuat> phieuxuats) {
		this.phieuxuats = phieuxuats;
	}

}

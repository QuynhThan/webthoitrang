package com.websitethoitrang.entities;
// Generated Dec 6, 2022, 2:28:47 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Nhacungcap generated by hbm2java
 */
@Entity
@Table(name = "nhacungcap", catalog = "thoitrang", uniqueConstraints = { @UniqueConstraint(columnNames = "EMAIL"),
		@UniqueConstraint(columnNames = "SDT") })
public class Nhacungcap implements java.io.Serializable {

	private String mancc;
	private String tenncc;
	private String diachi;
	private String email;
	private String sdt;
	private Set<Dondathang> dondathangs = new HashSet<Dondathang>(0);

	public Nhacungcap() {
	}

	public Nhacungcap(String mancc, String tenncc, String diachi, String email, String sdt) {
		this.mancc = mancc;
		this.tenncc = tenncc;
		this.diachi = diachi;
		this.email = email;
		this.sdt = sdt;
	}

	public Nhacungcap(String mancc, String tenncc, String diachi, String email, String sdt,
			Set<Dondathang> dondathangs) {
		this.mancc = mancc;
		this.tenncc = tenncc;
		this.diachi = diachi;
		this.email = email;
		this.sdt = sdt;
		this.dondathangs = dondathangs;
	}

	@Id

	@Column(name = "MANCC", unique = true, nullable = false, length = 10)
	public String getMancc() {
		return this.mancc;
	}

	public void setMancc(String mancc) {
		this.mancc = mancc;
	}

	@Column(name = "TENNCC", nullable = false, length = 500)
	public String getTenncc() {
		return this.tenncc;
	}

	public void setTenncc(String tenncc) {
		this.tenncc = tenncc;
	}

	@Column(name = "DIACHI", nullable = false, length = 100)
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Column(name = "EMAIL", unique = true, nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "SDT", unique = true, nullable = false, length = 15)
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhacungcap")
	public Set<Dondathang> getDondathangs() {
		return this.dondathangs;
	}

	public void setDondathangs(Set<Dondathang> dondathangs) {
		this.dondathangs = dondathangs;
	}

}

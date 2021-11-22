package model;

import java.util.Date;

public class NguoiDung {
	private int id;
	private String ten;
	private Date ngaySinh;
	private String cccd;
	private String diaChi;
	private String username;
	private String password;
	public NguoiDung() {
		super();
	}
	public NguoiDung(int id, String ten, Date ngaySinh, String cccd, String diaChi, String username, String password) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.cccd = cccd;
		this.diaChi = diaChi;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

package model;

import java.util.Date;

public class KhachHang {
	private int id;
	private String ten;
	private Date ngaySinh;
	private String cccd;
	private String sdt;
	private String diaChi;
	public KhachHang() {
		super();
	}
	
	public KhachHang(int id, String ten, Date ngaySinh, String cccd, String sdt, String diaChi) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.cccd = cccd;
		this.sdt = sdt;
		this.diaChi = diaChi;
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
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}

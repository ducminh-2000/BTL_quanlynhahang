package model;

public class BanDaDat {
	private int id;
	private int soLuong;
	private float donGia;
	private Ban ban;
	public BanDaDat() {
		super();
	}
	public BanDaDat(int id, int soLuong, float donGia, Ban ban) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.ban = ban;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public Ban getBan() {
		return ban;
	}
	public void setBan(Ban ban) {
		this.ban = ban;
	}
	
}

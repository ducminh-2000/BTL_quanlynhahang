package model;

public class MonDaDat {
	private int id;
	private String ghiChu;
	private int soLuong;
	private float giamGia;
	private MonAn monAn;
	public MonDaDat() {
		super();
	}
	public MonDaDat(int id, String ghiChu, int soLuong, float giamGia, MonAn monAn) {
		super();
		this.id = id;
		this.ghiChu = ghiChu;
		this.soLuong = soLuong;
		this.giamGia = giamGia;
		this.monAn = monAn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(float giamGia) {
		this.giamGia = giamGia;
	}
	public MonAn getMonAn() {
		return monAn;
	}
	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}
	
}

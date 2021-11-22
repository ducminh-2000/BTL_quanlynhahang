package model;

public class ComboDaDat {
	private int id;
	private int soLuong;
	private String ghiChu;
	private float giamGia;
	private Combo cb;
	public ComboDaDat() {
		super();
	}
	public ComboDaDat(int id, int soLuong, String ghiChu, float giamGia, Combo cb) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.ghiChu = ghiChu;
		this.giamGia = giamGia;
		this.cb = cb;
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
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public float getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(float giamGia) {
		this.giamGia = giamGia;
	}
	public Combo getCb() {
		return cb;
	}
	public void setCb(Combo cb) {
		this.cb = cb;
	}
	
}

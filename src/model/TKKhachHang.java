package model;

public class TKKhachHang extends KhachHang{
	private float tongDoanhThu;
	private int soLanDat;
	public TKKhachHang() {
		super();
	}
	public TKKhachHang(float tongDoanhThu, int soLanDat) {
		super();
		this.tongDoanhThu = tongDoanhThu;
		this.soLanDat = soLanDat;
	}
	public float getTongDoanhThu() {
		return tongDoanhThu;
	}
	public void setTongDoanhThu(float tongDoanhThu) {
		this.tongDoanhThu = tongDoanhThu;
	}
	public int getSoLanDat() {
		return soLanDat;
	}
	public void setSoLanDat(int soLanDat) {
		this.soLanDat = soLanDat;
	}
	
}

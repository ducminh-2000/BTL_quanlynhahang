package model;

public class TKMonAn extends MonAn{
	private float tongDoanhThu;
	private int soLanDat;
	public TKMonAn() {
		super();
	}
	public TKMonAn(float tongDoanhThu, int soLanDat) {
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

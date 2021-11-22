package model;

public class NguyenLieuMonAn {
	private int id;
	private int soCalo;
	private int soLuongSuDung;
	private NguyenLieu nguyenLieu;
	public NguyenLieuMonAn() {
		super();
	}
	public NguyenLieuMonAn(int id, int soCalo, int soLuongSuDung, NguyenLieu nguyenLieu) {
		super();
		this.id = id;
		this.soCalo = soCalo;
		this.soLuongSuDung = soLuongSuDung;
		this.nguyenLieu = nguyenLieu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoCalo() {
		return soCalo;
	}
	public void setSoCalo(int soCalo) {
		this.soCalo = soCalo;
	}
	public int getSoLuongSuDung() {
		return soLuongSuDung;
	}
	public void setSoLuongSuDung(int soLuongSuDung) {
		this.soLuongSuDung = soLuongSuDung;
	}
	public NguyenLieu getNguyenLieu() {
		return nguyenLieu;
	}
	public void setNguyenLieu(NguyenLieu nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}
	
}

package model;

import java.util.Date;

public class HoaDon {
	private int id;
	private Date thoiGianThanhToan;
	private String kieuThanhToan;
	private float soTienThanhToan;
	private NguoiDung nguoiDung;
	private HangDat hangDat;
	public HoaDon() {
		super();
	}
	public HoaDon(int id, Date thoiGianThanhToan, String kieuThanhToan, float soTienThanhToan, NguoiDung nguoiDung,
			HangDat hangDat) {
		super();
		this.id = id;
		this.thoiGianThanhToan = thoiGianThanhToan;
		this.kieuThanhToan = kieuThanhToan;
		this.soTienThanhToan = soTienThanhToan;
		this.nguoiDung = nguoiDung;
		this.hangDat = hangDat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getThoiGianThanhToan() {
		return thoiGianThanhToan;
	}
	public void setThoiGianThanhToan(Date thoiGianThanhToan) {
		this.thoiGianThanhToan = thoiGianThanhToan;
	}
	public String getKieuThanhToan() {
		return kieuThanhToan;
	}
	public void setKieuThanhToan(String kieuThanhToan) {
		this.kieuThanhToan = kieuThanhToan;
	}
	public float getSoTienThanhToan() {
		return soTienThanhToan;
	}
	public void setSoTienThanhToan(float soTienThanhToan) {
		this.soTienThanhToan = soTienThanhToan;
	}
	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	public HangDat getHangDat() {
		return hangDat;
	}
	public void setHangDat(HangDat hangDat) {
		this.hangDat = hangDat;
	}
	
}

package model;

import java.util.ArrayList;
import java.util.Date;

public class HoaDonNhapNguyenLieu {
	private int id;
	private Date thoiGianThanhToan;
	private String kieuThanhToan;
	private float tongSoTien;
	private String ghiChu;
	private NguoiDung nguoiDung;
	private ArrayList<NguyenLieuNhap> listNguyenLieuNhaps;
	public HoaDonNhapNguyenLieu() {
		super();
	}
	public HoaDonNhapNguyenLieu(int id, Date thoiGianThanhToan, String kieuThanhToan, float tongSoTien, String ghiChu,
			NguoiDung nguoiDung, ArrayList<NguyenLieuNhap> listNguyenLieuNhaps) {
		super();
		this.id = id;
		this.thoiGianThanhToan = thoiGianThanhToan;
		this.kieuThanhToan = kieuThanhToan;
		this.tongSoTien = tongSoTien;
		this.ghiChu = ghiChu;
		this.nguoiDung = nguoiDung;
		this.listNguyenLieuNhaps = listNguyenLieuNhaps;
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
	public float getTongSoTien() {
		return tongSoTien;
	}
	public void setTongSoTien(float tongSoTien) {
		this.tongSoTien = tongSoTien;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	public ArrayList<NguyenLieuNhap> getListNguyenLieuNhaps() {
		return listNguyenLieuNhaps;
	}
	public void setListNguyenLieuNhaps(ArrayList<NguyenLieuNhap> listNguyenLieuNhaps) {
		this.listNguyenLieuNhaps = listNguyenLieuNhaps;
	}
	
}

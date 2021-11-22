package model;

import java.util.ArrayList;
import java.util.Date;

public class HangDat {
	private int id;
	private Date thoiGianDat;
	private String ghiChu;
	private int tongSoMonAn;
	private int tongSoBan;
	private int tongSoCombo;
	private float tongTien;
	private boolean daNhanMonAn;
	private NguoiDung nguoiDung;
	private KhachHang khachHang;
	private ArrayList<BanDaDat> listBanDaDats;
	private ArrayList<MonDaDat> listMonDaDats;
	private ArrayList<ComboDaDat> listComboDaDats;
	public HangDat() {
		super();
	}
	public HangDat(int id, Date thoiGianDat, String ghiChu, int tongSoMonAn, int tongSoBan, int tongSoCombo,
			float tongTien, boolean daNhanMonAn, NguoiDung nguoiDung, KhachHang khachHang,
			ArrayList<BanDaDat> listBanDaDats, ArrayList<MonDaDat> listMonDaDats,
			ArrayList<ComboDaDat> listComboDaDats) {
		super();
		this.id = id;
		this.thoiGianDat = thoiGianDat;
		this.ghiChu = ghiChu;
		this.tongSoMonAn = tongSoMonAn;
		this.tongSoBan = tongSoBan;
		this.tongSoCombo = tongSoCombo;
		this.tongTien = tongTien;
		this.daNhanMonAn = daNhanMonAn;
		this.nguoiDung = nguoiDung;
		this.khachHang = khachHang;
		this.listBanDaDats = listBanDaDats;
		this.listMonDaDats = listMonDaDats;
		this.listComboDaDats = listComboDaDats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getThoiGianDat() {
		return thoiGianDat;
	}
	public void setThoiGianDat(Date thoiGianDat) {
		this.thoiGianDat = thoiGianDat;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getTongSoMonAn() {
		return tongSoMonAn;
	}
	public void setTongSoMonAn(int tongSoMonAn) {
		this.tongSoMonAn = tongSoMonAn;
	}
	public int getTongSoBan() {
		return tongSoBan;
	}
	public void setTongSoBan(int tongSoBan) {
		this.tongSoBan = tongSoBan;
	}
	public int getTongSoCombo() {
		return tongSoCombo;
	}
	public void setTongSoCombo(int tongSoCombo) {
		this.tongSoCombo = tongSoCombo;
	}
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	public boolean isDaNhanMonAn() {
		return daNhanMonAn;
	}
	public void setDaNhanMonAn(boolean daNhanMonAn) {
		this.daNhanMonAn = daNhanMonAn;
	}
	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public ArrayList<BanDaDat> getListBanDaDats() {
		return listBanDaDats;
	}
	public void setListBanDaDats(ArrayList<BanDaDat> listBanDaDats) {
		this.listBanDaDats = listBanDaDats;
	}
	public ArrayList<MonDaDat> getListMonDaDats() {
		return listMonDaDats;
	}
	public void setListMonDaDats(ArrayList<MonDaDat> listMonDaDats) {
		this.listMonDaDats = listMonDaDats;
	}
	public ArrayList<ComboDaDat> getListComboDaDats() {
		return listComboDaDats;
	}
	public void setListComboDaDats(ArrayList<ComboDaDat> listComboDaDats) {
		this.listComboDaDats = listComboDaDats;
	}
	
}

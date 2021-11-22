package model;

import java.util.ArrayList;

public class MonAn {
	private int id;
	private String ten;
	private String loai;
	private String mota;
	private int luongCalo;
	private float donGia;
	private ArrayList<NguyenLieuMonAn> listNguyenLieuMonAns;
	public MonAn() {
		super();
	}
	public MonAn(int id, String ten, String loai, String mota, int luongCalo, float donGia,
			ArrayList<NguyenLieuMonAn> listNguyenLieuMonAns) {
		super();
		this.id = id;
		this.ten = ten;
		this.loai = loai;
		this.mota = mota;
		this.luongCalo = luongCalo;
		this.donGia = donGia;
		this.listNguyenLieuMonAns = listNguyenLieuMonAns;
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
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public int getLuongCalo() {
		return luongCalo;
	}
	public void setLuongCalo(int luongCalo) {
		this.luongCalo = luongCalo;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public ArrayList<NguyenLieuMonAn> getListNguyenLieuMonAns() {
		return listNguyenLieuMonAns;
	}
	public void setListNguyenLieuMonAns(ArrayList<NguyenLieuMonAn> listNguyenLieuMonAns) {
		this.listNguyenLieuMonAns = listNguyenLieuMonAns;
	}
	
}

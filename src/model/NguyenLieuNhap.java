package model;

public class NguyenLieuNhap {
	private int id;
	private String chatLuong;
	private String xuatSu;
	private float donGia;
	private int soLuong;
	private NhaCungCap nhaCungCap;
	private NguyenLieu nguyenLieu;
	public NguyenLieuNhap() {
		super();
	}
	
	public NguyenLieuNhap(int id, String chatLuong, String xuatSu, float donGia, int soLuong, NhaCungCap nhaCungCap,
			NguyenLieu nguyenLieu) {
		super();
		this.id = id;
		this.chatLuong = chatLuong;
		this.xuatSu = xuatSu;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaCungCap = nhaCungCap;
		this.nguyenLieu = nguyenLieu;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChatLuong() {
		return chatLuong;
	}
	public void setChatLuong(String chatLuong) {
		this.chatLuong = chatLuong;
	}
	public String getXuatSu() {
		return xuatSu;
	}
	public void setXuatSu(String xuatSu) {
		this.xuatSu = xuatSu;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public NguyenLieu getNguyenLieu() {
		return nguyenLieu;
	}
	public void setNguyenLieu(NguyenLieu nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}
	
}

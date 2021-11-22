package model;

public class Ban {
	private int id;
	private String ten;
	private String kieu;
	private String moTa;
	public Ban() {
		super();
	}
	public Ban(int id, String ten, String kieu, String moTa) {
		super();
		this.id = id;
		this.ten = ten;
		this.kieu = kieu;
		this.moTa = moTa;
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
	public String getKieu() {
		return kieu;
	}
	public void setKieu(String kieu) {
		this.kieu = kieu;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
}

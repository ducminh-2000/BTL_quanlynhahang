package model;

public class MonCombo {
	private int id;
	private int soLuong;
	private String moTa;
	private MonAn ma;
	public MonCombo() {
		super();
	}
	public MonCombo(int id, int soLuong, String moTa, MonAn ma) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.moTa = moTa;
		this.ma = ma;
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
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public MonAn getMa() {
		return ma;
	}
	public void setMa(MonAn ma) {
		this.ma = ma;
	}
	
}

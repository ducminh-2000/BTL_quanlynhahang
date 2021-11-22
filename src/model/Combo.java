package model;

import java.util.ArrayList;

public class Combo {
	private int id;
	private String ten;
	private float tongTien;
	private ArrayList<MonCombo> listMonCombos;
	public Combo() {
		super();
	}
	public Combo(int id, String ten, float tongTien, ArrayList<MonCombo> listMonCombos) {
		super();
		this.id = id;
		this.ten = ten;
		this.tongTien = tongTien;
		this.listMonCombos = listMonCombos;
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
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	public ArrayList<MonCombo> getListMonCombos() {
		return listMonCombos;
	}
	public void setListMonCombos(ArrayList<MonCombo> listMonCombos) {
		this.listMonCombos = listMonCombos;
	}
	
}

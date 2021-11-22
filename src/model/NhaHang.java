package model;

import java.util.ArrayList;

public class NhaHang {
	private int id;
	private String ten;
	private String diaChi;
	private int soSao;
	private String sdt;
	private ArrayList<Ban> listBans;
	private ArrayList<MonAn> listMonAns;
	public NhaHang() {
		super();
	}
	public NhaHang(int id, String ten, String diaChi, int soSao, String sdt, ArrayList<Ban> listBans,
			ArrayList<MonAn> listMonAns) {
		super();
		this.id = id;
		this.ten = ten;
		this.diaChi = diaChi;
		this.soSao = soSao;
		this.sdt = sdt;
		this.listBans = listBans;
		this.listMonAns = listMonAns;
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSoSao() {
		return soSao;
	}
	public void setSoSao(int soSao) {
		this.soSao = soSao;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public ArrayList<Ban> getListBans() {
		return listBans;
	}
	public void setListBans(ArrayList<Ban> listBans) {
		this.listBans = listBans;
	}
	public ArrayList<MonAn> getListMonAns() {
		return listMonAns;
	}
	public void setListMonAns(ArrayList<MonAn> listMonAns) {
		this.listMonAns = listMonAns;
	}
	
}

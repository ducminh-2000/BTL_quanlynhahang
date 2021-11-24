package controller;

import model.Hoadon;

import java.util.ArrayList;

import model.Hangdat;
import model.Khachhang;

public class ThongketheokhachDAO extends DAO {
	public  ThongketheokhachDAO() {
		super();
	}
	
	public ArrayList<Khachhang> layDSKhachhang(){
		ArrayList<Khachhang> = new ArrayList<>();
		return list;
	}
	
	public boolean getDoanhthuKH() {
		return true;
	}
	public boolean getHangdatKH() {
		return true;
	}
}

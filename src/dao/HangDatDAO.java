/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;

import model.BanDaDat;
import model.HangDat;
import model.KhachHang;
import model.MonAn;
import model.MonDaDat;

/**
 *
 * @author duc08
 */
public class HangDatDAO {
    public HangDatDAO(){
        
    }
    public HangDat create(ArrayList<MonAn> list){
        return new HangDat();
    }
    public HangDat get(KhachHang user){
        return new HangDat();
    }
    public List<BanDaDat>getByKhachHang(String name,String sdt){
        KhachHang kh = new KhachHang();
        kh.setSdt(sdt);
        kh.setTen(name);
        List<BanDaDat> list = new ArrayList<BanDaDat>();
        return list;
    }

    public void updateDanhSachMon(MonAn mon, int sl,KhachHang user){
        HangDat hangDat = this.get(user);
        List<MonDaDat>dsMon = hangDat.getListMonDaDats();
        MonDaDat daDat = new MonDaDat();
        daDat.setMonAn(mon);
        daDat.setSoLuong(sl);
        dsMon.add(daDat);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;

import model.BanDaDat;


/**
 *
 * @author Theu
 */
public class BanDaDatDAO extends DAO{
    public BanDaDatDAO() {
        super();
    }
    private HangDatDAO hangDatDAO;
    public boolean themDatBan(BanDaDat db){
        return true;
    }

    public List<BanDaDat> getByKhachHang(String name, String sdt){
        return hangDatDAO.getByKhachHang(name,sdt);
    }
}

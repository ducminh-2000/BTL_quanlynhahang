/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.KhachHang;

/**
 *
 * @author Theu
 */
public class KhachHangDAO extends DAO{
    public KhachHangDAO() {
        super();
    }
    public boolean themKhachHang(KhachHang kh){
        return true;
    }
    public KhachHang Login(String username,String password){
        return new KhachHang();
    }
    public KhachHang getUser(){
        return new KhachHang();
    }
}

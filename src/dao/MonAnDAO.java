package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.MonAn;

/**
 *
 * @author DatIT
 */
public class MonAnDAO extends DAO{

    public MonAnDAO() {
        super();
    }
    public boolean luuMonAn(MonAn ma){
        boolean result = false;
        return result;
    }
    public boolean luuNguyenLieuMonAn(MonAn ma){
        boolean result = false;
        
        
        return result;
    }
    public ArrayList<MonAn> layDSMonAn(){
        ArrayList<MonAn> list = new ArrayList<>();
        return list;
    }
    public ArrayList<MonAn> timkiemMonAn(String key){
        ArrayList<MonAn> result = new ArrayList<MonAn>();
        return result;
    }
    public boolean capnhatmonan(MonAn ma){
        return true;
    }
    public ArrayList<MonAn> getAll(){
        return new ArrayList<MonAn>();
    }
}

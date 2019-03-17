/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import Database.Database;
import java.sql.ResultSet;
import sun.util.calendar.BaseCalendar;
/**
 *
 * @author DELL
 */
public class sanpham {
          Database db;
	public sanpham() {
            db=new Database();               
	}
        public ResultSet Login(){
            String sql = "select * from Login";
            return db.ExcuteQueryGetTable(sql);
        }
        public ResultSet loadSanPham(){
            String sql = "select * from Product";
            return db.ExcuteQueryGetTable(sql);
        }
        public ResultSet loadCategory(){
            String sql = "select * from Category";
            return db.ExcuteQueryGetTable(sql);
        }
	public void addSanPham(String ten, int gia, int sl, int Cateid) {	
            String sql = "INSERT INTO Product (Name, Price, Quantily, CategoryID) VALUES(N'"+ten+"','"+gia+"','"+sl+"','"+Cateid+"')";
            db.ExcuteQueryUpdateDB(sql);	
	}
        public void editSanPham(int ID, String ten, int gia, int sl, int Cateid) {	
            String sql = "update Product set Name= N'"+ten+"',Price='"+gia+"',Quantily='"+sl+"',CategoryID='"+Cateid+"' where ID='"+ID+"'";
            db.ExcuteQueryUpdateDB(sql);	
	}
        public void deleteSanPham(int ID) {	
            String sql = "delete from Product where ID='" + ID + "'";
            db.ExcuteQueryUpdateDB(sql);	
	}
}

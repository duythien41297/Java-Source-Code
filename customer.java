/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Database.Database;
import java.sql.ResultSet;

/**
 *
 * @author Song Tu
 */
public class customer {
    Database db;
	public customer() {
            db=new Database();               
	}
        public ResultSet loadCustomer(){
            String sql = "select * from Customer";
            return db.ExcuteQueryGetTable(sql);
        }
	public void addCustomer(String ten, String phone, String email) {	
            String sql = "INSERT INTO Customer (Name, phone, email) VALUES(N'"+ten+"','"+phone+"','"+email+"')";
            db.ExcuteQueryUpdateDB(sql);	
	}
        public void editCustomer(int ID, String ten, String phone, String email) {	
            String sql = "update Customer set Name= N'"+ten+"',Phone='"+phone+"',Email='"+email+"' where ID='"+ID+"'";
            db.ExcuteQueryUpdateDB(sql);	
	}
        public void deleteCustomer(int ID) {	
            String sql = "delete from Customer where ID='" + ID + "'";
            db.ExcuteQueryUpdateDB(sql);	
	}
}

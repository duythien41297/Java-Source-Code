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
public class category {
          Database db;
	public category() {
            db=new Database();
                
	}
        public ResultSet loadCategory(){
            String sql = "select * from Category" ;
            return db.ExcuteQueryGetTable(sql);
        }
	public void addCategory( String Ten) {
           // String sql = "INSERT INTO Category (id,name) VALUES('"+ID+"', N'"+Ten+"')";
            String sql = "INSERT INTO Category (name) VALUES( N'"+Ten+"')";
            db.ExcuteQueryUpdateDB(sql);	
	}
        public void editCategory( int ID,String Ten) {	
            String sql = "update Category set name= N'"+Ten+"' where id='"+ID+"'";
            db.ExcuteQueryUpdateDB(sql);	
	}
        public void deleteCategory(int ID) {	
            String sql = "delete from Category where id='" + ID + "'";
            db.ExcuteQueryUpdateDB(sql);	
	}
}

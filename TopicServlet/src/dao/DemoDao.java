package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import dbutil.DBConnection;
import dbutil.DBProperties;
import scheme.DemoScheme;

public class DemoDao {
	
	public int getNewId(){
		int newId = -1;
		
		String sql = "select ifnull(max(id), 0) as id from demo";
		
		Connection con = DBConnection.getConnection();
		System.out.println(DBProperties.getPropertiesString());

		Statement stat = null;
		ResultSet result = null;
		
		try {
			stat = con.createStatement();
			result = stat.executeQuery(sql);
			
			if(result.next()){
				newId = result.getInt("id") + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				result.close();
				stat.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return newId;
	}
	
	public int insert(DemoScheme scheme){
		int result = -1;
		
		String sql = "insert into demo (id,name,value) values (?,?,?)";
		
		Connection con = DBConnection.getConnection();
		
		PreparedStatement stat = null;
		
		try {
			
			stat = con.prepareStatement(sql);
			
			int index = 0;
			
			stat.setInt(++index, scheme.getId());
			stat.setString(++index, scheme.getName());
			stat.setString(++index, scheme.getValue());
			
			result = stat.executeUpdate();
			
			stat.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public List<DemoScheme> query(){
		List<DemoScheme> list = new LinkedList<DemoScheme>();
		
		String sql = "select * from demo";
		
		Connection con = DBConnection.getConnection();
		
		PreparedStatement stat = null;
		ResultSet result = null;
		
		try {
			
			stat = con.prepareStatement(sql);
			
			DemoScheme scheme = new DemoScheme();
			
			result = stat.executeQuery();
			
			while(result.next()){
				scheme.setId(result.getInt("id"));
				scheme.setName(result.getString("name"));
				scheme.setValue(result.getString("value"));
				list.add(scheme);
				scheme = new DemoScheme();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				result.close();
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public int update(DemoScheme scheme){
		int result = -1;
		
		String sql = "update demo set name=?,value=? where id=?";
		
		Connection con = DBConnection.getConnection();
		
		PreparedStatement stat = null;
		
		try {
			
			stat = con.prepareStatement(sql);
			
			int index = 0;
			
			stat.setString(++index, scheme.getName());
			stat.setString(++index, scheme.getValue());
			stat.setInt(++index, scheme.getId());
			
			result = stat.executeUpdate();
			
			stat.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int delete(DemoScheme scheme){
		int result = -1;
		
		String sql = "delete from demo where id=?";
		
		Connection con = DBConnection.getConnection();
		
		PreparedStatement stat = null;
		
		try {
			
			stat = con.prepareStatement(sql);
			
			int index = 0;
			
			stat.setInt(++index, scheme.getId());
			
			result = stat.executeUpdate();
			
			stat.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}

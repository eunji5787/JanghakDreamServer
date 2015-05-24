package org.hanyang.wsb;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 

public class SelectCmd {
	
	
	public ArrayList<JanghakObject> queryAll(Connection con) throws SQLException{
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM JanghakDream.JanghakInfo");
		ResultSet rs = stmt.executeQuery();
		
		return makeJanghakObj(rs);
	}

	public ArrayList<JanghakObject> querySelect(Connection con, String query) throws SQLException{
		
		System.out.println("The Selected query arise");
		System.out.println(query + " This is SQL command to get what we want");
		
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		
		return makeJanghakObj(rs);
	}

	public ArrayList<JanghakObject> makeJanghakObj(ResultSet rs){
		ArrayList<JanghakObject> janghakList = new ArrayList<JanghakObject>();

		
		try{
			while(rs.next()){
				JanghakObject janghakObj = new JanghakObject();
				janghakObj.setFoundation(rs.getString("foundation"));
				janghakObj.setPayamount(rs.getInt("payamount"));
				janghakList.add(janghakObj);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return janghakList;
	}
	
		
}


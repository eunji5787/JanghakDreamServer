package org.hanyang.wsb;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
 

public class SelectCmd {
	
	
	public ArrayList<JanghakObject> queryAll(Connection con) throws SQLException{
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM JanghakDream.JanghakList");
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

	/**
	 * @param rs
	 * @return
	 */
	public ArrayList<JanghakObject> makeJanghakObj(ResultSet rs){
		ArrayList<JanghakObject> janghakList = new ArrayList<JanghakObject>();

		
		try{
			// Really bad coding..should be fixed!
			while(rs.next()){
				JanghakObject janghakObj = new JanghakObject(rs.getString("janghakname"),
						rs.getString("foundation"), rs.getString("payamount"),
						rs.getString("weblink"), rs.getString("downloadlink"),
						rs.getString("startdate"), rs.getString("enddate"),
						calcDday(rs.getString("enddate")));
				janghakList.add(janghakObj);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return janghakList;
	}
	
	public String calcDday(String enddate){
		
		try{
			
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date endd = sdf.parse(enddate);

			long diff = endd.getTime() - today.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			
			return String.valueOf(diffDays);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
		
}


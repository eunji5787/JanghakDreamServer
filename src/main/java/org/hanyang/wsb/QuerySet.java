package org.hanyang.wsb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuerySet {
	
	public String makeCommand(UserInfoObj uObj){
		String query="SELECT * FROM JanghakDream.JanghakList";
		
		// grade and region select should be added
		
		String subquery= "Where ";
		subquery += uObj.year+">= startsemester and "+ uObj.year+"<= endsemester and ";
		subquery += uObj.sex+"=0 or sex="+uObj.sex+" and ";
		subquery += uObj.incomerank+">= incomerank and ";
		subquery += "enddate IS NULL or enddate>="+getDatetime();
		
		return query;
	}
	
	public String getDatetime(){
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss");
		return sdf.format(dt).toString();
		
	}

}

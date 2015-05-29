package org.hanyang.wsb;

import java.text.SimpleDateFormat;

import java.util.Date;

public class QuerySet {
	
	public String makeCommand(UserInfoObj uObj){
		String query="SELECT * FROM JanghakDream.JanghakList ";
		
		// grade and region select should be added
		
		String subquery= "Where ";
		subquery += "("+uObj.year+" <=endsemester and "+uObj.year+" >=startsemester) and (";
		subquery += uObj.local + "= local or local=0 ) and ( ";  
		subquery += uObj.sex+"=sex or sex=0) and (";
		subquery += uObj.incomerank+" >=incomerank) and (";
		subquery += "enddate IS NULL or enddate>="+getDatetime()+")";
		
		System.out.println(subquery);
		
		return query+subquery;
	}
	
	public String getDatetime(){
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return '"'+sdf.format(dt).toString()+'"';
		//return "'"+"2015-06-01 00:00:00"+"'";
	}

}

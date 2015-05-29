package org.hanyang.wsb;

import java.sql.Connection;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.hanyang.wsb.*;

import com.google.gson.Gson;

@Path("/select")
public class ParamSet {
	int ind;

    public final static int AllJanghak = 0;
    public final static int CustomJanghak = 1;
	String janghakInfo = null;
	ArrayList<JanghakObject> janghakList = new ArrayList<JanghakObject>();
    
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
	public String sqlAll(){
		
		return JSONandSQLhandler(0);
	}
	
	@GET
	@Path("/school/{school}/year/{year}/"
			+"local/{local}/sex/{sex}"
			+"/allmark/{allmark}/scoretype1/{scoretype1}"
			+"/nowmark/{nowmark}/scoretype2/{scoretype2}"
			+"/incomerank/{incomerank}/meritman/{meritman}")
	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
	public String sqlSelect(
			@PathParam("school") String school,
			@PathParam("year") Integer year,
			@PathParam("local") Integer local,
			@PathParam("sex") Integer sex,
			@PathParam("allmark") String allmark,
			@PathParam("scoretype1") Integer scoretype1,
			@PathParam("lastmark") String nowmark,
			@PathParam("scoretype2") Integer scoretype2,
			@PathParam("incomerank") Integer incomerank,
			@PathParam("meritman") Integer meritman
			) {

		System.out.println("UserInfoObj is making");
		UserInfoObj uObj = new UserInfoObj(school, year, local+1, sex, allmark, 
				scoretype1, nowmark, scoretype2,incomerank, meritman);
		System.out.println(uObj.getSchool()+"To check Obj is made properly");
		
		return JSONandSQLhandler(1, uObj);
	}
	
	public String JSONandSQLhandler(Integer ind){
		
		return JSONandSQLhandler(ind, null);
	}
	
	public String JSONandSQLhandler(Integer ind, UserInfoObj uObj){
		
		try 
		{	
			System.out.println("Main Process is started");
			MysqlConnector ms = new MysqlConnector();
			Connection conn = ms.connector();
			SelectCmd cmd = new SelectCmd();
			
			
			switch(ind){
			case AllJanghak:
				janghakList = cmd.queryAll(conn);
				break;
			case CustomJanghak:
				String query = new QuerySet().makeCommand(uObj);
				janghakList = cmd.querySelect(conn, query);
				break;
		
			default:
				System.out.println("Unhandled request");
				break;
			}
			
			Gson gson = new Gson();
			janghakInfo = gson.toJson(janghakList);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return janghakInfo;
		
	}
}

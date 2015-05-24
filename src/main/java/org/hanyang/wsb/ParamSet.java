package org.hanyang.wsb;

import java.io.BufferedReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
	@Path("/school/{school}/year/{year}"
			+"/male/{male}&{female}"
			+"/grade/{grade}/pointfive/{pfive}&{pthree}"
			+"/incomerank/{incomerank}/merityes/{merityes}&{meritno}")
	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
	public String sqlSelect(
			@PathParam("school") String school,
			@PathParam("year") Integer year,
			@PathParam("male") Boolean male,
			@PathParam("female") Boolean female,
			@PathParam("grade") String grade,
			@PathParam("pfive") Boolean pfive,
			@PathParam("pthree") Boolean pthree,
			@PathParam("incomerank") String incomerank,
			@PathParam("merityes") Boolean merityes,
			@PathParam("meritno") Boolean meritno
			) {

		System.out.println("UserInfoObj is making");
		UserInfoObj uObj = new UserInfoObj(school, year, male, female, grade, 
				pfive, pthree, incomerank, merityes, meritno);
		System.out.println(uObj.getFemale()+"To check Obj is made properly");
		
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

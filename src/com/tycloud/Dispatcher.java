/*
 *  Mysql_REST_API
 */
package com.tycloud;


import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/")
public class Dispatcher {
	@QueryParam("DBInstanceId") 
	String DBInstanceId;
	
	@QueryParam("DBName")
	String DBName;
	
	@QueryParam("CharacterSetName")
	String CharacterSetName;
	
	@QueryParam("Action") 
	String action;
	
	@QueryParam("DBDescription")
	String DBDescription;
	
	@QueryParam("DBStatus")
	String DBStatus;
	
	@QueryParam("AccountName")
	String AccountName;
	
	@QueryParam("AccountPassword")
	String AccountPassword;
	
	@QueryParam("AccountDescription")
	String AccountDescription;
	
	@QueryParam("AccountPrivilege")
	String AccountPrivilege;
	
	@QueryParam("EngineVersion")//
	String EngineVersion;
	
	@QueryParam("ZoneId")
	String ZoneId;
	
	@QueryParam("DBInstanceClass")
	String DBInstanceClass;
	
	@QueryParam("DBInstanceNetType")
	String DBInstanceNetType;
	
	@QueryParam("PayType")
	String PayType;
	
	@QueryParam("Timestamp")
	String Timestamp;
	
	@QueryParam("DBInstanceStorage")
	String DBInstanceStorage;
	
	@QueryParam("RegionId")
	String RegionId;
	
	@QueryParam("Engine")
	String Engine;
	
	@QueryParam("DBInstanceDescription")
	String DBInstanceDescription;
	
	@GET()//
	@Produces(MediaType.APPLICATION_XML)
    public TyResponse tyresponse() {
		if(action.equals("CreateAccount")){
		CreateAccountResponseSql OptSql=new CreateAccountResponseSql();
		OptSql.setAccountName("houge");
		OptSql.setAccountPassword("123");
		OptSql.setDBInstanceId("mysql");
		OptSql.setAccountDescription("create account for houge");
		MarshallerContext context=OptSql.SqlOperate();
		CreateAccountResponse response=new CreateAccountResponse();
		return response.getInstance(context);
		}
		//在下面编写其它分支
		if(action.equals("")){
			
			/*
			 * 
			 */
		}
		//如果不是这些操作中的任意一种，则返回错误
		ErrorResponse error=new ErrorResponse();
		error.Code="UnsupportedOperation";
		error.Message="The?specified?action?is?not?supported.";
		error.RequestId="8906582E-6722-409A-A6C4-0E7863B733A5";
		try {
			error.HostId=InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return error;
    }

}

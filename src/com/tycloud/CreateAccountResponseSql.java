package com.tycloud;


///该文件接收参数通过JDBC操作mysql，并将结果组成MarshallerContext，供CreateAccountResponseMarshaller来打包成Xml
public class CreateAccountResponseSql extends ResponseSql{
	private String DBInstanceId;
	private String AccountName;
	private String AccountPassword;
	private String AccountDescription;
	public String getDBInstanceId(){
		return this.DBInstanceId;
	}
	public void  setDBInstanceId(String dbinstanceid) {
		this.DBInstanceId=dbinstanceid;
	}
	public String getAccountName(){
		return this.AccountName;
	}
	public void  setAccountName(String accountname) {
		this.AccountName=accountname;
	}
	public String getAccountPassword(){
		return this.AccountPassword;
	}
	public void  setAccountPassword(String accountpassword) {
		this.AccountPassword=accountpassword;
	}
	public String getAccountDescription(){
		return this.AccountDescription;
	}
	public void  setAccountDescription(String accountdescription) {
		this.AccountDescription=accountdescription;
	}
	
	@Override
	public  MarshallerContext  SqlOperate(){
			MarshallerContext result =new MarshallerContext();
			/*
			这个里面写操作数据库，获取数据库实例、数据库、用户的信息，并且打包成MarshallerContext对象类型
			
			*/
			return result;
		
		
	}
}

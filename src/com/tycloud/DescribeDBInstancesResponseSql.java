package com.tycloud;

public class DescribeDBInstancesResponseSql extends ResponseSql{
	@Override
	public  MarshallerContext  SqlOperate(){
			MarshallerContext result =new MarshallerContext();
			/*
			这个里面写操作数据库，获取数据库实例、数据库、用户的信息，并且打包成MarshallerContext对象类型
			
			*/
			return result;
		
		
	}
}	

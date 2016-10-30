/*
 Mysql_REST_API
 */
package com.tycloud;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

public abstract class TyResponse {
	
	public abstract TyResponse getInstance(MarshallerContext context) throws ClientException, ServerException;
}

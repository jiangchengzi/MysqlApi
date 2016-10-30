package com.tycloud;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

public abstract class ResponseSql {
	public abstract MarshallerContext SqlOperate() throws ClientException, ServerException;
}

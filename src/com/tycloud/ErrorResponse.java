package com.tycloud;
import javax.xml.bind.annotation.XmlRootElement;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
@XmlRootElement(name="Error")
public class ErrorResponse extends TyResponse{
		public String RequestId;
		public String Code ;
		public String Message;
		public String HostId;
		@Override
		public TyResponse getInstance(MarshallerContext context) throws ClientException, ServerException {
			// TODO Auto-generated method stub
			return null;
		}

}

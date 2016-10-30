/*
  Mysql_REST_API
 */
package com.tycloud;
import java.util.Map;

import com.aliyuncs.http.HttpResponse;


public class MarshallerContext {
	
	private int httpStatus;
	private Map<String, String> responseMap;
	private HttpResponse httpResponse;

	public Integer integerValue(String key) {
		String value = responseMap.get(key);
		if(null == value || 0 == value.length()){
			return null;
		}
		return Integer.valueOf(value);
	}

	public String stringValue(String key) {
		return responseMap.get(key);
	}
	
	public Long longValue(String key) {
		String value = responseMap.get(key);
		if(null == value || 0 == value.length()){
			return null;
		}
		return Long.valueOf(responseMap.get(key));
	}
	
	public Boolean booleanValue(String key) {
		String value = responseMap.get(key);
		if(null == value || 0 == value.length()){
			return null;
		}
		return Boolean.valueOf(responseMap.get(key));
	}
	
	public Float floatValue(String key) {
		String value = responseMap.get(key);
		if(null == value || 0 == value.length()){
			return null;
		}
		return Float.valueOf(responseMap.get(key));
	}
	
	public Double doubleValue(String key) {
		String value = responseMap.get(key);
		if(null == value || 0 == value.length()){
			return null;
		}
		return Double.valueOf(responseMap.get(key));
	}
	
	public int lengthValue(String key) {
		String value = responseMap.get(key);
		if(null == value || 0 == value.length()){
			return 0;
		}
		return Integer.valueOf(responseMap.get(key));
	}
	
	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Map<String, String> getResponseMap() {
		return responseMap;
	}

	public void setResponseMap(Map<String, String> responseMap) {
		this.responseMap = responseMap;
	}

	public HttpResponse getHttpResponse() {
		return httpResponse;
	}

	public void setHttpResponse(HttpResponse httpResponse) {
		this.httpResponse = httpResponse;
	}

}

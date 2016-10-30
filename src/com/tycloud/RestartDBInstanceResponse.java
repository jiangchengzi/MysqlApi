/*
  Mysql_REST_API
 */
package com.tycloud;

/**
 * @author houge
 */
public class RestartDBInstanceResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public RestartDBInstanceResponse getInstance(MarshallerContext context) {
        return RestartDBInstanceResponseMarshaller.marshall(this, context);
    }
}

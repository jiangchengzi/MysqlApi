/*
  Mysql_REST_API
 */
package com.tycloud;

/**
 * @author houge
 */
public class ResetAccountPasswordResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public ResetAccountPasswordResponse getInstance(MarshallerContext context) {
        return ResetAccountPasswordResponseMarshaller.marshall(this, context);
    }
}

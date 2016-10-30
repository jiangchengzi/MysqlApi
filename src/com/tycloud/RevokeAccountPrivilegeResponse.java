/*
 Mysql_REST_API
 */
package com.tycloud;


/**
 * @author houge
 */
public class RevokeAccountPrivilegeResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public RevokeAccountPrivilegeResponse getInstance(MarshallerContext context) {
        return RevokeAccountPrivilegeResponseMarshaller.marshall(this, context);
    }
}

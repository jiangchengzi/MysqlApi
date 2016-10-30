/*
 Mysql_REST_API
 */
package com.tycloud;

/**
 * @author houge
 */
public class GrantAccountPrivilegeResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public GrantAccountPrivilegeResponse getInstance(MarshallerContext context) {
        return GrantAccountPrivilegeResponseMarshaller.marshall(this, context);
    }
}

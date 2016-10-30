/*
 Mysql_REST_API
 */
package com.tycloud;


/**
 * @author houge
 */
public class DeleteDatabaseResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public DeleteDatabaseResponse getInstance(MarshallerContext context) {
        return DeleteDatabaseResponseMarshaller.marshall(this, context);
    }
}

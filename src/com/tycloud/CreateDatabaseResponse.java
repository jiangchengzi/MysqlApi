/*
 * Mysql_REST_API
 */
package com.tycloud;


/**
 * @author houge
 */
public class CreateDatabaseResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public CreateDatabaseResponse getInstance(MarshallerContext context) {
        return CreateDatabaseResponseMarshaller.marshall(this, context);
    }
}

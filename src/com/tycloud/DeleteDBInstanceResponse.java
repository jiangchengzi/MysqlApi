/*
  Mysql_REST_API
 */
package com.tycloud;

/**
 * @author houge
 */
public class DeleteDBInstanceResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public DeleteDBInstanceResponse getInstance(MarshallerContext context) {
        return DeleteDBInstanceResponseMarshaller.marshall(this, context);
    }
}

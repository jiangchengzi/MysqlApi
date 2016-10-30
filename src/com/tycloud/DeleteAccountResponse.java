/*
  Mysql_REST_API
 */
package com.tycloud;

/**
 * @author houge
 */
public class DeleteAccountResponse extends TyResponse {

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public DeleteAccountResponse getInstance(MarshallerContext context) {
        return DeleteAccountResponseMarshaller.marshall(this, context);
    }
}

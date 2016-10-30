/*
 * Mysql_REST_API
 */
package com.tycloud;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author houge
 */
@XmlRootElement()
public class CreateAccountResponse extends TyResponse{

    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public CreateAccountResponse getInstance(MarshallerContext context) {
        return CreateAccountResponseMarshaller.marshall(this, context);
    }
}

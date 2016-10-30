/*
 * Mysql_REST_API
 */
package com.tycloud;


public class CreateAccountResponseMarshaller {

    public static CreateAccountResponse marshall(CreateAccountResponse createAccountResponse,
                                                   MarshallerContext context) {

        createAccountResponse.setRequestId(context.stringValue("CreateAccountResponse.RequestId"));

        return createAccountResponse;
    }
}

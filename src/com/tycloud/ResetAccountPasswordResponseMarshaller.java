/*
 Mysql_REST_API
 */
package com.tycloud;


public class ResetAccountPasswordResponseMarshaller {

    public static ResetAccountPasswordResponse marshall(
            ResetAccountPasswordResponse resetAccountPasswordResponse,
            MarshallerContext context) {

        resetAccountPasswordResponse
                .setRequestId(context.stringValue("ResetAccountPasswordResponse.RequestId"));

        return resetAccountPasswordResponse;
    }
}

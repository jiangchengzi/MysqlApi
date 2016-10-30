/*
 Mysql_REST_API
 */
package com.tycloud;


public class RevokeAccountPrivilegeResponseMarshaller {

    public static RevokeAccountPrivilegeResponse marshall(
            RevokeAccountPrivilegeResponse revokeAccountPrivilegeResponse,
            MarshallerContext context) {

        revokeAccountPrivilegeResponse
                .setRequestId(context.stringValue("RevokeAccountPrivilegeResponse.RequestId"));

        return revokeAccountPrivilegeResponse;
    }
}

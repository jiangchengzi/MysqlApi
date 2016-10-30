/*
  Mysql_REST_API
 */
package com.tycloud;

public class GrantAccountPrivilegeResponseMarshaller {

    public static GrantAccountPrivilegeResponse marshall(
            GrantAccountPrivilegeResponse grantAccountPrivilegeResponse,
            MarshallerContext context) {

        grantAccountPrivilegeResponse
                .setRequestId(context.stringValue("GrantAccountPrivilegeResponse.RequestId"));

        return grantAccountPrivilegeResponse;
    }
}

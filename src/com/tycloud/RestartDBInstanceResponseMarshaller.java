/*
  Mysql_REST_API
 */
package com.tycloud;

public class RestartDBInstanceResponseMarshaller {

    public static RestartDBInstanceResponse marshall(
            RestartDBInstanceResponse restartDBInstanceResponse, MarshallerContext context) {

        restartDBInstanceResponse
                .setRequestId(context.stringValue("RestartDBInstanceResponse.RequestId"));

        return restartDBInstanceResponse;
    }
}

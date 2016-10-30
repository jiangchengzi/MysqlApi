/*
  Mysql_REST_API
 */
package com.tycloud;

public class CreateDBInstanceResponseMarshaller {

    public static CreateDBInstanceResponse marshall(
            CreateDBInstanceResponse createDBInstanceResponse, MarshallerContext context) {

        createDBInstanceResponse
                .setRequestId(context.stringValue("CreateDBInstanceResponse.RequestId"));
        createDBInstanceResponse
                .setDBInstanceId(context.stringValue("CreateDBInstanceResponse.DBInstanceId"));
        createDBInstanceResponse
                .setOrderId(context.stringValue("CreateDBInstanceResponse.OrderId"));
        createDBInstanceResponse.setConnectionString(
                context.stringValue("CreateDBInstanceResponse.ConnectionString"));
        createDBInstanceResponse.setPort(context.stringValue("CreateDBInstanceResponse.Port"));

        return createDBInstanceResponse;
    }
}

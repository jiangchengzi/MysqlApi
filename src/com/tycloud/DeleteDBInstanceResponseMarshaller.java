/*
  Mysql_REST_API
 */
package com.tycloud;


public class DeleteDBInstanceResponseMarshaller {

    public static DeleteDBInstanceResponse marshall(
            DeleteDBInstanceResponse deleteDBInstanceResponse, MarshallerContext context) {

        deleteDBInstanceResponse
                .setRequestId(context.stringValue("DeleteDBInstanceResponse.RequestId"));

        return deleteDBInstanceResponse;
    }
}

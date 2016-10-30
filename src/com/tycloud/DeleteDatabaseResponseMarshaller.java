/*
 Mysql_REST_API
 */
package com.tycloud;

public class DeleteDatabaseResponseMarshaller {

    public static DeleteDatabaseResponse marshall(DeleteDatabaseResponse deleteDatabaseResponse,
    		MarshallerContext context) {

        deleteDatabaseResponse
                .setRequestId(context.stringValue("DeleteDatabaseResponse.RequestId"));

        return deleteDatabaseResponse;
    }
}

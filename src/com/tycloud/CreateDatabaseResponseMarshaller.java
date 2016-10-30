/*
 * Mysql_REST_API
 */
package com.tycloud;

public class CreateDatabaseResponseMarshaller {

    public static CreateDatabaseResponse marshall(CreateDatabaseResponse createDatabaseResponse,
                                                    MarshallerContext context) {

        createDatabaseResponse
                .setRequestId(context.stringValue("CreateDatabaseResponse.RequestId"));

        return createDatabaseResponse;
    }
}

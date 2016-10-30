/*
  Mysql_REST_API
 */
package com.tycloud;

public class DeleteAccountResponseMarshaller {

    public static DeleteAccountResponse marshall(DeleteAccountResponse deleteAccountResponse,
    		MarshallerContext context) {

        deleteAccountResponse.setRequestId(context.stringValue("DeleteAccountResponse.RequestId"));

        return deleteAccountResponse;
    }
}

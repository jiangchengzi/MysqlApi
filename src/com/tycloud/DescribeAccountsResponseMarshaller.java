/*
  Mysql_REST_API
 */
package com.tycloud;


import java.util.ArrayList;
import java.util.List;

import com.tycloud.DescribeAccountsResponse.DBInstanceAccount;
import com.tycloud.DescribeAccountsResponse.DBInstanceAccount.AccountStatus;
import com.tycloud.DescribeAccountsResponse.DBInstanceAccount.AccountType;
import com.tycloud.DescribeAccountsResponse.DBInstanceAccount.DatabasePrivilege;

public class DescribeAccountsResponseMarshaller {

    public static DescribeAccountsResponse marshall(
            DescribeAccountsResponse describeAccountsResponse, MarshallerContext context) {

        describeAccountsResponse
                .setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));

        List<DBInstanceAccount> accounts = new ArrayList<DBInstanceAccount>();
        for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
            DBInstanceAccount dBInstanceAccount = new DBInstanceAccount();
            dBInstanceAccount.setDBInstanceId(context.stringValue(
                    "DescribeAccountsResponse.Accounts[" + i + "].DBInstanceId"));
            dBInstanceAccount.setAccountName(context.stringValue(
                    "DescribeAccountsResponse.Accounts[" + i + "].AccountName"));
            dBInstanceAccount.setAccountStatus(AccountStatus.getEnum(context.stringValue(
                    "DescribeAccountsResponse.Accounts[" + i + "].AccountStatus")));
            dBInstanceAccount.setAccountType(AccountType.getEnum(context.stringValue(
                    "DescribeAccountsResponse.Accounts[" + i + "].AccountType")));
            dBInstanceAccount.setAccountDescription(context.stringValue(
                    "DescribeAccountsResponse.Accounts[" + i + "].AccountDescription"));

            List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
            for (int j = 0; j < context.lengthValue("DescribeAccountsResponse.Accounts[" + i
                    + "].DatabasePrivileges.Length"); j++) {
                DatabasePrivilege databasePrivilege = new DatabasePrivilege();
                databasePrivilege.setDBName(context.stringValue(
                        "DescribeAccountsResponse.Accounts[" + i + "].DatabasePrivileges[" + j
                                + "].DBName"));
                databasePrivilege.setAccountPrivilege(context.stringValue(
                        "DescribeAccountsResponse.Accounts[" + i + "].DatabasePrivileges[" + j
                                + "].AccountPrivilege"));

                databasePrivileges.add(databasePrivilege);
            }
            dBInstanceAccount.setDatabasePrivileges(databasePrivileges);

            accounts.add(dBInstanceAccount);
        }
        describeAccountsResponse.setAccounts(accounts);

        return describeAccountsResponse;
    }
}

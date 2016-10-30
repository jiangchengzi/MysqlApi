/*
  Mysql_REST_API
 */
package com.tycloud;

import java.util.ArrayList;
import java.util.List;

import com.tycloud.DescribeDatabasesResponse.Database;
import com.tycloud.DescribeDatabasesResponse.Database.AccountPrivilegeInfo;
import com.tycloud.DescribeDatabasesResponse.Database.DBStatus;

public class DescribeDatabasesResponseMarshaller {

    public static DescribeDatabasesResponse marshall(
            DescribeDatabasesResponse describeDatabasesResponse, MarshallerContext context) {

        describeDatabasesResponse
                .setRequestId(context.stringValue("DescribeDatabasesResponse.RequestId"));

        List<Database> databases = new ArrayList<Database>();
        for (int i = 0;
             i < context.lengthValue("DescribeDatabasesResponse.Databases.Length"); i++) {
            Database database = new Database();
            database.setDBName(
                    context.stringValue("DescribeDatabasesResponse.Databases[" + i + "].DBName"));
            database.setDBInstanceId(context.stringValue(
                    "DescribeDatabasesResponse.Databases[" + i + "].DBInstanceId"));
            database.setEngine(
                    context.stringValue("DescribeDatabasesResponse.Databases[" + i + "].Engine"));
            database.setDBStatus(DBStatus.getEnum(context.stringValue(
                    "DescribeDatabasesResponse.Databases[" + i + "].DBStatus")));
            database.setCharacterSetName(context.stringValue(
                    "DescribeDatabasesResponse.Databases[" + i + "].CharacterSetName"));
            database.setDBDescription(context.stringValue(
                    "DescribeDatabasesResponse.Databases[" + i + "].DBDescription"));

            List<AccountPrivilegeInfo> accounts = new ArrayList<AccountPrivilegeInfo>();
            for (int j = 0; j < context.lengthValue(
                    "DescribeDatabasesResponse.Databases[" + i + "].Accounts.Length"); j++) {
                AccountPrivilegeInfo accountPrivilegeInfo = new AccountPrivilegeInfo();
                accountPrivilegeInfo.setAccount(context.stringValue(
                        "DescribeDatabasesResponse.Databases[" + i + "].Accounts[" + j
                                + "].Account"));
                accountPrivilegeInfo.setAccountPrivilege(context.stringValue(
                        "DescribeDatabasesResponse.Databases[" + i + "].Accounts[" + j
                                + "].AccountPrivilege"));

                accounts.add(accountPrivilegeInfo);
            }
            database.setAccounts(accounts);

            databases.add(database);
        }
        describeDatabasesResponse.setDatabases(databases);

        return describeDatabasesResponse;
    }
}

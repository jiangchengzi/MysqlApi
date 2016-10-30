/*
 Mysql_REST_API
 */
package com.tycloud;

import java.util.List;

/**
 * @author houge
 */
public class DescribeDatabasesResponse extends TyResponse {

    private String requestId;

    private List<Database> databases;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Database> getDatabases() {
        return this.databases;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    public static class Database {

        private String dBName;

        private String dBInstanceId;

        private String engine;

        private DBStatus dBStatus;

        private String characterSetName;

        private String dBDescription;

        private List<AccountPrivilegeInfo> accounts;

        public String getDBName() {
            return this.dBName;
        }

        public void setDBName(String dBName) {
            this.dBName = dBName;
        }

        public String getDBInstanceId() {
            return this.dBInstanceId;
        }

        public void setDBInstanceId(String dBInstanceId) {
            this.dBInstanceId = dBInstanceId;
        }

        public String getEngine() {
            return this.engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public DBStatus getDBStatus() {
            return this.dBStatus;
        }

        public void setDBStatus(DBStatus dBStatus) {
            this.dBStatus = dBStatus;
        }

        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public void setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
        }

        public String getDBDescription() {
            return this.dBDescription;
        }

        public void setDBDescription(String dBDescription) {
            this.dBDescription = dBDescription;
        }

        public List<AccountPrivilegeInfo> getAccounts() {
            return this.accounts;
        }

        public void setAccounts(List<AccountPrivilegeInfo> accounts) {
            this.accounts = accounts;
        }

        public enum DBStatus {

            DELETING("Deleting"),
            RUNNING("Running"),
            CREATING("Creating"),;

            private String stringValue;

            DBStatus(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static DBStatus getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (DBStatus dBStatus : DBStatus.values()) {
                    if (dBStatus.getStringValue().equals(stringValue)) {
                        return dBStatus;
                    }
                }
                return null;
            }
        }

        public static class AccountPrivilegeInfo {

            private String account;

            private String accountPrivilege;

            public String getAccount() {
                return this.account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getAccountPrivilege() {
                return this.accountPrivilege;
            }

            public void setAccountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
            }
        }
    }

    @Override
    public DescribeDatabasesResponse getInstance(MarshallerContext context) {
        return DescribeDatabasesResponseMarshaller.marshall(this, context);
    }
}

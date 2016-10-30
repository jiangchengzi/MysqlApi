/*
 * Mysql_REST_API
 */
package com.tycloud;
/**
 * @author houge
 */
public class CreateDBInstanceResponse extends TyResponse {

    private String requestId;

    private String dBInstanceId;

    private String orderId;

    private String connectionString;

    private String port;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDBInstanceId() {
        return this.dBInstanceId;
    }

    public void setDBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public CreateDBInstanceResponse getInstance(MarshallerContext context) {
        return CreateDBInstanceResponseMarshaller.marshall(this, context);
    }
}

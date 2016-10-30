/*
  Mysql_REST_API
 */
package com.tycloud;

import java.util.ArrayList;
import java.util.List;

import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.AccountType;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ConnectionMode;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBInstanceNetType;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBInstanceStatus;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBInstanceType;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.LockMode;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ReadOnlyDBInstanceId;
import com.tycloud.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.SupportUpgradeAccountType;

public class DescribeDBInstanceAttributeResponseMarshaller {

    public static DescribeDBInstanceAttributeResponse marshall(
            DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse,
            MarshallerContext context) {

        describeDBInstanceAttributeResponse
                .setRequestId(context.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

        List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
        for (int i = 0;
             i < context.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
            DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
            dBInstanceAttribute.setInsId(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].InsId"));
            dBInstanceAttribute.setDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceId"));
            dBInstanceAttribute.setPayType(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].PayType"));
            dBInstanceAttribute.setDBInstanceClassType(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceClassType"));
            dBInstanceAttribute.setDBInstanceType(DBInstanceType.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceType")));
            dBInstanceAttribute.setRegionId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].RegionId"));
            dBInstanceAttribute.setConnectionString(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ConnectionString"));
            dBInstanceAttribute.setPort(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].Port"));
            dBInstanceAttribute.setEngine(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].Engine"));
            dBInstanceAttribute.setEngineVersion(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].EngineVersion"));
            dBInstanceAttribute.setDBInstanceClass(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceClass"));
            dBInstanceAttribute.setDBInstanceMemory(context.longValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceMemory"));
            dBInstanceAttribute.setDBInstanceStorage(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceStorage"));
            dBInstanceAttribute.setDBInstanceNetType(DBInstanceNetType.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceNetType")));
            dBInstanceAttribute.setDBInstanceStatus(DBInstanceStatus.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceStatus")));
            dBInstanceAttribute.setDBInstanceDescription(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceDescription"));
            dBInstanceAttribute.setLockMode(LockMode.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].LockMode")));
            dBInstanceAttribute.setLockReason(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].LockReason"));
            dBInstanceAttribute.setReadDelayTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ReadDelayTime"));
            dBInstanceAttribute.setDBMaxQuantity(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBMaxQuantity"));
            dBInstanceAttribute.setAccountMaxQuantity(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].AccountMaxQuantity"));
            dBInstanceAttribute.setCreationTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].CreationTime"));
            dBInstanceAttribute.setExpireTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ExpireTime"));
            dBInstanceAttribute.setMaintainTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MaintainTime"));
            dBInstanceAttribute.setAvailabilityValue(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].AvailabilityValue"));
            dBInstanceAttribute.setMaxIOPS(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MaxIOPS"));
            dBInstanceAttribute.setMaxConnections(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MaxConnections"));
            dBInstanceAttribute.setMasterInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MasterInstanceId"));
            dBInstanceAttribute.setDBInstanceCPU(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceCPU"));
            dBInstanceAttribute.setIncrementSourceDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i
                            + "].IncrementSourceDBInstanceId"));
            dBInstanceAttribute.setGuardDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].GuardDBInstanceId"));
            dBInstanceAttribute.setTempDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].TempDBInstanceId"));
            dBInstanceAttribute.setSecurityIPList(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].SecurityIPList"));
            dBInstanceAttribute.setZoneId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ZoneId"));
            dBInstanceAttribute.setInstanceNetworkType(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].InstanceNetworkType"));
            dBInstanceAttribute.setAccountType(AccountType.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].AccountType")));
            dBInstanceAttribute.setSupportUpgradeAccountType(SupportUpgradeAccountType.getEnum(
                    context.stringValue("DescribeDBInstanceAttributeResponse.Items[" + i
                            + "].SupportUpgradeAccountType")));
            dBInstanceAttribute.setVpcId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].VpcId"));
            dBInstanceAttribute.setConnectionMode(ConnectionMode.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ConnectionMode")));

            List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
            for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.Items[" + i
                    + "].ReadOnlyDBInstanceIds.Length"); j++) {
                ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
                readOnlyDBInstanceId.setDBInstanceId(context.stringValue(
                        "DescribeDBInstanceAttributeResponse.Items[" + i
                                + "].ReadOnlyDBInstanceIds[" + j + "].DBInstanceId"));

                readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
            }
            dBInstanceAttribute.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

            items.add(dBInstanceAttribute);
        }
        describeDBInstanceAttributeResponse.setItems(items);

        return describeDBInstanceAttributeResponse;
    }
}

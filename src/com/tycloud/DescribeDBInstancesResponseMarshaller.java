/*
  Mysql_REST_API
 */
package com.tycloud;


import java.util.ArrayList;
import java.util.List;

import com.tycloud.DescribeDBInstancesResponse.DBInstance;
import com.tycloud.DescribeDBInstancesResponse.DBInstance.ConnectionMode;
import com.tycloud.DescribeDBInstancesResponse.DBInstance.DBInstanceNetType;
import com.tycloud.DescribeDBInstancesResponse.DBInstance.DBInstanceStatus;
import com.tycloud.DescribeDBInstancesResponse.DBInstance.DBInstanceType;
import com.tycloud.DescribeDBInstancesResponse.DBInstance.LockMode;
import com.tycloud.DescribeDBInstancesResponse.DBInstance.ReadOnlyDBInstanceId;

public class DescribeDBInstancesResponseMarshaller {

    public static DescribeDBInstancesResponse marshall(
            DescribeDBInstancesResponse describeDBInstancesResponse, MarshallerContext context) {

        describeDBInstancesResponse
                .setRequestId(context.stringValue("DescribeDBInstancesResponse.RequestId"));
        describeDBInstancesResponse
                .setPageNumber(context.integerValue("DescribeDBInstancesResponse.PageNumber"));
        describeDBInstancesResponse.setTotalRecordCount(
                context.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));
        describeDBInstancesResponse.setPageRecordCount(
                context.integerValue("DescribeDBInstancesResponse.PageRecordCount"));

        List<DBInstance> items = new ArrayList<DBInstance>();
        for (int i = 0; i < context.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
            DBInstance dBInstance = new DBInstance();
            dBInstance.setInsId(
                    context.integerValue("DescribeDBInstancesResponse.Items[" + i + "].InsId"));
            dBInstance.setDBInstanceId(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].DBInstanceId"));
            dBInstance.setDBInstanceDescription(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].DBInstanceDescription"));
            dBInstance.setPayType(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].PayType"));
            dBInstance.setDBInstanceType(DBInstanceType.getEnum(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].DBInstanceType")));
            dBInstance.setRegionId(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].RegionId"));
            dBInstance.setExpireTime(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].ExpireTime"));
            dBInstance.setDBInstanceStatus(DBInstanceStatus.getEnum(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].DBInstanceStatus")));
            dBInstance.setEngine(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].Engine"));
            dBInstance.setDBInstanceNetType(DBInstanceNetType.getEnum(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].DBInstanceNetType")));
            dBInstance.setConnectionMode(ConnectionMode.getEnum(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].ConnectionMode")));
            dBInstance.setLockMode(LockMode.getEnum(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].LockMode")));
            dBInstance.setInstanceNetworkType(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].InstanceNetworkType"));
            dBInstance.setLockReason(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].LockReason"));
            dBInstance.setZoneId(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].ZoneId"));
            dBInstance.setMutriORsignle(context.booleanValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].MutriORsignle"));
            dBInstance.setCreateTime(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].CreateTime"));
            dBInstance.setEngineVersion(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].EngineVersion"));
            dBInstance.setGuardDBInstanceId(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].GuardDBInstanceId"));
            dBInstance.setTempDBInstanceId(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].TempDBInstanceId"));
            dBInstance.setMasterInstanceId(context.stringValue(
                    "DescribeDBInstancesResponse.Items[" + i + "].MasterInstanceId"));
            dBInstance.setVpcId(
                    context.stringValue("DescribeDBInstancesResponse.Items[" + i + "].VpcId"));

            List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds= new ArrayList<ReadOnlyDBInstanceId>();
            for (int j = 0; j < context.lengthValue("DescribeDBInstancesResponse.Items[" + i
                    + "].ReadOnlyDBInstanceIds.Length"); j++) {
                ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
                readOnlyDBInstanceId.setDBInstanceId(context.stringValue(
                        "DescribeDBInstancesResponse.Items[" + i + "].ReadOnlyDBInstanceIds[" + j
                                + "].DBInstanceId"));

                readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
            }
            dBInstance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

            items.add(dBInstance);
        }
        describeDBInstancesResponse.setItems(items);

        return describeDBInstancesResponse;
    }
}

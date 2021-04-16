import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.PurgeStatus purgeStatus1 = com.ibm.watson.data.client.model.enums.PurgeStatus.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value ''");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.ibm.watson.data.client.model.enums.PermissionMode permissionMode0 = com.ibm.watson.data.client.model.enums.PermissionMode.PRIVATE;
        java.lang.String str1 = permissionMode0.toString();
        org.junit.Assert.assertTrue("'" + permissionMode0 + "' != '" + com.ibm.watson.data.client.model.enums.PermissionMode.PRIVATE + "'", permissionMode0.equals(com.ibm.watson.data.client.model.enums.PermissionMode.PRIVATE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8" + "'", str1, "8");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.ibm.watson.data.client.model.enums.DatasourceTypeEnum datasourceTypeEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.DATABASE;
        java.lang.String str1 = datasourceTypeEnum0.getValue();
        org.junit.Assert.assertTrue("'" + datasourceTypeEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.DATABASE + "'", datasourceTypeEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.DATABASE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "database" + "'", str1, "database");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.TABULARCOLUMNTYPE;
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.TABULARCOLUMNTYPE + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.TABULARCOLUMNTYPE));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole dataSchemaFieldModelingRole0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.BOTH;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldModelingRole0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.BOTH + "'", dataSchemaFieldModelingRole0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.BOTH));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldType dataSchemaFieldType0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldType.TIME;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldType0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldType.TIME + "'", dataSchemaFieldType0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldType.TIME));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.ibm.watson.data.client.model.enums.PropertyType propertyType0 = com.ibm.watson.data.client.model.enums.PropertyType.STRING;
        org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.PropertyType.STRING + "'", propertyType0.equals(com.ibm.watson.data.client.model.enums.PropertyType.STRING));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.JobRunState jobRunState1 = com.ibm.watson.data.client.model.enums.JobRunState.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value ''");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.CONNECTION;
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.CONNECTION + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.CONNECTION));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure dataSchemaFieldMeasure1 = com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.fromValue("database");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'database'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse0 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse0.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        omrsProcessingStatusResponse0.setAllStatsZero((java.lang.Boolean) false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.ibm.watson.data.client.model.enums.ElementOrigin elementOrigin0 = com.ibm.watson.data.client.model.enums.ElementOrigin.EXTERNAL_SOURCE;
        org.junit.Assert.assertTrue("'" + elementOrigin0 + "' != '" + com.ibm.watson.data.client.model.enums.ElementOrigin.EXTERNAL_SOURCE + "'", elementOrigin0.equals(com.ibm.watson.data.client.model.enums.ElementOrigin.EXTERNAL_SOURCE));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.ibm.watson.data.client.model.ColumnTypeDetails columnTypeDetails0 = new com.ibm.watson.data.client.model.ColumnTypeDetails();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse1 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse1.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        boolean boolean4 = columnTypeDetails0.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.ibm.watson.data.client.model.enums.TargetModelType targetModelType0 = com.ibm.watson.data.client.model.enums.TargetModelType.HEADER;
        org.junit.Assert.assertTrue("'" + targetModelType0 + "' != '" + com.ibm.watson.data.client.model.enums.TargetModelType.HEADER + "'", targetModelType0.equals(com.ibm.watson.data.client.model.enums.TargetModelType.HEADER));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.ibm.watson.data.client.model.enums.DatasourceTypeEnum datasourceTypeEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.FILE;
        java.lang.String str1 = datasourceTypeEnum0.getValue();
        org.junit.Assert.assertTrue("'" + datasourceTypeEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.FILE + "'", datasourceTypeEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.FILE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "file" + "'", str1, "file");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ConnectionFlag connectionFlag1 = com.ibm.watson.data.client.model.enums.ConnectionFlag.fromValue("8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value '8'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog1 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo2 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo4 = failureInfo2.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse5 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse5.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob8 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray10 = new java.lang.Object[] { discoveryLog1, failureInfo4, omrsProcessingStatusResponse5, jobPostBodyJob8, "database" };
        java.util.ArrayList<java.lang.Object> objList11 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        deploymentEntity0.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList11);
        deploymentEntity0.setSpaceId("");
        org.junit.Assert.assertNotNull(failureInfo4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.ibm.watson.data.client.model.enums.PermissionMode permissionMode0 = com.ibm.watson.data.client.model.enums.PermissionMode.HIDDEN;
        org.junit.Assert.assertTrue("'" + permissionMode0 + "' != '" + com.ibm.watson.data.client.model.enums.PermissionMode.HIDDEN + "'", permissionMode0.equals(com.ibm.watson.data.client.model.enums.PermissionMode.HIDDEN));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState0 = com.ibm.watson.data.client.model.enums.MappableAssetState.NOT_DETERMINED;
        org.junit.Assert.assertTrue("'" + mappableAssetState0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.NOT_DETERMINED + "'", mappableAssetState0.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.NOT_DETERMINED));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        java.lang.Integer int1 = paginatedResourceWorkflow0.getLimit();
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog0 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType1 = com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION;
        boolean boolean2 = discoveryLog0.equals((java.lang.Object) mappableAssetType1);
        com.ibm.watson.data.client.model.enums.Severity severity3 = discoveryLog0.getSeverity();
        org.junit.Assert.assertTrue("'" + mappableAssetType1 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION + "'", mappableAssetType1.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(severity3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.ibm.watson.data.client.model.enums.GovernancePermissionAction governancePermissionAction0 = com.ibm.watson.data.client.model.enums.GovernancePermissionAction.READ;
        java.lang.String str1 = governancePermissionAction0.getValue();
        org.junit.Assert.assertTrue("'" + governancePermissionAction0 + "' != '" + com.ibm.watson.data.client.model.enums.GovernancePermissionAction.READ + "'", governancePermissionAction0.equals(com.ibm.watson.data.client.model.enums.GovernancePermissionAction.READ));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "read" + "'", str1, "read");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str1 = attachment0.toString();
        attachment0.setVersion((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str1, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState0 = com.ibm.watson.data.client.model.enums.MappableAssetState.INCOMPLETE;
        org.junit.Assert.assertTrue("'" + mappableAssetState0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.INCOMPLETE + "'", mappableAssetState0.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.INCOMPLETE));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity0 = new com.ibm.watson.data.client.model.PolicyRuleEntity();
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob1 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity2 = policyRuleEntity0.addTriggerItem((java.lang.Object) jobPostBodyJob1);
        policyRuleEntity2.setName("");
        java.lang.String str5 = policyRuleEntity2.toString();
        org.junit.Assert.assertNotNull(policyRuleEntity2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" + "'", str5, "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.SET;
        org.junit.Assert.assertTrue("'" + datasourceTypeConditionEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.SET + "'", datasourceTypeConditionEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.SET));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.ibm.watson.data.client.model.enums.BootstrapState bootstrapState0 = com.ibm.watson.data.client.model.enums.BootstrapState.NEW;
        org.junit.Assert.assertTrue("'" + bootstrapState0 + "' != '" + com.ibm.watson.data.client.model.enums.BootstrapState.NEW + "'", bootstrapState0.equals(com.ibm.watson.data.client.model.enums.BootstrapState.NEW));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.MessageReprocessingType messageReprocessingType1 = com.ibm.watson.data.client.model.enums.MessageReprocessingType.fromValue("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class PolicyRuleRequest {?    name: ?    description: null?    governanceTypeId: null?    trigger: [class JobPostBodyJob {?        assetRef: null?        name: null?        description: null?        schedule: null?        scheduleInfo: null?        _configuration: null?    }]?    action: null?    state: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.MATCHES;
        org.junit.Assert.assertTrue("'" + datasourceTypeConditionEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.MATCHES + "'", datasourceTypeConditionEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.MATCHES));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest0 = new com.ibm.watson.data.client.model.DeploymentEntityRequest();
        deploymentEntityRequest0.setName("database");
        com.ibm.watson.data.client.model.HardwareSpecRel hardwareSpecRel3 = deploymentEntityRequest0.getHardwareSpec();
        org.junit.Assert.assertNull(hardwareSpecRel3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse0 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse0.setReportTimestamp((java.lang.Long) 0L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest2 = deploymentEntity0.description("");
        deploymentEntity0.setSpaceId("8");
        com.ibm.watson.data.client.model.DeploymentEntityRequestPhysical deploymentEntityRequestPhysical5 = null;
        deploymentEntity0.setOnline(deploymentEntityRequestPhysical5);
        org.junit.Assert.assertNotNull(deploymentEntityRequest2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.ibm.watson.data.client.model.enums.ProjectToolType projectToolType0 = com.ibm.watson.data.client.model.enums.ProjectToolType.JUPYTER_NOTEBOOKS;
        org.junit.Assert.assertTrue("'" + projectToolType0 + "' != '" + com.ibm.watson.data.client.model.enums.ProjectToolType.JUPYTER_NOTEBOOKS + "'", projectToolType0.equals(com.ibm.watson.data.client.model.enums.ProjectToolType.JUPYTER_NOTEBOOKS));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.lang.String str2 = connectionEntity0.getDescription();
        connectionEntity0.setOriginCountry("database");
        java.util.List<com.ibm.watson.data.client.model.enums.ConnectionFlag> connectionFlagList5 = connectionEntity0.getFlags();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(connectionFlagList5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.DeployedAssetType deployedAssetType1 = com.ibm.watson.data.client.model.enums.DeployedAssetType.fromValue("class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class Member {?    userId: null?    userIamId: null?    accessGroupId: null?    role: null?    href: null?    createTime: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.StreamsFlowPatchState streamsFlowPatchState1 = com.ibm.watson.data.client.model.enums.StreamsFlowPatchState.fromValue("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'file'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.ibm.watson.data.client.model.PolicyRuleParameter policyRuleParameter0 = new com.ibm.watson.data.client.model.PolicyRuleParameter();
        java.util.List<java.lang.String> strList1 = policyRuleParameter0.getValue();
        com.ibm.watson.data.client.model.PolicyRuleParameter policyRuleParameter3 = policyRuleParameter0.name("read");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(policyRuleParameter3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.ibm.watson.data.client.model.JSONResourcePatchModel jSONResourcePatchModel0 = new com.ibm.watson.data.client.model.JSONResourcePatchModel();
        com.ibm.watson.data.client.model.enums.JsonPatchOperation jsonPatchOperation1 = null;
        jSONResourcePatchModel0.setOp(jsonPatchOperation1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState0 = com.ibm.watson.data.client.model.enums.MappableAssetState.READY_TO_CREATE;
        org.junit.Assert.assertTrue("'" + mappableAssetState0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.READY_TO_CREATE + "'", mappableAssetState0.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.READY_TO_CREATE));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.ibm.watson.data.client.model.enums.EntityStatus entityStatus0 = com.ibm.watson.data.client.model.enums.EntityStatus.DOES_NOT_EXIST;
        java.lang.String str1 = entityStatus0.toString();
        java.lang.String str2 = entityStatus0.toString();
        org.junit.Assert.assertTrue("'" + entityStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.EntityStatus.DOES_NOT_EXIST + "'", entityStatus0.equals(com.ibm.watson.data.client.model.enums.EntityStatus.DOES_NOT_EXIST));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DOES_NOT_EXIST" + "'", str1, "DOES_NOT_EXIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DOES_NOT_EXIST" + "'", str2, "DOES_NOT_EXIST");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship3 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity4 = writeableTermEntity2.addIsOfTermsItem(newRelationship3);
        java.lang.String[] strArray18 = new java.lang.String[] { "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "geospatial", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "hi!", "read", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "file", "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}", "database", "DOES_NOT_EXIST", "geospatial", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity21 = writeableTermEntity2.abbreviations((java.util.List<java.lang.String>) strList19);
        com.ibm.watson.data.client.model.Link link22 = new com.ibm.watson.data.client.model.Link();
        link22.setTitle("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        link22.setParams(strMap25);
        boolean boolean27 = writeableTermEntity21.equals((java.lang.Object) link22);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(writeableTermEntity4);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.ibm.watson.data.client.model.ColumnTypeDetails columnTypeDetails0 = new com.ibm.watson.data.client.model.ColumnTypeDetails();
        java.lang.Double double1 = columnTypeDetails0.getLength();
        boolean boolean3 = columnTypeDetails0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.ibm.watson.data.client.model.FailureInfo failureInfo0 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo2 = failureInfo0.camsVersion("geospatial");
        com.ibm.watson.data.client.model.FailureInfo failureInfo4 = failureInfo0.camsVersion("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.FailureInfo failureInfo6 = failureInfo0.thread("DOES_NOT_EXIST");
        java.lang.String str7 = failureInfo0.toString();
        org.junit.Assert.assertNotNull(failureInfo2);
        org.junit.Assert.assertNotNull(failureInfo4);
        org.junit.Assert.assertNotNull(failureInfo6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}" + "'", str7, "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        java.util.List<java.lang.String> strList1 = deploymentEntity0.getTags();
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        com.ibm.watson.data.client.model.enums.AssetCategory assetCategory1 = null;
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity2 = connectionEntity0.assetCategory(assetCategory1);
        connectionEntity0.setDatasourceType("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNotNull(connectionEntity2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest2 = deploymentEntity0.description("");
        com.ibm.watson.data.client.model.DeploymentEntityRequestPhysical deploymentEntityRequestPhysical3 = deploymentEntity0.getBatch();
        org.junit.Assert.assertNotNull(deploymentEntityRequest2);
        org.junit.Assert.assertNull(deploymentEntityRequestPhysical3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.ibm.watson.data.client.model.enums.BootstrapState bootstrapState0 = com.ibm.watson.data.client.model.enums.BootstrapState.STALLED;
        org.junit.Assert.assertTrue("'" + bootstrapState0 + "' != '" + com.ibm.watson.data.client.model.enums.BootstrapState.STALLED + "'", bootstrapState0.equals(com.ibm.watson.data.client.model.enums.BootstrapState.STALLED));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse0 = new com.ibm.watson.data.client.model.PaginatedAssetFileListResponse();
        paginatedAssetFileListResponse0.setOffset((java.lang.Integer) 0);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        paginatedAssetFileListResponse0.setNext(hrefModel3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.TABULARCOLUMN;
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.TABULARCOLUMN + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.TABULARCOLUMN));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.ibm.watson.data.client.model.enums.ConditionValues conditionValues0 = com.ibm.watson.data.client.model.enums.ConditionValues.REFERENCE_DATA;
        org.junit.Assert.assertTrue("'" + conditionValues0 + "' != '" + com.ibm.watson.data.client.model.enums.ConditionValues.REFERENCE_DATA + "'", conditionValues0.equals(com.ibm.watson.data.client.model.enums.ConditionValues.REFERENCE_DATA));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.ibm.watson.data.client.model.Variable variable0 = new com.ibm.watson.data.client.model.Variable();
        java.lang.String str1 = variable0.getName();
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource2 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray3 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList4 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList4, relationshipCreateResponseIdsArray3);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource6 = createRelationshipResponseResource2.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList4);
        variable0.setValue((java.lang.Object) relationshipCreateResponseIdsList4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.ibm.watson.data.client.model.ConnectionAssetSystemMetadata connectionAssetSystemMetadata0 = new com.ibm.watson.data.client.model.ConnectionAssetSystemMetadata();
        com.ibm.watson.data.client.model.ConnectionAssetSystemMetadata connectionAssetSystemMetadata2 = connectionAssetSystemMetadata0.assetType("");
        org.junit.Assert.assertNotNull(connectionAssetSystemMetadata2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.DeleteTarget deleteTarget1 = com.ibm.watson.data.client.model.enums.DeleteTarget.fromValue("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'file'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody0 = new com.ibm.watson.data.client.model.CreateRoleParamsBody();
        createRoleParamsBody0.setRoleName("geospatial");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.ibm.watson.data.client.model.enums.DatasourceTypeEnum datasourceTypeEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.DATABASE;
        java.lang.String str1 = datasourceTypeEnum0.toString();
        org.junit.Assert.assertTrue("'" + datasourceTypeEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.DATABASE + "'", datasourceTypeEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeEnum.DATABASE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "database" + "'", str1, "database");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest0 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray1 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList2, newRelationshipArray1);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest4 = classificationRelationshipsRequest0.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList2);
        com.ibm.watson.data.client.model.NewRelationship newRelationship5 = null;
        classificationRelationshipsRequest4.setParentCategory(newRelationship5);
        com.ibm.watson.data.client.model.NewRelationship newRelationship7 = classificationRelationshipsRequest4.getParentCategory();
        org.junit.Assert.assertNotNull(newRelationshipArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest4);
        org.junit.Assert.assertNull(newRelationship7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.ibm.watson.data.client.model.enums.PurgeStatus purgeStatus0 = com.ibm.watson.data.client.model.enums.PurgeStatus.NOT_PURGED;
        org.junit.Assert.assertTrue("'" + purgeStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.PurgeStatus.NOT_PURGED + "'", purgeStatus0.equals(com.ibm.watson.data.client.model.enums.PurgeStatus.NOT_PURGED));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity0 = new com.ibm.watson.data.client.model.PolicyRuleEntity();
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob1 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity2 = policyRuleEntity0.addTriggerItem((java.lang.Object) jobPostBodyJob1);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob4 = jobPostBodyJob1.schedule("class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}");
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob6 = jobPostBodyJob4.description("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        org.junit.Assert.assertNotNull(policyRuleEntity2);
        org.junit.Assert.assertNotNull(jobPostBodyJob4);
        org.junit.Assert.assertNotNull(jobPostBodyJob6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.ibm.watson.data.client.model.enums.FormPropertyType formPropertyType0 = com.ibm.watson.data.client.model.enums.FormPropertyType.ENUM;
        org.junit.Assert.assertTrue("'" + formPropertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.FormPropertyType.ENUM + "'", formPropertyType0.equals(com.ibm.watson.data.client.model.enums.FormPropertyType.ENUM));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.ibm.watson.data.client.model.ConnectionMetadata connectionMetadata0 = new com.ibm.watson.data.client.model.ConnectionMetadata();
        connectionMetadata0.setCatalogId("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship3 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity4 = writeableTermEntity2.addIsOfTermsItem(newRelationship3);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity6 = writeableTermEntity2.example("hi!");
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(writeableTermEntity4);
        org.junit.Assert.assertNotNull(writeableTermEntity6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType0 = com.ibm.watson.data.client.model.enums.MappableAssetType.TABULAR_COLUMN;
        org.junit.Assert.assertTrue("'" + mappableAssetType0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.TABULAR_COLUMN + "'", mappableAssetType0.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.TABULAR_COLUMN));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.ibm.watson.data.client.model.DiscoveredStringDetails discoveredStringDetails0 = new com.ibm.watson.data.client.model.DiscoveredStringDetails();
        java.lang.Long long1 = discoveredStringDetails0.getDistinctCount();
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.EQUALS;
        java.lang.String str1 = datasourceTypeConditionEnum0.getValue();
        org.junit.Assert.assertTrue("'" + datasourceTypeConditionEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.EQUALS + "'", datasourceTypeConditionEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.EQUALS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "equals" + "'", str1, "equals");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.WorkflowState workflowState1 = com.ibm.watson.data.client.model.enums.WorkflowState.fromValue("geospatial");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'geospatial'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow0.totalCount((java.lang.Long) 100L);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow4 = paginatedResourceWorkflow0.next(hrefModel3);
        com.ibm.watson.data.client.model.HrefModel hrefModel5 = paginatedResourceWorkflow4.getFirst();
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow2);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow4);
        org.junit.Assert.assertNull(hrefModel5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.Long long6 = rDVImportInfo0.getValuesCount();
        com.ibm.watson.data.client.model.Warnings[] warningsArray7 = new com.ibm.watson.data.client.model.Warnings[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Warnings> warningsList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.Warnings>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Warnings>) warningsList8, warningsArray7);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo10 = rDVImportInfo0.warnings((java.util.List<com.ibm.watson.data.client.model.Warnings>) warningsList8);
        java.lang.String str11 = rDVImportInfo0.getImportState();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(warningsArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rDVImportInfo10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity0 = new com.ibm.watson.data.client.model.PolicyRuleEntity();
        policyRuleEntity0.setDescription("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure dataSchemaFieldMeasure3 = com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.TYPELESS;
        boolean boolean4 = policyRuleEntity0.equals((java.lang.Object) dataSchemaFieldMeasure3);
        org.junit.Assert.assertTrue("'" + dataSchemaFieldMeasure3 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.TYPELESS + "'", dataSchemaFieldMeasure3.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.TYPELESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.DATABASE;
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.DATABASE + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.DATABASE));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.CONTAINS;
        org.junit.Assert.assertTrue("'" + datasourceTypeConditionEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.CONTAINS + "'", datasourceTypeConditionEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.CONTAINS));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.String str6 = rDVImportInfo0.getImportId();
        java.util.List<com.ibm.watson.data.client.model.Warnings> warningsList7 = rDVImportInfo0.getWarnings();
        rDVImportInfo0.setImportMessage("class FunctionEntitySchemas {\n    input: null\n    output: []\n}");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(warningsList7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.Severity severity1 = com.ibm.watson.data.client.model.enums.Severity.fromValue("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class FindAssetsResponse {?    totalRows: null?    results: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.ibm.watson.data.client.model.enums.ProjectToolType projectToolType0 = com.ibm.watson.data.client.model.enums.ProjectToolType.DATA_REFINERY;
        org.junit.Assert.assertTrue("'" + projectToolType0 + "' != '" + com.ibm.watson.data.client.model.enums.ProjectToolType.DATA_REFINERY + "'", projectToolType0.equals(com.ibm.watson.data.client.model.enums.ProjectToolType.DATA_REFINERY));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.ibm.watson.data.client.model.enums.ComputeType computeType0 = com.ibm.watson.data.client.model.enums.ComputeType.SPARK;
        java.lang.String str1 = computeType0.toString();
        org.junit.Assert.assertTrue("'" + computeType0 + "' != '" + com.ibm.watson.data.client.model.enums.ComputeType.SPARK + "'", computeType0.equals(com.ibm.watson.data.client.model.enums.ComputeType.SPARK));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "spark" + "'", str1, "spark");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.ibm.watson.data.client.model.Member member0 = new com.ibm.watson.data.client.model.Member();
        member0.setCreateTime("internal_use_only");
        member0.setUserId("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.ibm.watson.data.client.model.enums.WorkflowRelationshipType workflowRelationshipType0 = com.ibm.watson.data.client.model.enums.WorkflowRelationshipType.CHILD;
        org.junit.Assert.assertTrue("'" + workflowRelationshipType0 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowRelationshipType.CHILD + "'", workflowRelationshipType0.equals(com.ibm.watson.data.client.model.enums.WorkflowRelationshipType.CHILD));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.ibm.watson.data.client.model.ReferenceDataValuesList referenceDataValuesList0 = new com.ibm.watson.data.client.model.ReferenceDataValuesList();
        java.lang.String str1 = referenceDataValuesList0.toString();
        java.lang.String str2 = referenceDataValuesList0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ReferenceDataValuesList {\n    values: null\n}" + "'", str1, "class ReferenceDataValuesList {\n    values: null\n}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class ReferenceDataValuesList {\n    values: null\n}" + "'", str2, "class ReferenceDataValuesList {\n    values: null\n}");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity3 = connectionEntity0.addChildSourceSystemsItem(strMap2);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity5 = connectionEntity0.originCountry("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.Attachment attachment6 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment8 = attachment6.isReferenced((java.lang.Boolean) true);
        boolean boolean9 = connectionEntity0.equals((java.lang.Object) attachment8);
        java.lang.Long long10 = attachment8.getSize();
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader12 = attachment8.userData((java.lang.Object) "8");
        com.ibm.watson.data.client.model.Attachment attachment14 = attachment8.attachmentId("equals");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNotNull(connectionEntity3);
        org.junit.Assert.assertNotNull(connectionEntity5);
        org.junit.Assert.assertNotNull(attachment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(attachmentHeader12);
        org.junit.Assert.assertNotNull(attachment14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.AccessServiceStatus accessServiceStatus1 = com.ibm.watson.data.client.model.enums.AccessServiceStatus.fromValue("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class Attachment {?    assetType: null?    name: null?    description: null?    mime: null?    testDoc: null?    connectionId: null?    connectionPath: null?    objectKey: null?    userData: null?    isPartitioned: null?    assetCategory: null?    id: null?    version: null?    attachmentId: null?    datasourceType: null?    attachmentType: null?    href: null?    createdAt: null?    message: null?    creatorId: null?    createTime: null?    size: null?    isRemote: null?    isManaged: null?    isReferenced: true?    isObjectKeyReadOnly: null?    isUserProvidedPathKey: null?    transferComplete: false?    completeTimeTicks: null?    handle: null?    usage: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.MemberState memberState1 = com.ibm.watson.data.client.model.enums.MemberState.fromValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'hi!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.ibm.watson.data.client.model.Member member0 = new com.ibm.watson.data.client.model.Member();
        member0.setCreateTime("internal_use_only");
        member0.setUserId("internal_use_only");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.ibm.watson.data.client.model.enums.ExistsInWKC existsInWKC0 = com.ibm.watson.data.client.model.enums.ExistsInWKC.UNKNOWN;
        org.junit.Assert.assertTrue("'" + existsInWKC0 + "' != '" + com.ibm.watson.data.client.model.enums.ExistsInWKC.UNKNOWN + "'", existsInWKC0.equals(com.ibm.watson.data.client.model.enums.ExistsInWKC.UNKNOWN));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity4 = updatableTermEntity0.revision("read");
        java.lang.String str5 = updatableTermEntity0.getShortDescription();
        com.ibm.watson.data.client.model.Link link6 = new com.ibm.watson.data.client.model.Link();
        link6.setTitle("");
        boolean boolean9 = updatableTermEntity0.equals((java.lang.Object) link6);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(updatableTermEntity4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity0 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement[] customAttributeDefElementArray1 = new com.ibm.watson.data.client.model.CustomAttributeDefElement[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement> customAttributeDefElementList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList2, customAttributeDefElementArray1);
        customAttributeDefinitionEntity0.setElementsList((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList2);
        java.lang.Double double5 = customAttributeDefinitionEntity0.getMinimum();
        org.junit.Assert.assertNotNull(customAttributeDefElementArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.PermissionMode permissionMode1 = com.ibm.watson.data.client.model.enums.PermissionMode.fromValue((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value '1'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.FormPropertyType formPropertyType1 = com.ibm.watson.data.client.model.enums.FormPropertyType.fromValue("class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class Member {?    userId: null?    userIamId: null?    accessGroupId: null?    role: null?    href: null?    createTime: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.UserTaskAction userTaskAction1 = com.ibm.watson.data.client.model.enums.UserTaskAction.fromValue("class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class ProjectStorage {?    guid: null?    properties: null?    type: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource0 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray1 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList2, relationshipCreateResponseIdsArray1);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource4 = createRelationshipResponseResource0.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList2);
        java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList5 = createRelationshipResponseResource4.getTerms();
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource4);
        org.junit.Assert.assertNull(relationshipCreateResponseIdsList5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity0 = new com.ibm.watson.data.client.model.PolicyRuleEntity();
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob1 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity2 = policyRuleEntity0.addTriggerItem((java.lang.Object) jobPostBodyJob1);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob4 = jobPostBodyJob1.description("database");
        jobPostBodyJob1.setDescription("equals");
        org.junit.Assert.assertNotNull(policyRuleEntity2);
        org.junit.Assert.assertNotNull(jobPostBodyJob4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.ibm.watson.data.client.model.enums.WorkflowState workflowState0 = com.ibm.watson.data.client.model.enums.WorkflowState.RUNNING;
        org.junit.Assert.assertTrue("'" + workflowState0 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowState.RUNNING + "'", workflowState0.equals(com.ibm.watson.data.client.model.enums.WorkflowState.RUNNING));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.ibm.watson.data.client.model.enums.EntityStatus entityStatus0 = com.ibm.watson.data.client.model.enums.EntityStatus.DOES_NOT_EXIST;
        java.lang.String str1 = entityStatus0.toString();
        java.lang.String str2 = entityStatus0.getValue();
        org.junit.Assert.assertTrue("'" + entityStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.EntityStatus.DOES_NOT_EXIST + "'", entityStatus0.equals(com.ibm.watson.data.client.model.enums.EntityStatus.DOES_NOT_EXIST));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DOES_NOT_EXIST" + "'", str1, "DOES_NOT_EXIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DOES_NOT_EXIST" + "'", str2, "DOES_NOT_EXIST");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldType dataSchemaFieldType0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldType.INTEGER;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldType0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldType.INTEGER + "'", dataSchemaFieldType0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldType.INTEGER));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.ibm.watson.data.client.model.enums.DeployedAssetType deployedAssetType0 = com.ibm.watson.data.client.model.enums.DeployedAssetType.PY_SCRIPT;
        java.lang.String str1 = deployedAssetType0.getValue();
        java.lang.String str2 = deployedAssetType0.getValue();
        org.junit.Assert.assertTrue("'" + deployedAssetType0 + "' != '" + com.ibm.watson.data.client.model.enums.DeployedAssetType.PY_SCRIPT + "'", deployedAssetType0.equals(com.ibm.watson.data.client.model.enums.DeployedAssetType.PY_SCRIPT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "py_script" + "'", str1, "py_script");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "py_script" + "'", str2, "py_script");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage1 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.usage(metadataUsage1);
        java.lang.String str3 = attachmentDetail2.toString();
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader5 = attachmentDetail2.connectionId("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        java.lang.Boolean boolean6 = attachmentDetail2.getTransferComplete();
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}" + "'", str3, "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}");
        org.junit.Assert.assertNotNull(attachmentHeader5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.ibm.watson.data.client.model.enums.TargetModelType targetModelType0 = com.ibm.watson.data.client.model.enums.TargetModelType.PARAMETER;
        org.junit.Assert.assertTrue("'" + targetModelType0 + "' != '" + com.ibm.watson.data.client.model.enums.TargetModelType.PARAMETER + "'", targetModelType0.equals(com.ibm.watson.data.client.model.enums.TargetModelType.PARAMETER));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow0.totalCount((java.lang.Long) 100L);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow4 = paginatedResourceWorkflow0.next(hrefModel3);
        com.ibm.watson.data.client.model.HrefModel hrefModel5 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow6 = paginatedResourceWorkflow4.first(hrefModel5);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow2);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow4);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.ibm.watson.data.client.model.enums.MappableOMRSRelationship mappableOMRSRelationship0 = com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.CONNECTIONENDPOINT;
        org.junit.Assert.assertTrue("'" + mappableOMRSRelationship0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.CONNECTIONENDPOINT + "'", mappableOMRSRelationship0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.CONNECTIONENDPOINT));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.ibm.watson.data.client.model.enums.PurgeStatus purgeStatus0 = com.ibm.watson.data.client.model.enums.PurgeStatus.NOT_DETERMINED;
        org.junit.Assert.assertTrue("'" + purgeStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.PurgeStatus.NOT_DETERMINED + "'", purgeStatus0.equals(com.ibm.watson.data.client.model.enums.PurgeStatus.NOT_DETERMINED));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType datasourceTypePropertyType0 = com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.INTEGER;
        org.junit.Assert.assertTrue("'" + datasourceTypePropertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.INTEGER + "'", datasourceTypePropertyType0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.INTEGER));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog0 = new com.ibm.watson.data.client.model.DiscoveryLog();
        discoveryLog0.setMessage("class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.ibm.watson.data.client.model.enums.FormPropertyType formPropertyType0 = com.ibm.watson.data.client.model.enums.FormPropertyType.LONG;
        org.junit.Assert.assertTrue("'" + formPropertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.FormPropertyType.LONG + "'", formPropertyType0.equals(com.ibm.watson.data.client.model.enums.FormPropertyType.LONG));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow0.totalCount((java.lang.Long) 100L);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow4 = paginatedResourceWorkflow0.next(hrefModel3);
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow6 = paginatedResourceWorkflow0.offset((java.lang.Integer) 1);
        com.ibm.watson.data.client.model.Workflow[] workflowArray7 = new com.ibm.watson.data.client.model.Workflow[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Workflow> workflowList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.Workflow>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Workflow>) workflowList8, workflowArray7);
        paginatedResourceWorkflow0.setResources((java.util.List<com.ibm.watson.data.client.model.Workflow>) workflowList8);
        com.ibm.watson.data.client.model.HrefModel hrefModel11 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow12 = paginatedResourceWorkflow0.next(hrefModel11);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow2);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow4);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow6);
        org.junit.Assert.assertNotNull(workflowArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow12);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.ibm.watson.data.client.model.WriteableSpace writeableSpace0 = new com.ibm.watson.data.client.model.WriteableSpace();
        com.ibm.watson.data.client.model.enums.PropertyType propertyType1 = com.ibm.watson.data.client.model.enums.PropertyType.NUMBER;
        boolean boolean2 = writeableSpace0.equals((java.lang.Object) propertyType1);
        java.lang.String str3 = propertyType1.getValue();
        org.junit.Assert.assertTrue("'" + propertyType1 + "' != '" + com.ibm.watson.data.client.model.enums.PropertyType.NUMBER + "'", propertyType1.equals(com.ibm.watson.data.client.model.enums.PropertyType.NUMBER));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "number" + "'", str3, "number");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.ibm.watson.data.client.model.ColumnTypeDetails columnTypeDetails0 = new com.ibm.watson.data.client.model.ColumnTypeDetails();
        java.lang.Double double1 = columnTypeDetails0.getLength();
        java.lang.Boolean boolean2 = columnTypeDetails0.getUnique();
        columnTypeDetails0.setSigned((java.lang.Boolean) false);
        columnTypeDetails0.setScale((java.lang.Double) 10.0d);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.ibm.watson.data.client.model.DiscoveredAssetExtendedMetadataProperty discoveredAssetExtendedMetadataProperty0 = new com.ibm.watson.data.client.model.DiscoveredAssetExtendedMetadataProperty();
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo1 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo6 = rDVImportInfo1.skippedRowIndex((java.util.List<java.lang.Long>) longList4);
        com.ibm.watson.data.client.model.DiscoveredAssetExtendedMetadataProperty discoveredAssetExtendedMetadataProperty7 = discoveredAssetExtendedMetadataProperty0.value((java.lang.Object) longList4);
        com.ibm.watson.data.client.model.DiscoveredAssetExtendedMetadataProperty discoveredAssetExtendedMetadataProperty9 = discoveredAssetExtendedMetadataProperty0.name("py_script");
        java.lang.String str10 = discoveredAssetExtendedMetadataProperty0.toString();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo6);
        org.junit.Assert.assertNotNull(discoveredAssetExtendedMetadataProperty7);
        org.junit.Assert.assertNotNull(discoveredAssetExtendedMetadataProperty9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class DiscoveredAssetExtendedMetadataProperty {\n    name: py_script\n    value: [100]\n}" + "'", str10, "class DiscoveredAssetExtendedMetadataProperty {\n    name: py_script\n    value: [100]\n}");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.ibm.watson.data.client.model.enums.RuleType ruleType0 = com.ibm.watson.data.client.model.enums.RuleType.DATA;
        org.junit.Assert.assertTrue("'" + ruleType0 + "' != '" + com.ibm.watson.data.client.model.enums.RuleType.DATA + "'", ruleType0.equals(com.ibm.watson.data.client.model.enums.RuleType.DATA));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.ibm.watson.data.client.model.Variable variable0 = new com.ibm.watson.data.client.model.Variable();
        java.lang.Object obj1 = variable0.getValue();
        com.ibm.watson.data.client.model.ConnectionMetadata connectionMetadata2 = new com.ibm.watson.data.client.model.ConnectionMetadata();
        boolean boolean3 = variable0.equals((java.lang.Object) connectionMetadata2);
        java.lang.String str4 = connectionMetadata2.getCreatorId();
        com.ibm.watson.data.client.model.Metadata metadata6 = connectionMetadata2.addTagsItem("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        com.ibm.watson.data.client.model.enums.AssetCategory assetCategory7 = null;
        metadata6.setAssetCategory(assetCategory7);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(metadata6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        java.lang.String str1 = securitySyncConfig0.getSecuritySyncServerAuthorization();
        java.lang.String str2 = securitySyncConfig0.getSecurityServerURL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.ibm.watson.data.client.model.FailureInfo failureInfo0 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo2 = failureInfo0.camsVersion("geospatial");
        java.lang.String str3 = failureInfo0.getTimestamp();
        org.junit.Assert.assertNotNull(failureInfo2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.ibm.watson.data.client.model.AssetCreateResponse assetCreateResponse0 = new com.ibm.watson.data.client.model.AssetCreateResponse();
        java.util.Map<java.lang.String, com.ibm.watson.data.client.model.AbstractAssetEntity> strMap1 = null;
        com.ibm.watson.data.client.model.MetadataEntityResult metadataEntityResult2 = assetCreateResponse0.entity(strMap1);
        java.lang.String str3 = metadataEntityResult2.getHref();
        org.junit.Assert.assertNotNull(metadataEntityResult2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel0 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str1 = intermediateModel0.getProcess();
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel3 = intermediateModel0.name("completed");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(intermediateModel3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.ibm.watson.data.client.model.ModelResource modelResource0 = new com.ibm.watson.data.client.model.ModelResource();
        com.ibm.watson.data.client.model.ResourceMeta resourceMeta1 = null;
        modelResource0.setMetadata(resourceMeta1);
        com.ibm.watson.data.client.model.ResourceMeta resourceMeta3 = null;
        modelResource0.setMetadata(resourceMeta3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.ibm.watson.data.client.model.enums.JsonPatchOperation jsonPatchOperation0 = com.ibm.watson.data.client.model.enums.JsonPatchOperation.COPY;
        org.junit.Assert.assertTrue("'" + jsonPatchOperation0 + "' != '" + com.ibm.watson.data.client.model.enums.JsonPatchOperation.COPY + "'", jsonPatchOperation0.equals(com.ibm.watson.data.client.model.enums.JsonPatchOperation.COPY));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship3 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity4 = writeableTermEntity2.addIsOfTermsItem(newRelationship3);
        java.lang.String[] strArray18 = new java.lang.String[] { "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "geospatial", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "hi!", "read", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "file", "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}", "database", "DOES_NOT_EXIST", "geospatial", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity21 = writeableTermEntity2.abbreviations((java.util.List<java.lang.String>) strList19);
        com.ibm.watson.data.client.model.NewRelationship newRelationship22 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity23 = writeableTermEntity2.addSynonymTermsItem(newRelationship22);
        java.lang.String str24 = writeableTermEntity23.getImportSourceCreatedBy();
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(writeableTermEntity4);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity21);
        org.junit.Assert.assertNotNull(writeableTermEntity23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.Long long6 = rDVImportInfo0.getValuesCount();
        com.ibm.watson.data.client.model.Warnings[] warningsArray7 = new com.ibm.watson.data.client.model.Warnings[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Warnings> warningsList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.Warnings>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Warnings>) warningsList8, warningsArray7);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo10 = rDVImportInfo0.warnings((java.util.List<com.ibm.watson.data.client.model.Warnings>) warningsList8);
        java.lang.String str11 = rDVImportInfo0.getHref();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(warningsArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rDVImportInfo10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.ibm.watson.data.client.model.enums.TokenRole tokenRole0 = com.ibm.watson.data.client.model.enums.TokenRole.VIEWER;
        java.lang.String str1 = tokenRole0.getValue();
        org.junit.Assert.assertTrue("'" + tokenRole0 + "' != '" + com.ibm.watson.data.client.model.enums.TokenRole.VIEWER + "'", tokenRole0.equals(com.ibm.watson.data.client.model.enums.TokenRole.VIEWER));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "viewer" + "'", str1, "viewer");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.ibm.watson.data.client.model.CreateUserSuccessResponse createUserSuccessResponse0 = new com.ibm.watson.data.client.model.CreateUserSuccessResponse();
        java.lang.String str1 = createUserSuccessResponse0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}" + "'", str1, "class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.ibm.watson.data.client.model.ProjectToken projectToken0 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel1 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str2 = intermediateModel1.getProcess();
        boolean boolean3 = projectToken0.equals((java.lang.Object) str2);
        projectToken0.setGuid("class DiscoveredAssetExtendedMetadataProperty {\n    name: py_script\n    value: [100]\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage1 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.usage(metadataUsage1);
        java.lang.String str3 = attachmentDetail2.toString();
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader5 = attachmentDetail2.connectionId("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        java.util.Date date6 = null;
        attachmentDetail2.setCreatedAt(date6);
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}" + "'", str3, "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}");
        org.junit.Assert.assertNotNull(attachmentHeader5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        java.lang.String str1 = updatableTermEntity0.getLongDescription();
        java.util.List<com.ibm.watson.data.client.model.RelationshipObject> relationshipObjectList2 = updatableTermEntity0.getRelatedTermRelationships();
        com.ibm.watson.data.client.model.CustomAttribute customAttribute3 = null;
        com.ibm.watson.data.client.model.GlossaryObjectEntity glossaryObjectEntity4 = updatableTermEntity0.addCustomAttributesItem(customAttribute3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(relationshipObjectList2);
        org.junit.Assert.assertNotNull(glossaryObjectEntity4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.ibm.watson.data.client.model.ColumnTypeDetails columnTypeDetails0 = new com.ibm.watson.data.client.model.ColumnTypeDetails();
        columnTypeDetails0.setUnique((java.lang.Boolean) false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.ibm.watson.data.client.model.Link link0 = new com.ibm.watson.data.client.model.Link();
        java.lang.String str1 = link0.getType();
        java.lang.Object obj2 = link0.getUriBuilder();
        com.ibm.watson.data.client.model.Link link5 = link0.putParamsItem("class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(link5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.ibm.watson.data.client.model.WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new com.ibm.watson.data.client.model.WriteableGlossaryObjectEntity();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.NOT_ENDSWITH;
        org.junit.Assert.assertTrue("'" + datasourceTypeConditionEnum0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.NOT_ENDSWITH + "'", datasourceTypeConditionEnum0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.NOT_ENDSWITH));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.lang.String str2 = connectionEntity0.getDescription();
        connectionEntity0.setOriginCountry("database");
        com.ibm.watson.data.client.model.ConnectionInteractionProperties connectionInteractionProperties5 = connectionEntity0.getInteractionProperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = connectionEntity0.getProperties();
        java.util.List<com.ibm.watson.data.client.model.enums.ConnectionFlag> connectionFlagList7 = connectionEntity0.getFlags();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(connectionInteractionProperties5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(connectionFlagList7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata0.setName("8");
        java.util.Date date3 = null;
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata4 = glossaryObjectMetadata0.createdAt(date3);
        java.util.List<java.lang.String> strList5 = glossaryObjectMetadata0.getStewardIds();
        java.lang.Boolean boolean6 = glossaryObjectMetadata0.getRemoveEndDate();
        org.junit.Assert.assertNotNull(glossaryObjectMetadata4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldType dataSchemaFieldType0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldType.OBJECT;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldType0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldType.OBJECT + "'", dataSchemaFieldType0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldType.OBJECT));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        java.lang.String str3 = updatableTermEntity0.getRevision();
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity4 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail5 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage6 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail7 = attachmentDetail5.usage(metadataUsage6);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest8 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray9 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList10 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList10, newRelationshipArray9);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest12 = classificationRelationshipsRequest8.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList10);
        boolean boolean13 = attachmentDetail5.equals((java.lang.Object) newRelationshipList10);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity14 = newReferenceDataSetEntity4.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList10);
        updatableTermEntity0.setHasTerms((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList10);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attachmentDetail7);
        org.junit.Assert.assertNotNull(newRelationshipArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole dataSchemaFieldModelingRole0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.NONE;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldModelingRole0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.NONE + "'", dataSchemaFieldModelingRole0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.NONE));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship3 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity4 = writeableTermEntity2.addIsOfTermsItem(newRelationship3);
        java.lang.String[] strArray18 = new java.lang.String[] { "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "geospatial", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "hi!", "read", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "file", "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}", "database", "DOES_NOT_EXIST", "geospatial", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity21 = writeableTermEntity2.abbreviations((java.util.List<java.lang.String>) strList19);
        com.ibm.watson.data.client.model.ConformanceSuiteConfig conformanceSuiteConfig22 = new com.ibm.watson.data.client.model.ConformanceSuiteConfig();
        com.ibm.watson.data.client.model.NewRelationship newRelationship23 = new com.ibm.watson.data.client.model.NewRelationship();
        boolean boolean24 = conformanceSuiteConfig22.equals((java.lang.Object) newRelationship23);
        com.ibm.watson.data.client.model.NewRelationship newRelationship25 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray26 = new com.ibm.watson.data.client.model.NewRelationship[] { newRelationship23, newRelationship25 };
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList27 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList27, newRelationshipArray26);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity29 = writeableTermEntity21.isOfTerms((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList27);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(writeableTermEntity4);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(newRelationshipArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity29);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.ibm.watson.data.client.model.enums.MappableOMRSRelationship mappableOMRSRelationship0 = com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.SEMANTICASSIGNMENT;
        org.junit.Assert.assertTrue("'" + mappableOMRSRelationship0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.SEMANTICASSIGNMENT + "'", mappableOMRSRelationship0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.SEMANTICASSIGNMENT));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.ibm.watson.data.client.model.RDVGlossaryResource rDVGlossaryResource0 = new com.ibm.watson.data.client.model.RDVGlossaryResource();
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity responseReferenceDataValueEntity1 = null;
        com.ibm.watson.data.client.model.RDVGlossaryResource rDVGlossaryResource2 = rDVGlossaryResource0.addRdsValuesItem(responseReferenceDataValueEntity1);
        java.util.List<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity> responseReferenceDataValueEntityList3 = rDVGlossaryResource0.getRdsValues();
        org.junit.Assert.assertNotNull(rDVGlossaryResource2);
        org.junit.Assert.assertNotNull(responseReferenceDataValueEntityList3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.ibm.watson.data.client.model.enums.StreamsFlowState streamsFlowState0 = com.ibm.watson.data.client.model.enums.StreamsFlowState.STARTING;
        java.lang.String str1 = streamsFlowState0.getValue();
        org.junit.Assert.assertTrue("'" + streamsFlowState0 + "' != '" + com.ibm.watson.data.client.model.enums.StreamsFlowState.STARTING + "'", streamsFlowState0.equals(com.ibm.watson.data.client.model.enums.StreamsFlowState.STARTING));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "starting" + "'", str1, "starting");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.ibm.watson.data.client.model.Spaces spaces0 = new com.ibm.watson.data.client.model.Spaces();
        java.lang.Integer int1 = spaces0.getOffset();
        com.ibm.watson.data.client.model.HrefModel hrefModel2 = null;
        spaces0.setPrev(hrefModel2);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.ibm.watson.data.client.model.enums.PropertyType propertyType0 = com.ibm.watson.data.client.model.enums.PropertyType.OBJECT;
        org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.PropertyType.OBJECT + "'", propertyType0.equals(com.ibm.watson.data.client.model.enums.PropertyType.OBJECT));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload0 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.enums.ScoringType scoringType1 = scoringPayload0.getType();
        com.ibm.watson.data.client.model.InputDataArray inputDataArray3 = scoringPayload0.id("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        inputDataArray3.setId("class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}");
        org.junit.Assert.assertNull(scoringType1);
        org.junit.Assert.assertNotNull(inputDataArray3);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment2 = attachment0.isReferenced((java.lang.Boolean) true);
        java.lang.String str3 = attachment0.getMime();
        org.junit.Assert.assertNotNull(attachment2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.ibm.watson.data.client.model.enums.DatasourceTypeStatus datasourceTypeStatus0 = com.ibm.watson.data.client.model.enums.DatasourceTypeStatus.DEPRECATED;
        org.junit.Assert.assertTrue("'" + datasourceTypeStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeStatus.DEPRECATED + "'", datasourceTypeStatus0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeStatus.DEPRECATED));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.MemberState memberState1 = com.ibm.watson.data.client.model.enums.MemberState.fromValue("AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: 8\n    usage: null\n    href: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'AttachmentDetail{class AttachmentDetail {?    assetType: null?    name: null?    description: null?    mime: null?    testDoc: null?    connectionId: null?    connectionPath: null?    objectKey: null?    userData: null?    isPartitioned: null?    assetCategory: null?    attachmentId: null?    createdAt: null?    objectKeyIsReadOnly: null?    datasourceType: null?    url: null?    transferComplete: null?    size: null?    creatorId: 8?    usage: null?    href: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.ibm.watson.data.client.model.enums.ElementOrigin elementOrigin0 = com.ibm.watson.data.client.model.enums.ElementOrigin.LOCAL_COHORT;
        org.junit.Assert.assertTrue("'" + elementOrigin0 + "' != '" + com.ibm.watson.data.client.model.enums.ElementOrigin.LOCAL_COHORT + "'", elementOrigin0.equals(com.ibm.watson.data.client.model.enums.ElementOrigin.LOCAL_COHORT));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.ibm.watson.data.client.model.MetadataRov metadataRov0 = new com.ibm.watson.data.client.model.MetadataRov();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse1 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse1.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse5 = omrsProcessingStatusResponse1.numPendingDataAssets((java.lang.Long) 0L);
        java.lang.Long long6 = omrsProcessingStatusResponse1.getNumSyncedConnectionsCreated();
        boolean boolean7 = metadataRov0.equals((java.lang.Object) long6);
        java.util.Map<java.lang.String, com.ibm.watson.data.client.model.MemberHeader> strMap8 = null;
        metadataRov0.setCollaboratorIds(strMap8);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.ibm.watson.data.client.model.AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new com.ibm.watson.data.client.model.AssetAggregatedCommentsMetadata();
        assetAggregatedCommentsMetadata0.setDayOfEvent("viewer");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.ibm.watson.data.client.model.enums.GovernancePermissionAction governancePermissionAction0 = com.ibm.watson.data.client.model.enums.GovernancePermissionAction.READ;
        java.lang.String str1 = governancePermissionAction0.toString();
        java.lang.String str2 = governancePermissionAction0.toString();
        org.junit.Assert.assertTrue("'" + governancePermissionAction0 + "' != '" + com.ibm.watson.data.client.model.enums.GovernancePermissionAction.READ + "'", governancePermissionAction0.equals(com.ibm.watson.data.client.model.enums.GovernancePermissionAction.READ));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "read" + "'", str1, "read");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "read" + "'", str2, "read");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList0 = new com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = paginatedAssetAggregatedCommentsList0.getPrev();
        org.junit.Assert.assertNull(hrefModel1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.ibm.watson.data.client.model.enums.UserTaskState userTaskState0 = com.ibm.watson.data.client.model.enums.UserTaskState.CREATED;
        org.junit.Assert.assertTrue("'" + userTaskState0 + "' != '" + com.ibm.watson.data.client.model.enums.UserTaskState.CREATED + "'", userTaskState0.equals(com.ibm.watson.data.client.model.enums.UserTaskState.CREATED));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.ibm.watson.data.client.model.TypeDetails typeDetails0 = new com.ibm.watson.data.client.model.TypeDetails();
        java.lang.Integer int1 = typeDetails0.getScale();
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequestPhysical deploymentEntityRequestPhysical1 = null;
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest2 = deploymentEntity0.batch(deploymentEntityRequestPhysical1);
        org.junit.Assert.assertNotNull(deploymentEntityRequest2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.ibm.watson.data.client.model.enums.DeployedAssetType deployedAssetType0 = com.ibm.watson.data.client.model.enums.DeployedAssetType.FUNCTION;
        org.junit.Assert.assertTrue("'" + deployedAssetType0 + "' != '" + com.ibm.watson.data.client.model.enums.DeployedAssetType.FUNCTION + "'", deployedAssetType0.equals(com.ibm.watson.data.client.model.enums.DeployedAssetType.FUNCTION));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.creatorId("8");
        java.lang.String str3 = attachmentDetail0.getHref();
        attachmentDetail0.setCreatorId("spark");
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.ibm.watson.data.client.model.DataProfileExecution dataProfileExecution0 = new com.ibm.watson.data.client.model.DataProfileExecution();
        java.lang.Boolean boolean1 = dataProfileExecution0.getSupported();
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.ibm.watson.data.client.model.DiscoveredStringDetails discoveredStringDetails0 = new com.ibm.watson.data.client.model.DiscoveredStringDetails();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow1 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow3 = paginatedResourceWorkflow1.totalCount((java.lang.Long) 100L);
        com.ibm.watson.data.client.model.HrefModel hrefModel4 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow5 = paginatedResourceWorkflow1.next(hrefModel4);
        com.ibm.watson.data.client.model.HrefModel hrefModel6 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow7 = paginatedResourceWorkflow1.previous(hrefModel6);
        boolean boolean8 = discoveredStringDetails0.equals((java.lang.Object) paginatedResourceWorkflow1);
        discoveredStringDetails0.setValue("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow3);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow5);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody0 = new com.ibm.watson.data.client.model.UpdateProjectBody();
        com.ibm.watson.data.client.model.ProjectCatalog projectCatalog1 = null;
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody2 = updateProjectBody0.catalog(projectCatalog1);
        com.ibm.watson.data.client.model.ProjectCatalog projectCatalog3 = null;
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody4 = updateProjectBody2.catalog(projectCatalog3);
        updateProjectBody2.setPublic((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(updateProjectBody2);
        org.junit.Assert.assertNotNull(updateProjectBody4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.ibm.watson.data.client.model.StepInfo stepInfo0 = new com.ibm.watson.data.client.model.StepInfo();
        com.ibm.watson.data.client.model.StepInfo stepInfo2 = stepInfo0.name("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        stepInfo2.setTransformer("internal_use_only");
        java.util.Date date5 = stepInfo2.getStartedAt();
        org.junit.Assert.assertNotNull(stepInfo2);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity0 = new com.ibm.watson.data.client.model.ResponseRuleEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList1 = null;
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity2 = responseRuleEntity0.governsAssets(paginatedRelationshipsList1);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList3 = null;
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity4 = responseRuleEntity0.rules(paginatedRelationshipsList3);
        com.ibm.watson.data.client.model.CustomAttribute[] customAttributeArray5 = new com.ibm.watson.data.client.model.CustomAttribute[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttribute> customAttributeList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttribute>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttribute>) customAttributeList6, customAttributeArray5);
        responseRuleEntity4.setCustomAttributes((java.util.List<com.ibm.watson.data.client.model.CustomAttribute>) customAttributeList6);
        org.junit.Assert.assertNotNull(responseRuleEntity2);
        org.junit.Assert.assertNotNull(responseRuleEntity4);
        org.junit.Assert.assertNotNull(customAttributeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.UserType userType1 = com.ibm.watson.data.client.model.enums.UserType.fromValue("Governance");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'Governance'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload0 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.InputDataArray inputDataArray2 = scoringPayload0.addFieldsItem("hi!");
        java.util.List<java.util.List<java.lang.Object>> objListList3 = inputDataArray2.getValues();
        org.junit.Assert.assertNotNull(inputDataArray2);
        org.junit.Assert.assertNull(objListList3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.ibm.watson.data.client.model.ColumnTypeDetails columnTypeDetails0 = new com.ibm.watson.data.client.model.ColumnTypeDetails();
        java.lang.Double double1 = columnTypeDetails0.getLength();
        columnTypeDetails0.setScale((java.lang.Double) 100.0d);
        org.junit.Assert.assertNull(double1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.ibm.watson.data.client.model.BluemixCOSCredentials bluemixCOSCredentials0 = new com.ibm.watson.data.client.model.BluemixCOSCredentials();
        com.ibm.watson.data.client.model.Credentials credentials2 = bluemixCOSCredentials0.secretAccessKey("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        java.lang.String str3 = credentials2.getAccessKeyId();
        org.junit.Assert.assertNotNull(credentials2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.String str6 = rDVImportInfo0.getImportId();
        java.util.List<com.ibm.watson.data.client.model.Warnings> warningsList7 = rDVImportInfo0.getWarnings();
        java.lang.Long long8 = rDVImportInfo0.getValuesSkipped();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(warningsList7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis0 = new com.ibm.watson.data.client.model.ValueAnalysis();
        com.ibm.watson.data.client.model.DiscoveredFormatDetails[] discoveredFormatDetailsArray1 = new com.ibm.watson.data.client.model.DiscoveredFormatDetails[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DiscoveredFormatDetails> discoveredFormatDetailsList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.DiscoveredFormatDetails>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DiscoveredFormatDetails>) discoveredFormatDetailsList2, discoveredFormatDetailsArray1);
        valueAnalysis0.setFormatDistribution((java.util.List<com.ibm.watson.data.client.model.DiscoveredFormatDetails>) discoveredFormatDetailsList2);
        org.junit.Assert.assertNotNull(discoveredFormatDetailsArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType datasourceTypePropertyType0 = com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.ENUM;
        org.junit.Assert.assertTrue("'" + datasourceTypePropertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.ENUM + "'", datasourceTypePropertyType0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.ENUM));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.ibm.watson.data.client.model.SpaceScope spaceScope0 = new com.ibm.watson.data.client.model.SpaceScope();
        com.ibm.watson.data.client.model.SpaceScope spaceScope2 = spaceScope0.bssAccountId("file");
        java.lang.String str3 = spaceScope0.getBssAccountId();
        org.junit.Assert.assertNotNull(spaceScope2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "file" + "'", str3, "file");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.ibm.watson.data.client.model.PolicyResourceMetadata policyResourceMetadata0 = new com.ibm.watson.data.client.model.PolicyResourceMetadata();
        policyResourceMetadata0.setGuid("viewer");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo7 = rDVImportInfo0.valuesProcessed((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNotNull(rDVImportInfo7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.ibm.watson.data.client.model.StepInfo stepInfo0 = new com.ibm.watson.data.client.model.StepInfo();
        boolean boolean2 = stepInfo0.equals((java.lang.Object) 100.0f);
        java.util.Date date3 = null;
        com.ibm.watson.data.client.model.StepInfo stepInfo4 = stepInfo0.startedAt(date3);
        java.util.Date date5 = stepInfo4.getStartedAt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stepInfo4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity0 = new com.ibm.watson.data.client.model.PolicyRuleEntity();
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob1 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity2 = policyRuleEntity0.addTriggerItem((java.lang.Object) jobPostBodyJob1);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob4 = jobPostBodyJob1.schedule("class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}");
        com.ibm.watson.data.client.model.JobEntityJobScheduleInfo jobEntityJobScheduleInfo5 = null;
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob6 = jobPostBodyJob4.scheduleInfo(jobEntityJobScheduleInfo5);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob8 = jobPostBodyJob4.description("DOES_NOT_EXIST");
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob10 = jobPostBodyJob4.schedule("");
        com.ibm.watson.data.client.model.JobEntityJobScheduleInfo jobEntityJobScheduleInfo11 = jobPostBodyJob4.getScheduleInfo();
        org.junit.Assert.assertNotNull(policyRuleEntity2);
        org.junit.Assert.assertNotNull(jobPostBodyJob4);
        org.junit.Assert.assertNotNull(jobPostBodyJob6);
        org.junit.Assert.assertNotNull(jobPostBodyJob8);
        org.junit.Assert.assertNotNull(jobPostBodyJob10);
        org.junit.Assert.assertNull(jobEntityJobScheduleInfo11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.creatorId("8");
        java.lang.Boolean boolean3 = attachmentDetail2.getObjectKeyIsReadOnly();
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.ibm.watson.data.client.model.AssetTypeRelationship assetTypeRelationship0 = new com.ibm.watson.data.client.model.AssetTypeRelationship();
        com.ibm.watson.data.client.model.enums.DeleteTarget deleteTarget1 = null;
        assetTypeRelationship0.setOnDeleteTarget(deleteTarget1);
        com.ibm.watson.data.client.model.ConnectionMetadataUsage connectionMetadataUsage3 = new com.ibm.watson.data.client.model.ConnectionMetadataUsage();
        com.ibm.watson.data.client.model.ConnectionMetadataUsage connectionMetadataUsage5 = connectionMetadataUsage3.lastAccessorId("");
        java.util.Date date6 = connectionMetadataUsage3.getLastAccessTime();
        boolean boolean7 = assetTypeRelationship0.equals((java.lang.Object) connectionMetadataUsage3);
        org.junit.Assert.assertNotNull(connectionMetadataUsage5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.ibm.watson.data.client.model.Spaces spaces0 = new com.ibm.watson.data.client.model.Spaces();
        java.lang.String str1 = spaces0.toString();
        java.util.List<com.ibm.watson.data.client.model.Space> spaceList2 = spaces0.getResources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}" + "'", str1, "class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}");
        org.junit.Assert.assertNull(spaceList2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.ibm.watson.data.client.model.enums.ApprovalStatus approvalStatus0 = com.ibm.watson.data.client.model.enums.ApprovalStatus.APPROVED;
        java.lang.String str1 = approvalStatus0.toString();
        org.junit.Assert.assertTrue("'" + approvalStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.ApprovalStatus.APPROVED + "'", approvalStatus0.equals(com.ibm.watson.data.client.model.enums.ApprovalStatus.APPROVED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "approved" + "'", str1, "approved");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.ibm.watson.data.client.model.CohortMembership cohortMembership0 = new com.ibm.watson.data.client.model.CohortMembership();
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo1 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo6 = rDVImportInfo1.skippedRowIndex((java.util.List<java.lang.Long>) longList4);
        java.lang.Long long7 = rDVImportInfo1.getValuesCount();
        com.ibm.watson.data.client.model.Warnings[] warningsArray8 = new com.ibm.watson.data.client.model.Warnings[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Warnings> warningsList9 = new java.util.ArrayList<com.ibm.watson.data.client.model.Warnings>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Warnings>) warningsList9, warningsArray8);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo11 = rDVImportInfo1.warnings((java.util.List<com.ibm.watson.data.client.model.Warnings>) warningsList9);
        boolean boolean12 = cohortMembership0.equals((java.lang.Object) rDVImportInfo11);
        java.lang.String str13 = cohortMembership0.toString();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(warningsArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rDVImportInfo11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}" + "'", str13, "class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.ibm.watson.data.client.model.enums.ComputeType computeType0 = com.ibm.watson.data.client.model.enums.ComputeType.ANALYTICS_ENGINE;
        java.lang.String str1 = computeType0.toString();
        org.junit.Assert.assertTrue("'" + computeType0 + "' != '" + com.ibm.watson.data.client.model.enums.ComputeType.ANALYTICS_ENGINE + "'", computeType0.equals(com.ibm.watson.data.client.model.enums.ComputeType.ANALYTICS_ENGINE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "analytics_engine" + "'", str1, "analytics_engine");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.TokenRole tokenRole1 = com.ibm.watson.data.client.model.enums.TokenRole.fromValue("class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class CreateUserSuccessResponse {?    messageCode: null?    message: null?    user: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ProjectToolType projectToolType1 = com.ibm.watson.data.client.model.enums.ProjectToolType.fromValue("class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class CreateUserSuccessResponse {?    messageCode: null?    message: null?    user: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.ibm.watson.data.client.model.ReferenceDataValuesList referenceDataValuesList0 = new com.ibm.watson.data.client.model.ReferenceDataValuesList();
        java.lang.String str1 = referenceDataValuesList0.toString();
        com.ibm.watson.data.client.model.UpdateUserParamsBody updateUserParamsBody2 = new com.ibm.watson.data.client.model.UpdateUserParamsBody();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse3 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse3.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse7 = omrsProcessingStatusResponse3.numPendingDataAssets((java.lang.Long) 0L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse10 = omrsProcessingStatusResponse3.putNumNewRelationshipsReceivedItem("file", (java.lang.Long) 1L);
        boolean boolean11 = updateUserParamsBody2.equals((java.lang.Object) 1L);
        updateUserParamsBody2.setDisplayName("");
        boolean boolean14 = referenceDataValuesList0.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ReferenceDataValuesList {\n    values: null\n}" + "'", str1, "class ReferenceDataValuesList {\n    values: null\n}");
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse7);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.ibm.watson.data.client.model.StepInfo stepInfo0 = new com.ibm.watson.data.client.model.StepInfo();
        boolean boolean2 = stepInfo0.equals((java.lang.Object) 100.0f);
        java.util.Date date3 = null;
        com.ibm.watson.data.client.model.StepInfo stepInfo4 = stepInfo0.startedAt(date3);
        stepInfo0.setId("class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stepInfo4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.ibm.watson.data.client.model.ProjectToken projectToken0 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.ProjectToken projectToken2 = projectToken0.token("hi!");
        java.lang.String str3 = projectToken0.toString();
        org.junit.Assert.assertNotNull(projectToken2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}" + "'", str3, "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty0 = new com.ibm.watson.data.client.model.AssetTypeProperty();
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState1 = com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE;
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty2 = assetTypeProperty0.minimum((java.lang.Object) mappableAssetState1);
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty4 = assetTypeProperty2.readonly((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + mappableAssetState1 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE + "'", mappableAssetState1.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE));
        org.junit.Assert.assertNotNull(assetTypeProperty2);
        org.junit.Assert.assertNotNull(assetTypeProperty4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.ibm.watson.data.client.model.CreateRelationshipResponse createRelationshipResponse0 = new com.ibm.watson.data.client.model.CreateRelationshipResponse();
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource1 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray2 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList3 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList3, relationshipCreateResponseIdsArray2);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource5 = createRelationshipResponseResource1.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList3);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray6 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList7 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList7, relationshipCreateResponseIdsArray6);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource9 = createRelationshipResponseResource1.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList7);
        createRelationshipResponseResource1.setVersionId("geospatial");
        com.ibm.watson.data.client.model.CreateRelationshipResponse createRelationshipResponse12 = createRelationshipResponse0.addResourcesItem(createRelationshipResponseResource1);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource5);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource9);
        org.junit.Assert.assertNotNull(createRelationshipResponse12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch0 = new com.ibm.watson.data.client.model.CatalogSearch();
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch2 = catalogSearch0.limit((java.lang.Integer) 0);
        catalogSearch2.setQuery("class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}");
        org.junit.Assert.assertNotNull(catalogSearch2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity0 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList1 = null;
        responsePolicyEntity0.setTerms(paginatedRelationshipsList1);
        com.ibm.watson.data.client.model.PaginatedParentRelationshipsList paginatedParentRelationshipsList3 = responsePolicyEntity0.getRetParentCategoryRelationship();
        org.junit.Assert.assertNull(paginatedParentRelationshipsList3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.ibm.watson.data.client.model.AttachmentRequest attachmentRequest0 = new com.ibm.watson.data.client.model.AttachmentRequest();
        attachmentRequest0.setObjectKeyIsReadOnly((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = attachmentRequest0.getObjectKeyIsReadOnly();
        attachmentRequest0.setPrivateUrl((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity0 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList1 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity2 = responsePolicyEntity0.rules(paginatedRelationshipsList1);
        org.junit.Assert.assertNotNull(responsePolicyEntity2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.ibm.watson.data.client.model.PolicyResourceMetadata policyResourceMetadata0 = new com.ibm.watson.data.client.model.PolicyResourceMetadata();
        policyResourceMetadata0.setModifier("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.ibm.watson.data.client.model.enums.MappableEntityType mappableEntityType0 = com.ibm.watson.data.client.model.enums.MappableEntityType.GLOSSARY_TERM;
        java.lang.String str1 = mappableEntityType0.getValue();
        org.junit.Assert.assertTrue("'" + mappableEntityType0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableEntityType.GLOSSARY_TERM + "'", mappableEntityType0.equals(com.ibm.watson.data.client.model.enums.MappableEntityType.GLOSSARY_TERM));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GLOSSARY_TERM" + "'", str1, "GLOSSARY_TERM");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.ibm.watson.data.client.model.enums.EventTypeFilter eventTypeFilter0 = com.ibm.watson.data.client.model.enums.EventTypeFilter.REGISTRATION_ONLY;
        org.junit.Assert.assertTrue("'" + eventTypeFilter0 + "' != '" + com.ibm.watson.data.client.model.enums.EventTypeFilter.REGISTRATION_ONLY + "'", eventTypeFilter0.equals(com.ibm.watson.data.client.model.enums.EventTypeFilter.REGISTRATION_ONLY));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.ibm.watson.data.client.model.Projects projects0 = new com.ibm.watson.data.client.model.Projects();
        java.lang.Integer int1 = projects0.getTotalResults();
        java.lang.Integer int2 = projects0.getTotalResults();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.ibm.watson.data.client.model.JobEntityJobScheduleInfo jobEntityJobScheduleInfo0 = new com.ibm.watson.data.client.model.JobEntityJobScheduleInfo();
        java.lang.Integer int1 = jobEntityJobScheduleInfo0.getEndOn();
        com.ibm.watson.data.client.model.JobEntityJobScheduleInfo jobEntityJobScheduleInfo3 = jobEntityJobScheduleInfo0.repeat((java.lang.Boolean) false);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(jobEntityJobScheduleInfo3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload0 = new com.ibm.watson.data.client.model.ScoringPayload();
        java.util.List<java.util.List<java.lang.Object>> objListList1 = scoringPayload0.getTargets();
        java.util.List<java.util.List<java.lang.Object>> objListList2 = scoringPayload0.getTargets();
        java.util.List<java.lang.String> strList3 = scoringPayload0.getFields();
        org.junit.Assert.assertNull(objListList1);
        org.junit.Assert.assertNull(objListList2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.ibm.watson.data.client.model.DeploymentEntityStatus deploymentEntityStatus0 = new com.ibm.watson.data.client.model.DeploymentEntityStatus();
        com.ibm.watson.data.client.model.WMLError wMLError1 = deploymentEntityStatus0.getFailure();
        com.ibm.watson.data.client.model.enums.DeploymentState deploymentState2 = null;
        com.ibm.watson.data.client.model.DeploymentEntityStatus deploymentEntityStatus3 = deploymentEntityStatus0.state(deploymentState2);
        com.ibm.watson.data.client.model.UrlDetails urlDetails4 = deploymentEntityStatus3.getOnlineUrl();
        org.junit.Assert.assertNull(wMLError1);
        org.junit.Assert.assertNotNull(deploymentEntityStatus3);
        org.junit.Assert.assertNull(urlDetails4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata0 = new com.ibm.watson.data.client.model.WorkflowMetadata();
        workflowMetadata0.setDescription("class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.ibm.watson.data.client.model.enums.ConditionValues conditionValues0 = com.ibm.watson.data.client.model.enums.ConditionValues.RULE;
        org.junit.Assert.assertTrue("'" + conditionValues0 + "' != '" + com.ibm.watson.data.client.model.enums.ConditionValues.RULE + "'", conditionValues0.equals(com.ibm.watson.data.client.model.enums.ConditionValues.RULE));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity0 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity0.getCategories();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList2 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity3 = responsePolicyEntity0.terms(paginatedRelationshipsList2);
        com.ibm.watson.data.client.model.RelationshipParentRelationshipEntity relationshipParentRelationshipEntity4 = responsePolicyEntity3.getParentPolicy();
        org.junit.Assert.assertNull(paginatedRelationshipsList1);
        org.junit.Assert.assertNotNull(responsePolicyEntity3);
        org.junit.Assert.assertNull(relationshipParentRelationshipEntity4);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ConditionValues conditionValues1 = com.ibm.watson.data.client.model.enums.ConditionValues.fromValue("class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class CreateUserSuccessResponse {?    messageCode: null?    message: null?    user: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity0 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement[] customAttributeDefElementArray1 = new com.ibm.watson.data.client.model.CustomAttributeDefElement[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement> customAttributeDefElementList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList2, customAttributeDefElementArray1);
        customAttributeDefinitionEntity0.setElementsList((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList2);
        java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement> customAttributeDefElementList5 = customAttributeDefinitionEntity0.getElementsList();
        org.junit.Assert.assertNotNull(customAttributeDefElementArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(customAttributeDefElementList5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.ibm.watson.data.client.model.DataProfileAttachment dataProfileAttachment0 = new com.ibm.watson.data.client.model.DataProfileAttachment();
        com.ibm.watson.data.client.model.DataProfileColumn[] dataProfileColumnArray1 = new com.ibm.watson.data.client.model.DataProfileColumn[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DataProfileColumn> dataProfileColumnList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.DataProfileColumn>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DataProfileColumn>) dataProfileColumnList2, dataProfileColumnArray1);
        dataProfileAttachment0.setColumns((java.util.List<com.ibm.watson.data.client.model.DataProfileColumn>) dataProfileColumnList2);
        org.junit.Assert.assertNotNull(dataProfileColumnArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig0 = new com.ibm.watson.data.client.model.DiscoveryServerConfig();
        java.util.List<java.lang.String> strList1 = discoveryServerConfig0.getDiscoveryEngineGUIDs();
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig3 = discoveryServerConfig0.accessServiceRootURL("geospatial");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(discoveryServerConfig3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.ibm.watson.data.client.model.enums.MappableEntityType mappableEntityType0 = com.ibm.watson.data.client.model.enums.MappableEntityType.COLUMN;
        org.junit.Assert.assertTrue("'" + mappableEntityType0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableEntityType.COLUMN + "'", mappableEntityType0.equals(com.ibm.watson.data.client.model.enums.MappableEntityType.COLUMN));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource0 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray1 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList2, relationshipCreateResponseIdsArray1);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource4 = createRelationshipResponseResource0.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList2);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray5 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList6, relationshipCreateResponseIdsArray5);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource8 = createRelationshipResponseResource0.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList6);
        java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList9 = createRelationshipResponseResource0.getCategories();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds relationshipCreateResponseIds10 = null;
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource11 = createRelationshipResponseResource0.addChildItem(relationshipCreateResponseIds10);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds relationshipCreateResponseIds12 = null;
        createRelationshipResponseResource11.setParentCategory(relationshipCreateResponseIds12);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds relationshipCreateResponseIds14 = null;
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource15 = createRelationshipResponseResource11.parentCategory(relationshipCreateResponseIds14);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource4);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource8);
        org.junit.Assert.assertNull(relationshipCreateResponseIdsList9);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource11);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState0 = com.ibm.watson.data.client.model.enums.MappableAssetState.PURGE_PENDING;
        org.junit.Assert.assertTrue("'" + mappableAssetState0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.PURGE_PENDING + "'", mappableAssetState0.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.PURGE_PENDING));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.ibm.watson.data.client.model.SpaceScope spaceScope0 = new com.ibm.watson.data.client.model.SpaceScope();
        com.ibm.watson.data.client.model.SpaceScope spaceScope2 = spaceScope0.bssAccountId("file");
        java.lang.String str3 = spaceScope2.toString();
        org.junit.Assert.assertNotNull(spaceScope2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class SpaceScope {\n    bssAccountId: file\n}" + "'", str3, "class SpaceScope {\n    bssAccountId: file\n}");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.ibm.watson.data.client.model.StepInfo stepInfo0 = new com.ibm.watson.data.client.model.StepInfo();
        boolean boolean2 = stepInfo0.equals((java.lang.Object) 100.0f);
        java.util.Date date3 = null;
        com.ibm.watson.data.client.model.StepInfo stepInfo4 = stepInfo0.startedAt(date3);
        java.math.BigDecimal bigDecimal5 = null;
        com.ibm.watson.data.client.model.StepInfo stepInfo6 = stepInfo4.score(bigDecimal5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stepInfo4);
        org.junit.Assert.assertNotNull(stepInfo6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.ibm.watson.data.client.model.enums.RuleType ruleType0 = com.ibm.watson.data.client.model.enums.RuleType.DATAPROTECTION;
        org.junit.Assert.assertTrue("'" + ruleType0 + "' != '" + com.ibm.watson.data.client.model.enums.RuleType.DATAPROTECTION + "'", ruleType0.equals(com.ibm.watson.data.client.model.enums.RuleType.DATAPROTECTION));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.ibm.watson.data.client.model.enums.GovernancePermissionAction governancePermissionAction0 = com.ibm.watson.data.client.model.enums.GovernancePermissionAction.VIEW_PUBLISHED;
        org.junit.Assert.assertTrue("'" + governancePermissionAction0 + "' != '" + com.ibm.watson.data.client.model.enums.GovernancePermissionAction.VIEW_PUBLISHED + "'", governancePermissionAction0.equals(com.ibm.watson.data.client.model.enums.GovernancePermissionAction.VIEW_PUBLISHED));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ExistsInWKC existsInWKC1 = com.ibm.watson.data.client.model.enums.ExistsInWKC.fromValue("GLOSSARY_TERM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'GLOSSARY_TERM'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldType dataSchemaFieldType0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldType.OTHER;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldType0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldType.OTHER + "'", dataSchemaFieldType0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldType.OTHER));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.ibm.watson.data.client.model.FailureInfo failureInfo0 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo2 = failureInfo0.camsVersion("geospatial");
        com.ibm.watson.data.client.model.FailureInfo failureInfo4 = failureInfo0.camsVersion("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.FailureInfo failureInfo6 = failureInfo0.thread("DOES_NOT_EXIST");
        com.ibm.watson.data.client.model.FailureInfo failureInfo8 = failureInfo6.camsInstance("class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}");
        org.junit.Assert.assertNotNull(failureInfo2);
        org.junit.Assert.assertNotNull(failureInfo4);
        org.junit.Assert.assertNotNull(failureInfo6);
        org.junit.Assert.assertNotNull(failureInfo8);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity0 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail1 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage2 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail3 = attachmentDetail1.usage(metadataUsage2);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest4 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray5 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList6, newRelationshipArray5);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest8 = classificationRelationshipsRequest4.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList6);
        boolean boolean9 = attachmentDetail1.equals((java.lang.Object) newRelationshipList6);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity10 = newReferenceDataSetEntity0.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList6);
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity12 = newReferenceDataSetEntity10.type("internal_use_only");
        java.lang.String str13 = newReferenceDataSetEntity10.getName();
        java.lang.String str14 = newReferenceDataSetEntity10.getLongDescription();
        org.junit.Assert.assertNotNull(attachmentDetail3);
        org.junit.Assert.assertNotNull(newRelationshipArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity10);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata0 = new com.ibm.watson.data.client.model.ArtifactMetadata();
        com.ibm.watson.data.client.model.enums.ArtifactState artifactState1 = artifactMetadata0.getState();
        org.junit.Assert.assertNull(artifactState1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField0 = new com.ibm.watson.data.client.model.AssetTypeField();
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField2 = assetTypeField0.key("equals");
        java.lang.String str3 = assetTypeField0.toString();
        org.junit.Assert.assertNotNull(assetTypeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}" + "'", str3, "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.ibm.watson.data.client.model.DataProfile dataProfile0 = new com.ibm.watson.data.client.model.DataProfile();
        com.ibm.watson.data.client.model.DataProfile dataProfile2 = dataProfile0.href("file");
        com.ibm.watson.data.client.model.EntityDataProfile entityDataProfile3 = null;
        com.ibm.watson.data.client.model.DataProfile dataProfile4 = dataProfile2.entity(entityDataProfile3);
        com.ibm.watson.data.client.model.EntityDataProfile entityDataProfile5 = dataProfile2.getEntity();
        org.junit.Assert.assertNotNull(dataProfile2);
        org.junit.Assert.assertNotNull(dataProfile4);
        org.junit.Assert.assertNull(entityDataProfile5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.ibm.watson.data.client.model.Condition condition0 = new com.ibm.watson.data.client.model.Condition();
        condition0.setType("equals");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.ibm.watson.data.client.model.enums.UserTaskState userTaskState0 = com.ibm.watson.data.client.model.enums.UserTaskState.COMPLETED;
        java.lang.String str1 = userTaskState0.getValue();
        java.lang.String str2 = userTaskState0.toString();
        org.junit.Assert.assertTrue("'" + userTaskState0 + "' != '" + com.ibm.watson.data.client.model.enums.UserTaskState.COMPLETED + "'", userTaskState0.equals(com.ibm.watson.data.client.model.enums.UserTaskState.COMPLETED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "completed" + "'", str1, "completed");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "completed" + "'", str2, "completed");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.UserTaskAction userTaskAction1 = com.ibm.watson.data.client.model.enums.UserTaskAction.fromValue("analytics_engine");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'analytics_engine'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch0 = new com.ibm.watson.data.client.model.CatalogSearch();
        java.lang.Integer int1 = catalogSearch0.getLimit();
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch3 = catalogSearch0.sort("AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(catalogSearch3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.ibm.watson.data.client.ApiClient.CollectionFormat collectionFormat0 = com.ibm.watson.data.client.ApiClient.CollectionFormat.CSV;
        org.junit.Assert.assertTrue("'" + collectionFormat0 + "' != '" + com.ibm.watson.data.client.ApiClient.CollectionFormat.CSV + "'", collectionFormat0.equals(com.ibm.watson.data.client.ApiClient.CollectionFormat.CSV));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader0 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader();
        java.lang.Boolean boolean1 = customAttributeDefinitionEntityHeader0.getHidden();
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader3 = customAttributeDefinitionEntityHeader0.description("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntityHeader3);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse0 = new com.ibm.watson.data.client.model.ReprocessMessagesResponse();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse2 = reprocessMessagesResponse0.entityGuidsSubmitted(strMap1);
        com.ibm.watson.data.client.model.ReprocessMessagesOptions reprocessMessagesOptions3 = reprocessMessagesResponse0.getOptions();
        org.junit.Assert.assertNotNull(reprocessMessagesResponse2);
        org.junit.Assert.assertNull(reprocessMessagesOptions3);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity3 = connectionEntity0.addChildSourceSystemsItem(strMap2);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity5 = connectionEntity0.originCountry("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.Attachment attachment6 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment8 = attachment6.isReferenced((java.lang.Boolean) true);
        boolean boolean9 = connectionEntity0.equals((java.lang.Object) attachment8);
        java.lang.Long long10 = attachment8.getSize();
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader12 = attachment8.userData((java.lang.Object) "8");
        com.ibm.watson.data.client.model.AttachmentHandle attachmentHandle13 = null;
        attachment8.setHandle(attachmentHandle13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNotNull(connectionEntity3);
        org.junit.Assert.assertNotNull(connectionEntity5);
        org.junit.Assert.assertNotNull(attachment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(attachmentHeader12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.MemberState memberState1 = com.ibm.watson.data.client.model.enums.MemberState.fromValue("class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class UpdatableTermEntity {?    longDescription: null?    state: null?    customAttributes: null?    name: null?    shortDescription: null?    effectiveStartDate: null?    effectiveEndDate: null?    tags: null?    stewardIds: null?    parentCategory: null?    categories: null?    abbreviations: null?    importSourceCreatedBy: null?    importSourceCreatedOn: null?    importSourceUsage: null?    example: class CatalogSearch {?        query: null?        limit: null?        counts: null?        drilldown: null?        sort: null?        include: null?    }?    relatedTermRelationships: null?    isATypeOfTerms: null?    hasTypeTerms: null?    isOfTerms: null?    hasTerms: null?    synonymTerms: null?    relatedTerms: null?    replacesTerms: null?    replacedByTerms: null?    dataClasses: null?    classifications: null?    revision: read?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.ibm.watson.data.client.model.Spaces spaces0 = new com.ibm.watson.data.client.model.Spaces();
        java.lang.Integer int1 = spaces0.getOffset();
        com.ibm.watson.data.client.model.PaginatedList paginatedList3 = spaces0.offset((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(paginatedList3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig0 = new com.ibm.watson.data.client.model.OpenLineageConfig();
        openLineageConfig0.setOpenLineageName("");
        openLineageConfig0.setOpenLineageDescription("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        java.lang.String str5 = openLineageConfig0.getOpenLineageName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis0 = new com.ibm.watson.data.client.model.ValueAnalysis();
        com.ibm.watson.data.client.model.JSONResourcePatchModel jSONResourcePatchModel1 = new com.ibm.watson.data.client.model.JSONResourcePatchModel();
        jSONResourcePatchModel1.setValue((java.lang.Object) "");
        valueAnalysis0.setMinHashSignature((java.lang.Object) jSONResourcePatchModel1);
        com.ibm.watson.data.client.model.DiscoveredNumericDetails[] discoveredNumericDetailsArray5 = new com.ibm.watson.data.client.model.DiscoveredNumericDetails[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DiscoveredNumericDetails> discoveredNumericDetailsList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.DiscoveredNumericDetails>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DiscoveredNumericDetails>) discoveredNumericDetailsList6, discoveredNumericDetailsArray5);
        valueAnalysis0.setLengthDistribution((java.util.List<com.ibm.watson.data.client.model.DiscoveredNumericDetails>) discoveredNumericDetailsList6);
        com.ibm.watson.data.client.model.DiscoveredClass discoveredClass9 = valueAnalysis0.getInferredClass();
        org.junit.Assert.assertNotNull(discoveredNumericDetailsArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(discoveredClass9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload0 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.enums.ScoringType scoringType1 = scoringPayload0.getType();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity2 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog3 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo4 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo6 = failureInfo4.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse7 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse7.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob10 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray12 = new java.lang.Object[] { discoveryLog3, failureInfo6, omrsProcessingStatusResponse7, jobPostBodyJob10, "database" };
        java.util.ArrayList<java.lang.Object> objList13 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList13, objArray12);
        deploymentEntity2.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList13);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList16 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean17 = objListList16.add((java.util.List<java.lang.Object>) objList13);
        scoringPayload0.setValues((java.util.List<java.util.List<java.lang.Object>>) objListList16);
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty19 = new com.ibm.watson.data.client.model.AssetTypeProperty();
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState20 = com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE;
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty21 = assetTypeProperty19.minimum((java.lang.Object) mappableAssetState20);
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity22 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog23 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo24 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo26 = failureInfo24.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse27 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse27.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob30 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray32 = new java.lang.Object[] { discoveryLog23, failureInfo26, omrsProcessingStatusResponse27, jobPostBodyJob30, "database" };
        java.util.ArrayList<java.lang.Object> objList33 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList33, objArray32);
        deploymentEntity22.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList33);
        assetTypeProperty19.setValues((java.util.List<java.lang.Object>) objList33);
        com.ibm.watson.data.client.model.InputDataArray inputDataArray37 = scoringPayload0.addValuesItem((java.util.List<java.lang.Object>) objList33);
        com.ibm.watson.data.client.model.enums.ScoringType scoringType38 = scoringPayload0.getType();
        org.junit.Assert.assertNull(scoringType1);
        org.junit.Assert.assertNotNull(failureInfo6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + mappableAssetState20 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE + "'", mappableAssetState20.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE));
        org.junit.Assert.assertNotNull(assetTypeProperty21);
        org.junit.Assert.assertNotNull(failureInfo26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(inputDataArray37);
        org.junit.Assert.assertNull(scoringType38);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType0 = com.ibm.watson.data.client.model.enums.MappableAssetType.COLUMN;
        org.junit.Assert.assertTrue("'" + mappableAssetType0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.COLUMN + "'", mappableAssetType0.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.COLUMN));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.StatusFamily statusFamily1 = com.ibm.watson.data.client.model.enums.StatusFamily.fromValue("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class ConnectionEntity {?    datasourceType: null?    description: null?    name: null?    gatewayId: null?    flags: null?    originCountry: null?    ownerId: null?    rov: null?    properties: {}?    interactionProperties: null?    sourceSystem: null?    assetCategory: null?    childSourceSystems: null?    tags: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.ibm.watson.data.client.model.SpaceScope spaceScope0 = new com.ibm.watson.data.client.model.SpaceScope();
        com.ibm.watson.data.client.model.SpaceScope spaceScope2 = spaceScope0.bssAccountId("py_script");
        org.junit.Assert.assertNotNull(spaceScope2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig0 = new com.ibm.watson.data.client.model.OpenLineageConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = openLineageConfig0.getBufferGraphConfig();
        com.ibm.watson.data.client.model.Connection connection2 = null;
        openLineageConfig0.setOpenLineageBufferGraphConnection(connection2);
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig5 = openLineageConfig0.inTopicName("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        java.lang.String str6 = openLineageConfig0.getOpenLineageProvider();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNotNull(openLineageConfig5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.RuleType ruleType1 = com.ibm.watson.data.client.model.enums.RuleType.fromValue("viewer");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'viewer'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.ibm.watson.data.client.model.MemberRegistration memberRegistration0 = new com.ibm.watson.data.client.model.MemberRegistration();
        java.lang.String str1 = memberRegistration0.toString();
        com.ibm.watson.data.client.model.Connection connection2 = null;
        com.ibm.watson.data.client.model.MemberRegistration memberRegistration3 = memberRegistration0.repositoryConnection(connection2);
        com.ibm.watson.data.client.model.MemberRegistration memberRegistration5 = memberRegistration3.metadataCollectionId("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        memberRegistration5.setServerType("PENDING");
        java.util.Date date8 = memberRegistration5.getRegistrationTime();
        memberRegistration5.setServerType("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}" + "'", str1, "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        org.junit.Assert.assertNotNull(memberRegistration3);
        org.junit.Assert.assertNotNull(memberRegistration5);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog1 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo2 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo4 = failureInfo2.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse5 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse5.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob8 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray10 = new java.lang.Object[] { discoveryLog1, failureInfo4, omrsProcessingStatusResponse5, jobPostBodyJob8, "database" };
        java.util.ArrayList<java.lang.Object> objList11 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        deploymentEntity0.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList11);
        deploymentEntity0.setDescription("AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: 8\n    usage: null\n    href: null\n}");
        com.ibm.watson.data.client.model.DeploymentEntityRequestPhysical deploymentEntityRequestPhysical16 = deploymentEntity0.getOnline();
        org.junit.Assert.assertNotNull(failureInfo4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(deploymentEntityRequestPhysical16);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo0 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.util.Date date1 = null;
        extendedUserInfo0.setFirstFailedAttemptTimestamp(date1);
        java.util.Date date3 = extendedUserInfo0.getFirstFailedAttemptTimestamp();
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        java.lang.Boolean boolean1 = attachmentDetail0.getTransferComplete();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail3 = attachmentDetail0.size((java.lang.Long) (-1L));
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage4 = null;
        attachmentDetail3.setUsage(metadataUsage4);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(attachmentDetail3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList0 = new com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList();
        com.ibm.watson.data.client.model.AssetAggregatedCommentsList[] assetAggregatedCommentsListArray1 = new com.ibm.watson.data.client.model.AssetAggregatedCommentsList[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.AssetAggregatedCommentsList> assetAggregatedCommentsListList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList2, assetAggregatedCommentsListArray1);
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList4 = paginatedAssetAggregatedCommentsList0.resources((java.util.List<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList2);
        com.ibm.watson.data.client.model.HrefModel hrefModel5 = paginatedAssetAggregatedCommentsList4.getLast();
        java.lang.String str6 = paginatedAssetAggregatedCommentsList4.toString();
        org.junit.Assert.assertNotNull(assetAggregatedCommentsListArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paginatedAssetAggregatedCommentsList4);
        org.junit.Assert.assertNull(hrefModel5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}" + "'", str6, "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.ibm.watson.data.client.model.FunctionEntitySchemas functionEntitySchemas0 = new com.ibm.watson.data.client.model.FunctionEntitySchemas();
        com.ibm.watson.data.client.model.DataSchema[] dataSchemaArray1 = new com.ibm.watson.data.client.model.DataSchema[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema> dataSchemaList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList2, dataSchemaArray1);
        functionEntitySchemas0.setOutput((java.util.List<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList2);
        java.lang.String str5 = functionEntitySchemas0.toString();
        com.ibm.watson.data.client.model.FunctionEntitySchemas functionEntitySchemas6 = new com.ibm.watson.data.client.model.FunctionEntitySchemas();
        com.ibm.watson.data.client.model.DataSchema[] dataSchemaArray7 = new com.ibm.watson.data.client.model.DataSchema[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema> dataSchemaList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList8, dataSchemaArray7);
        functionEntitySchemas6.setOutput((java.util.List<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList8);
        java.lang.String str11 = functionEntitySchemas6.toString();
        com.ibm.watson.data.client.model.FunctionEntitySchemas functionEntitySchemas12 = new com.ibm.watson.data.client.model.FunctionEntitySchemas();
        com.ibm.watson.data.client.model.DataSchema[] dataSchemaArray13 = new com.ibm.watson.data.client.model.DataSchema[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema> dataSchemaList14 = new java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList14, dataSchemaArray13);
        functionEntitySchemas12.setOutput((java.util.List<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList14);
        functionEntitySchemas6.setOutput((java.util.List<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList14);
        com.ibm.watson.data.client.model.FunctionEntitySchemas functionEntitySchemas18 = functionEntitySchemas0.output((java.util.List<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList14);
        org.junit.Assert.assertNotNull(dataSchemaArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class FunctionEntitySchemas {\n    input: null\n    output: []\n}" + "'", str5, "class FunctionEntitySchemas {\n    input: null\n    output: []\n}");
        org.junit.Assert.assertNotNull(dataSchemaArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class FunctionEntitySchemas {\n    input: null\n    output: []\n}" + "'", str11, "class FunctionEntitySchemas {\n    input: null\n    output: []\n}");
        org.junit.Assert.assertNotNull(dataSchemaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionEntitySchemas18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.ibm.watson.data.client.model.FailureInfo failureInfo0 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo2 = failureInfo0.camsVersion("geospatial");
        java.lang.String str3 = failureInfo2.getOperation();
        org.junit.Assert.assertNotNull(failureInfo2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType0 = com.ibm.watson.data.client.model.enums.MappableAssetType.DATA_FILE_TERM;
        org.junit.Assert.assertTrue("'" + mappableAssetType0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.DATA_FILE_TERM + "'", mappableAssetType0.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.DATA_FILE_TERM));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig0 = new com.ibm.watson.data.client.model.DiscoveryServerConfig();
        java.util.List<java.lang.String> strList1 = discoveryServerConfig0.getDiscoveryEngineGUIDs();
        java.lang.String str2 = discoveryServerConfig0.toString();
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig4 = discoveryServerConfig0.addDiscoveryEngineGUIDsItem("file");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}" + "'", str2, "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}");
        org.junit.Assert.assertNotNull(discoveryServerConfig4);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.ibm.watson.data.client.model.enums.DeploymentExportFormat deploymentExportFormat0 = com.ibm.watson.data.client.model.enums.DeploymentExportFormat.COREML;
        org.junit.Assert.assertTrue("'" + deploymentExportFormat0 + "' != '" + com.ibm.watson.data.client.model.enums.DeploymentExportFormat.COREML + "'", deploymentExportFormat0.equals(com.ibm.watson.data.client.model.enums.DeploymentExportFormat.COREML));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.ibm.watson.data.client.model.DatasourceTypePropertyValues datasourceTypePropertyValues0 = new com.ibm.watson.data.client.model.DatasourceTypePropertyValues();
        datasourceTypePropertyValues0.setValue("class DataProfileAttachment {\n    summary: null\n    columns: null\n}");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ApprovalStatus approvalStatus1 = com.ibm.watson.data.client.model.enums.ApprovalStatus.fromValue("starting");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'starting'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.ibm.watson.data.client.model.enums.MemberStateLower memberStateLower0 = com.ibm.watson.data.client.model.enums.MemberStateLower.ACTIVE;
        java.lang.String str1 = memberStateLower0.toString();
        org.junit.Assert.assertTrue("'" + memberStateLower0 + "' != '" + com.ibm.watson.data.client.model.enums.MemberStateLower.ACTIVE + "'", memberStateLower0.equals(com.ibm.watson.data.client.model.enums.MemberStateLower.ACTIVE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "active" + "'", str1, "active");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity0 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList1 = null;
        responsePolicyEntity0.setTerms(paginatedRelationshipsList1);
        com.ibm.watson.data.client.model.PaginatedParentRelationshipsList paginatedParentRelationshipsList3 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity4 = responsePolicyEntity0.retParentCategoryRelationship(paginatedParentRelationshipsList3);
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity6 = responsePolicyEntity4.addStewardIdsItem("geospatial");
        com.ibm.watson.data.client.model.RelationshipParentRelationshipEntity relationshipParentRelationshipEntity7 = responsePolicyEntity6.getParentCategory();
        org.junit.Assert.assertNotNull(responsePolicyEntity4);
        org.junit.Assert.assertNotNull(responsePolicyEntity6);
        org.junit.Assert.assertNull(relationshipParentRelationshipEntity7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata0 = new com.ibm.watson.data.client.model.WorkflowMetadata();
        java.lang.String str1 = workflowMetadata0.getCreatedBy();
        com.ibm.watson.data.client.model.enums.WorkflowState workflowState2 = com.ibm.watson.data.client.model.enums.WorkflowState.CREATED;
        workflowMetadata0.setState(workflowState2);
        java.util.Date date4 = null;
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata5 = workflowMetadata0.modifiedAt(date4);
        workflowMetadata0.setWorkflowId("database");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + workflowState2 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowState.CREATED + "'", workflowState2.equals(com.ibm.watson.data.client.model.enums.WorkflowState.CREATED));
        org.junit.Assert.assertNotNull(workflowMetadata5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str1 = attachment0.toString();
        com.ibm.watson.data.client.model.Attachment attachment3 = attachment0.message("hi!");
        java.lang.Long long4 = attachment0.getTestDoc();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str1, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(attachment3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload0 = new com.ibm.watson.data.client.model.ScoringPayload();
        java.lang.String str1 = scoringPayload0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ScoringPayload {\n    id: null\n    fields: null\n    values: null\n    type: null\n    targets: null\n}" + "'", str1, "class ScoringPayload {\n    id: null\n    fields: null\n    values: null\n    type: null\n    targets: null\n}");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.ibm.watson.data.client.model.DiscoveredClass discoveredClass0 = new com.ibm.watson.data.client.model.DiscoveredClass();
        com.ibm.watson.data.client.model.CodeValue codeValue1 = discoveredClass0.getDataClass();
        org.junit.Assert.assertNull(codeValue1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.ibm.watson.data.client.model.Link link0 = new com.ibm.watson.data.client.model.Link();
        link0.setTitle("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        link0.setParams(strMap3);
        com.ibm.watson.data.client.model.Link link6 = link0.title("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = link6.getParams();
        com.ibm.watson.data.client.model.Link link9 = link6.rel("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        org.junit.Assert.assertNotNull(link6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(link9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity0 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity1 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest3 = deploymentEntity1.description("");
        java.lang.String[] strArray12 = new java.lang.String[] { "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "geospatial" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        deploymentEntity1.setTags((java.util.List<java.lang.String>) strList13);
        customAttributeDefinitionEntity0.setArtifactTypes((java.util.List<java.lang.String>) strList13);
        java.lang.String str17 = customAttributeDefinitionEntity0.getName();
        org.junit.Assert.assertNotNull(deploymentEntityRequest3);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse0 = new com.ibm.watson.data.client.model.PaginatedAssetFileListResponse();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = paginatedAssetFileListResponse0.getFirst();
        com.ibm.watson.data.client.model.ProjectStorage projectStorage2 = new com.ibm.watson.data.client.model.ProjectStorage();
        boolean boolean3 = paginatedAssetFileListResponse0.equals((java.lang.Object) projectStorage2);
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity4 = new com.ibm.watson.data.client.model.ResponseRuleEntity();
        com.ibm.watson.data.client.model.enums.RuleType ruleType5 = com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE;
        java.lang.String str6 = ruleType5.toString();
        java.lang.String str7 = ruleType5.toString();
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity8 = responseRuleEntity4.ruleType(ruleType5);
        boolean boolean9 = paginatedAssetFileListResponse0.equals((java.lang.Object) ruleType5);
        org.junit.Assert.assertNull(hrefModel1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + ruleType5 + "' != '" + com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE + "'", ruleType5.equals(com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Governance" + "'", str6, "Governance");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Governance" + "'", str7, "Governance");
        org.junit.Assert.assertNotNull(responseRuleEntity8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow0.totalCount((java.lang.Long) 100L);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow4 = paginatedResourceWorkflow0.next(hrefModel3);
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow6 = paginatedResourceWorkflow0.offset((java.lang.Integer) 1);
        com.ibm.watson.data.client.model.Workflow[] workflowArray7 = new com.ibm.watson.data.client.model.Workflow[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Workflow> workflowList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.Workflow>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Workflow>) workflowList8, workflowArray7);
        paginatedResourceWorkflow0.setResources((java.util.List<com.ibm.watson.data.client.model.Workflow>) workflowList8);
        com.ibm.watson.data.client.model.HrefModel hrefModel11 = paginatedResourceWorkflow0.getNext();
        com.ibm.watson.data.client.model.HrefModel hrefModel12 = null;
        paginatedResourceWorkflow0.setLast(hrefModel12);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow2);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow4);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow6);
        org.junit.Assert.assertNotNull(workflowArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(hrefModel11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.ibm.watson.data.client.model.AssetCreateResponse assetCreateResponse0 = new com.ibm.watson.data.client.model.AssetCreateResponse();
        assetCreateResponse0.setAssetId("class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment2 = attachment0.isReferenced((java.lang.Boolean) true);
        attachment0.setHref("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        org.junit.Assert.assertNotNull(attachment2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo0 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.math.BigDecimal bigDecimal1 = null;
        extendedUserInfo0.setRecentNumberOfFailedAttempts(bigDecimal1);
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity3 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity4 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest6 = deploymentEntity4.description("");
        java.lang.String[] strArray15 = new java.lang.String[] { "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "geospatial" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        deploymentEntity4.setTags((java.util.List<java.lang.String>) strList16);
        customAttributeDefinitionEntity3.setArtifactTypes((java.util.List<java.lang.String>) strList16);
        extendedUserInfo0.setPermissions((java.util.List<java.lang.String>) strList16);
        org.junit.Assert.assertNotNull(deploymentEntityRequest6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.ibm.watson.data.client.model.ProjectHeader projectHeader0 = new com.ibm.watson.data.client.model.ProjectHeader();
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel0 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str1 = intermediateModel0.getProcess();
        java.util.List<java.lang.String> strList2 = intermediateModel0.getCompositionSteps();
        java.lang.String str3 = intermediateModel0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class IntermediateModel {\n    name: null\n    process: null\n    location: null\n    notebookLocation: null\n    sdkNotebookLocation: null\n    pipelineNodes: null\n    compositionSteps: null\n    duration: null\n    modelAsset: null\n}" + "'", str3, "class IntermediateModel {\n    name: null\n    process: null\n    location: null\n    notebookLocation: null\n    sdkNotebookLocation: null\n    pipelineNodes: null\n    compositionSteps: null\n    duration: null\n    modelAsset: null\n}");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.RELATIONALDBSCHEMATYPE;
        java.lang.String str1 = mappableOMRSEntity0.getValue();
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.RELATIONALDBSCHEMATYPE + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.RELATIONALDBSCHEMATYPE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RelationalDBSchemaType" + "'", str1, "RelationalDBSchemaType");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.ibm.watson.data.client.model.enums.DatasourceTypeStatus datasourceTypeStatus0 = com.ibm.watson.data.client.model.enums.DatasourceTypeStatus.SYSTEM;
        org.junit.Assert.assertTrue("'" + datasourceTypeStatus0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypeStatus.SYSTEM + "'", datasourceTypeStatus0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypeStatus.SYSTEM));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState0 = com.ibm.watson.data.client.model.enums.MappableAssetState.WAITING_FOR_PARENT_CREATION;
        org.junit.Assert.assertTrue("'" + mappableAssetState0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.WAITING_FOR_PARENT_CREATION + "'", mappableAssetState0.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.WAITING_FOR_PARENT_CREATION));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.enums.DeployedAssetType deployedAssetType1 = deploymentEntity0.getDeployedAssetType();
        com.ibm.watson.data.client.model.DeploymentEntityStatus deploymentEntityStatus2 = new com.ibm.watson.data.client.model.DeploymentEntityStatus();
        deploymentEntity0.setStatus(deploymentEntityStatus2);
        com.ibm.watson.data.client.model.WMLError wMLError4 = deploymentEntityStatus2.getFailure();
        org.junit.Assert.assertNull(deployedAssetType1);
        org.junit.Assert.assertNull(wMLError4);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.ibm.watson.data.client.model.NewCategoryEntity newCategoryEntity0 = new com.ibm.watson.data.client.model.NewCategoryEntity();
        com.ibm.watson.data.client.model.CustomAttribute[] customAttributeArray1 = new com.ibm.watson.data.client.model.CustomAttribute[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttribute> customAttributeList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttribute>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttribute>) customAttributeList2, customAttributeArray1);
        newCategoryEntity0.setCustomAttributes((java.util.List<com.ibm.watson.data.client.model.CustomAttribute>) customAttributeList2);
        newCategoryEntity0.setName("analytics_engine");
        org.junit.Assert.assertNotNull(customAttributeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.Long long6 = rDVImportInfo0.getValuesCount();
        java.lang.String str7 = rDVImportInfo0.getHref();
        rDVImportInfo0.setValuesProcessed((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.ibm.watson.data.client.model.ScoreStats scoreStats0 = new com.ibm.watson.data.client.model.ScoreStats();
        java.lang.Double double1 = scoreStats0.getMax();
        java.lang.String str2 = scoreStats0.toString();
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class ScoreStats {\n    n: null\n    mean: null\n    variance: null\n    stddev: null\n    min: null\n    max: null\n    sum: null\n}" + "'", str2, "class ScoreStats {\n    n: null\n    mean: null\n    variance: null\n    stddev: null\n    min: null\n    max: null\n    sum: null\n}");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig0 = new com.ibm.watson.data.client.model.DiscoveryServerConfig();
        java.util.List<java.lang.String> strList1 = discoveryServerConfig0.getDiscoveryEngineGUIDs();
        java.lang.String str2 = discoveryServerConfig0.toString();
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig4 = discoveryServerConfig0.addDiscoveryEngineGUIDsItem("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        java.lang.String str5 = discoveryServerConfig4.toString();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}" + "'", str2, "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}");
        org.junit.Assert.assertNotNull(discoveryServerConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: [class Attachment {\n        assetType: null\n        name: null\n        description: null\n        mime: null\n        testDoc: null\n        connectionId: null\n        connectionPath: null\n        objectKey: null\n        userData: null\n        isPartitioned: null\n        assetCategory: null\n        id: null\n        version: null\n        attachmentId: null\n        datasourceType: null\n        attachmentType: null\n        href: null\n        createdAt: null\n        message: hi!\n        creatorId: null\n        createTime: null\n        size: null\n        isRemote: null\n        isManaged: null\n        isReferenced: null\n        isObjectKeyReadOnly: null\n        isUserProvidedPathKey: null\n        transferComplete: null\n        completeTimeTicks: null\n        handle: null\n        usage: null\n    }]\n}" + "'", str5, "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: [class Attachment {\n        assetType: null\n        name: null\n        description: null\n        mime: null\n        testDoc: null\n        connectionId: null\n        connectionPath: null\n        objectKey: null\n        userData: null\n        isPartitioned: null\n        assetCategory: null\n        id: null\n        version: null\n        attachmentId: null\n        datasourceType: null\n        attachmentType: null\n        href: null\n        createdAt: null\n        message: hi!\n        creatorId: null\n        createTime: null\n        size: null\n        isRemote: null\n        isManaged: null\n        isReferenced: null\n        isObjectKeyReadOnly: null\n        isUserProvidedPathKey: null\n        transferComplete: null\n        completeTimeTicks: null\n        handle: null\n        usage: null\n    }]\n}");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.ibm.watson.data.client.model.WorkflowEntity workflowEntity0 = new com.ibm.watson.data.client.model.WorkflowEntity();
        java.lang.String str1 = workflowEntity0.getParentId();
        com.ibm.watson.data.client.model.enums.WorkflowAction workflowAction2 = workflowEntity0.getLastAction();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(workflowAction2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.ibm.watson.data.client.model.enums.StreamsFlowPatchState streamsFlowPatchState0 = com.ibm.watson.data.client.model.enums.StreamsFlowPatchState.STOPPED;
        org.junit.Assert.assertTrue("'" + streamsFlowPatchState0 + "' != '" + com.ibm.watson.data.client.model.enums.StreamsFlowPatchState.STOPPED + "'", streamsFlowPatchState0.equals(com.ibm.watson.data.client.model.enums.StreamsFlowPatchState.STOPPED));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig0 = new com.ibm.watson.data.client.model.SecurityOfficerConfig();
        com.ibm.watson.data.client.model.Connection connection1 = null;
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig2 = securityOfficerConfig0.securityOfficerServerInTopic(connection1);
        java.lang.String str3 = securityOfficerConfig2.toString();
        java.lang.String str4 = securityOfficerConfig2.getSecurityOfficerServerInTopicName();
        org.junit.Assert.assertNotNull(securityOfficerConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}" + "'", str3, "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig2 = securitySyncConfig0.securitySyncServerType("DOES_NOT_EXIST");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig4 = securitySyncConfig2.securitySyncServerType("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.Connection connection5 = null;
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig6 = securitySyncConfig4.securitySyncServerConnection(connection5);
        org.junit.Assert.assertNotNull(securitySyncConfig2);
        org.junit.Assert.assertNotNull(securitySyncConfig4);
        org.junit.Assert.assertNotNull(securitySyncConfig6);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.ibm.watson.data.client.model.enums.RuleType ruleType0 = com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE;
        java.lang.String str1 = ruleType0.toString();
        java.lang.String str2 = ruleType0.getValue();
        org.junit.Assert.assertTrue("'" + ruleType0 + "' != '" + com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE + "'", ruleType0.equals(com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Governance" + "'", str1, "Governance");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Governance" + "'", str2, "Governance");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse0 = new com.ibm.watson.data.client.model.PaginatedAssetFileListResponse();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = null;
        paginatedAssetFileListResponse0.setFirst(hrefModel1);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse4 = paginatedAssetFileListResponse0.first(hrefModel3);
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse6 = paginatedAssetFileListResponse0.offset((java.lang.Integer) 1);
        com.ibm.watson.data.client.model.HrefModel hrefModel7 = null;
        paginatedAssetFileListResponse0.setFirst(hrefModel7);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse4);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.ibm.watson.data.client.model.FailedRule failedRule0 = new com.ibm.watson.data.client.model.FailedRule();
        java.lang.String str1 = failedRule0.getName();
        failedRule0.setName("DOES_NOT_EXIST");
        com.ibm.watson.data.client.model.Variable variable4 = new com.ibm.watson.data.client.model.Variable();
        java.lang.Object obj5 = variable4.getValue();
        com.ibm.watson.data.client.model.ConnectionMetadata connectionMetadata6 = new com.ibm.watson.data.client.model.ConnectionMetadata();
        boolean boolean7 = variable4.equals((java.lang.Object) connectionMetadata6);
        com.ibm.watson.data.client.model.Metadata metadata9 = connectionMetadata6.assetType("SELECTED_TYPES");
        boolean boolean10 = failedRule0.equals((java.lang.Object) "SELECTED_TYPES");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(metadata9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        java.lang.String str1 = glossaryObjectMetadata0.getArtifactId();
        java.util.Date date2 = null;
        glossaryObjectMetadata0.setCreatedAt(date2);
        java.util.Date date4 = null;
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata5 = glossaryObjectMetadata0.effectiveEndDate(date4);
        glossaryObjectMetadata5.setRevision("class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.RELATIONALCOLUMNTYPE;
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.RELATIONALCOLUMNTYPE + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.RELATIONALCOLUMNTYPE));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.ibm.watson.data.client.model.enums.MessageReprocessingType messageReprocessingType0 = com.ibm.watson.data.client.model.enums.MessageReprocessingType.ALL;
        org.junit.Assert.assertTrue("'" + messageReprocessingType0 + "' != '" + com.ibm.watson.data.client.model.enums.MessageReprocessingType.ALL + "'", messageReprocessingType0.equals(com.ibm.watson.data.client.model.enums.MessageReprocessingType.ALL));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.ibm.watson.data.client.model.FailedRule failedRule0 = new com.ibm.watson.data.client.model.FailedRule();
        java.lang.Integer int1 = failedRule0.getIndex();
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum datasourceTypeConditionEnum1 = com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum.fromValue("class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class PaginatedAssetAggregatedCommentsList {?    limit: null?    count: null?    first: null?    next: null?    offset: null?    last: null?    prev: null?    resources: []?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis0 = new com.ibm.watson.data.client.model.ValueAnalysis();
        java.util.List<com.ibm.watson.data.client.model.DiscoveredStringDetails> discoveredStringDetailsList1 = valueAnalysis0.getCaseDistribution();
        com.ibm.watson.data.client.model.NumericStats numericStats2 = null;
        valueAnalysis0.setNumericStats(numericStats2);
        org.junit.Assert.assertNull(discoveredStringDetailsList1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.ibm.watson.data.client.model.AssetCreateResponse assetCreateResponse0 = new com.ibm.watson.data.client.model.AssetCreateResponse();
        java.util.Map<java.lang.String, com.ibm.watson.data.client.model.AbstractAssetEntity> strMap1 = null;
        com.ibm.watson.data.client.model.MetadataEntityResult metadataEntityResult2 = assetCreateResponse0.entity(strMap1);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource3 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray4 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList5 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList5, relationshipCreateResponseIdsArray4);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource7 = createRelationshipResponseResource3.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList5);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray8 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList9 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList9, relationshipCreateResponseIdsArray8);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource11 = createRelationshipResponseResource3.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList9);
        boolean boolean12 = metadataEntityResult2.equals((java.lang.Object) relationshipCreateResponseIdsList9);
        java.lang.String str13 = metadataEntityResult2.toString();
        com.ibm.watson.data.client.model.MetadataAsset metadataAsset14 = metadataEntityResult2.getMetadata();
        org.junit.Assert.assertNotNull(metadataEntityResult2);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource7);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}" + "'", str13, "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}");
        org.junit.Assert.assertNull(metadataAsset14);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.AttachmentHandle attachmentHandle1 = null;
        com.ibm.watson.data.client.model.Attachment attachment2 = attachment0.handle(attachmentHandle1);
        org.junit.Assert.assertNotNull(attachment2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.ibm.watson.data.client.model.enums.MessageReprocessingType messageReprocessingType0 = com.ibm.watson.data.client.model.enums.MessageReprocessingType.SELF_AND_PARENTS;
        java.lang.String str1 = messageReprocessingType0.getValue();
        java.lang.String str2 = messageReprocessingType0.getValue();
        org.junit.Assert.assertTrue("'" + messageReprocessingType0 + "' != '" + com.ibm.watson.data.client.model.enums.MessageReprocessingType.SELF_AND_PARENTS + "'", messageReprocessingType0.equals(com.ibm.watson.data.client.model.enums.MessageReprocessingType.SELF_AND_PARENTS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SELF_AND_PARENTS" + "'", str1, "SELF_AND_PARENTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SELF_AND_PARENTS" + "'", str2, "SELF_AND_PARENTS");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity0 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement customAttributeDefElement1 = null;
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity2 = customAttributeDefinitionEntity0.addElementsListItem(customAttributeDefElement1);
        java.lang.Boolean boolean3 = customAttributeDefinitionEntity2.getReadOnly();
        java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement> customAttributeDefElementList4 = customAttributeDefinitionEntity2.getElementsList();
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntity2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(customAttributeDefElementList4);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata0 = new com.ibm.watson.data.client.model.ArtifactMetadata();
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata2 = artifactMetadata0.versionId("hi!");
        java.util.Date date3 = null;
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata4 = artifactMetadata2.effectiveStartDate(date3);
        java.util.Date date5 = null;
        artifactMetadata2.setEffectiveEndDate(date5);
        org.junit.Assert.assertNotNull(artifactMetadata2);
        org.junit.Assert.assertNotNull(artifactMetadata4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ArtifactState artifactState1 = com.ibm.watson.data.client.model.enums.ArtifactState.fromValue("class Spaces {\n    limit: null\n    count: -1\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class Spaces {?    limit: null?    count: -1?    first: null?    next: null?    offset: null?    last: null?    prev: null?    resources: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.ibm.watson.data.client.model.Link link0 = new com.ibm.watson.data.client.model.Link();
        link0.setTitle("");
        link0.setType("project");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList3 = writeableTermEntity2.getHasTypeTerms();
        com.ibm.watson.data.client.model.GlossaryObjectEntity glossaryObjectEntity5 = writeableTermEntity2.longDescription("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNull(newRelationshipList3);
        org.junit.Assert.assertNotNull(glossaryObjectEntity5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.ibm.watson.data.client.model.enums.ProjectToolType projectToolType0 = com.ibm.watson.data.client.model.enums.ProjectToolType.STREAMS_DESIGNER;
        java.lang.String str1 = projectToolType0.getValue();
        org.junit.Assert.assertTrue("'" + projectToolType0 + "' != '" + com.ibm.watson.data.client.model.enums.ProjectToolType.STREAMS_DESIGNER + "'", projectToolType0.equals(com.ibm.watson.data.client.model.enums.ProjectToolType.STREAMS_DESIGNER));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "streams_designer" + "'", str1, "streams_designer");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.ibm.watson.data.client.model.MetadataRov metadataRov0 = new com.ibm.watson.data.client.model.MetadataRov();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse1 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse1.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse5 = omrsProcessingStatusResponse1.numPendingDataAssets((java.lang.Long) 0L);
        java.lang.Long long6 = omrsProcessingStatusResponse1.getNumSyncedConnectionsCreated();
        boolean boolean7 = metadataRov0.equals((java.lang.Object) long6);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource8 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray9 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList10 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList10, relationshipCreateResponseIdsArray9);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource12 = createRelationshipResponseResource8.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList10);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray13 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList14 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList14, relationshipCreateResponseIdsArray13);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource16 = createRelationshipResponseResource8.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList14);
        java.lang.String str17 = createRelationshipResponseResource8.getArtifactId();
        boolean boolean18 = metadataRov0.equals((java.lang.Object) str17);
        java.lang.String str19 = metadataRov0.toString();
        metadataRov0.setMode((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource12);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class MetadataRov {\n    mode: null\n    collaboratorIds: null\n}" + "'", str19, "class MetadataRov {\n    mode: null\n    collaboratorIds: null\n}");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis0 = new com.ibm.watson.data.client.model.ValueAnalysis();
        com.ibm.watson.data.client.model.JSONResourcePatchModel jSONResourcePatchModel1 = new com.ibm.watson.data.client.model.JSONResourcePatchModel();
        jSONResourcePatchModel1.setValue((java.lang.Object) "");
        valueAnalysis0.setMinHashSignature((java.lang.Object) jSONResourcePatchModel1);
        com.ibm.watson.data.client.model.enums.JsonPatchOperation jsonPatchOperation5 = com.ibm.watson.data.client.model.enums.JsonPatchOperation.REMOVE;
        com.ibm.watson.data.client.model.JSONResourcePatchModel jSONResourcePatchModel6 = jSONResourcePatchModel1.op(jsonPatchOperation5);
        java.lang.String str7 = jSONResourcePatchModel1.getPath();
        org.junit.Assert.assertTrue("'" + jsonPatchOperation5 + "' != '" + com.ibm.watson.data.client.model.enums.JsonPatchOperation.REMOVE + "'", jsonPatchOperation5.equals(com.ibm.watson.data.client.model.enums.JsonPatchOperation.REMOVE));
        org.junit.Assert.assertNotNull(jSONResourcePatchModel6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.ibm.watson.data.client.model.PaginatedList paginatedList0 = new com.ibm.watson.data.client.model.PaginatedList();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = paginatedList0.getNext();
        org.junit.Assert.assertNull(hrefModel1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole dataSchemaFieldModelingRole0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.PARTITION;
        java.lang.String str1 = dataSchemaFieldModelingRole0.getValue();
        org.junit.Assert.assertTrue("'" + dataSchemaFieldModelingRole0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.PARTITION + "'", dataSchemaFieldModelingRole0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldModelingRole.PARTITION));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "partition" + "'", str1, "partition");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.lang.String str2 = connectionEntity0.getDescription();
        connectionEntity0.setOriginCountry("database");
        com.ibm.watson.data.client.model.ConnectionInteractionProperties connectionInteractionProperties5 = connectionEntity0.getInteractionProperties();
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity7 = connectionEntity0.name("number");
        connectionEntity0.setOriginCountry("py_script");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(connectionInteractionProperties5);
        org.junit.Assert.assertNotNull(connectionEntity7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str1 = attachment0.toString();
        com.ibm.watson.data.client.model.Attachment attachment3 = attachment0.message("hi!");
        com.ibm.watson.data.client.model.Attachment attachment5 = attachment0.id("database");
        java.lang.String str6 = attachment5.getAttachmentId();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage7 = null;
        com.ibm.watson.data.client.model.Attachment attachment8 = attachment5.usage(metadataUsage7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str1, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(attachment3);
        org.junit.Assert.assertNotNull(attachment5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(attachment8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody0 = new com.ibm.watson.data.client.model.UpdateProjectBody();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity1 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest3 = deploymentEntity1.description("");
        java.lang.String[] strArray12 = new java.lang.String[] { "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "geospatial" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        deploymentEntity1.setTags((java.util.List<java.lang.String>) strList13);
        updateProjectBody0.setTags((java.util.List<java.lang.String>) strList13);
        org.junit.Assert.assertNotNull(deploymentEntityRequest3);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.lang.String str2 = connectionEntity0.getDescription();
        connectionEntity0.setOriginCountry("database");
        com.ibm.watson.data.client.model.ConnectionInteractionProperties connectionInteractionProperties5 = connectionEntity0.getInteractionProperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = connectionEntity0.getProperties();
        java.util.List<java.util.Map<java.lang.String, java.lang.Object>> strMapList7 = connectionEntity0.getChildSourceSystems();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(connectionInteractionProperties5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMapList7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.ibm.watson.data.client.model.MemberSet memberSet0 = new com.ibm.watson.data.client.model.MemberSet();
        java.util.List<com.ibm.watson.data.client.model.Member> memberList1 = memberSet0.getMembers();
        org.junit.Assert.assertNotNull(memberList1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.ibm.watson.data.client.model.AccessServiceConfig accessServiceConfig0 = new com.ibm.watson.data.client.model.AccessServiceConfig();
        java.lang.Integer int1 = accessServiceConfig0.getAccessServiceId();
        java.lang.String str2 = accessServiceConfig0.getAccessServiceURLMarker();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.ibm.watson.data.client.model.Endpoint endpoint0 = new com.ibm.watson.data.client.model.Endpoint();
        com.ibm.watson.data.client.model.Meaning meaning1 = null;
        com.ibm.watson.data.client.model.BaseEntity baseEntity2 = endpoint0.addMeaningsItem(meaning1);
        endpoint0.setAddress("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        org.junit.Assert.assertNotNull(baseEntity2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.ibm.watson.data.client.model.UpdateUserParamsBody updateUserParamsBody0 = new com.ibm.watson.data.client.model.UpdateUserParamsBody();
        updateUserParamsBody0.setEmail("database");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure dataSchemaFieldMeasure0 = com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.RANGE;
        org.junit.Assert.assertTrue("'" + dataSchemaFieldMeasure0 + "' != '" + com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.RANGE + "'", dataSchemaFieldMeasure0.equals(com.ibm.watson.data.client.model.enums.DataSchemaFieldMeasure.RANGE));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity0 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail1 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage2 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail3 = attachmentDetail1.usage(metadataUsage2);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest4 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray5 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList6, newRelationshipArray5);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest8 = classificationRelationshipsRequest4.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList6);
        boolean boolean9 = attachmentDetail1.equals((java.lang.Object) newRelationshipList6);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity10 = newReferenceDataSetEntity0.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList6);
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity12 = newReferenceDataSetEntity10.type("internal_use_only");
        writeableReferenceDataSetEntity12.setName("class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: null\n}");
        java.util.List<java.lang.String> strList15 = writeableReferenceDataSetEntity12.getTags();
        org.junit.Assert.assertNotNull(attachmentDetail3);
        org.junit.Assert.assertNotNull(newRelationshipArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity10);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity12);
        org.junit.Assert.assertNull(strList15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.ibm.watson.data.client.model.ConformanceSuiteConfig conformanceSuiteConfig0 = new com.ibm.watson.data.client.model.ConformanceSuiteConfig();
        com.ibm.watson.data.client.model.NewRelationship newRelationship1 = new com.ibm.watson.data.client.model.NewRelationship();
        boolean boolean2 = conformanceSuiteConfig0.equals((java.lang.Object) newRelationship1);
        com.ibm.watson.data.client.model.PlatformConformanceWorkbenchConfig platformConformanceWorkbenchConfig3 = null;
        com.ibm.watson.data.client.model.ConformanceSuiteConfig conformanceSuiteConfig4 = conformanceSuiteConfig0.platformWorkbenchConfig(platformConformanceWorkbenchConfig3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(conformanceSuiteConfig4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.ibm.watson.data.client.model.ImportMessage importMessage0 = new com.ibm.watson.data.client.model.ImportMessage();
        com.ibm.watson.data.client.model.ImportMessage importMessage2 = importMessage0.lineNumber((java.lang.Long) (-1L));
        java.util.List<java.lang.String> strList3 = importMessage0.getParameters();
        org.junit.Assert.assertNotNull(importMessage2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog0 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType1 = com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION;
        boolean boolean2 = discoveryLog0.equals((java.lang.Object) mappableAssetType1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        discoveryLog0.setDetails(strMap3);
        java.lang.String str5 = discoveryLog0.toString();
        org.junit.Assert.assertTrue("'" + mappableAssetType1 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION + "'", mappableAssetType1.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}" + "'", str5, "class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.ibm.watson.data.client.model.PaginatedDataClassList paginatedDataClassList0 = new com.ibm.watson.data.client.model.PaginatedDataClassList();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = null;
        com.ibm.watson.data.client.model.PaginatedList paginatedList2 = paginatedDataClassList0.prev(hrefModel1);
        com.ibm.watson.data.client.model.ResponseDataClass[] responseDataClassArray3 = new com.ibm.watson.data.client.model.ResponseDataClass[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.ResponseDataClass> responseDataClassList4 = new java.util.ArrayList<com.ibm.watson.data.client.model.ResponseDataClass>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.ResponseDataClass>) responseDataClassList4, responseDataClassArray3);
        com.ibm.watson.data.client.model.PaginatedDataClassList paginatedDataClassList6 = paginatedDataClassList0.resources((java.util.List<com.ibm.watson.data.client.model.ResponseDataClass>) responseDataClassList4);
        java.util.List<com.ibm.watson.data.client.model.ResponseDataClass> responseDataClassList7 = paginatedDataClassList6.getResources();
        org.junit.Assert.assertNotNull(paginatedList2);
        org.junit.Assert.assertNotNull(responseDataClassArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paginatedDataClassList6);
        org.junit.Assert.assertNotNull(responseDataClassList7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.PropagationType propagationType1 = com.ibm.watson.data.client.model.enums.PropagationType.fromValue("internal_use_only");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'internal_use_only'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader0 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader();
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader2 = customAttributeDefinitionEntityHeader0.displayInChildAssets((java.lang.Boolean) false);
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity3 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest5 = deploymentEntity3.description("");
        java.lang.String[] strArray14 = new java.lang.String[] { "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "geospatial" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        deploymentEntity3.setTags((java.util.List<java.lang.String>) strList15);
        customAttributeDefinitionEntityHeader2.setArtifactTypes((java.util.List<java.lang.String>) strList15);
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader20 = customAttributeDefinitionEntityHeader2.name("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntityHeader2);
        org.junit.Assert.assertNotNull(deploymentEntityRequest5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntityHeader20);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.ibm.watson.data.client.model.Metadata metadata0 = new com.ibm.watson.data.client.model.Metadata();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        java.lang.String str1 = securitySyncConfig0.getSecuritySyncServerAuthorization();
        java.lang.Long long2 = securitySyncConfig0.getPollingInterval();
        com.ibm.watson.data.client.model.Connection connection3 = null;
        securitySyncConfig0.setSecuritySyncInTopic(connection3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.ibm.watson.data.client.model.DataSchema dataSchema0 = new com.ibm.watson.data.client.model.DataSchema();
        com.ibm.watson.data.client.model.DataSchema dataSchema2 = dataSchema0.name("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.DataSchema dataSchema4 = dataSchema2.type("class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}");
        dataSchema2.setName("class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}");
        org.junit.Assert.assertNotNull(dataSchema2);
        org.junit.Assert.assertNotNull(dataSchema4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis0 = new com.ibm.watson.data.client.model.ValueAnalysis();
        java.util.List<com.ibm.watson.data.client.model.DiscoveredNumericDetails> discoveredNumericDetailsList1 = valueAnalysis0.getLengthDistribution();
        valueAnalysis0.setEmptyCount((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.ScoreStats scoreStats4 = valueAnalysis0.getAlphaCharacterStats();
        org.junit.Assert.assertNull(discoveredNumericDetailsList1);
        org.junit.Assert.assertNull(scoreStats4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse0 = new com.ibm.watson.data.client.model.ReprocessMessagesResponse();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse2 = reprocessMessagesResponse0.entityGuidsSubmitted(strMap1);
        java.util.List<java.lang.String> strList4 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse5 = reprocessMessagesResponse0.putEntityGuidsSubmittedItem("class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}", strList4);
        com.ibm.watson.data.client.model.NewClassificationEntity newClassificationEntity6 = new com.ibm.watson.data.client.model.NewClassificationEntity();
        boolean boolean7 = reprocessMessagesResponse0.equals((java.lang.Object) newClassificationEntity6);
        java.lang.Integer int8 = reprocessMessagesResponse0.getTotalEntityGuidsSubmitted();
        org.junit.Assert.assertNotNull(reprocessMessagesResponse2);
        org.junit.Assert.assertNotNull(reprocessMessagesResponse5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.ibm.watson.data.client.model.NewClassificationEntity newClassificationEntity0 = new com.ibm.watson.data.client.model.NewClassificationEntity();
        com.ibm.watson.data.client.model.NewRelationship newRelationship1 = newClassificationEntity0.getIsATypeOfClassification();
        org.junit.Assert.assertNull(newRelationship1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty0 = new com.ibm.watson.data.client.model.AssetTypeProperty();
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty2 = assetTypeProperty0.isArray((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = assetTypeProperty0.getRequired();
        org.junit.Assert.assertNotNull(assetTypeProperty2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.ibm.watson.data.client.model.ConnectionMetadata connectionMetadata0 = new com.ibm.watson.data.client.model.ConnectionMetadata();
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity1 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity3 = updatableTermEntity1.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity5 = updatableTermEntity1.revision("read");
        com.ibm.watson.data.client.model.UpdateUserParamsBody updateUserParamsBody6 = new com.ibm.watson.data.client.model.UpdateUserParamsBody();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse7 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse7.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse11 = omrsProcessingStatusResponse7.numPendingDataAssets((java.lang.Long) 0L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse14 = omrsProcessingStatusResponse7.putNumNewRelationshipsReceivedItem("file", (java.lang.Long) 1L);
        boolean boolean15 = updateUserParamsBody6.equals((java.lang.Object) 1L);
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel16 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str17 = intermediateModel16.getProcess();
        java.util.List<java.lang.String> strList18 = intermediateModel16.getCompositionSteps();
        com.ibm.watson.data.client.model.AssetTypeRelationship assetTypeRelationship19 = new com.ibm.watson.data.client.model.AssetTypeRelationship();
        java.lang.String str20 = assetTypeRelationship19.getKey();
        boolean boolean21 = intermediateModel16.equals((java.lang.Object) str20);
        java.lang.String[] strArray26 = new java.lang.String[] { "read", "", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        intermediateModel16.setPipelineNodes((java.util.List<java.lang.String>) strList27);
        updateUserParamsBody6.setUserRoles((java.util.List<java.lang.String>) strList27);
        updatableTermEntity5.setAbbreviations((java.util.List<java.lang.String>) strList27);
        connectionMetadata0.setTags((java.util.List<java.lang.String>) strList27);
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody33 = new com.ibm.watson.data.client.model.UpdateProjectBody();
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo34 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.util.Date date35 = null;
        extendedUserInfo34.setFirstFailedAttemptTimestamp(date35);
        com.ibm.watson.data.client.model.UserInfo userInfo38 = extendedUserInfo34.username("hi!");
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody39 = new com.ibm.watson.data.client.model.CreateRoleParamsBody();
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody41 = createRoleParamsBody39.addPermissionsItem("");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity42 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity44 = updatableTermEntity42.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship45 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity46 = writeableTermEntity44.addIsOfTermsItem(newRelationship45);
        java.lang.String[] strArray60 = new java.lang.String[] { "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "geospatial", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "hi!", "read", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "file", "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}", "database", "DOES_NOT_EXIST", "geospatial", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity63 = writeableTermEntity44.abbreviations((java.util.List<java.lang.String>) strList61);
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody64 = createRoleParamsBody41.permissions((java.util.List<java.lang.String>) strList61);
        com.ibm.watson.data.client.model.UserInfo userInfo65 = userInfo38.userRoles((java.util.List<java.lang.String>) strList61);
        com.ibm.watson.data.client.model.ProjectHeader projectHeader66 = updateProjectBody33.tags((java.util.List<java.lang.String>) strList61);
        connectionMetadata0.setTags((java.util.List<java.lang.String>) strList61);
        org.junit.Assert.assertNotNull(writeableTermEntity3);
        org.junit.Assert.assertNotNull(updatableTermEntity5);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse11);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userInfo38);
        org.junit.Assert.assertNotNull(createRoleParamsBody41);
        org.junit.Assert.assertNotNull(writeableTermEntity44);
        org.junit.Assert.assertNotNull(writeableTermEntity46);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity63);
        org.junit.Assert.assertNotNull(createRoleParamsBody64);
        org.junit.Assert.assertNotNull(userInfo65);
        org.junit.Assert.assertNotNull(projectHeader66);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage1 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.usage(metadataUsage1);
        java.lang.String str3 = attachmentDetail2.toString();
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader5 = attachmentDetail2.connectionId("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail7 = attachmentDetail2.url("DOES_NOT_EXIST");
        com.ibm.watson.data.client.model.StepInfo stepInfo8 = new com.ibm.watson.data.client.model.StepInfo();
        com.ibm.watson.data.client.model.StepInfo stepInfo10 = stepInfo8.name("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        java.util.Date date11 = null;
        com.ibm.watson.data.client.model.StepInfo stepInfo12 = stepInfo8.completedAt(date11);
        java.util.Date date13 = stepInfo8.getCompletedAt();
        boolean boolean14 = attachmentDetail7.equals((java.lang.Object) date13);
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}" + "'", str3, "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}");
        org.junit.Assert.assertNotNull(attachmentHeader5);
        org.junit.Assert.assertNotNull(attachmentDetail7);
        org.junit.Assert.assertNotNull(stepInfo10);
        org.junit.Assert.assertNotNull(stepInfo12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig0 = new com.ibm.watson.data.client.model.OpenLineageConfig();
        com.ibm.watson.data.client.model.Connection connection1 = openLineageConfig0.getOpenLineageBufferGraphConnection();
        org.junit.Assert.assertNull(connection1);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.ibm.watson.data.client.model.WorkflowEntity workflowEntity0 = new com.ibm.watson.data.client.model.WorkflowEntity();
        java.lang.String str1 = workflowEntity0.getParentId();
        java.lang.Integer int2 = workflowEntity0.getWorkflowTemplateVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch0 = new com.ibm.watson.data.client.model.CatalogSearch();
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch2 = catalogSearch0.limit((java.lang.Integer) 0);
        catalogSearch2.setInclude("class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}");
        org.junit.Assert.assertNotNull(catalogSearch2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.ibm.watson.data.client.model.StepInfo stepInfo0 = new com.ibm.watson.data.client.model.StepInfo();
        boolean boolean2 = stepInfo0.equals((java.lang.Object) 100.0f);
        java.math.BigDecimal bigDecimal3 = stepInfo0.getScore();
        java.lang.Integer int4 = stepInfo0.getDataAllocation();
        java.util.Date date5 = null;
        stepInfo0.setStartedAt(date5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig0 = new com.ibm.watson.data.client.model.SecurityOfficerConfig();
        com.ibm.watson.data.client.model.Connection connection1 = null;
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig2 = securityOfficerConfig0.securityOfficerServerInTopic(connection1);
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig4 = securityOfficerConfig0.accessServiceServerName("spark");
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig6 = securityOfficerConfig4.accessServiceRootURL("");
        org.junit.Assert.assertNotNull(securityOfficerConfig2);
        org.junit.Assert.assertNotNull(securityOfficerConfig4);
        org.junit.Assert.assertNotNull(securityOfficerConfig6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.Long long6 = rDVImportInfo0.getValuesCount();
        rDVImportInfo0.setHref("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
        java.lang.Long long9 = rDVImportInfo0.getValuesSkipped();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList();
        com.ibm.watson.data.client.model.AbstractRelationship[] abstractRelationshipArray1 = new com.ibm.watson.data.client.model.AbstractRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.AbstractRelationship> abstractRelationshipList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.AbstractRelationship>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.AbstractRelationship>) abstractRelationshipList2, abstractRelationshipArray1);
        com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList paginatedAbstractRelationshipList4 = paginatedAbstractRelationshipList0.resources((java.util.List<com.ibm.watson.data.client.model.AbstractRelationship>) abstractRelationshipList2);
        com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList paginatedAbstractRelationshipList5 = new com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList();
        com.ibm.watson.data.client.model.AbstractRelationship[] abstractRelationshipArray6 = new com.ibm.watson.data.client.model.AbstractRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.AbstractRelationship> abstractRelationshipList7 = new java.util.ArrayList<com.ibm.watson.data.client.model.AbstractRelationship>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.AbstractRelationship>) abstractRelationshipList7, abstractRelationshipArray6);
        com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList paginatedAbstractRelationshipList9 = paginatedAbstractRelationshipList5.resources((java.util.List<com.ibm.watson.data.client.model.AbstractRelationship>) abstractRelationshipList7);
        paginatedAbstractRelationshipList4.setResources((java.util.List<com.ibm.watson.data.client.model.AbstractRelationship>) abstractRelationshipList7);
        org.junit.Assert.assertNotNull(abstractRelationshipArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paginatedAbstractRelationshipList4);
        org.junit.Assert.assertNotNull(abstractRelationshipArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paginatedAbstractRelationshipList9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.ibm.watson.data.client.model.CreateRelationshipResponse createRelationshipResponse0 = new com.ibm.watson.data.client.model.CreateRelationshipResponse();
        com.ibm.watson.data.client.model.Attachment attachment1 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str2 = attachment1.toString();
        boolean boolean3 = createRelationshipResponse0.equals((java.lang.Object) attachment1);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource4 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray5 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList6, relationshipCreateResponseIdsArray5);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource8 = createRelationshipResponseResource4.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList6);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray9 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList10 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList10, relationshipCreateResponseIdsArray9);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource12 = createRelationshipResponseResource4.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList10);
        com.ibm.watson.data.client.model.GlossaryResource glossaryResource14 = createRelationshipResponseResource4.workflowId("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource15 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray16 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList17 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList17, relationshipCreateResponseIdsArray16);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource19 = createRelationshipResponseResource15.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList17);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource20 = createRelationshipResponseResource4.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList17);
        com.ibm.watson.data.client.model.GlossaryResource glossaryResource22 = createRelationshipResponseResource20.versionId("class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}");
        com.ibm.watson.data.client.model.CreateRelationshipResponse createRelationshipResponse23 = createRelationshipResponse0.addResourcesItem(createRelationshipResponseResource20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str2, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource8);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource12);
        org.junit.Assert.assertNotNull(glossaryResource14);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource19);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource20);
        org.junit.Assert.assertNotNull(glossaryResource22);
        org.junit.Assert.assertNotNull(createRelationshipResponse23);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.ibm.watson.data.client.model.enums.MappableOMRSRelationship mappableOMRSRelationship0 = com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.ASSETSCHEMATYPE;
        org.junit.Assert.assertTrue("'" + mappableOMRSRelationship0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.ASSETSCHEMATYPE + "'", mappableOMRSRelationship0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.ASSETSCHEMATYPE));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.ibm.watson.data.client.model.FileDeleteResponse fileDeleteResponse0 = new com.ibm.watson.data.client.model.FileDeleteResponse();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity1 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog2 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo3 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo5 = failureInfo3.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse6 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse6.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob9 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray11 = new java.lang.Object[] { discoveryLog2, failureInfo5, omrsProcessingStatusResponse6, jobPostBodyJob9, "database" };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        deploymentEntity1.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList12);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList15 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean16 = objListList15.add((java.util.List<java.lang.Object>) objList12);
        fileDeleteResponse0.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList15);
        com.ibm.watson.data.client.model.FileDeleteResponse fileDeleteResponse18 = new com.ibm.watson.data.client.model.FileDeleteResponse();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity19 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog20 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo21 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo23 = failureInfo21.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse24 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse24.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob27 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray29 = new java.lang.Object[] { discoveryLog20, failureInfo23, omrsProcessingStatusResponse24, jobPostBodyJob27, "database" };
        java.util.ArrayList<java.lang.Object> objList30 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList30, objArray29);
        deploymentEntity19.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList30);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList33 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean34 = objListList33.add((java.util.List<java.lang.Object>) objList30);
        fileDeleteResponse18.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList33);
        fileDeleteResponse0.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList33);
        com.ibm.watson.data.client.model.FileDeleteResponse fileDeleteResponse37 = new com.ibm.watson.data.client.model.FileDeleteResponse();
        com.ibm.watson.data.client.model.FileDeleteResponse fileDeleteResponse38 = new com.ibm.watson.data.client.model.FileDeleteResponse();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity39 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog40 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo41 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo43 = failureInfo41.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse44 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse44.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob47 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray49 = new java.lang.Object[] { discoveryLog40, failureInfo43, omrsProcessingStatusResponse44, jobPostBodyJob47, "database" };
        java.util.ArrayList<java.lang.Object> objList50 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList50, objArray49);
        deploymentEntity39.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList50);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList53 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean54 = objListList53.add((java.util.List<java.lang.Object>) objList50);
        fileDeleteResponse38.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList53);
        com.ibm.watson.data.client.model.FileDeleteResponse fileDeleteResponse56 = new com.ibm.watson.data.client.model.FileDeleteResponse();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity57 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog58 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo59 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo61 = failureInfo59.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse62 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse62.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob65 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray67 = new java.lang.Object[] { discoveryLog58, failureInfo61, omrsProcessingStatusResponse62, jobPostBodyJob65, "database" };
        java.util.ArrayList<java.lang.Object> objList68 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList68, objArray67);
        deploymentEntity57.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList68);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList71 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean72 = objListList71.add((java.util.List<java.lang.Object>) objList68);
        fileDeleteResponse56.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList71);
        fileDeleteResponse38.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList71);
        fileDeleteResponse37.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList71);
        fileDeleteResponse0.setResults((java.util.List<java.util.List<java.lang.Object>>) objListList71);
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload77 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.enums.ScoringType scoringType78 = scoringPayload77.getType();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity79 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog80 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo81 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo83 = failureInfo81.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse84 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse84.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob87 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray89 = new java.lang.Object[] { discoveryLog80, failureInfo83, omrsProcessingStatusResponse84, jobPostBodyJob87, "database" };
        java.util.ArrayList<java.lang.Object> objList90 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList90, objArray89);
        deploymentEntity79.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList90);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList93 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean94 = objListList93.add((java.util.List<java.lang.Object>) objList90);
        scoringPayload77.setValues((java.util.List<java.util.List<java.lang.Object>>) objListList93);
        com.ibm.watson.data.client.model.FileDeleteResponse fileDeleteResponse96 = fileDeleteResponse0.results((java.util.List<java.util.List<java.lang.Object>>) objListList93);
        org.junit.Assert.assertNotNull(failureInfo5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(failureInfo23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(failureInfo43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(failureInfo61);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(scoringType78);
        org.junit.Assert.assertNotNull(failureInfo83);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(fileDeleteResponse96);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        boolean boolean2 = attachmentDetail0.equals((java.lang.Object) 100.0d);
        attachmentDetail0.setAttachmentId("class FindAssetsResponse {\n    totalRows: null\n    results: null\n}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        com.ibm.watson.data.client.model.enums.GlossaryObjectDraftMode glossaryObjectDraftMode1 = glossaryObjectMetadata0.getDraftMode();
        java.util.Date date2 = null;
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata3 = glossaryObjectMetadata0.effectiveEndDate(date2);
        java.util.Date date4 = glossaryObjectMetadata3.getCreatedAt();
        org.junit.Assert.assertNull(glossaryObjectDraftMode1);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse0 = new com.ibm.watson.data.client.model.ReprocessMessagesResponse();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse2 = reprocessMessagesResponse0.entityGuidsSubmitted(strMap1);
        java.util.List<java.lang.String> strList4 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse5 = reprocessMessagesResponse0.putEntityGuidsSubmittedItem("class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}", strList4);
        com.ibm.watson.data.client.model.ReprocessMessagesOptions reprocessMessagesOptions6 = reprocessMessagesResponse5.getOptions();
        org.junit.Assert.assertNotNull(reprocessMessagesResponse2);
        org.junit.Assert.assertNotNull(reprocessMessagesResponse5);
        org.junit.Assert.assertNull(reprocessMessagesOptions6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        java.lang.String str1 = securitySyncConfig0.getSecuritySyncServerAuthorization();
        com.ibm.watson.data.client.model.Connection connection2 = securitySyncConfig0.getSecuritySyncServerConnection();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(connection2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.ibm.watson.data.client.model.EntityInfoResponse entityInfoResponse0 = new com.ibm.watson.data.client.model.EntityInfoResponse();
        com.ibm.watson.data.client.model.EntityInfoResponse entityInfoResponse2 = entityInfoResponse0.catalogId("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        java.lang.Long long3 = entityInfoResponse0.getReportTimestamp();
        org.junit.Assert.assertNotNull(entityInfoResponse2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.ibm.watson.data.client.model.DataPlatformConfig dataPlatformConfig0 = new com.ibm.watson.data.client.model.DataPlatformConfig();
        com.ibm.watson.data.client.model.DataPlatformConfig dataPlatformConfig2 = dataPlatformConfig0.dataPlatformServerName("8");
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse3 = new com.ibm.watson.data.client.model.PaginatedAssetFileListResponse();
        com.ibm.watson.data.client.model.HrefModel hrefModel4 = paginatedAssetFileListResponse3.getFirst();
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse6 = paginatedAssetFileListResponse3.totalCount((java.lang.Integer) (-1));
        com.ibm.watson.data.client.model.HrefModel hrefModel7 = null;
        paginatedAssetFileListResponse3.setLast(hrefModel7);
        boolean boolean9 = dataPlatformConfig2.equals((java.lang.Object) hrefModel7);
        org.junit.Assert.assertNotNull(dataPlatformConfig2);
        org.junit.Assert.assertNull(hrefModel4);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.String str6 = rDVImportInfo0.getImportId();
        java.util.List<com.ibm.watson.data.client.model.Warnings> warningsList7 = rDVImportInfo0.getWarnings();
        com.ibm.watson.data.client.model.Warnings warnings8 = new com.ibm.watson.data.client.model.Warnings();
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo9 = rDVImportInfo0.addWarningsItem(warnings8);
        java.util.List<java.lang.String> strList10 = warnings8.getInfo();
        java.util.List<java.lang.String> strList11 = warnings8.getInfo();
        warnings8.setRow((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(warningsList7);
        org.junit.Assert.assertNotNull(rDVImportInfo9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.ibm.watson.data.client.model.DataSchemaFieldRange dataSchemaFieldRange0 = new com.ibm.watson.data.client.model.DataSchemaFieldRange();
        java.lang.String str1 = dataSchemaFieldRange0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class DataSchemaFieldRange {\n    min: null\n    max: null\n}" + "'", str1, "class DataSchemaFieldRange {\n    min: null\n    max: null\n}");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.ibm.watson.data.client.model.enums.ConnectionFlag connectionFlag0 = com.ibm.watson.data.client.model.enums.ConnectionFlag.PERSONAL_CREDENTIALS;
        org.junit.Assert.assertTrue("'" + connectionFlag0 + "' != '" + com.ibm.watson.data.client.model.enums.ConnectionFlag.PERSONAL_CREDENTIALS + "'", connectionFlag0.equals(com.ibm.watson.data.client.model.enums.ConnectionFlag.PERSONAL_CREDENTIALS));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.ibm.watson.data.client.model.ConnectionMetadataUsage connectionMetadataUsage0 = new com.ibm.watson.data.client.model.ConnectionMetadataUsage();
        com.ibm.watson.data.client.model.ConnectionMetadataUsage connectionMetadataUsage2 = connectionMetadataUsage0.lastAccessorId("8");
        java.util.Date date3 = null;
        connectionMetadataUsage2.setLastAccessTime(date3);
        org.junit.Assert.assertNotNull(connectionMetadataUsage2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.DeleteTarget deleteTarget1 = com.ibm.watson.data.client.model.enums.DeleteTarget.fromValue("8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value '8'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.ibm.watson.data.client.model.enums.GovernancePermissionAction governancePermissionAction0 = com.ibm.watson.data.client.model.enums.GovernancePermissionAction.AUTHOR;
        java.lang.String str1 = governancePermissionAction0.getValue();
        org.junit.Assert.assertTrue("'" + governancePermissionAction0 + "' != '" + com.ibm.watson.data.client.model.enums.GovernancePermissionAction.AUTHOR + "'", governancePermissionAction0.equals(com.ibm.watson.data.client.model.enums.GovernancePermissionAction.AUTHOR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "author" + "'", str1, "author");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow0.totalCount((java.lang.Long) 100L);
        java.util.List<com.ibm.watson.data.client.model.Workflow> workflowList3 = null;
        paginatedResourceWorkflow0.setResources(workflowList3);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.ibm.watson.data.client.model.EntityInfoResponse entityInfoResponse0 = new com.ibm.watson.data.client.model.EntityInfoResponse();
        com.ibm.watson.data.client.model.EntityInfoResponse entityInfoResponse2 = entityInfoResponse0.catalogId("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        java.lang.String str3 = entityInfoResponse0.getCatalogId();
        java.lang.String str4 = entityInfoResponse0.getCatalogId();
        org.junit.Assert.assertNotNull(entityInfoResponse2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" + "'", str3, "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" + "'", str4, "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.ibm.watson.data.client.model.ElementType elementType0 = new com.ibm.watson.data.client.model.ElementType();
        elementType0.setElementHomeMetadataCollectionId("database");
        elementType0.setElementTypeDescription("geospatial");
        com.ibm.watson.data.client.model.ElementType elementType6 = elementType0.elementHomeMetadataCollectionId("geospatial");
        java.lang.String str7 = elementType6.getElementHomeMetadataCollectionId();
        com.ibm.watson.data.client.model.CustomFieldAssetEntity customFieldAssetEntity8 = new com.ibm.watson.data.client.model.CustomFieldAssetEntity();
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity9 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str10 = connectionEntity9.toString();
        java.lang.String str11 = connectionEntity9.getDescription();
        connectionEntity9.setOriginCountry("database");
        com.ibm.watson.data.client.model.ConnectionInteractionProperties connectionInteractionProperties14 = connectionEntity9.getInteractionProperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = connectionEntity9.getProperties();
        customFieldAssetEntity8.setFields(strMap15);
        boolean boolean17 = elementType6.equals((java.lang.Object) customFieldAssetEntity8);
        java.lang.String str18 = elementType6.getElementTypeDescription();
        org.junit.Assert.assertNotNull(elementType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "geospatial" + "'", str7, "geospatial");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str10, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(connectionInteractionProperties14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "geospatial" + "'", str18, "geospatial");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch0 = new com.ibm.watson.data.client.model.CatalogSearch();
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch2 = catalogSearch0.limit((java.lang.Integer) 0);
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch4 = catalogSearch0.limit((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(catalogSearch2);
        org.junit.Assert.assertNotNull(catalogSearch4);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity0 = new com.ibm.watson.data.client.model.PolicyRuleEntity();
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob1 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        com.ibm.watson.data.client.model.PolicyRuleEntity policyRuleEntity2 = policyRuleEntity0.addTriggerItem((java.lang.Object) jobPostBodyJob1);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob4 = jobPostBodyJob1.schedule("class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}");
        java.lang.String str5 = jobPostBodyJob4.getName();
        org.junit.Assert.assertNotNull(policyRuleEntity2);
        org.junit.Assert.assertNotNull(jobPostBodyJob4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.ibm.watson.data.client.model.enums.ComputeType computeType0 = com.ibm.watson.data.client.model.enums.ComputeType.WATSON;
        org.junit.Assert.assertTrue("'" + computeType0 + "' != '" + com.ibm.watson.data.client.model.enums.ComputeType.WATSON + "'", computeType0.equals(com.ibm.watson.data.client.model.enums.ComputeType.WATSON));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.ibm.watson.data.client.model.Variable variable0 = new com.ibm.watson.data.client.model.Variable();
        java.lang.Object obj1 = variable0.getValue();
        com.ibm.watson.data.client.model.ConnectionMetadata connectionMetadata2 = new com.ibm.watson.data.client.model.ConnectionMetadata();
        boolean boolean3 = variable0.equals((java.lang.Object) connectionMetadata2);
        com.ibm.watson.data.client.model.Metadata metadata5 = connectionMetadata2.assetType("SELECTED_TYPES");
        com.ibm.watson.data.client.model.ConnectionMetadata connectionMetadata7 = connectionMetadata2.assetId("AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: 8\n    usage: null\n    href: null\n}");
        com.ibm.watson.data.client.model.enums.AssetCategory assetCategory8 = connectionMetadata2.getAssetCategory();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(metadata5);
        org.junit.Assert.assertNotNull(connectionMetadata7);
        org.junit.Assert.assertNull(assetCategory8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow0 = new com.ibm.watson.data.client.model.PaginatedResourceWorkflow();
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow0.totalCount((java.lang.Long) 100L);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow4 = paginatedResourceWorkflow0.next(hrefModel3);
        com.ibm.watson.data.client.model.HrefModel hrefModel5 = null;
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow6 = paginatedResourceWorkflow0.previous(hrefModel5);
        com.ibm.watson.data.client.model.PaginatedResourceWorkflow paginatedResourceWorkflow8 = paginatedResourceWorkflow0.limit((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow2);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow4);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow6);
        org.junit.Assert.assertNotNull(paginatedResourceWorkflow8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig0 = new com.ibm.watson.data.client.model.SecurityOfficerConfig();
        com.ibm.watson.data.client.model.Connection connection1 = securityOfficerConfig0.getSecurityOfficerServerOutTopic();
        com.ibm.watson.data.client.model.SecurityOfficerConfig securityOfficerConfig3 = securityOfficerConfig0.securityOfficerServerOutTopicName("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
        java.lang.String str4 = securityOfficerConfig0.getAccessServiceRootURL();
        org.junit.Assert.assertNull(connection1);
        org.junit.Assert.assertNotNull(securityOfficerConfig3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.ibm.watson.data.client.model.SystemDetails systemDetails0 = new com.ibm.watson.data.client.model.SystemDetails();
        boolean boolean2 = systemDetails0.equals((java.lang.Object) "equals");
        java.lang.String str3 = systemDetails0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class SystemDetails {\n    warnings: null\n}" + "'", str3, "class SystemDetails {\n    warnings: null\n}");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.ibm.watson.data.client.model.TermRelationshipsRequest termRelationshipsRequest0 = new com.ibm.watson.data.client.model.TermRelationshipsRequest();
        com.ibm.watson.data.client.model.ProjectToken projectToken1 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel2 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str3 = intermediateModel2.getProcess();
        boolean boolean4 = projectToken1.equals((java.lang.Object) str3);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest5 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray6 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList7 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList7, newRelationshipArray6);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest9 = classificationRelationshipsRequest5.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList7);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity10 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail11 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage12 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail13 = attachmentDetail11.usage(metadataUsage12);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest14 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray15 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList16 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList16, newRelationshipArray15);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest18 = classificationRelationshipsRequest14.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList16);
        boolean boolean19 = attachmentDetail11.equals((java.lang.Object) newRelationshipList16);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity20 = newReferenceDataSetEntity10.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList16);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest21 = classificationRelationshipsRequest9.dataClasses((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList16);
        boolean boolean22 = projectToken1.equals((java.lang.Object) newRelationshipList16);
        termRelationshipsRequest0.setClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList16);
        com.ibm.watson.data.client.model.RuleRelationshipsRequest ruleRelationshipsRequest24 = new com.ibm.watson.data.client.model.RuleRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship newRelationship25 = new com.ibm.watson.data.client.model.NewRelationship();
        ruleRelationshipsRequest24.setParentCategory(newRelationship25);
        com.ibm.watson.data.client.model.TermRelationshipsRequest termRelationshipsRequest27 = termRelationshipsRequest0.parentCategory(newRelationship25);
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList28 = termRelationshipsRequest0.getHasTerms();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(newRelationshipArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest9);
        org.junit.Assert.assertNotNull(attachmentDetail13);
        org.junit.Assert.assertNotNull(newRelationshipArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity20);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(termRelationshipsRequest27);
        org.junit.Assert.assertNull(newRelationshipList28);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.ibm.watson.data.client.model.enums.DataConnectionType dataConnectionType0 = com.ibm.watson.data.client.model.enums.DataConnectionType.DATA_ASSET;
        org.junit.Assert.assertTrue("'" + dataConnectionType0 + "' != '" + com.ibm.watson.data.client.model.enums.DataConnectionType.DATA_ASSET + "'", dataConnectionType0.equals(com.ibm.watson.data.client.model.enums.DataConnectionType.DATA_ASSET));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo0 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.lang.String str1 = extendedUserInfo0.getDisplayName();
        extendedUserInfo0.setRole("class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity0 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        java.util.Date date1 = null;
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity2 = newReferenceDataSetEntity0.effectiveEndDate(date1);
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity4 = writeableReferenceDataSetEntity2.name("class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}");
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity2);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.String str6 = rDVImportInfo0.getImportId();
        java.util.List<com.ibm.watson.data.client.model.Warnings> warningsList7 = rDVImportInfo0.getWarnings();
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo9 = rDVImportInfo0.valuesInserted((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(warningsList7);
        org.junit.Assert.assertNotNull(rDVImportInfo9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.ibm.watson.data.client.model.ModelResource modelResource0 = new com.ibm.watson.data.client.model.ModelResource();
        com.ibm.watson.data.client.model.ResourceMeta resourceMeta1 = null;
        modelResource0.setMetadata(resourceMeta1);
        com.ibm.watson.data.client.model.SystemDetails systemDetails3 = new com.ibm.watson.data.client.model.SystemDetails();
        boolean boolean5 = systemDetails3.equals((java.lang.Object) "equals");
        modelResource0.setSystem(systemDetails3);
        java.lang.String str7 = modelResource0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class ModelResource {\n    metadata: null\n    entity: null\n    system: class SystemDetails {\n        warnings: null\n    }\n}" + "'", str7, "class ModelResource {\n    metadata: null\n    entity: null\n    system: class SystemDetails {\n        warnings: null\n    }\n}");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.ibm.watson.data.client.model.enums.WorkflowState workflowState0 = com.ibm.watson.data.client.model.enums.WorkflowState.COMPLETED;
        org.junit.Assert.assertTrue("'" + workflowState0 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowState.COMPLETED + "'", workflowState0.equals(com.ibm.watson.data.client.model.enums.WorkflowState.COMPLETED));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig2 = securitySyncConfig0.securitySyncServerType("DOES_NOT_EXIST");
        securitySyncConfig0.setSecurityServerURL("equals");
        securitySyncConfig0.setPollingInterval((java.lang.Long) 10L);
        securitySyncConfig0.setSecuritySyncInTopicName("class PolicyRuleTermListResponseResource {\n    entity: null\n    metadata: null\n}");
        org.junit.Assert.assertNotNull(securitySyncConfig2);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.ibm.watson.data.client.model.FailedRule failedRule0 = new com.ibm.watson.data.client.model.FailedRule();
        failedRule0.setReason("class DataSchemaFieldRange {\n    min: null\n    max: null\n}");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo0 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.math.BigDecimal bigDecimal1 = null;
        extendedUserInfo0.setRecentNumberOfFailedAttempts(bigDecimal1);
        com.ibm.watson.data.client.model.UserInfo userInfo4 = extendedUserInfo0.authenticator("class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}");
        java.util.Date date5 = extendedUserInfo0.getFirstFailedAttemptTimestamp();
        java.util.Date date6 = extendedUserInfo0.getReleaseLockAtTimestamp();
        java.util.Date date7 = null;
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo8 = extendedUserInfo0.firstFailedAttemptTimestamp(date7);
        extendedUserInfo8.setDisplayName("class ModelResource {\n    metadata: null\n    entity: null\n    system: class SystemDetails {\n        warnings: null\n    }\n}");
        org.junit.Assert.assertNotNull(userInfo4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(extendedUserInfo8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.ibm.watson.data.client.model.DeploymentResourcesDetails deploymentResourcesDetails0 = new com.ibm.watson.data.client.model.DeploymentResourcesDetails();
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest0 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray1 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList2, newRelationshipArray1);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest4 = classificationRelationshipsRequest0.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList2);
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity5 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity7 = updatableTermEntity5.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity9 = updatableTermEntity5.revision("read");
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList10 = updatableTermEntity5.getDataClasses();
        java.lang.String str11 = updatableTermEntity5.getName();
        java.lang.String[] strArray54 = new java.lang.String[] { "SELF_AND_PARENTS", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "DOES_NOT_EXIST", "internal_use_only", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "SELF_AND_PARENTS", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "8", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "class PolicyRuleTermListResponseResource {\n    entity: null\n    metadata: null\n}", "class DiscoveredAssetType {\n    type: null\n    dataset: null\n    datasetContainer: null\n}", "class ScoringPayload {\n    id: null\n    fields: null\n    values: null\n    type: null\n    targets: null\n}", "class NewPolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    workflowState: null\n    tags: null\n    parentPolicy: null\n    subPolicies: null\n    parentCategory: null\n    categories: null\n    terms: null\n    dataClasses: null\n    rules: null\n    classifications: null\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "active", "class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}", "database", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class FindAssetsResponse {\n    totalRows: null\n    results: null\n}", "read", "SELECTED_TYPES", "spark", "class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", "number", "hi!", "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "approved", "starting", "database", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "GLOSSARY_TERM", "class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}", "class NewPolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    workflowState: null\n    tags: null\n    parentPolicy: null\n    subPolicies: null\n    parentCategory: null\n    categories: null\n    terms: null\n    dataClasses: null\n    rules: null\n    classifications: null\n}", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        updatableTermEntity5.setStewardIds((java.util.List<java.lang.String>) strList55);
        com.ibm.watson.data.client.model.NewRelationship newRelationship58 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity59 = updatableTermEntity5.addClassificationsItem(newRelationship58);
        classificationRelationshipsRequest4.setParentCategory(newRelationship58);
        org.junit.Assert.assertNotNull(newRelationshipArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest4);
        org.junit.Assert.assertNotNull(writeableTermEntity7);
        org.junit.Assert.assertNotNull(updatableTermEntity9);
        org.junit.Assert.assertNull(newRelationshipList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity59);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.OMRSProtocolVersion oMRSProtocolVersion1 = com.ibm.watson.data.client.model.enums.OMRSProtocolVersion.fromValue("class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class Member {?    userId: null?    userIamId: null?    accessGroupId: null?    role: null?    href: null?    createTime: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str1 = attachment0.toString();
        com.ibm.watson.data.client.model.Attachment attachment3 = attachment0.message("hi!");
        java.lang.String str4 = attachment0.toString();
        java.lang.Long long5 = attachment0.getSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str1, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(attachment3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str4, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.ibm.watson.data.client.model.AssetCommentsModificationDetails assetCommentsModificationDetails0 = new com.ibm.watson.data.client.model.AssetCommentsModificationDetails();
        com.ibm.watson.data.client.model.CommentMetadata commentMetadata1 = assetCommentsModificationDetails0.getMetadata();
        org.junit.Assert.assertNull(commentMetadata1);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.ibm.watson.data.client.model.UpdateMembersBody updateMembersBody0 = new com.ibm.watson.data.client.model.UpdateMembersBody();
        java.util.List<com.ibm.watson.data.client.model.UpdateMemberBody> updateMemberBodyList1 = updateMembersBody0.getMembers();
        org.junit.Assert.assertNotNull(updateMemberBodyList1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.ibm.watson.data.client.model.ArtifactSearchResultEntity artifactSearchResultEntity0 = new com.ibm.watson.data.client.model.ArtifactSearchResultEntity();
        java.util.Date date1 = null;
        artifactSearchResultEntity0.setEffectiveStartDate(date1);
        java.util.Date date3 = null;
        artifactSearchResultEntity0.setEffectiveStartDate(date3);
        java.util.Date date5 = artifactSearchResultEntity0.getEffectiveStartDate();
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.ibm.watson.data.client.model.DatasourceTypePropertyValues datasourceTypePropertyValues0 = new com.ibm.watson.data.client.model.DatasourceTypePropertyValues();
        com.ibm.watson.data.client.model.DatasourceTypePropertyValues datasourceTypePropertyValues2 = datasourceTypePropertyValues0.label("viewer");
        com.ibm.watson.data.client.model.DatasourceTypePropertyValues datasourceTypePropertyValues4 = datasourceTypePropertyValues0.value("SELF_AND_PARENTS");
        org.junit.Assert.assertNotNull(datasourceTypePropertyValues2);
        org.junit.Assert.assertNotNull(datasourceTypePropertyValues4);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.ibm.watson.data.client.model.AssetCreateResponse assetCreateResponse0 = new com.ibm.watson.data.client.model.AssetCreateResponse();
        java.util.Map<java.lang.String, com.ibm.watson.data.client.model.AbstractAssetEntity> strMap1 = null;
        com.ibm.watson.data.client.model.MetadataEntityResult metadataEntityResult2 = assetCreateResponse0.entity(strMap1);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource3 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray4 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList5 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList5, relationshipCreateResponseIdsArray4);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource7 = createRelationshipResponseResource3.parent((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList5);
        com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] relationshipCreateResponseIdsArray8 = new com.ibm.watson.data.client.model.RelationshipCreateResponseIds[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds> relationshipCreateResponseIdsList9 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList9, relationshipCreateResponseIdsArray8);
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource11 = createRelationshipResponseResource3.terms((java.util.List<com.ibm.watson.data.client.model.RelationshipCreateResponseIds>) relationshipCreateResponseIdsList9);
        boolean boolean12 = metadataEntityResult2.equals((java.lang.Object) relationshipCreateResponseIdsList9);
        java.lang.String str13 = metadataEntityResult2.toString();
        java.lang.String str14 = metadataEntityResult2.toString();
        org.junit.Assert.assertNotNull(metadataEntityResult2);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource7);
        org.junit.Assert.assertNotNull(relationshipCreateResponseIdsArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(createRelationshipResponseResource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}" + "'", str13, "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}" + "'", str14, "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.ibm.watson.data.client.model.DataSchema dataSchema0 = new com.ibm.watson.data.client.model.DataSchema();
        com.ibm.watson.data.client.model.DataSchema dataSchema2 = dataSchema0.name("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.DataSchema dataSchema4 = dataSchema2.type("class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}");
        com.ibm.watson.data.client.model.DataSchemaField dataSchemaField5 = null;
        com.ibm.watson.data.client.model.DataSchema dataSchema6 = dataSchema2.addFieldsItem(dataSchemaField5);
        org.junit.Assert.assertNotNull(dataSchema2);
        org.junit.Assert.assertNotNull(dataSchema4);
        org.junit.Assert.assertNotNull(dataSchema6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.ibm.watson.data.client.model.ProjectToken projectToken0 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.ProjectToken projectToken2 = projectToken0.token("hi!");
        java.util.Date date3 = projectToken0.getCreatedAt();
        com.ibm.watson.data.client.model.ProjectToken projectToken4 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.TokenScope[] tokenScopeArray5 = new com.ibm.watson.data.client.model.TokenScope[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.TokenScope> tokenScopeList6 = new java.util.ArrayList<com.ibm.watson.data.client.model.TokenScope>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.TokenScope>) tokenScopeList6, tokenScopeArray5);
        com.ibm.watson.data.client.model.ProjectToken projectToken8 = projectToken4.scopes((java.util.List<com.ibm.watson.data.client.model.TokenScope>) tokenScopeList6);
        projectToken0.setScopes((java.util.List<com.ibm.watson.data.client.model.TokenScope>) tokenScopeList6);
        java.util.Date date10 = null;
        com.ibm.watson.data.client.model.ProjectToken projectToken11 = projectToken0.lastUsedAt(date10);
        org.junit.Assert.assertNotNull(projectToken2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(tokenScopeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(projectToken8);
        org.junit.Assert.assertNotNull(projectToken11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.ibm.watson.data.client.model.GetPermissionsResponse getPermissionsResponse0 = new com.ibm.watson.data.client.model.GetPermissionsResponse();
        com.ibm.watson.data.client.model.GetPermissionsResponse getPermissionsResponse2 = getPermissionsResponse0.addPermissionsItem("binary");
        org.junit.Assert.assertNotNull(getPermissionsResponse2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig0 = new com.ibm.watson.data.client.model.OpenLineageConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = openLineageConfig0.getBufferGraphConfig();
        com.ibm.watson.data.client.model.Connection connection2 = null;
        openLineageConfig0.setOpenLineageBufferGraphConnection(connection2);
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig5 = openLineageConfig0.inTopicName("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = openLineageConfig0.getBufferGraphConfig();
        openLineageConfig0.setOpenLineageProvider("class ClassificationOptions {\n    disabled: null\n    useAllIbmClasses: null\n    useAllCustomClasses: null\n    ibmClassCodes: null\n    customClassCodes: null\n}");
        openLineageConfig0.setLineageServerURL("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNotNull(openLineageConfig5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.ibm.watson.data.client.model.GetPermissionsResponse getPermissionsResponse0 = new com.ibm.watson.data.client.model.GetPermissionsResponse();
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity1 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity2 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest4 = deploymentEntity2.description("");
        java.lang.String[] strArray13 = new java.lang.String[] { "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "geospatial" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        deploymentEntity2.setTags((java.util.List<java.lang.String>) strList14);
        customAttributeDefinitionEntity1.setArtifactTypes((java.util.List<java.lang.String>) strList14);
        getPermissionsResponse0.setPermissions((java.util.List<java.lang.String>) strList14);
        getPermissionsResponse0.setMessage("class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}");
        org.junit.Assert.assertNotNull(deploymentEntityRequest4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.ibm.watson.data.client.model.Response response0 = new com.ibm.watson.data.client.model.Response();
        com.ibm.watson.data.client.model.Locale locale1 = response0.getLanguage();
        com.ibm.watson.data.client.model.MediaType mediaType2 = response0.getMediaType();
        com.ibm.watson.data.client.model.RDVGlossaryResource rDVGlossaryResource3 = new com.ibm.watson.data.client.model.RDVGlossaryResource();
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity responseReferenceDataValueEntity4 = new com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity();
        com.ibm.watson.data.client.model.RDVGlossaryResource rDVGlossaryResource5 = rDVGlossaryResource3.addRdsValuesItem(responseReferenceDataValueEntity4);
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity responseReferenceDataValueEntity6 = new com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity();
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity[] responseReferenceDataValueEntityArray7 = new com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity[] { responseReferenceDataValueEntity6 };
        java.util.ArrayList<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity> responseReferenceDataValueEntityList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity>) responseReferenceDataValueEntityList8, responseReferenceDataValueEntityArray7);
        rDVGlossaryResource3.setRdsValues((java.util.List<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity>) responseReferenceDataValueEntityList8);
        response0.setEntity((java.lang.Object) rDVGlossaryResource3);
        com.ibm.watson.data.client.model.StepInfo stepInfo12 = new com.ibm.watson.data.client.model.StepInfo();
        boolean boolean14 = stepInfo12.equals((java.lang.Object) 100.0f);
        java.math.BigDecimal bigDecimal15 = stepInfo12.getScore();
        java.lang.Integer int16 = stepInfo12.getDataAllocation();
        java.math.BigDecimal bigDecimal17 = stepInfo12.getScore();
        com.ibm.watson.data.client.model.Response response18 = response0.entity((java.lang.Object) bigDecimal17);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(mediaType2);
        org.junit.Assert.assertNotNull(rDVGlossaryResource5);
        org.junit.Assert.assertNotNull(responseReferenceDataValueEntityArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bigDecimal15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(bigDecimal17);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity0 = new com.ibm.watson.data.client.model.NewPolicyEntity();
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity2 = newPolicyEntity0.name("SELECTED_TYPES");
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest3 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray4 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList5 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList5, newRelationshipArray4);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest7 = classificationRelationshipsRequest3.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList5);
        com.ibm.watson.data.client.model.NewRelationship newRelationship8 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest9 = classificationRelationshipsRequest7.parentCategory(newRelationship8);
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity10 = newPolicyEntity0.addClassificationsItem(newRelationship8);
        java.lang.String str11 = newPolicyEntity0.getShortDescription();
        com.ibm.watson.data.client.model.WriteableClassificationEntity writeableClassificationEntity12 = new com.ibm.watson.data.client.model.WriteableClassificationEntity();
        com.ibm.watson.data.client.model.RuleRelationshipsRequest ruleRelationshipsRequest13 = new com.ibm.watson.data.client.model.RuleRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship newRelationship14 = new com.ibm.watson.data.client.model.NewRelationship();
        ruleRelationshipsRequest13.setParentCategory(newRelationship14);
        com.ibm.watson.data.client.model.NewRelationship newRelationship16 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.RuleRelationshipsRequest ruleRelationshipsRequest17 = ruleRelationshipsRequest13.addClassificationsItem(newRelationship16);
        com.ibm.watson.data.client.model.AssetCreateResponse assetCreateResponse18 = new com.ibm.watson.data.client.model.AssetCreateResponse();
        java.util.Map<java.lang.String, com.ibm.watson.data.client.model.AbstractAssetEntity> strMap19 = null;
        com.ibm.watson.data.client.model.MetadataEntityResult metadataEntityResult20 = assetCreateResponse18.entity(strMap19);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity21 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str22 = connectionEntity21.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity24 = connectionEntity21.addChildSourceSystemsItem(strMap23);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity26 = connectionEntity21.originCountry("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.Attachment attachment27 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment29 = attachment27.isReferenced((java.lang.Boolean) true);
        boolean boolean30 = connectionEntity21.equals((java.lang.Object) attachment29);
        java.lang.Long long31 = attachment29.getSize();
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader33 = attachment29.userData((java.lang.Object) "8");
        com.ibm.watson.data.client.model.Attachment attachment35 = attachment29.version((java.lang.Double) 1.0d);
        com.ibm.watson.data.client.model.MetadataAssetResult metadataAssetResult36 = metadataEntityResult20.addAttachmentsItem(attachment35);
        boolean boolean37 = newRelationship16.equals((java.lang.Object) attachment35);
        writeableClassificationEntity12.setIsATypeOfClassification(newRelationship16);
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity39 = newPolicyEntity0.parentPolicy(newRelationship16);
        org.junit.Assert.assertNotNull(newPolicyEntity2);
        org.junit.Assert.assertNotNull(newRelationshipArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest7);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest9);
        org.junit.Assert.assertNotNull(newPolicyEntity10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(ruleRelationshipsRequest17);
        org.junit.Assert.assertNotNull(metadataEntityResult20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str22, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNotNull(connectionEntity24);
        org.junit.Assert.assertNotNull(connectionEntity26);
        org.junit.Assert.assertNotNull(attachment29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(attachmentHeader33);
        org.junit.Assert.assertNotNull(attachment35);
        org.junit.Assert.assertNotNull(metadataAssetResult36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(newPolicyEntity39);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog0 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType1 = com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION;
        boolean boolean2 = discoveryLog0.equals((java.lang.Object) mappableAssetType1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        discoveryLog0.setDetails(strMap3);
        com.ibm.watson.data.client.model.enums.Severity severity5 = discoveryLog0.getSeverity();
        org.junit.Assert.assertTrue("'" + mappableAssetType1 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION + "'", mappableAssetType1.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(severity5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState0 = com.ibm.watson.data.client.model.enums.MappableAssetState.PURGE_FAILED;
        org.junit.Assert.assertTrue("'" + mappableAssetState0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.PURGE_FAILED + "'", mappableAssetState0.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.PURGE_FAILED));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel0 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str1 = intermediateModel0.getProcess();
        java.util.List<java.lang.String> strList2 = intermediateModel0.getCompositionSteps();
        com.ibm.watson.data.client.model.AssetTypeRelationship assetTypeRelationship3 = new com.ibm.watson.data.client.model.AssetTypeRelationship();
        java.lang.String str4 = assetTypeRelationship3.getKey();
        boolean boolean5 = intermediateModel0.equals((java.lang.Object) str4);
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel7 = intermediateModel0.addPipelineNodesItem("file");
        java.lang.String str8 = intermediateModel0.getNotebookLocation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intermediateModel7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig2 = securitySyncConfig0.securitySyncServerType("DOES_NOT_EXIST");
        com.ibm.watson.data.client.model.Connection connection3 = securitySyncConfig2.getSecuritySyncOutTopic();
        securitySyncConfig2.setSecurityServerURL("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        org.junit.Assert.assertNotNull(securitySyncConfig2);
        org.junit.Assert.assertNull(connection3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.ibm.watson.data.client.model.DataSchema dataSchema0 = new com.ibm.watson.data.client.model.DataSchema();
        java.lang.String str1 = dataSchema0.getType();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata0 = new com.ibm.watson.data.client.model.ArtifactMetadata();
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata2 = artifactMetadata0.versionId("hi!");
        com.ibm.watson.data.client.model.Category category3 = null;
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata4 = artifactMetadata2.parentCategory(category3);
        org.junit.Assert.assertNotNull(artifactMetadata2);
        org.junit.Assert.assertNotNull(artifactMetadata4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.DeployedAssetType deployedAssetType1 = com.ibm.watson.data.client.model.enums.DeployedAssetType.fromValue("partition");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'partition'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata0.setName("8");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata4 = glossaryObjectMetadata0.artifactType("");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata6 = glossaryObjectMetadata0.sourceRepositoryId("number");
        glossaryObjectMetadata0.setName("SELF_AND_PARENTS");
        org.junit.Assert.assertNotNull(glossaryObjectMetadata4);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity4 = updatableTermEntity0.revision("read");
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList5 = updatableTermEntity0.getDataClasses();
        java.lang.String str6 = updatableTermEntity0.toString();
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(updatableTermEntity4);
        org.junit.Assert.assertNull(newRelationshipList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}" + "'", str6, "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.ibm.watson.data.client.model.MemberSet memberSet0 = new com.ibm.watson.data.client.model.MemberSet();
        boolean boolean2 = memberSet0.equals((java.lang.Object) (short) 10);
        java.util.List<com.ibm.watson.data.client.model.Member> memberList3 = memberSet0.getMembers();
        java.lang.String str4 = memberSet0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class MemberSet {\n    members: []\n}" + "'", str4, "class MemberSet {\n    members: []\n}");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis0 = new com.ibm.watson.data.client.model.ValueAnalysis();
        com.ibm.watson.data.client.model.JSONResourcePatchModel jSONResourcePatchModel1 = new com.ibm.watson.data.client.model.JSONResourcePatchModel();
        jSONResourcePatchModel1.setValue((java.lang.Object) "");
        valueAnalysis0.setMinHashSignature((java.lang.Object) jSONResourcePatchModel1);
        com.ibm.watson.data.client.model.DiscoveredFormat discoveredFormat5 = null;
        valueAnalysis0.setInferredFormat(discoveredFormat5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType datasourceTypePropertyType0 = com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.STRING;
        org.junit.Assert.assertTrue("'" + datasourceTypePropertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.STRING + "'", datasourceTypePropertyType0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.STRING));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage1 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.usage(metadataUsage1);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest3 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray4 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList5 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList5, newRelationshipArray4);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest7 = classificationRelationshipsRequest3.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList5);
        boolean boolean8 = attachmentDetail0.equals((java.lang.Object) newRelationshipList5);
        attachmentDetail0.setAttachmentId("class IntermediateModel {\n    name: null\n    process: null\n    location: null\n    notebookLocation: null\n    sdkNotebookLocation: null\n    pipelineNodes: null\n    compositionSteps: null\n    duration: null\n    modelAsset: null\n}");
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertNotNull(newRelationshipArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.ibm.watson.data.client.model.DeploymentSystemDetails deploymentSystemDetails0 = new com.ibm.watson.data.client.model.DeploymentSystemDetails();
        com.ibm.watson.data.client.model.Warning[] warningArray1 = new com.ibm.watson.data.client.model.Warning[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Warning> warningList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.Warning>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Warning>) warningList2, warningArray1);
        deploymentSystemDetails0.setWarnings((java.util.List<com.ibm.watson.data.client.model.Warning>) warningList2);
        com.ibm.watson.data.client.model.Stats stats5 = null;
        com.ibm.watson.data.client.model.DeploymentSystemDetails deploymentSystemDetails6 = deploymentSystemDetails0.addStatsItem(stats5);
        java.lang.String str7 = deploymentSystemDetails0.toString();
        org.junit.Assert.assertNotNull(warningArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deploymentSystemDetails6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class DeploymentSystemDetails {\n    warnings: []\n    stats: [null]\n}" + "'", str7, "class DeploymentSystemDetails {\n    warnings: []\n    stats: [null]\n}");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.ibm.watson.data.client.model.EventBusConfig eventBusConfig0 = new com.ibm.watson.data.client.model.EventBusConfig();
        eventBusConfig0.setConnectorProvider("class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: [class Attachment {\n        assetType: null\n        name: null\n        description: null\n        mime: null\n        testDoc: null\n        connectionId: null\n        connectionPath: null\n        objectKey: null\n        userData: null\n        isPartitioned: null\n        assetCategory: null\n        id: null\n        version: null\n        attachmentId: null\n        datasourceType: null\n        attachmentType: null\n        href: null\n        createdAt: null\n        message: hi!\n        creatorId: null\n        createTime: null\n        size: null\n        isRemote: null\n        isManaged: null\n        isReferenced: null\n        isObjectKeyReadOnly: null\n        isUserProvidedPathKey: null\n        transferComplete: null\n        completeTimeTicks: null\n        handle: null\n        usage: null\n    }]\n}");
        java.lang.Object obj4 = null;
        com.ibm.watson.data.client.model.EventBusConfig eventBusConfig5 = eventBusConfig0.putAdditionalPropertiesItem("class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}", obj4);
        org.junit.Assert.assertNotNull(eventBusConfig5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.ibm.watson.data.client.model.DataPlatformConfig dataPlatformConfig0 = new com.ibm.watson.data.client.model.DataPlatformConfig();
        com.ibm.watson.data.client.model.DataPlatformConfig dataPlatformConfig2 = dataPlatformConfig0.dataPlatformServerName("8");
        dataPlatformConfig2.setDataPlatformGUID("class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}");
        dataPlatformConfig2.setDataPlatformServerURL("");
        org.junit.Assert.assertNotNull(dataPlatformConfig2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.StreamsFlowState streamsFlowState1 = com.ibm.watson.data.client.model.enums.StreamsFlowState.fromValue("class CustomAttribute {\n    customAttributeDefinitionId: null\n    name: null\n    values: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class CustomAttribute {?    customAttributeDefinitionId: null?    name: null?    values: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.ibm.watson.data.client.model.enums.SecureGateway secureGateway0 = com.ibm.watson.data.client.model.enums.SecureGateway.REQUIRED;
        org.junit.Assert.assertTrue("'" + secureGateway0 + "' != '" + com.ibm.watson.data.client.model.enums.SecureGateway.REQUIRED + "'", secureGateway0.equals(com.ibm.watson.data.client.model.enums.SecureGateway.REQUIRED));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.ibm.watson.data.client.model.enums.TypeDefCategory typeDefCategory0 = com.ibm.watson.data.client.model.enums.TypeDefCategory.ENTITY_DEF;
        java.lang.String str1 = typeDefCategory0.getValue();
        org.junit.Assert.assertTrue("'" + typeDefCategory0 + "' != '" + com.ibm.watson.data.client.model.enums.TypeDefCategory.ENTITY_DEF + "'", typeDefCategory0.equals(com.ibm.watson.data.client.model.enums.TypeDefCategory.ENTITY_DEF));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENTITY_DEF" + "'", str1, "ENTITY_DEF");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity3 = connectionEntity0.addChildSourceSystemsItem(strMap2);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity5 = connectionEntity0.originCountry("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody6 = new com.ibm.watson.data.client.model.CreateRoleParamsBody();
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody8 = createRoleParamsBody6.addPermissionsItem("");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity9 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity11 = updatableTermEntity9.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship12 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity13 = writeableTermEntity11.addIsOfTermsItem(newRelationship12);
        java.lang.String[] strArray27 = new java.lang.String[] { "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "geospatial", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "hi!", "read", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "file", "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}", "database", "DOES_NOT_EXIST", "geospatial", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity30 = writeableTermEntity11.abbreviations((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody31 = createRoleParamsBody8.permissions((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity32 = connectionEntity0.tags((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.enums.ConnectionFlag connectionFlag33 = com.ibm.watson.data.client.model.enums.ConnectionFlag.INTERNAL_USE_ONLY;
        java.lang.String str34 = connectionFlag33.getValue();
        java.lang.String str35 = connectionFlag33.getValue();
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity36 = connectionEntity32.addFlagsItem(connectionFlag33);
        java.lang.String str37 = connectionFlag33.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNotNull(connectionEntity3);
        org.junit.Assert.assertNotNull(connectionEntity5);
        org.junit.Assert.assertNotNull(createRoleParamsBody8);
        org.junit.Assert.assertNotNull(writeableTermEntity11);
        org.junit.Assert.assertNotNull(writeableTermEntity13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity30);
        org.junit.Assert.assertNotNull(createRoleParamsBody31);
        org.junit.Assert.assertNotNull(connectionEntity32);
        org.junit.Assert.assertTrue("'" + connectionFlag33 + "' != '" + com.ibm.watson.data.client.model.enums.ConnectionFlag.INTERNAL_USE_ONLY + "'", connectionFlag33.equals(com.ibm.watson.data.client.model.enums.ConnectionFlag.INTERNAL_USE_ONLY));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "internal_use_only" + "'", str34, "internal_use_only");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "internal_use_only" + "'", str35, "internal_use_only");
        org.junit.Assert.assertNotNull(connectionEntity36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "internal_use_only" + "'", str37, "internal_use_only");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.ibm.watson.data.client.model.DeploymentSystemDetails deploymentSystemDetails0 = new com.ibm.watson.data.client.model.DeploymentSystemDetails();
        com.ibm.watson.data.client.model.Warning[] warningArray1 = new com.ibm.watson.data.client.model.Warning[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.Warning> warningList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.Warning>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.Warning>) warningList2, warningArray1);
        deploymentSystemDetails0.setWarnings((java.util.List<com.ibm.watson.data.client.model.Warning>) warningList2);
        com.ibm.watson.data.client.model.Stats stats5 = null;
        com.ibm.watson.data.client.model.DeploymentSystemDetails deploymentSystemDetails6 = deploymentSystemDetails0.addStatsItem(stats5);
        com.ibm.watson.data.client.model.Response response7 = new com.ibm.watson.data.client.model.Response();
        com.ibm.watson.data.client.model.Locale locale8 = response7.getLanguage();
        com.ibm.watson.data.client.model.MediaType mediaType9 = response7.getMediaType();
        com.ibm.watson.data.client.model.RDVGlossaryResource rDVGlossaryResource10 = new com.ibm.watson.data.client.model.RDVGlossaryResource();
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity responseReferenceDataValueEntity11 = new com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity();
        com.ibm.watson.data.client.model.RDVGlossaryResource rDVGlossaryResource12 = rDVGlossaryResource10.addRdsValuesItem(responseReferenceDataValueEntity11);
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity responseReferenceDataValueEntity13 = new com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity();
        com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity[] responseReferenceDataValueEntityArray14 = new com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity[] { responseReferenceDataValueEntity13 };
        java.util.ArrayList<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity> responseReferenceDataValueEntityList15 = new java.util.ArrayList<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity>) responseReferenceDataValueEntityList15, responseReferenceDataValueEntityArray14);
        rDVGlossaryResource10.setRdsValues((java.util.List<com.ibm.watson.data.client.model.ResponseReferenceDataValueEntity>) responseReferenceDataValueEntityList15);
        response7.setEntity((java.lang.Object) rDVGlossaryResource10);
        boolean boolean19 = deploymentSystemDetails0.equals((java.lang.Object) rDVGlossaryResource10);
        org.junit.Assert.assertNotNull(warningArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deploymentSystemDetails6);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNull(mediaType9);
        org.junit.Assert.assertNotNull(rDVGlossaryResource12);
        org.junit.Assert.assertNotNull(responseReferenceDataValueEntityArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.ibm.watson.data.client.model.enums.MappableOMRSEntity mappableOMRSEntity0 = com.ibm.watson.data.client.model.enums.MappableOMRSEntity.DEPLOYEDDATABASESCHEMA;
        org.junit.Assert.assertTrue("'" + mappableOMRSEntity0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSEntity.DEPLOYEDDATABASESCHEMA + "'", mappableOMRSEntity0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSEntity.DEPLOYEDDATABASESCHEMA));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.ibm.watson.data.client.model.NewCategoryEntity newCategoryEntity0 = new com.ibm.watson.data.client.model.NewCategoryEntity();
        com.ibm.watson.data.client.model.NewCategoryEntity newCategoryEntity2 = newCategoryEntity0.longDescription("py_script");
        com.ibm.watson.data.client.model.CustomAttribute customAttribute3 = null;
        com.ibm.watson.data.client.model.NewCategoryEntity newCategoryEntity4 = newCategoryEntity0.addCustomAttributesItem(customAttribute3);
        java.lang.String str5 = newCategoryEntity4.getName();
        org.junit.Assert.assertNotNull(newCategoryEntity2);
        org.junit.Assert.assertNotNull(newCategoryEntity4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.ibm.watson.data.client.model.ContentInfo contentInfo0 = new com.ibm.watson.data.client.model.ContentInfo();
        contentInfo0.setFileName("");
        com.ibm.watson.data.client.model.enums.ContentFormatType contentFormatType3 = contentInfo0.getContentFormat();
        org.junit.Assert.assertNull(contentFormatType3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.ibm.watson.data.client.model.ProjectStorage projectStorage0 = new com.ibm.watson.data.client.model.ProjectStorage();
        com.ibm.watson.data.client.model.NewRuleEntity newRuleEntity1 = new com.ibm.watson.data.client.model.NewRuleEntity();
        boolean boolean2 = projectStorage0.equals((java.lang.Object) newRuleEntity1);
        com.ibm.watson.data.client.model.enums.StorageType storageType3 = projectStorage0.getType();
        com.ibm.watson.data.client.model.enums.StorageType storageType4 = com.ibm.watson.data.client.model.enums.StorageType.BMCOS_OBJECT_STORAGE;
        projectStorage0.setType(storageType4);
        java.lang.String str6 = storageType4.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(storageType3);
        org.junit.Assert.assertTrue("'" + storageType4 + "' != '" + com.ibm.watson.data.client.model.enums.StorageType.BMCOS_OBJECT_STORAGE + "'", storageType4.equals(com.ibm.watson.data.client.model.enums.StorageType.BMCOS_OBJECT_STORAGE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bmcos_object_storage" + "'", str6, "bmcos_object_storage");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata0.setName("8");
        java.lang.String str3 = glossaryObjectMetadata0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class GlossaryObjectMetadata {\n    artifactType: null\n    artifactId: null\n    versionId: null\n    sourceRepositoryId: null\n    externalId: null\n    globalId: null\n    workflowId: null\n    draftMode: null\n    publishedAncestorId: null\n    draftAncestorId: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    createdBy: null\n    createdAt: null\n    modifiedBy: null\n    modifiedAt: null\n    revision: null\n    name: 8\n    shortDescription: null\n    state: null\n    tags: null\n    stewardIds: null\n    workflowState: null\n    readOnly: null\n    removeStartDate: null\n    removeEndDate: null\n    userAccess: null\n}" + "'", str3, "class GlossaryObjectMetadata {\n    artifactType: null\n    artifactId: null\n    versionId: null\n    sourceRepositoryId: null\n    externalId: null\n    globalId: null\n    workflowId: null\n    draftMode: null\n    publishedAncestorId: null\n    draftAncestorId: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    createdBy: null\n    createdAt: null\n    modifiedBy: null\n    modifiedAt: null\n    revision: null\n    name: 8\n    shortDescription: null\n    state: null\n    tags: null\n    stewardIds: null\n    workflowState: null\n    readOnly: null\n    removeStartDate: null\n    removeEndDate: null\n    userAccess: null\n}");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse0 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse0.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse4 = omrsProcessingStatusResponse0.numPendingDataAssets((java.lang.Long) 0L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse7 = omrsProcessingStatusResponse0.putNumNewRelationshipsReceivedItem("file", (java.lang.Long) 1L);
        java.lang.Long long8 = omrsProcessingStatusResponse0.getStartTimestamp();
        java.util.Map<java.lang.String, java.lang.Long> strMap9 = null;
        omrsProcessingStatusResponse0.setNumNewRelationshipsReceived(strMap9);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse4);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.ibm.watson.data.client.model.DataSchema dataSchema0 = new com.ibm.watson.data.client.model.DataSchema();
        com.ibm.watson.data.client.model.DataSchema dataSchema2 = dataSchema0.name("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.DataSchema dataSchema4 = dataSchema2.id("viewer");
        org.junit.Assert.assertNotNull(dataSchema2);
        org.junit.Assert.assertNotNull(dataSchema4);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        java.lang.String str3 = updatableTermEntity0.getRevision();
        java.util.Date date4 = null;
        updatableTermEntity0.setEffectiveEndDate(date4);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity7 = updatableTermEntity0.importSourceCreatedBy("completed");
        writeableTermEntity7.setExample("completed");
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(writeableTermEntity7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.Long long6 = rDVImportInfo0.getValuesCount();
        java.lang.String str7 = rDVImportInfo0.getHref();
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo9 = rDVImportInfo0.importId("class MemberSet {\n    members: []\n}");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(rDVImportInfo9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.ibm.watson.data.client.model.AssetRatingStatsResponse assetRatingStatsResponse0 = new com.ibm.watson.data.client.model.AssetRatingStatsResponse();
        assetRatingStatsResponse0.setRevisionId((java.lang.Long) 1L);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity4 = updatableTermEntity0.revision("read");
        java.lang.String str5 = updatableTermEntity4.toString();
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity6 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail7 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage8 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail9 = attachmentDetail7.usage(metadataUsage8);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest10 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray11 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList12 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList12, newRelationshipArray11);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest14 = classificationRelationshipsRequest10.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList12);
        boolean boolean15 = attachmentDetail7.equals((java.lang.Object) newRelationshipList12);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity16 = newReferenceDataSetEntity6.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList12);
        updatableTermEntity4.setClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList12);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(updatableTermEntity4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}" + "'", str5, "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}");
        org.junit.Assert.assertNotNull(attachmentDetail9);
        org.junit.Assert.assertNotNull(newRelationshipArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo0 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.util.Date date1 = null;
        extendedUserInfo0.setFirstFailedAttemptTimestamp(date1);
        com.ibm.watson.data.client.model.UserInfo userInfo4 = extendedUserInfo0.username("hi!");
        java.lang.String str5 = userInfo4.getRole();
        org.junit.Assert.assertNotNull(userInfo4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.QueryConditionType queryConditionType1 = com.ibm.watson.data.client.model.enums.QueryConditionType.fromValue("class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class UpdateType {?    description: null?    fields: [class AssetTypeField {?        key: null?        type: null?        facet: null?        isArray: null?        searchPath: null?        isSearchableAcrossTypes: null?    }]?    externalAssetPreview: null?    relationships: null?    properties: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata0.setName("8");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata4 = glossaryObjectMetadata0.artifactType("");
        com.ibm.watson.data.client.model.enums.GlossaryObjectDraftMode glossaryObjectDraftMode5 = null;
        glossaryObjectMetadata0.setDraftMode(glossaryObjectDraftMode5);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.ibm.watson.data.client.model.StepInfo stepInfo0 = new com.ibm.watson.data.client.model.StepInfo();
        boolean boolean2 = stepInfo0.equals((java.lang.Object) 100.0f);
        java.math.BigDecimal bigDecimal3 = stepInfo0.getScore();
        java.lang.Integer int4 = stepInfo0.getDataAllocation();
        java.math.BigDecimal bigDecimal5 = stepInfo0.getScore();
        stepInfo0.setTransformer("class SyncScoringDataResults {\n    predictions: [class ScoringPayload {\n        id: null\n        fields: null\n        values: null\n        type: null\n        targets: null\n    }]\n}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.ibm.watson.data.client.model.TypesResponse typesResponse0 = new com.ibm.watson.data.client.model.TypesResponse();
        java.util.List<com.ibm.watson.data.client.model.Type> typeList1 = typesResponse0.getResources();
        java.lang.String str2 = typesResponse0.toString();
        org.junit.Assert.assertNotNull(typeList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class TypesResponse {\n    resources: []\n}" + "'", str2, "class TypesResponse {\n    resources: []\n}");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.ibm.watson.data.client.model.Member member0 = new com.ibm.watson.data.client.model.Member();
        member0.setHref("Governance");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.ibm.watson.data.client.model.Member member0 = new com.ibm.watson.data.client.model.Member();
        java.lang.String str1 = member0.getCreateTime();
        java.lang.String str2 = member0.getHref();
        java.lang.String str3 = member0.getAccessGroupId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.ibm.watson.data.client.model.EntityInfoResponse entityInfoResponse0 = new com.ibm.watson.data.client.model.EntityInfoResponse();
        com.ibm.watson.data.client.model.EntityInfoResponse entityInfoResponse2 = entityInfoResponse0.catalogId("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        com.ibm.watson.data.client.model.EntityInfoSummary entityInfoSummary3 = entityInfoResponse2.getSummary();
        org.junit.Assert.assertNotNull(entityInfoResponse2);
        org.junit.Assert.assertNull(entityInfoSummary3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity0 = new com.ibm.watson.data.client.model.ResponseRuleEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList1 = null;
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity2 = responseRuleEntity0.governsAssets(paginatedRelationshipsList1);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList3 = null;
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity4 = responseRuleEntity0.rules(paginatedRelationshipsList3);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList5 = new com.ibm.watson.data.client.model.PaginatedRelationshipsList();
        com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] relationshipRelationshipEntityArray6 = new com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity> relationshipRelationshipEntityList7 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList7, relationshipRelationshipEntityArray6);
        paginatedRelationshipsList5.setResources((java.util.List<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList7);
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity10 = responseRuleEntity4.categories(paginatedRelationshipsList5);
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity11 = new com.ibm.watson.data.client.model.ResponseRuleEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList12 = null;
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity13 = responseRuleEntity11.governsAssets(paginatedRelationshipsList12);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList14 = new com.ibm.watson.data.client.model.PaginatedRelationshipsList();
        com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] relationshipRelationshipEntityArray15 = new com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity> relationshipRelationshipEntityList16 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList16, relationshipRelationshipEntityArray15);
        paginatedRelationshipsList14.setResources((java.util.List<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList16);
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity19 = responseRuleEntity11.policies(paginatedRelationshipsList14);
        responseRuleEntity4.setPolicies(paginatedRelationshipsList14);
        org.junit.Assert.assertNotNull(responseRuleEntity2);
        org.junit.Assert.assertNotNull(responseRuleEntity4);
        org.junit.Assert.assertNotNull(relationshipRelationshipEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(responseRuleEntity10);
        org.junit.Assert.assertNotNull(responseRuleEntity13);
        org.junit.Assert.assertNotNull(relationshipRelationshipEntityArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(responseRuleEntity19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.ibm.watson.data.client.model.NewRuleEntity newRuleEntity0 = new com.ibm.watson.data.client.model.NewRuleEntity();
        com.ibm.watson.data.client.model.NewRelationship newRelationship1 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.WriteableRuleEntity writeableRuleEntity2 = newRuleEntity0.addClassificationsItem(newRelationship1);
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity3 = new com.ibm.watson.data.client.model.NewPolicyEntity();
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity5 = newPolicyEntity3.name("SELECTED_TYPES");
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest6 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray7 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList8, newRelationshipArray7);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest10 = classificationRelationshipsRequest6.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList8);
        com.ibm.watson.data.client.model.NewRelationship newRelationship11 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest12 = classificationRelationshipsRequest10.parentCategory(newRelationship11);
        com.ibm.watson.data.client.model.NewPolicyEntity newPolicyEntity13 = newPolicyEntity3.addClassificationsItem(newRelationship11);
        com.ibm.watson.data.client.model.WriteableRuleEntity writeableRuleEntity14 = writeableRuleEntity2.addRulesItem(newRelationship11);
        org.junit.Assert.assertNotNull(writeableRuleEntity2);
        org.junit.Assert.assertNotNull(newPolicyEntity5);
        org.junit.Assert.assertNotNull(newRelationshipArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest10);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest12);
        org.junit.Assert.assertNotNull(newPolicyEntity13);
        org.junit.Assert.assertNotNull(writeableRuleEntity14);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.ibm.watson.data.client.model.enums.MappableOMRSRelationship mappableOMRSRelationship0 = com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.DATACONTENTFORDATASET;
        org.junit.Assert.assertTrue("'" + mappableOMRSRelationship0 + "' != '" + com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.DATACONTENTFORDATASET + "'", mappableOMRSRelationship0.equals(com.ibm.watson.data.client.model.enums.MappableOMRSRelationship.DATACONTENTFORDATASET));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.ibm.watson.data.client.model.Artifact artifact0 = new com.ibm.watson.data.client.model.Artifact();
        com.ibm.watson.data.client.model.ArtifactWorkflowData artifactWorkflowData1 = null;
        artifact0.setWorkflowData(artifactWorkflowData1);
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata3 = new com.ibm.watson.data.client.model.WorkflowMetadata();
        java.lang.String str4 = workflowMetadata3.getCreatedBy();
        com.ibm.watson.data.client.model.enums.WorkflowState workflowState5 = com.ibm.watson.data.client.model.enums.WorkflowState.CREATED;
        workflowMetadata3.setState(workflowState5);
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata7 = new com.ibm.watson.data.client.model.ArtifactMetadata();
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata9 = artifactMetadata7.versionId("hi!");
        boolean boolean10 = workflowMetadata3.equals((java.lang.Object) artifactMetadata7);
        java.lang.String str11 = artifactMetadata7.getArtifactId();
        artifact0.setMetadata(artifactMetadata7);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + workflowState5 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowState.CREATED + "'", workflowState5.equals(com.ibm.watson.data.client.model.enums.WorkflowState.CREATED));
        org.junit.Assert.assertNotNull(artifactMetadata9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity0 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        java.util.List<java.lang.String> strList1 = newReferenceDataSetEntity0.getStewardIds();
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.ibm.watson.data.client.model.AssetTypeRelationship assetTypeRelationship0 = new com.ibm.watson.data.client.model.AssetTypeRelationship();
        com.ibm.watson.data.client.model.enums.DeleteTarget deleteTarget1 = null;
        com.ibm.watson.data.client.model.AssetTypeRelationship assetTypeRelationship2 = assetTypeRelationship0.onDeleteTarget(deleteTarget1);
        com.ibm.watson.data.client.model.enums.DeleteTarget deleteTarget3 = null;
        assetTypeRelationship2.setOnDeleteTarget(deleteTarget3);
        org.junit.Assert.assertNotNull(assetTypeRelationship2);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.ibm.watson.data.client.model.DataPlatformConfig dataPlatformConfig0 = new com.ibm.watson.data.client.model.DataPlatformConfig();
        com.ibm.watson.data.client.model.DataPlatformConfig dataPlatformConfig2 = dataPlatformConfig0.dataPlatformGUID("class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}");
        com.ibm.watson.data.client.model.Link link3 = new com.ibm.watson.data.client.model.Link();
        link3.setTitle("");
        link3.setUriBuilder((java.lang.Object) (-1.0f));
        boolean boolean8 = dataPlatformConfig0.equals((java.lang.Object) (-1.0f));
        dataPlatformConfig0.setDataPlatformGUID("class ResponseClassificationEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    defaultLocaleId: null\n    tags: null\n    parentCategory: null\n    categories: null\n    isATypeOfClassification: null\n    hasTypesClassifications: null\n    terms: null\n    dataClasses: null\n    referenceData: null\n    policies: null\n    rules: null\n}");
        org.junit.Assert.assertNotNull(dataPlatformConfig2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig2 = securitySyncConfig0.securitySyncServerType("DOES_NOT_EXIST");
        java.lang.String str3 = securitySyncConfig2.getSecurityServerURL();
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig5 = securitySyncConfig2.pollingInterval((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(securitySyncConfig2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(securitySyncConfig5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody0 = new com.ibm.watson.data.client.model.UpdateProjectBody();
        com.ibm.watson.data.client.model.ProjectCatalog projectCatalog1 = null;
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody2 = updateProjectBody0.catalog(projectCatalog1);
        java.util.List<com.ibm.watson.data.client.model.enums.ProjectToolType> projectToolTypeList3 = updateProjectBody0.getTools();
        com.ibm.watson.data.client.model.ProjectFigureEight projectFigureEight4 = null;
        updateProjectBody0.setFigureEight(projectFigureEight4);
        org.junit.Assert.assertNotNull(updateProjectBody2);
        org.junit.Assert.assertNull(projectToolTypeList3);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.ibm.watson.data.client.model.EnumValue enumValue0 = new com.ibm.watson.data.client.model.EnumValue();
        java.lang.String str1 = enumValue0.getName();
        java.lang.String str2 = enumValue0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class EnumValue {\n    id: null\n    name: null\n}" + "'", str2, "class EnumValue {\n    id: null\n    name: null\n}");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.ibm.watson.data.client.model.DataSchema dataSchema0 = new com.ibm.watson.data.client.model.DataSchema();
        com.ibm.watson.data.client.model.DataSchema dataSchema2 = dataSchema0.name("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        java.lang.String str3 = dataSchema2.getType();
        org.junit.Assert.assertNotNull(dataSchema2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList0 = new com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList();
        com.ibm.watson.data.client.model.AssetAggregatedCommentsList[] assetAggregatedCommentsListArray1 = new com.ibm.watson.data.client.model.AssetAggregatedCommentsList[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.AssetAggregatedCommentsList> assetAggregatedCommentsListList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList2, assetAggregatedCommentsListArray1);
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList4 = paginatedAssetAggregatedCommentsList0.resources((java.util.List<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList2);
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList5 = new com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList();
        com.ibm.watson.data.client.model.AssetAggregatedCommentsList[] assetAggregatedCommentsListArray6 = new com.ibm.watson.data.client.model.AssetAggregatedCommentsList[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.AssetAggregatedCommentsList> assetAggregatedCommentsListList7 = new java.util.ArrayList<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList7, assetAggregatedCommentsListArray6);
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList9 = paginatedAssetAggregatedCommentsList5.resources((java.util.List<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList7);
        com.ibm.watson.data.client.model.PaginatedAssetAggregatedCommentsList paginatedAssetAggregatedCommentsList10 = paginatedAssetAggregatedCommentsList0.resources((java.util.List<com.ibm.watson.data.client.model.AssetAggregatedCommentsList>) assetAggregatedCommentsListList7);
        org.junit.Assert.assertNotNull(assetAggregatedCommentsListArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paginatedAssetAggregatedCommentsList4);
        org.junit.Assert.assertNotNull(assetAggregatedCommentsListArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paginatedAssetAggregatedCommentsList9);
        org.junit.Assert.assertNotNull(paginatedAssetAggregatedCommentsList10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.ibm.watson.data.client.model.WriteableClassificationEntity writeableClassificationEntity0 = new com.ibm.watson.data.client.model.WriteableClassificationEntity();
        com.ibm.watson.data.client.model.TermRelationshipsRequest termRelationshipsRequest1 = new com.ibm.watson.data.client.model.TermRelationshipsRequest();
        com.ibm.watson.data.client.model.ProjectToken projectToken2 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.IntermediateModel intermediateModel3 = new com.ibm.watson.data.client.model.IntermediateModel();
        java.lang.String str4 = intermediateModel3.getProcess();
        boolean boolean5 = projectToken2.equals((java.lang.Object) str4);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest6 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray7 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList8 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList8, newRelationshipArray7);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest10 = classificationRelationshipsRequest6.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList8);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity11 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail12 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage13 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail14 = attachmentDetail12.usage(metadataUsage13);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest15 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray16 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList17 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList17, newRelationshipArray16);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest19 = classificationRelationshipsRequest15.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList17);
        boolean boolean20 = attachmentDetail12.equals((java.lang.Object) newRelationshipList17);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity21 = newReferenceDataSetEntity11.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList17);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest22 = classificationRelationshipsRequest10.dataClasses((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList17);
        boolean boolean23 = projectToken2.equals((java.lang.Object) newRelationshipList17);
        termRelationshipsRequest1.setClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList17);
        com.ibm.watson.data.client.model.RuleRelationshipsRequest ruleRelationshipsRequest25 = new com.ibm.watson.data.client.model.RuleRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship newRelationship26 = new com.ibm.watson.data.client.model.NewRelationship();
        ruleRelationshipsRequest25.setParentCategory(newRelationship26);
        com.ibm.watson.data.client.model.TermRelationshipsRequest termRelationshipsRequest28 = termRelationshipsRequest1.parentCategory(newRelationship26);
        com.ibm.watson.data.client.model.WriteableClassificationEntity writeableClassificationEntity29 = writeableClassificationEntity0.addHasTypesClassificationsItem(newRelationship26);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(newRelationshipArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest10);
        org.junit.Assert.assertNotNull(attachmentDetail14);
        org.junit.Assert.assertNotNull(newRelationshipArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity21);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(termRelationshipsRequest28);
        org.junit.Assert.assertNotNull(writeableClassificationEntity29);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.ibm.watson.data.client.model.RepositoryServicesConfig repositoryServicesConfig0 = new com.ibm.watson.data.client.model.RepositoryServicesConfig();
        java.util.List<com.ibm.watson.data.client.model.Connection> connectionList1 = repositoryServicesConfig0.getAuditLogConnections();
        com.ibm.watson.data.client.model.Connection connection2 = null;
        com.ibm.watson.data.client.model.RepositoryServicesConfig repositoryServicesConfig3 = repositoryServicesConfig0.addOpenMetadataArchiveConnectionsItem(connection2);
        com.ibm.watson.data.client.model.CohortConfig[] cohortConfigArray4 = new com.ibm.watson.data.client.model.CohortConfig[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CohortConfig> cohortConfigList5 = new java.util.ArrayList<com.ibm.watson.data.client.model.CohortConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CohortConfig>) cohortConfigList5, cohortConfigArray4);
        com.ibm.watson.data.client.model.RepositoryServicesConfig repositoryServicesConfig7 = repositoryServicesConfig3.cohortConfigList((java.util.List<com.ibm.watson.data.client.model.CohortConfig>) cohortConfigList5);
        com.ibm.watson.data.client.model.EnterpriseAccessConfig enterpriseAccessConfig8 = null;
        com.ibm.watson.data.client.model.RepositoryServicesConfig repositoryServicesConfig9 = repositoryServicesConfig7.enterpriseAccessConfig(enterpriseAccessConfig8);
        org.junit.Assert.assertNull(connectionList1);
        org.junit.Assert.assertNotNull(repositoryServicesConfig3);
        org.junit.Assert.assertNotNull(cohortConfigArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(repositoryServicesConfig7);
        org.junit.Assert.assertNotNull(repositoryServicesConfig9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment2 = attachment0.isReferenced((java.lang.Boolean) true);
        attachment2.setTransferComplete((java.lang.Boolean) false);
        java.lang.String str5 = attachment2.toString();
        com.ibm.watson.data.client.model.Attachment attachment7 = attachment2.createTime((java.lang.Long) 1L);
        attachment2.setCreateTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(attachment2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str5, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(attachment7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.ibm.watson.data.client.model.DatasourceTypePropertyCondition datasourceTypePropertyCondition0 = new com.ibm.watson.data.client.model.DatasourceTypePropertyCondition();
        com.ibm.watson.data.client.model.DatasourceTypeCondition[] datasourceTypeConditionArray1 = new com.ibm.watson.data.client.model.DatasourceTypeCondition[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DatasourceTypeCondition> datasourceTypeConditionList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.DatasourceTypeCondition>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DatasourceTypeCondition>) datasourceTypeConditionList2, datasourceTypeConditionArray1);
        datasourceTypePropertyCondition0.setConditions((java.util.List<com.ibm.watson.data.client.model.DatasourceTypeCondition>) datasourceTypeConditionList2);
        org.junit.Assert.assertNotNull(datasourceTypeConditionArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity0 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.NewRelationship newRelationship1 = null;
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity2 = newReferenceDataSetEntity0.addTermsItem(newRelationship1);
        java.util.Date date3 = null;
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity4 = newReferenceDataSetEntity0.effectiveStartDate(date3);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity2);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType datasourceTypePropertyType0 = com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.BOOLEAN;
        org.junit.Assert.assertTrue("'" + datasourceTypePropertyType0 + "' != '" + com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.BOOLEAN + "'", datasourceTypePropertyType0.equals(com.ibm.watson.data.client.model.enums.DatasourceTypePropertyType.BOOLEAN));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.ibm.watson.data.client.model.DiscoveredStringDetails discoveredStringDetails0 = new com.ibm.watson.data.client.model.DiscoveredStringDetails();
        java.lang.String str1 = discoveredStringDetails0.getValue();
        java.lang.Double double2 = discoveredStringDetails0.getConfidence();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(double2);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.ibm.watson.data.client.model.BaseEntity baseEntity0 = new com.ibm.watson.data.client.model.BaseEntity();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.ibm.watson.data.client.model.BaseEntity baseEntity2 = baseEntity0.additionalProperties(strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        com.ibm.watson.data.client.model.BaseEntity baseEntity4 = baseEntity2.additionalProperties(strMap3);
        baseEntity2.setUrl("analytics_engine");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        baseEntity2.setAdditionalProperties(strMap7);
        org.junit.Assert.assertNotNull(baseEntity2);
        org.junit.Assert.assertNotNull(baseEntity4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload0 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.enums.ScoringType scoringType1 = scoringPayload0.getType();
        com.ibm.watson.data.client.model.enums.ScoringType scoringType2 = scoringPayload0.getType();
        org.junit.Assert.assertNull(scoringType1);
        org.junit.Assert.assertNull(scoringType2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty0 = new com.ibm.watson.data.client.model.AssetTypeProperty();
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty2 = assetTypeProperty0.isArray((java.lang.Boolean) false);
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty3 = new com.ibm.watson.data.client.model.AssetTypeProperty();
        assetTypeProperty0.setDefaultValue((java.lang.Object) assetTypeProperty3);
        java.lang.Integer int5 = assetTypeProperty0.getMinLength();
        org.junit.Assert.assertNotNull(assetTypeProperty2);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        java.lang.String str1 = updatableTermEntity0.getLongDescription();
        java.lang.String str2 = updatableTermEntity0.getExample();
        com.ibm.watson.data.client.model.GlossaryObjectEntity glossaryObjectEntity4 = updatableTermEntity0.longDescription("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(glossaryObjectEntity4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.ibm.watson.data.client.model.FunctionEntitySchemas functionEntitySchemas0 = new com.ibm.watson.data.client.model.FunctionEntitySchemas();
        com.ibm.watson.data.client.model.DataSchema[] dataSchemaArray1 = new com.ibm.watson.data.client.model.DataSchema[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema> dataSchemaList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.DataSchema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList2, dataSchemaArray1);
        functionEntitySchemas0.setOutput((java.util.List<com.ibm.watson.data.client.model.DataSchema>) dataSchemaList2);
        com.ibm.watson.data.client.model.DataSchema dataSchema5 = new com.ibm.watson.data.client.model.DataSchema();
        com.ibm.watson.data.client.model.DataSchema dataSchema7 = dataSchema5.name("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.DataSchemaField[] dataSchemaFieldArray8 = new com.ibm.watson.data.client.model.DataSchemaField[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.DataSchemaField> dataSchemaFieldList9 = new java.util.ArrayList<com.ibm.watson.data.client.model.DataSchemaField>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.DataSchemaField>) dataSchemaFieldList9, dataSchemaFieldArray8);
        dataSchema7.setFields((java.util.List<com.ibm.watson.data.client.model.DataSchemaField>) dataSchemaFieldList9);
        com.ibm.watson.data.client.model.FunctionEntitySchemas functionEntitySchemas12 = functionEntitySchemas0.addInputItem(dataSchema7);
        org.junit.Assert.assertNotNull(dataSchemaArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dataSchema7);
        org.junit.Assert.assertNotNull(dataSchemaFieldArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(functionEntitySchemas12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.ibm.watson.data.client.model.ResponseDataClass responseDataClass0 = new com.ibm.watson.data.client.model.ResponseDataClass();
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata1 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata1.setName("8");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata5 = glossaryObjectMetadata1.artifactType("");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata7 = glossaryObjectMetadata1.sourceRepositoryId("number");
        responseDataClass0.setMetadata(glossaryObjectMetadata7);
        java.lang.String str9 = responseDataClass0.toString();
        org.junit.Assert.assertNotNull(glossaryObjectMetadata5);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class ResponseDataClass {\n    metadata: class GlossaryObjectMetadata {\n        artifactType: \n        artifactId: null\n        versionId: null\n        sourceRepositoryId: number\n        externalId: null\n        globalId: null\n        workflowId: null\n        draftMode: null\n        publishedAncestorId: null\n        draftAncestorId: null\n        effectiveStartDate: null\n        effectiveEndDate: null\n        createdBy: null\n        createdAt: null\n        modifiedBy: null\n        modifiedAt: null\n        revision: null\n        name: 8\n        shortDescription: null\n        state: null\n        tags: null\n        stewardIds: null\n        workflowState: null\n        readOnly: null\n        removeStartDate: null\n        removeEndDate: null\n        userAccess: null\n    }\n    entity: null\n}" + "'", str9, "class ResponseDataClass {\n    metadata: class GlossaryObjectMetadata {\n        artifactType: \n        artifactId: null\n        versionId: null\n        sourceRepositoryId: number\n        externalId: null\n        globalId: null\n        workflowId: null\n        draftMode: null\n        publishedAncestorId: null\n        draftAncestorId: null\n        effectiveStartDate: null\n        effectiveEndDate: null\n        createdBy: null\n        createdAt: null\n        modifiedBy: null\n        modifiedAt: null\n        revision: null\n        name: 8\n        shortDescription: null\n        state: null\n        tags: null\n        stewardIds: null\n        workflowState: null\n        readOnly: null\n        removeStartDate: null\n        removeEndDate: null\n        userAccess: null\n    }\n    entity: null\n}");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.ibm.watson.data.client.model.ManualClassification manualClassification0 = new com.ibm.watson.data.client.model.ManualClassification();
        com.ibm.watson.data.client.model.ProjectToken projectToken1 = new com.ibm.watson.data.client.model.ProjectToken();
        com.ibm.watson.data.client.model.ProjectToken projectToken3 = projectToken1.token("hi!");
        java.util.Date date4 = projectToken1.getCreatedAt();
        java.util.Date date5 = projectToken1.getLastUsedAt();
        boolean boolean6 = manualClassification0.equals((java.lang.Object) projectToken1);
        manualClassification0.setName("");
        org.junit.Assert.assertNotNull(projectToken3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.ibm.watson.data.client.model.CommentByUser commentByUser0 = new com.ibm.watson.data.client.model.CommentByUser();
        java.lang.String str1 = commentByUser0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class CommentByUser {\n    comment: null\n    allowEdits: null\n}" + "'", str1, "class CommentByUser {\n    comment: null\n    allowEdits: null\n}");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.ibm.watson.data.client.model.DeploymentEntityStatus deploymentEntityStatus0 = new com.ibm.watson.data.client.model.DeploymentEntityStatus();
        com.ibm.watson.data.client.model.WMLError wMLError1 = deploymentEntityStatus0.getFailure();
        com.ibm.watson.data.client.model.UrlDetails urlDetails2 = null;
        com.ibm.watson.data.client.model.DeploymentEntityStatus deploymentEntityStatus3 = deploymentEntityStatus0.onlineUrl(urlDetails2);
        com.ibm.watson.data.client.model.UrlDetails urlDetails4 = null;
        deploymentEntityStatus3.setOnlineUrl(urlDetails4);
        java.util.List<com.ibm.watson.data.client.model.UrlDetails> urlDetailsList6 = deploymentEntityStatus3.getVirtualDeploymentDownloads();
        org.junit.Assert.assertNull(wMLError1);
        org.junit.Assert.assertNotNull(deploymentEntityStatus3);
        org.junit.Assert.assertNull(urlDetailsList6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.ibm.watson.data.client.model.SyncScoringDataResults syncScoringDataResults0 = new com.ibm.watson.data.client.model.SyncScoringDataResults();
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload1 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.ScoringPayload[] scoringPayloadArray2 = new com.ibm.watson.data.client.model.ScoringPayload[] { scoringPayload1 };
        java.util.ArrayList<com.ibm.watson.data.client.model.ScoringPayload> scoringPayloadList3 = new java.util.ArrayList<com.ibm.watson.data.client.model.ScoringPayload>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.ScoringPayload>) scoringPayloadList3, scoringPayloadArray2);
        com.ibm.watson.data.client.model.SyncScoringDataResults syncScoringDataResults5 = syncScoringDataResults0.predictions((java.util.List<com.ibm.watson.data.client.model.ScoringPayload>) scoringPayloadList3);
        java.lang.String str6 = syncScoringDataResults0.toString();
        java.util.List<com.ibm.watson.data.client.model.ScoringPayload> scoringPayloadList7 = syncScoringDataResults0.getPredictions();
        org.junit.Assert.assertNotNull(scoringPayloadArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(syncScoringDataResults5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class SyncScoringDataResults {\n    predictions: [class ScoringPayload {\n        id: null\n        fields: null\n        values: null\n        type: null\n        targets: null\n    }]\n}" + "'", str6, "class SyncScoringDataResults {\n    predictions: [class ScoringPayload {\n        id: null\n        fields: null\n        values: null\n        type: null\n        targets: null\n    }]\n}");
        org.junit.Assert.assertNotNull(scoringPayloadList7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog0 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType1 = com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION;
        boolean boolean2 = discoveryLog0.equals((java.lang.Object) mappableAssetType1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        discoveryLog0.setDetails(strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = discoveryLog0.getDetails();
        com.ibm.watson.data.client.model.enums.Severity severity6 = com.ibm.watson.data.client.model.enums.Severity.INFO;
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog7 = discoveryLog0.severity(severity6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = discoveryLog7.getDetails();
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity9 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str10 = connectionEntity9.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity12 = connectionEntity9.addChildSourceSystemsItem(strMap11);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity14 = connectionEntity9.originCountry("class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        com.ibm.watson.data.client.model.Attachment attachment15 = new com.ibm.watson.data.client.model.Attachment();
        com.ibm.watson.data.client.model.Attachment attachment17 = attachment15.isReferenced((java.lang.Boolean) true);
        boolean boolean18 = connectionEntity9.equals((java.lang.Object) attachment17);
        boolean boolean19 = discoveryLog7.equals((java.lang.Object) connectionEntity9);
        org.junit.Assert.assertTrue("'" + mappableAssetType1 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION + "'", mappableAssetType1.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + severity6 + "' != '" + com.ibm.watson.data.client.model.enums.Severity.INFO + "'", severity6.equals(com.ibm.watson.data.client.model.enums.Severity.INFO));
        org.junit.Assert.assertNotNull(discoveryLog7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str10, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNotNull(connectionEntity12);
        org.junit.Assert.assertNotNull(connectionEntity14);
        org.junit.Assert.assertNotNull(attachment17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField0 = new com.ibm.watson.data.client.model.AssetTypeField();
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField2 = assetTypeField0.key("equals");
        java.lang.String str3 = assetTypeField0.getKey();
        org.junit.Assert.assertNotNull(assetTypeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equals" + "'", str3, "equals");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.ibm.watson.data.client.model.ContentInfo contentInfo0 = new com.ibm.watson.data.client.model.ContentInfo();
        com.ibm.watson.data.client.model.enums.ContentFormatType contentFormatType1 = null;
        contentInfo0.setContentFormat(contentFormatType1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        com.ibm.watson.data.client.model.enums.GlossaryObjectDraftMode glossaryObjectDraftMode1 = glossaryObjectMetadata0.getDraftMode();
        java.util.Date date2 = null;
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata3 = glossaryObjectMetadata0.effectiveEndDate(date2);
        java.util.Date date4 = null;
        glossaryObjectMetadata3.setEffectiveStartDate(date4);
        java.lang.String str6 = glossaryObjectMetadata3.getExternalId();
        org.junit.Assert.assertNull(glossaryObjectDraftMode1);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.ibm.watson.data.client.model.ImportMessage importMessage0 = new com.ibm.watson.data.client.model.ImportMessage();
        com.ibm.watson.data.client.model.ImportMessage importMessage2 = importMessage0.recordNumber((java.lang.Long) 10L);
        java.lang.String str3 = importMessage2.getMessageTemplate();
        java.lang.String str4 = importMessage2.getMessageTemplate();
        importMessage2.setCode("AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}");
        org.junit.Assert.assertNotNull(importMessage2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.enums.DeployedAssetType deployedAssetType1 = deploymentEntity0.getDeployedAssetType();
        com.ibm.watson.data.client.model.HardwareSpecRel hardwareSpecRel2 = null;
        deploymentEntity0.setHardwareSpec(hardwareSpecRel2);
        com.ibm.watson.data.client.model.DeploymentEntityRequestPhysical deploymentEntityRequestPhysical4 = null;
        deploymentEntity0.setBatch(deploymentEntityRequestPhysical4);
        org.junit.Assert.assertNull(deployedAssetType1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo0 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.lang.String str1 = extendedUserInfo0.getAuthenticator();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage1 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.usage(metadataUsage1);
        java.lang.String str3 = attachmentDetail2.getHref();
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        java.lang.Boolean boolean1 = attachmentDetail0.getTransferComplete();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail3 = attachmentDetail0.size((java.lang.Long) (-1L));
        java.lang.Boolean boolean4 = attachmentDetail3.getTransferComplete();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(attachmentDetail3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.ibm.watson.data.client.model.Response response0 = new com.ibm.watson.data.client.model.Response();
        com.ibm.watson.data.client.model.Locale locale1 = response0.getLanguage();
        java.lang.Object obj2 = response0.getEntity();
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.ibm.watson.data.client.model.DataProtectionRuleExportFile dataProtectionRuleExportFile0 = new com.ibm.watson.data.client.model.DataProtectionRuleExportFile();
        dataProtectionRuleExportFile0.setOffset((java.lang.Integer) 1);
        dataProtectionRuleExportFile0.setTenantId("class ResponseClassificationEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    defaultLocaleId: null\n    tags: null\n    parentCategory: null\n    categories: null\n    isATypeOfClassification: null\n    hasTypesClassifications: null\n    terms: null\n    dataClasses: null\n    referenceData: null\n    policies: null\n    rules: null\n}");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.ibm.watson.data.client.model.DatasourceTypePropertyCondition datasourceTypePropertyCondition0 = new com.ibm.watson.data.client.model.DatasourceTypePropertyCondition();
        datasourceTypePropertyCondition0.setPropertyName("");
        java.lang.String str3 = datasourceTypePropertyCondition0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class DatasourceTypePropertyCondition {\n    propertyName: \n    conditions: null\n    allConditionsRequired: null\n}" + "'", str3, "class DatasourceTypePropertyCondition {\n    propertyName: \n    conditions: null\n    allConditionsRequired: null\n}");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.ibm.watson.data.client.model.ModelResource modelResource0 = new com.ibm.watson.data.client.model.ModelResource();
        com.ibm.watson.data.client.model.ResourceMeta resourceMeta1 = null;
        modelResource0.setMetadata(resourceMeta1);
        com.ibm.watson.data.client.model.SystemDetails systemDetails3 = new com.ibm.watson.data.client.model.SystemDetails();
        com.ibm.watson.data.client.model.ModelResource modelResource4 = modelResource0.system(systemDetails3);
        java.lang.String str5 = modelResource0.toString();
        org.junit.Assert.assertNotNull(modelResource4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class ModelResource {\n    metadata: null\n    entity: null\n    system: class SystemDetails {\n        warnings: null\n    }\n}" + "'", str5, "class ModelResource {\n    metadata: null\n    entity: null\n    system: class SystemDetails {\n        warnings: null\n    }\n}");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse0 = new com.ibm.watson.data.client.model.PaginatedAssetFileListResponse();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = paginatedAssetFileListResponse0.getFirst();
        com.ibm.watson.data.client.model.ProjectStorage projectStorage2 = new com.ibm.watson.data.client.model.ProjectStorage();
        boolean boolean3 = paginatedAssetFileListResponse0.equals((java.lang.Object) projectStorage2);
        com.ibm.watson.data.client.model.HrefModel hrefModel4 = null;
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse5 = paginatedAssetFileListResponse0.first(hrefModel4);
        org.junit.Assert.assertNull(hrefModel1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        java.lang.Long long6 = rDVImportInfo0.getValuesCount();
        java.lang.String str7 = rDVImportInfo0.getImportState();
        rDVImportInfo0.setValuesProcessed((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse0 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse0.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse4 = omrsProcessingStatusResponse0.numPendingDataAssets((java.lang.Long) 0L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse7 = omrsProcessingStatusResponse0.putNumNewRelationshipsReceivedItem("file", (java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse9 = omrsProcessingStatusResponse0.numSyncedConnectionsCreated((java.lang.Long) 100L);
        java.lang.Long long10 = omrsProcessingStatusResponse0.getUnrecognizedConnections();
        omrsProcessingStatusResponse0.setNumSyncedDataAssetsCreated((java.lang.Long) (-1L));
        java.util.Map<java.lang.String, java.lang.Long> strMap13 = null;
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse14 = omrsProcessingStatusResponse0.newEntitiesReceivedByType(strMap13);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse4);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse7);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse14);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.ibm.watson.data.client.model.enums.StatusFamily statusFamily0 = com.ibm.watson.data.client.model.enums.StatusFamily.SUCCESSFUL;
        java.lang.String str1 = statusFamily0.getValue();
        org.junit.Assert.assertTrue("'" + statusFamily0 + "' != '" + com.ibm.watson.data.client.model.enums.StatusFamily.SUCCESSFUL + "'", statusFamily0.equals(com.ibm.watson.data.client.model.enums.StatusFamily.SUCCESSFUL));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SUCCESSFUL" + "'", str1, "SUCCESSFUL");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.ibm.watson.data.client.model.GetMeResponse getMeResponse0 = new com.ibm.watson.data.client.model.GetMeResponse();
        com.ibm.watson.data.client.model.GetMeResponseAllOf1UserInfo getMeResponseAllOf1UserInfo1 = null;
        getMeResponse0.setUserInfo(getMeResponseAllOf1UserInfo1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.ibm.watson.data.client.model.ScoreStats scoreStats0 = new com.ibm.watson.data.client.model.ScoreStats();
        scoreStats0.setMax((java.lang.Double) (-1.0d));
        scoreStats0.setMin((java.lang.Double) 0.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse0 = new com.ibm.watson.data.client.model.ReprocessMessagesResponse();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse2 = reprocessMessagesResponse0.entityGuidsSubmitted(strMap1);
        com.ibm.watson.data.client.model.ReprocessMessagesOptions reprocessMessagesOptions3 = null;
        com.ibm.watson.data.client.model.ReprocessMessagesResponse reprocessMessagesResponse4 = reprocessMessagesResponse2.options(reprocessMessagesOptions3);
        org.junit.Assert.assertNotNull(reprocessMessagesResponse2);
        org.junit.Assert.assertNotNull(reprocessMessagesResponse4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.ibm.watson.data.client.model.CreateRelationshipResponse createRelationshipResponse0 = new com.ibm.watson.data.client.model.CreateRelationshipResponse();
        com.ibm.watson.data.client.model.Attachment attachment1 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str2 = attachment1.toString();
        boolean boolean3 = createRelationshipResponse0.equals((java.lang.Object) attachment1);
        com.ibm.watson.data.client.model.AttachmentHeader attachmentHeader5 = attachment1.mime("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.Attachment attachment7 = attachment1.createTime((java.lang.Long) 10L);
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage8 = null;
        com.ibm.watson.data.client.model.Attachment attachment9 = attachment1.usage(metadataUsage8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str2, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attachmentHeader5);
        org.junit.Assert.assertNotNull(attachment7);
        org.junit.Assert.assertNotNull(attachment9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.ibm.watson.data.client.model.enums.ConditionValues conditionValues0 = com.ibm.watson.data.client.model.enums.ConditionValues.CATEGORY;
        org.junit.Assert.assertTrue("'" + conditionValues0 + "' != '" + com.ibm.watson.data.client.model.enums.ConditionValues.CATEGORY + "'", conditionValues0.equals(com.ibm.watson.data.client.model.enums.ConditionValues.CATEGORY));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.ibm.watson.data.client.model.CommentByUser commentByUser0 = new com.ibm.watson.data.client.model.CommentByUser();
        commentByUser0.setAllowEdits((java.lang.Boolean) false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.FormPropertyType formPropertyType1 = com.ibm.watson.data.client.model.enums.FormPropertyType.fromValue("spark");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'spark'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse0 = new com.ibm.watson.data.client.model.PaginatedAssetFileListResponse();
        com.ibm.watson.data.client.model.HrefModel hrefModel1 = null;
        paginatedAssetFileListResponse0.setFirst(hrefModel1);
        com.ibm.watson.data.client.model.HrefModel hrefModel3 = null;
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse4 = paginatedAssetFileListResponse0.first(hrefModel3);
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse6 = paginatedAssetFileListResponse0.offset((java.lang.Integer) 1);
        com.ibm.watson.data.client.model.PaginatedAssetFileListResponse paginatedAssetFileListResponse8 = paginatedAssetFileListResponse0.totalCount((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse4);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse6);
        org.junit.Assert.assertNotNull(paginatedAssetFileListResponse8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField0 = new com.ibm.watson.data.client.model.AssetTypeField();
        java.lang.Boolean boolean1 = assetTypeField0.getFacet();
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField3 = assetTypeField0.type("class ModelResource {\n    metadata: null\n    entity: null\n    system: class SystemDetails {\n        warnings: null\n    }\n}");
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(assetTypeField3);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata0 = new com.ibm.watson.data.client.model.WorkflowMetadata();
        java.lang.String str1 = workflowMetadata0.getCreatedBy();
        java.util.Date date2 = null;
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata3 = workflowMetadata0.createdAt(date2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(workflowMetadata3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig0 = new com.ibm.watson.data.client.model.DiscoveryServerConfig();
        java.util.List<java.lang.String> strList1 = discoveryServerConfig0.getDiscoveryEngineGUIDs();
        java.lang.String str2 = discoveryServerConfig0.toString();
        java.util.List<java.lang.String> strList3 = discoveryServerConfig0.getDiscoveryEngineGUIDs();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity4 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest6 = deploymentEntity4.description("");
        java.lang.String[] strArray15 = new java.lang.String[] { "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class ReferenceDataValuesList {\n    values: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "geospatial" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        deploymentEntity4.setTags((java.util.List<java.lang.String>) strList16);
        com.ibm.watson.data.client.model.DiscoveryServerConfig discoveryServerConfig19 = discoveryServerConfig0.discoveryEngineGUIDs((java.util.List<java.lang.String>) strList16);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}" + "'", str2, "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(deploymentEntityRequest6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(discoveryServerConfig19);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.ibm.watson.data.client.model.enums.WorkflowState workflowState0 = com.ibm.watson.data.client.model.enums.WorkflowState.CANCELLED;
        org.junit.Assert.assertTrue("'" + workflowState0 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowState.CANCELLED + "'", workflowState0.equals(com.ibm.watson.data.client.model.enums.WorkflowState.CANCELLED));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.ibm.watson.data.client.model.Spaces spaces0 = new com.ibm.watson.data.client.model.Spaces();
        spaces0.setCount((java.lang.Long) (-1L));
        java.lang.String str3 = spaces0.toString();
        com.ibm.watson.data.client.model.NewCustomAttributeDefinitionEntity newCustomAttributeDefinitionEntity4 = new com.ibm.watson.data.client.model.NewCustomAttributeDefinitionEntity();
        java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElementEntity> customAttributeDefElementEntityList5 = newCustomAttributeDefinitionEntity4.getElements();
        boolean boolean6 = spaces0.equals((java.lang.Object) customAttributeDefElementEntityList5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class Spaces {\n    limit: null\n    count: -1\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}" + "'", str3, "class Spaces {\n    limit: null\n    count: -1\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}");
        org.junit.Assert.assertNull(customAttributeDefElementEntityList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.ibm.watson.data.client.model.OpenLineageConfig openLineageConfig0 = new com.ibm.watson.data.client.model.OpenLineageConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = openLineageConfig0.getBufferGraphConfig();
        com.ibm.watson.data.client.model.Connection connection2 = null;
        openLineageConfig0.setOpenLineageBufferGraphConnection(connection2);
        java.lang.String str4 = openLineageConfig0.toString();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class OpenLineageConfig {\n    openLineageId: null\n    openLineageName: null\n    openLineageDescription: null\n    lineageServerURL: null\n    inTopicName: null\n    inTopicConnection: null\n    openLineageProvider: null\n    openLineageBufferGraphConnection: null\n    openLineageMainGraphConnection: null\n    bufferGraphConfig: null\n    mainGraphConfig: null\n}" + "'", str4, "class OpenLineageConfig {\n    openLineageId: null\n    openLineageName: null\n    openLineageDescription: null\n    lineageServerURL: null\n    inTopicName: null\n    inTopicConnection: null\n    openLineageProvider: null\n    openLineageBufferGraphConnection: null\n    openLineageMainGraphConnection: null\n    bufferGraphConfig: null\n    mainGraphConfig: null\n}");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.ibm.watson.data.client.model.DataProtectionRuleExportFile dataProtectionRuleExportFile0 = new com.ibm.watson.data.client.model.DataProtectionRuleExportFile();
        dataProtectionRuleExportFile0.setOffset((java.lang.Integer) 1);
        dataProtectionRuleExportFile0.setTenantId("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity4 = updatableTermEntity0.revision("read");
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList5 = updatableTermEntity0.getDataClasses();
        java.lang.String str6 = updatableTermEntity0.getName();
        com.ibm.watson.data.client.model.RelationshipObject relationshipObject7 = new com.ibm.watson.data.client.model.RelationshipObject();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse8 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse8.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse12 = omrsProcessingStatusResponse8.numPendingDataAssets((java.lang.Long) 0L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse15 = omrsProcessingStatusResponse8.putNumNewRelationshipsReceivedItem("file", (java.lang.Long) 1L);
        boolean boolean16 = relationshipObject7.equals((java.lang.Object) omrsProcessingStatusResponse15);
        com.ibm.watson.data.client.model.RelationshipObject relationshipObject17 = new com.ibm.watson.data.client.model.RelationshipObject();
        java.lang.Object obj18 = relationshipObject17.getEntity();
        com.ibm.watson.data.client.model.RelationshipObject relationshipObject19 = new com.ibm.watson.data.client.model.RelationshipObject();
        com.ibm.watson.data.client.model.RelationshipObject[] relationshipObjectArray20 = new com.ibm.watson.data.client.model.RelationshipObject[] { relationshipObject7, relationshipObject17, relationshipObject19 };
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipObject> relationshipObjectList21 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipObject>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipObject>) relationshipObjectList21, relationshipObjectArray20);
        updatableTermEntity0.setRelatedTermRelationships((java.util.List<com.ibm.watson.data.client.model.RelationshipObject>) relationshipObjectList21);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(updatableTermEntity4);
        org.junit.Assert.assertNull(newRelationshipList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse12);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(relationshipObjectArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.ibm.watson.data.client.model.NewTermEntity newTermEntity0 = new com.ibm.watson.data.client.model.NewTermEntity();
        newTermEntity0.setWorkflowState("");
        java.lang.String str3 = newTermEntity0.getWorkflowState();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.ibm.watson.data.client.model.AssetRatingMetadata assetRatingMetadata0 = new com.ibm.watson.data.client.model.AssetRatingMetadata();
        assetRatingMetadata0.setCreatorId("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        java.util.Date date3 = assetRatingMetadata0.getUpdatedAt();
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata0.setName("8");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata4 = glossaryObjectMetadata0.artifactType("");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata6 = glossaryObjectMetadata0.sourceRepositoryId("number");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata8 = glossaryObjectMetadata0.modifiedBy("class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}");
        glossaryObjectMetadata0.setModifiedBy("class CustomAttribute {\n    customAttributeDefinitionId: null\n    name: null\n    values: null\n}");
        org.junit.Assert.assertNotNull(glossaryObjectMetadata4);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata6);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.ibm.watson.data.client.model.enums.StorageType storageType0 = com.ibm.watson.data.client.model.enums.StorageType.BMCOS_OBJECT_STORAGE;
        java.lang.String str1 = storageType0.getValue();
        org.junit.Assert.assertTrue("'" + storageType0 + "' != '" + com.ibm.watson.data.client.model.enums.StorageType.BMCOS_OBJECT_STORAGE + "'", storageType0.equals(com.ibm.watson.data.client.model.enums.StorageType.BMCOS_OBJECT_STORAGE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bmcos_object_storage" + "'", str1, "bmcos_object_storage");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.lang.String str2 = connectionEntity0.getDescription();
        connectionEntity0.setOriginCountry("database");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity5 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement customAttributeDefElement6 = null;
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity7 = customAttributeDefinitionEntity5.addElementsListItem(customAttributeDefElement6);
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity8 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement[] customAttributeDefElementArray9 = new com.ibm.watson.data.client.model.CustomAttributeDefElement[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement> customAttributeDefElementList10 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList10, customAttributeDefElementArray9);
        customAttributeDefinitionEntity8.setElementsList((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList10);
        customAttributeDefinitionEntity5.setElementsList((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList10);
        java.lang.String[] strArray67 = new java.lang.String[] { "class ScoreStats {\n    n: null\n    mean: null\n    variance: null\n    stddev: null\n    min: null\n    max: null\n    sum: null\n}", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "partition", "class Spaces {\n    limit: null\n    count: -1\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}", "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}", "class SpaceScope {\n    bssAccountId: file\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: [class Attachment {\n        assetType: null\n        name: null\n        description: null\n        mime: null\n        testDoc: null\n        connectionId: null\n        connectionPath: null\n        objectKey: null\n        userData: null\n        isPartitioned: null\n        assetCategory: null\n        id: null\n        version: null\n        attachmentId: null\n        datasourceType: null\n        attachmentType: null\n        href: null\n        createdAt: null\n        message: hi!\n        creatorId: null\n        createTime: null\n        size: null\n        isRemote: null\n        isManaged: null\n        isReferenced: null\n        isObjectKeyReadOnly: null\n        isUserProvidedPathKey: null\n        transferComplete: null\n        completeTimeTicks: null\n        handle: null\n        usage: null\n    }]\n}", "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: null\n}", "class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}", "equals", "hi!", "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}", "class CreateRelationshipResponseResource {\n    href: null\n    artifactId: null\n    versionId: null\n    workflowId: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    globalId: null\n    entityType: null\n    terms: []\n    classifications: null\n    categories: null\n    parentCategory: null\n    child: null\n    parent: []\n}", "class ClassificationOptions {\n    disabled: null\n    useAllIbmClasses: null\n    useAllCustomClasses: null\n    ibmClassCodes: null\n    customClassCodes: null\n}", "analytics_engine", "RelationalDBSchemaType", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}", "class SyncScoringDataResults {\n    predictions: [class ScoringPayload {\n        id: null\n        fields: null\n        values: null\n        type: null\n        targets: null\n    }]\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}", "SELECTED_TYPES", "", "class DataProfileAttachment {\n    summary: null\n    columns: null\n}", "class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}", "SELECTED_TYPES", "class SpaceScope {\n    bssAccountId: file\n}", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}", "SYSTEM", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}", "internal_use_only", "DOES_NOT_EXIST", "class PolicyRuleTermListResponseResource {\n    entity: null\n    metadata: null\n}", "class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}", "class FindAssetsResponse {\n    totalRows: null\n    results: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "partition", "hi!", "class MetadataRov {\n    mode: null\n    collaboratorIds: null\n}", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class CreateRelationshipResponseResource {\n    href: null\n    artifactId: null\n    versionId: null\n    workflowId: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    globalId: null\n    entityType: null\n    terms: []\n    classifications: null\n    categories: null\n    parentCategory: null\n    child: null\n    parent: []\n}", "class FunctionEntitySchemas {\n    input: null\n    output: []\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader70 = customAttributeDefinitionEntity5.relatedArtifactTypes((java.util.List<java.lang.String>) strList68);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity71 = connectionEntity0.tags((java.util.List<java.lang.String>) strList68);
        java.lang.String str72 = connectionEntity71.getOwnerId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntity7);
        org.junit.Assert.assertNotNull(customAttributeDefElementArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntityHeader70);
        org.junit.Assert.assertNotNull(connectionEntity71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.ibm.watson.data.client.model.ContentInfo contentInfo0 = new com.ibm.watson.data.client.model.ContentInfo();
        com.ibm.watson.data.client.model.ContentInfo contentInfo2 = contentInfo0.pipelineNodeId("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: true\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: false\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(contentInfo2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        glossaryObjectMetadata0.setName("8");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata4 = glossaryObjectMetadata0.artifactType("");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata6 = glossaryObjectMetadata0.sourceRepositoryId("number");
        java.lang.Boolean boolean7 = glossaryObjectMetadata0.getRemoveStartDate();
        org.junit.Assert.assertNotNull(glossaryObjectMetadata4);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity0 = new com.ibm.watson.data.client.model.ConnectionEntity();
        java.lang.String str1 = connectionEntity0.toString();
        java.lang.String str2 = connectionEntity0.getDescription();
        connectionEntity0.setOriginCountry("database");
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity5 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement customAttributeDefElement6 = null;
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity7 = customAttributeDefinitionEntity5.addElementsListItem(customAttributeDefElement6);
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity customAttributeDefinitionEntity8 = new com.ibm.watson.data.client.model.CustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElement[] customAttributeDefElementArray9 = new com.ibm.watson.data.client.model.CustomAttributeDefElement[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement> customAttributeDefElementList10 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElement>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList10, customAttributeDefElementArray9);
        customAttributeDefinitionEntity8.setElementsList((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList10);
        customAttributeDefinitionEntity5.setElementsList((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElement>) customAttributeDefElementList10);
        java.lang.String[] strArray67 = new java.lang.String[] { "class ScoreStats {\n    n: null\n    mean: null\n    variance: null\n    stddev: null\n    min: null\n    max: null\n    sum: null\n}", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "partition", "class Spaces {\n    limit: null\n    count: -1\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: read\n}", "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: null\n}", "class SpaceScope {\n    bssAccountId: file\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class DiscoveryServerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    discoveryEngineGUIDs: [class Attachment {\n        assetType: null\n        name: null\n        description: null\n        mime: null\n        testDoc: null\n        connectionId: null\n        connectionPath: null\n        objectKey: null\n        userData: null\n        isPartitioned: null\n        assetCategory: null\n        id: null\n        version: null\n        attachmentId: null\n        datasourceType: null\n        attachmentType: null\n        href: null\n        createdAt: null\n        message: hi!\n        creatorId: null\n        createTime: null\n        size: null\n        isRemote: null\n        isManaged: null\n        isReferenced: null\n        isObjectKeyReadOnly: null\n        isUserProvidedPathKey: null\n        transferComplete: null\n        completeTimeTicks: null\n        handle: null\n        usage: null\n    }]\n}", "class UpdatableTermEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    abbreviations: null\n    importSourceCreatedBy: null\n    importSourceCreatedOn: null\n    importSourceUsage: null\n    example: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    relatedTermRelationships: null\n    isATypeOfTerms: null\n    hasTypeTerms: null\n    isOfTerms: null\n    hasTerms: null\n    synonymTerms: null\n    relatedTerms: null\n    replacesTerms: null\n    replacedByTerms: null\n    dataClasses: null\n    classifications: null\n    revision: null\n}", "class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}", "equals", "hi!", "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}", "class CreateRelationshipResponseResource {\n    href: null\n    artifactId: null\n    versionId: null\n    workflowId: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    globalId: null\n    entityType: null\n    terms: []\n    classifications: null\n    categories: null\n    parentCategory: null\n    child: null\n    parent: []\n}", "class ClassificationOptions {\n    disabled: null\n    useAllIbmClasses: null\n    useAllCustomClasses: null\n    ibmClassCodes: null\n    customClassCodes: null\n}", "analytics_engine", "RelationalDBSchemaType", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class UpdateType {\n    description: null\n    fields: [class AssetTypeField {\n        key: null\n        type: null\n        facet: null\n        isArray: null\n        searchPath: null\n        isSearchableAcrossTypes: null\n    }]\n    externalAssetPreview: null\n    relationships: null\n    properties: null\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}", "class SyncScoringDataResults {\n    predictions: [class ScoringPayload {\n        id: null\n        fields: null\n        values: null\n        type: null\n        targets: null\n    }]\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}", "SELECTED_TYPES", "", "class DataProfileAttachment {\n    summary: null\n    columns: null\n}", "class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}", "SELECTED_TYPES", "class SpaceScope {\n    bssAccountId: file\n}", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}", "SYSTEM", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class CohortMembership {\n    localRegistration: null\n    remoteRegistrations: null\n}", "internal_use_only", "DOES_NOT_EXIST", "class PolicyRuleTermListResponseResource {\n    entity: null\n    metadata: null\n}", "class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}", "class FindAssetsResponse {\n    totalRows: null\n    results: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "partition", "hi!", "class MetadataRov {\n    mode: null\n    collaboratorIds: null\n}", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "read", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class CreateRelationshipResponseResource {\n    href: null\n    artifactId: null\n    versionId: null\n    workflowId: class CatalogSearch {\n        query: null\n        limit: null\n        counts: null\n        drilldown: null\n        sort: null\n        include: null\n    }\n    globalId: null\n    entityType: null\n    terms: []\n    classifications: null\n    categories: null\n    parentCategory: null\n    child: null\n    parent: []\n}", "class FunctionEntitySchemas {\n    input: null\n    output: []\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        com.ibm.watson.data.client.model.CustomAttributeDefinitionEntityHeader customAttributeDefinitionEntityHeader70 = customAttributeDefinitionEntity5.relatedArtifactTypes((java.util.List<java.lang.String>) strList68);
        com.ibm.watson.data.client.model.ConnectionEntity connectionEntity71 = connectionEntity0.tags((java.util.List<java.lang.String>) strList68);
        java.lang.String str72 = connectionEntity71.getGatewayId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}" + "'", str1, "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntity7);
        org.junit.Assert.assertNotNull(customAttributeDefElementArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(customAttributeDefinitionEntityHeader70);
        org.junit.Assert.assertNotNull(connectionEntity71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity0 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.CustomAttribute customAttribute1 = new com.ibm.watson.data.client.model.CustomAttribute();
        java.lang.String str2 = customAttribute1.toString();
        com.ibm.watson.data.client.model.CustomAttributeValueObject customAttributeValueObject3 = new com.ibm.watson.data.client.model.CustomAttributeValueObject();
        com.ibm.watson.data.client.model.CustomAttribute customAttribute4 = customAttribute1.addValuesItem(customAttributeValueObject3);
        com.ibm.watson.data.client.model.GlossaryObjectEntity glossaryObjectEntity5 = responsePolicyEntity0.addCustomAttributesItem(customAttribute1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class CustomAttribute {\n    customAttributeDefinitionId: null\n    name: null\n    values: null\n}" + "'", str2, "class CustomAttribute {\n    customAttributeDefinitionId: null\n    name: null\n    values: null\n}");
        org.junit.Assert.assertNotNull(customAttribute4);
        org.junit.Assert.assertNotNull(glossaryObjectEntity5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.ibm.watson.data.client.model.ConnectionMetadataUsage connectionMetadataUsage0 = new com.ibm.watson.data.client.model.ConnectionMetadataUsage();
        com.ibm.watson.data.client.model.ConnectionMetadataUsage connectionMetadataUsage2 = connectionMetadataUsage0.lastAccessorId("");
        java.util.Date date3 = connectionMetadataUsage0.getLastAccessTime();
        java.util.Date date4 = connectionMetadataUsage0.getLastAccessTime();
        org.junit.Assert.assertNotNull(connectionMetadataUsage2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField0 = new com.ibm.watson.data.client.model.AssetTypeField();
        com.ibm.watson.data.client.model.AssetTypeField assetTypeField2 = assetTypeField0.key("equals");
        java.lang.Boolean boolean3 = assetTypeField0.getFacet();
        assetTypeField0.setIsSearchableAcrossTypes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(assetTypeField2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata0 = new com.ibm.watson.data.client.model.WorkflowMetadata();
        java.lang.String str1 = workflowMetadata0.getCreatedBy();
        com.ibm.watson.data.client.model.enums.WorkflowState workflowState2 = com.ibm.watson.data.client.model.enums.WorkflowState.CREATED;
        workflowMetadata0.setState(workflowState2);
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata4 = new com.ibm.watson.data.client.model.ArtifactMetadata();
        com.ibm.watson.data.client.model.ArtifactMetadata artifactMetadata6 = artifactMetadata4.versionId("hi!");
        boolean boolean7 = workflowMetadata0.equals((java.lang.Object) artifactMetadata4);
        java.util.Date date8 = null;
        com.ibm.watson.data.client.model.WorkflowMetadata workflowMetadata9 = workflowMetadata0.createdAt(date8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + workflowState2 + "' != '" + com.ibm.watson.data.client.model.enums.WorkflowState.CREATED + "'", workflowState2.equals(com.ibm.watson.data.client.model.enums.WorkflowState.CREATED));
        org.junit.Assert.assertNotNull(artifactMetadata6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(workflowMetadata9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog0 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.enums.MappableAssetType mappableAssetType1 = com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION;
        boolean boolean2 = discoveryLog0.equals((java.lang.Object) mappableAssetType1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        discoveryLog0.setDetails(strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = discoveryLog0.getDetails();
        com.ibm.watson.data.client.model.enums.Severity severity6 = com.ibm.watson.data.client.model.enums.Severity.INFO;
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog7 = discoveryLog0.severity(severity6);
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog9 = discoveryLog7.message("class DatasourceTypePropertyCondition {\n    propertyName: \n    conditions: null\n    allConditionsRequired: null\n}");
        com.ibm.watson.data.client.model.TypesResponse typesResponse11 = new com.ibm.watson.data.client.model.TypesResponse();
        java.util.List<com.ibm.watson.data.client.model.Type> typeList12 = typesResponse11.getResources();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog13 = discoveryLog7.putDetailsItem("PENDING", (java.lang.Object) typesResponse11);
        org.junit.Assert.assertTrue("'" + mappableAssetType1 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION + "'", mappableAssetType1.equals(com.ibm.watson.data.client.model.enums.MappableAssetType.CONNECTION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + severity6 + "' != '" + com.ibm.watson.data.client.model.enums.Severity.INFO + "'", severity6.equals(com.ibm.watson.data.client.model.enums.Severity.INFO));
        org.junit.Assert.assertNotNull(discoveryLog7);
        org.junit.Assert.assertNotNull(discoveryLog9);
        org.junit.Assert.assertNotNull(typeList12);
        org.junit.Assert.assertNotNull(discoveryLog13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            com.ibm.watson.data.client.model.enums.ContentFormatType contentFormatType1 = com.ibm.watson.data.client.model.enums.ContentFormatType.fromValue("class SystemDetails {\n    warnings: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class SystemDetails {?    warnings: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch0 = new com.ibm.watson.data.client.model.CatalogSearch();
        java.lang.Integer int1 = catalogSearch0.getLimit();
        com.ibm.watson.data.client.model.CatalogSearch catalogSearch3 = catalogSearch0.sort("class EnumValue {\n    id: null\n    name: null\n}");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(catalogSearch3);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.ibm.watson.data.client.model.ResponseClassificationEntity responseClassificationEntity0 = new com.ibm.watson.data.client.model.ResponseClassificationEntity();
        java.lang.String str1 = responseClassificationEntity0.toString();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList2 = new com.ibm.watson.data.client.model.PaginatedRelationshipsList();
        com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] relationshipRelationshipEntityArray3 = new com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity> relationshipRelationshipEntityList4 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList4, relationshipRelationshipEntityArray3);
        paginatedRelationshipsList2.setResources((java.util.List<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList4);
        com.ibm.watson.data.client.model.ResponseClassificationEntity responseClassificationEntity7 = responseClassificationEntity0.policies(paginatedRelationshipsList2);
        com.ibm.watson.data.client.model.PaginatedList paginatedList9 = paginatedRelationshipsList2.offset((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ResponseClassificationEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    defaultLocaleId: null\n    tags: null\n    parentCategory: null\n    categories: null\n    isATypeOfClassification: null\n    hasTypesClassifications: null\n    terms: null\n    dataClasses: null\n    referenceData: null\n    policies: null\n    rules: null\n}" + "'", str1, "class ResponseClassificationEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    defaultLocaleId: null\n    tags: null\n    parentCategory: null\n    categories: null\n    isATypeOfClassification: null\n    hasTypesClassifications: null\n    terms: null\n    dataClasses: null\n    referenceData: null\n    policies: null\n    rules: null\n}");
        org.junit.Assert.assertNotNull(relationshipRelationshipEntityArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(responseClassificationEntity7);
        org.junit.Assert.assertNotNull(paginatedList9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo0 = new com.ibm.watson.data.client.model.RDVImportInfo();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo5 = rDVImportInfo0.skippedRowIndex((java.util.List<java.lang.Long>) longList3);
        com.ibm.watson.data.client.model.RDVImportInfo rDVImportInfo7 = rDVImportInfo0.href("class ReferenceDataValuesList {\n    values: null\n}");
        java.lang.Long long8 = rDVImportInfo0.getValuesProcessed();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rDVImportInfo5);
        org.junit.Assert.assertNotNull(rDVImportInfo7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.ibm.watson.data.client.model.AccessServiceConfig accessServiceConfig0 = new com.ibm.watson.data.client.model.AccessServiceConfig();
        java.lang.Integer int1 = accessServiceConfig0.getAccessServiceId();
        com.ibm.watson.data.client.model.Connection connection2 = null;
        com.ibm.watson.data.client.model.AccessServiceConfig accessServiceConfig3 = accessServiceConfig0.accessServiceOutTopic(connection2);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(accessServiceConfig3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.ibm.watson.data.client.model.NewCustomAttributeDefinitionEntity newCustomAttributeDefinitionEntity0 = new com.ibm.watson.data.client.model.NewCustomAttributeDefinitionEntity();
        com.ibm.watson.data.client.model.CustomAttributeDefElementEntity[] customAttributeDefElementEntityArray1 = new com.ibm.watson.data.client.model.CustomAttributeDefElementEntity[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElementEntity> customAttributeDefElementEntityList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.CustomAttributeDefElementEntity>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.CustomAttributeDefElementEntity>) customAttributeDefElementEntityList2, customAttributeDefElementEntityArray1);
        newCustomAttributeDefinitionEntity0.setElements((java.util.List<com.ibm.watson.data.client.model.CustomAttributeDefElementEntity>) customAttributeDefElementEntityList2);
        org.junit.Assert.assertNotNull(customAttributeDefElementEntityArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig0 = new com.ibm.watson.data.client.model.SecuritySyncConfig();
        com.ibm.watson.data.client.model.SecuritySyncConfig securitySyncConfig2 = securitySyncConfig0.securitySyncServerType("DOES_NOT_EXIST");
        securitySyncConfig0.setSecurityServerURL("equals");
        securitySyncConfig0.setPollingInterval((java.lang.Long) 10L);
        securitySyncConfig0.setSecuritySyncOutTopicName("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        org.junit.Assert.assertNotNull(securitySyncConfig2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata0 = new com.ibm.watson.data.client.model.GlossaryObjectMetadata();
        com.ibm.watson.data.client.model.enums.GlossaryObjectDraftMode glossaryObjectDraftMode1 = glossaryObjectMetadata0.getDraftMode();
        glossaryObjectMetadata0.setSourceRepositoryId("class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}");
        com.ibm.watson.data.client.model.GlossaryObjectMetadata glossaryObjectMetadata5 = glossaryObjectMetadata0.modifiedBy("class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}");
        java.lang.String str6 = glossaryObjectMetadata5.getArtifactId();
        org.junit.Assert.assertNull(glossaryObjectDraftMode1);
        org.junit.Assert.assertNotNull(glossaryObjectMetadata5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.ibm.watson.data.client.model.ConnectionCollection connectionCollection0 = new com.ibm.watson.data.client.model.ConnectionCollection();
        java.lang.String str1 = connectionCollection0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ConnectionCollection {\n    resources: null\n    first: null\n    prev: null\n    next: null\n    last: null\n    offset: null\n    totalCount: null\n}" + "'", str1, "class ConnectionCollection {\n    resources: null\n    first: null\n    prev: null\n    next: null\n    last: null\n    offset: null\n    totalCount: null\n}");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody0 = new com.ibm.watson.data.client.model.UpdateProjectBody();
        com.ibm.watson.data.client.model.ExtendedUserInfo extendedUserInfo1 = new com.ibm.watson.data.client.model.ExtendedUserInfo();
        java.util.Date date2 = null;
        extendedUserInfo1.setFirstFailedAttemptTimestamp(date2);
        com.ibm.watson.data.client.model.UserInfo userInfo5 = extendedUserInfo1.username("hi!");
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody6 = new com.ibm.watson.data.client.model.CreateRoleParamsBody();
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody8 = createRoleParamsBody6.addPermissionsItem("");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity9 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity11 = updatableTermEntity9.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.NewRelationship newRelationship12 = null;
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity13 = writeableTermEntity11.addIsOfTermsItem(newRelationship12);
        java.lang.String[] strArray27 = new java.lang.String[] { "AttachmentDetail{class AttachmentDetail {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    attachmentId: null\n    createdAt: null\n    objectKeyIsReadOnly: null\n    datasourceType: null\n    url: null\n    transferComplete: null\n    size: null\n    creatorId: null\n    usage: null\n    href: null\n}", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}", "geospatial", "class Member {\n    userId: null\n    userIamId: null\n    accessGroupId: null\n    role: null\n    href: null\n    createTime: null\n}", "hi!", "read", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "file", "class ConnectionEntity {\n    datasourceType: null\n    description: null\n    name: null\n    gatewayId: null\n    flags: null\n    originCountry: null\n    ownerId: null\n    rov: null\n    properties: {}\n    interactionProperties: null\n    sourceSystem: null\n    assetCategory: null\n    childSourceSystems: null\n    tags: null\n}", "database", "DOES_NOT_EXIST", "geospatial", "class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity30 = writeableTermEntity11.abbreviations((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.CreateRoleParamsBody createRoleParamsBody31 = createRoleParamsBody8.permissions((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.UserInfo userInfo32 = userInfo5.userRoles((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.ProjectHeader projectHeader33 = updateProjectBody0.tags((java.util.List<java.lang.String>) strList28);
        com.ibm.watson.data.client.model.ProjectCompute[] projectComputeArray34 = new com.ibm.watson.data.client.model.ProjectCompute[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.ProjectCompute> projectComputeList35 = new java.util.ArrayList<com.ibm.watson.data.client.model.ProjectCompute>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.ProjectCompute>) projectComputeList35, projectComputeArray34);
        com.ibm.watson.data.client.model.UpdateProjectBody updateProjectBody37 = updateProjectBody0.compute((java.util.List<com.ibm.watson.data.client.model.ProjectCompute>) projectComputeList35);
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity38 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity40 = updatableTermEntity38.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity42 = updatableTermEntity38.revision("read");
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList43 = updatableTermEntity38.getDataClasses();
        java.lang.String str44 = updatableTermEntity38.getName();
        java.lang.String[] strArray87 = new java.lang.String[] { "SELF_AND_PARENTS", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "DOES_NOT_EXIST", "internal_use_only", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "SELF_AND_PARENTS", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "8", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "class PolicyRuleTermListResponseResource {\n    entity: null\n    metadata: null\n}", "class DiscoveredAssetType {\n    type: null\n    dataset: null\n    datasetContainer: null\n}", "class ScoringPayload {\n    id: null\n    fields: null\n    values: null\n    type: null\n    targets: null\n}", "class NewPolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    workflowState: null\n    tags: null\n    parentPolicy: null\n    subPolicies: null\n    parentCategory: null\n    categories: null\n    terms: null\n    dataClasses: null\n    rules: null\n    classifications: null\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "active", "class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}", "database", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class FindAssetsResponse {\n    totalRows: null\n    results: null\n}", "read", "SELECTED_TYPES", "spark", "class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", "number", "hi!", "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "approved", "starting", "database", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "GLOSSARY_TERM", "class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}", "class NewPolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    workflowState: null\n    tags: null\n    parentPolicy: null\n    subPolicies: null\n    parentCategory: null\n    categories: null\n    terms: null\n    dataClasses: null\n    rules: null\n    classifications: null\n}", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        updatableTermEntity38.setStewardIds((java.util.List<java.lang.String>) strList88);
        updateProjectBody37.setTags((java.util.List<java.lang.String>) strList88);
        org.junit.Assert.assertNotNull(userInfo5);
        org.junit.Assert.assertNotNull(createRoleParamsBody8);
        org.junit.Assert.assertNotNull(writeableTermEntity11);
        org.junit.Assert.assertNotNull(writeableTermEntity13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity30);
        org.junit.Assert.assertNotNull(createRoleParamsBody31);
        org.junit.Assert.assertNotNull(userInfo32);
        org.junit.Assert.assertNotNull(projectHeader33);
        org.junit.Assert.assertNotNull(projectComputeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(updateProjectBody37);
        org.junit.Assert.assertNotNull(writeableTermEntity40);
        org.junit.Assert.assertNotNull(updatableTermEntity42);
        org.junit.Assert.assertNull(newRelationshipList43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity0 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DeploymentEntityRequest deploymentEntityRequest2 = deploymentEntity0.description("");
        java.util.List<java.lang.Object> objList3 = deploymentEntityRequest2.getHybridPipelineHardwareSpecs();
        com.ibm.watson.data.client.model.Rel rel4 = null;
        deploymentEntityRequest2.setAsset(rel4);
        org.junit.Assert.assertNotNull(deploymentEntityRequest2);
        org.junit.Assert.assertNull(objList3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.ibm.watson.data.client.model.AssetCreateResponse assetCreateResponse0 = new com.ibm.watson.data.client.model.AssetCreateResponse();
        java.lang.String str1 = assetCreateResponse0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}" + "'", str1, "class MetadataEntityResult {\n    metadata: null\n    attachments: null\n    href: null\n    entity: null\n    assetId: null\n}");
    }
}


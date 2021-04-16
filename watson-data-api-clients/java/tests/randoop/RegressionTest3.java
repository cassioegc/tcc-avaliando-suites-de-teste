import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.ibm.watson.data.client.model.CreateRelationshipResponseResource createRelationshipResponseResource0 = new com.ibm.watson.data.client.model.CreateRelationshipResponseResource();
        com.ibm.watson.data.client.model.GlossaryResource glossaryResource2 = createRelationshipResponseResource0.artifactId("hi!");
        com.ibm.watson.data.client.model.GlossaryResource glossaryResource4 = createRelationshipResponseResource0.globalId("class PaginatedRelationshipsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}");
        org.junit.Assert.assertNotNull(glossaryResource2);
        org.junit.Assert.assertNotNull(glossaryResource4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.ibm.watson.data.client.model.ClassificationOptions classificationOptions0 = new com.ibm.watson.data.client.model.ClassificationOptions();
        java.lang.String str1 = classificationOptions0.toString();
        java.lang.Boolean boolean2 = classificationOptions0.getDisabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ClassificationOptions {\n    disabled: null\n    useAllIbmClasses: null\n    useAllCustomClasses: null\n    ibmClassCodes: null\n    customClassCodes: null\n}" + "'", str1, "class ClassificationOptions {\n    disabled: null\n    useAllIbmClasses: null\n    useAllCustomClasses: null\n    ibmClassCodes: null\n    customClassCodes: null\n}");
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.ibm.watson.data.client.model.Space space0 = new com.ibm.watson.data.client.model.Space();
        com.ibm.watson.data.client.model.SpaceMetadata spaceMetadata1 = null;
        com.ibm.watson.data.client.model.Space space2 = space0.metadata(spaceMetadata1);
        org.junit.Assert.assertNotNull(space2);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity11 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList12 = null;
        responsePolicyEntity11.setTerms(paginatedRelationshipsList12);
        com.ibm.watson.data.client.model.PaginatedParentRelationshipsList paginatedParentRelationshipsList14 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity15 = responsePolicyEntity11.retParentCategoryRelationship(paginatedParentRelationshipsList14);
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity17 = responsePolicyEntity11.addStewardIdsItem("completed");
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList18 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity19 = responsePolicyEntity11.subPolicies(paginatedRelationshipsList18);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList20 = responsePolicyEntity11.getRules();
        boolean boolean21 = paginatedRelationshipsList5.equals((java.lang.Object) paginatedRelationshipsList20);
        org.junit.Assert.assertNotNull(responseRuleEntity2);
        org.junit.Assert.assertNotNull(responseRuleEntity4);
        org.junit.Assert.assertNotNull(relationshipRelationshipEntityArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(responseRuleEntity10);
        org.junit.Assert.assertNotNull(responsePolicyEntity15);
        org.junit.Assert.assertNotNull(responsePolicyEntity17);
        org.junit.Assert.assertNotNull(responsePolicyEntity19);
        org.junit.Assert.assertNull(paginatedRelationshipsList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.ibm.watson.data.client.model.ResourceMeta resourceMeta0 = new com.ibm.watson.data.client.model.ResourceMeta();
        java.lang.String str1 = resourceMeta0.getRev();
        resourceMeta0.setDescription("spark");
        resourceMeta0.setOwner("class JobPostBodyConfiguration {\n    envId: null\n    envVariables: null\n    version: null\n    deploymentJobDefinitionId: null\n}");
        com.ibm.watson.data.client.model.ResourceMeta resourceMeta7 = resourceMeta0.name("class ColumnInfoEntity {\n    fields: null\n}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(resourceMeta7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity0 = new com.ibm.watson.data.client.model.ResponseRuleEntity();
        com.ibm.watson.data.client.model.enums.RuleType ruleType1 = com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE;
        java.lang.String str2 = ruleType1.toString();
        java.lang.String str3 = ruleType1.toString();
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity4 = responseRuleEntity0.ruleType(ruleType1);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList5 = responseRuleEntity0.getGovernsAssets();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList6 = responseRuleEntity0.getTerms();
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity7 = new com.ibm.watson.data.client.model.ResponsePolicyEntity();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList8 = null;
        responsePolicyEntity7.setTerms(paginatedRelationshipsList8);
        com.ibm.watson.data.client.model.PaginatedParentRelationshipsList paginatedParentRelationshipsList10 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity11 = responsePolicyEntity7.retParentCategoryRelationship(paginatedParentRelationshipsList10);
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity13 = responsePolicyEntity7.addStewardIdsItem("completed");
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList14 = null;
        com.ibm.watson.data.client.model.ResponsePolicyEntity responsePolicyEntity15 = responsePolicyEntity7.subPolicies(paginatedRelationshipsList14);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList16 = new com.ibm.watson.data.client.model.PaginatedRelationshipsList();
        com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] relationshipRelationshipEntityArray17 = new com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity> relationshipRelationshipEntityList18 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList18, relationshipRelationshipEntityArray17);
        paginatedRelationshipsList16.setResources((java.util.List<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList18);
        responsePolicyEntity15.setTerms(paginatedRelationshipsList16);
        responseRuleEntity0.setGovernsAssets(paginatedRelationshipsList16);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList23 = responseRuleEntity0.getImplementedBy();
        com.ibm.watson.data.client.model.EnumValue enumValue24 = new com.ibm.watson.data.client.model.EnumValue();
        enumValue24.setName("project");
        java.lang.String str27 = enumValue24.getId();
        boolean boolean28 = responseRuleEntity0.equals((java.lang.Object) str27);
        org.junit.Assert.assertTrue("'" + ruleType1 + "' != '" + com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE + "'", ruleType1.equals(com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Governance" + "'", str2, "Governance");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Governance" + "'", str3, "Governance");
        org.junit.Assert.assertNotNull(responseRuleEntity4);
        org.junit.Assert.assertNull(paginatedRelationshipsList5);
        org.junit.Assert.assertNull(paginatedRelationshipsList6);
        org.junit.Assert.assertNotNull(responsePolicyEntity11);
        org.junit.Assert.assertNotNull(responsePolicyEntity13);
        org.junit.Assert.assertNotNull(responsePolicyEntity15);
        org.junit.Assert.assertNotNull(relationshipRelationshipEntityArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(paginatedRelationshipsList23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity0 = new com.ibm.watson.data.client.model.ResponseRuleEntity();
        com.ibm.watson.data.client.model.enums.RuleType ruleType1 = com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE;
        java.lang.String str2 = ruleType1.toString();
        java.lang.String str3 = ruleType1.toString();
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity4 = responseRuleEntity0.ruleType(ruleType1);
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList5 = responseRuleEntity0.getGovernsAssets();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList6 = responseRuleEntity0.getTerms();
        com.ibm.watson.data.client.model.PaginatedParentRelationshipsList paginatedParentRelationshipsList7 = responseRuleEntity0.getParentCategory();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList8 = responseRuleEntity0.getImplementedBy();
        com.ibm.watson.data.client.model.PaginatedRelationshipsList paginatedRelationshipsList9 = new com.ibm.watson.data.client.model.PaginatedRelationshipsList();
        com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] relationshipRelationshipEntityArray10 = new com.ibm.watson.data.client.model.RelationshipRelationshipEntity[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity> relationshipRelationshipEntityList11 = new java.util.ArrayList<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList11, relationshipRelationshipEntityArray10);
        paginatedRelationshipsList9.setResources((java.util.List<com.ibm.watson.data.client.model.RelationshipRelationshipEntity>) relationshipRelationshipEntityList11);
        com.ibm.watson.data.client.model.ResponseRuleEntity responseRuleEntity14 = responseRuleEntity0.dataClasses(paginatedRelationshipsList9);
        com.ibm.watson.data.client.model.PaginatedParentRelationshipsList paginatedParentRelationshipsList15 = responseRuleEntity14.getParentCategory();
        org.junit.Assert.assertTrue("'" + ruleType1 + "' != '" + com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE + "'", ruleType1.equals(com.ibm.watson.data.client.model.enums.RuleType.GOVERNANCE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Governance" + "'", str2, "Governance");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Governance" + "'", str3, "Governance");
        org.junit.Assert.assertNotNull(responseRuleEntity4);
        org.junit.Assert.assertNull(paginatedRelationshipsList5);
        org.junit.Assert.assertNull(paginatedRelationshipsList6);
        org.junit.Assert.assertNull(paginatedParentRelationshipsList7);
        org.junit.Assert.assertNull(paginatedRelationshipsList8);
        org.junit.Assert.assertNotNull(relationshipRelationshipEntityArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(responseRuleEntity14);
        org.junit.Assert.assertNull(paginatedParentRelationshipsList15);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.ibm.watson.data.client.model.Attachment attachment0 = new com.ibm.watson.data.client.model.Attachment();
        java.lang.String str1 = attachment0.toString();
        com.ibm.watson.data.client.model.Attachment attachment3 = attachment0.message("hi!");
        com.ibm.watson.data.client.model.Attachment attachment5 = attachment0.id("database");
        com.ibm.watson.data.client.model.Attachment attachment7 = attachment5.id("class ProjectStorage {\n    guid: null\n    properties: null\n    type: null\n}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}" + "'", str1, "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        org.junit.Assert.assertNotNull(attachment3);
        org.junit.Assert.assertNotNull(attachment5);
        org.junit.Assert.assertNotNull(attachment7);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.ibm.watson.data.client.model.ClassificationOptions classificationOptions0 = new com.ibm.watson.data.client.model.ClassificationOptions();
        java.lang.Boolean boolean1 = classificationOptions0.getUseAllCustomClasses();
        com.ibm.watson.data.client.model.ValueAnalysis valueAnalysis2 = new com.ibm.watson.data.client.model.ValueAnalysis();
        com.ibm.watson.data.client.model.DiscoveredType discoveredType3 = valueAnalysis2.getInferredType();
        com.ibm.watson.data.client.model.ScoringPayload scoringPayload4 = new com.ibm.watson.data.client.model.ScoringPayload();
        com.ibm.watson.data.client.model.enums.ScoringType scoringType5 = scoringPayload4.getType();
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity6 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog7 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo8 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo10 = failureInfo8.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse11 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse11.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob14 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray16 = new java.lang.Object[] { discoveryLog7, failureInfo10, omrsProcessingStatusResponse11, jobPostBodyJob14, "database" };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        deploymentEntity6.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList17);
        java.util.ArrayList<java.util.List<java.lang.Object>> objListList20 = new java.util.ArrayList<java.util.List<java.lang.Object>>();
        boolean boolean21 = objListList20.add((java.util.List<java.lang.Object>) objList17);
        scoringPayload4.setValues((java.util.List<java.util.List<java.lang.Object>>) objListList20);
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty23 = new com.ibm.watson.data.client.model.AssetTypeProperty();
        com.ibm.watson.data.client.model.enums.MappableAssetState mappableAssetState24 = com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE;
        com.ibm.watson.data.client.model.AssetTypeProperty assetTypeProperty25 = assetTypeProperty23.minimum((java.lang.Object) mappableAssetState24);
        com.ibm.watson.data.client.model.DeploymentEntity deploymentEntity26 = new com.ibm.watson.data.client.model.DeploymentEntity();
        com.ibm.watson.data.client.model.DiscoveryLog discoveryLog27 = new com.ibm.watson.data.client.model.DiscoveryLog();
        com.ibm.watson.data.client.model.FailureInfo failureInfo28 = new com.ibm.watson.data.client.model.FailureInfo();
        com.ibm.watson.data.client.model.FailureInfo failureInfo30 = failureInfo28.camsVersion("geospatial");
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse31 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse31.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.JobPostBodyJob jobPostBodyJob34 = new com.ibm.watson.data.client.model.JobPostBodyJob();
        java.lang.Object[] objArray36 = new java.lang.Object[] { discoveryLog27, failureInfo30, omrsProcessingStatusResponse31, jobPostBodyJob34, "database" };
        java.util.ArrayList<java.lang.Object> objList37 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList37, objArray36);
        deploymentEntity26.setHybridPipelineHardwareSpecs((java.util.List<java.lang.Object>) objList37);
        assetTypeProperty23.setValues((java.util.List<java.lang.Object>) objList37);
        com.ibm.watson.data.client.model.InputDataArray inputDataArray41 = scoringPayload4.addValuesItem((java.util.List<java.lang.Object>) objList37);
        valueAnalysis2.setWordDistribution((java.util.List<java.lang.Object>) objList37);
        classificationOptions0.setCustomClassCodes((java.util.List<java.lang.Object>) objList37);
        java.lang.Boolean boolean44 = classificationOptions0.getUseAllCustomClasses();
        java.lang.Boolean boolean45 = classificationOptions0.getUseAllCustomClasses();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(discoveredType3);
        org.junit.Assert.assertNull(scoringType5);
        org.junit.Assert.assertNotNull(failureInfo10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + mappableAssetState24 + "' != '" + com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE + "'", mappableAssetState24.equals(com.ibm.watson.data.client.model.enums.MappableAssetState.COMPLETE));
        org.junit.Assert.assertNotNull(assetTypeProperty25);
        org.junit.Assert.assertNotNull(failureInfo30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[class DiscoveryLog {\n    severity: null\n    message: null\n    details: null\n}, class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: geospatial\n    threadId: null\n    thread: null\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}, class OmrsProcessingStatusResponse {\n    startTimestamp: null\n    reportTimestamp: null\n    numSyncedDataAssetsCreated: 1\n    numPendingDataAssets: null\n    numSyncedConnectionsCreated: null\n    numPendingConnections: null\n    numNewEntitiesReceived: null\n    newEntitiesReceivedByType: null\n    numNewRelationshipsReceived: null\n    unrecognizedConnections: null\n    allStatsZero: null\n}, class JobPostBodyJob {\n    assetRef: null\n    name: null\n    description: null\n    schedule: null\n    scheduleInfo: null\n    _configuration: null\n}, database]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(inputDataArray41);
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertNull(boolean45);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.ibm.watson.data.client.model.PolicyRuleListResponse policyRuleListResponse0 = new com.ibm.watson.data.client.model.PolicyRuleListResponse();
        com.ibm.watson.data.client.model.PolicyRuleResponse[] policyRuleResponseArray1 = new com.ibm.watson.data.client.model.PolicyRuleResponse[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.PolicyRuleResponse> policyRuleResponseList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.PolicyRuleResponse>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.PolicyRuleResponse>) policyRuleResponseList2, policyRuleResponseArray1);
        policyRuleListResponse0.setResources((java.util.List<com.ibm.watson.data.client.model.PolicyRuleResponse>) policyRuleResponseList2);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse5 = new com.ibm.watson.data.client.model.OmrsProcessingStatusResponse();
        omrsProcessingStatusResponse5.setNumSyncedDataAssetsCreated((java.lang.Long) 1L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse9 = omrsProcessingStatusResponse5.numPendingDataAssets((java.lang.Long) 0L);
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse12 = omrsProcessingStatusResponse5.putNumNewRelationshipsReceivedItem("file", (java.lang.Long) 1L);
        java.lang.Long long13 = omrsProcessingStatusResponse5.getStartTimestamp();
        com.ibm.watson.data.client.model.OmrsProcessingStatusResponse omrsProcessingStatusResponse15 = omrsProcessingStatusResponse5.numNewEntitiesReceived((java.lang.Long) 100L);
        boolean boolean16 = policyRuleListResponse0.equals((java.lang.Object) 100L);
        java.lang.String str17 = policyRuleListResponse0.toString();
        org.junit.Assert.assertNotNull(policyRuleResponseArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse9);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNotNull(omrsProcessingStatusResponse15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class PolicyRuleListResponse {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    previous: null\n    resources: []\n}" + "'", str17, "class PolicyRuleListResponse {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    previous: null\n    resources: []\n}");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.ibm.watson.data.client.model.LocalRepositoryConfig localRepositoryConfig0 = new com.ibm.watson.data.client.model.LocalRepositoryConfig();
        com.ibm.watson.data.client.model.TypeDefSummary[] typeDefSummaryArray1 = new com.ibm.watson.data.client.model.TypeDefSummary[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.TypeDefSummary> typeDefSummaryList2 = new java.util.ArrayList<com.ibm.watson.data.client.model.TypeDefSummary>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.TypeDefSummary>) typeDefSummaryList2, typeDefSummaryArray1);
        com.ibm.watson.data.client.model.LocalRepositoryConfig localRepositoryConfig4 = localRepositoryConfig0.selectedTypesToSend((java.util.List<com.ibm.watson.data.client.model.TypeDefSummary>) typeDefSummaryList2);
        com.ibm.watson.data.client.model.Connection connection5 = localRepositoryConfig0.getEventMapperConnection();
        org.junit.Assert.assertNotNull(typeDefSummaryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localRepositoryConfig4);
        org.junit.Assert.assertNull(connection5);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.ibm.watson.data.client.model.CommentMetadata commentMetadata0 = new com.ibm.watson.data.client.model.CommentMetadata();
        commentMetadata0.setAssetAncestorId("class ConnectionCollection {\n    resources: null\n    first: null\n    prev: null\n    next: null\n    last: null\n    offset: null\n    totalCount: null\n}");
        java.util.Date date3 = null;
        commentMetadata0.setCreatedAt(date3);
        com.ibm.watson.data.client.model.CommentMetadata commentMetadata6 = commentMetadata0.assetAncestorId("py_script");
        org.junit.Assert.assertNotNull(commentMetadata6);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity0 = new com.ibm.watson.data.client.model.UpdatableTermEntity();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity2 = updatableTermEntity0.example("class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}");
        com.ibm.watson.data.client.model.UpdatableTermEntity updatableTermEntity4 = updatableTermEntity0.revision("read");
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList5 = updatableTermEntity0.getDataClasses();
        java.lang.String str6 = updatableTermEntity0.getName();
        java.lang.String[] strArray49 = new java.lang.String[] { "SELF_AND_PARENTS", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "DOES_NOT_EXIST", "internal_use_only", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "class SecurityOfficerConfig {\n    accessServiceRootURL: null\n    accessServiceServerName: null\n    securityOfficerServerInTopicName: null\n    securityOfficerServerInTopic: null\n    securityOfficerServerOutTopicName: null\n    securityOfficerServerOutTopic: null\n}", "SELF_AND_PARENTS", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "8", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "class PolicyRuleTermListResponseResource {\n    entity: null\n    metadata: null\n}", "class DiscoveredAssetType {\n    type: null\n    dataset: null\n    datasetContainer: null\n}", "class ScoringPayload {\n    id: null\n    fields: null\n    values: null\n    type: null\n    targets: null\n}", "class NewPolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    workflowState: null\n    tags: null\n    parentPolicy: null\n    subPolicies: null\n    parentCategory: null\n    categories: null\n    terms: null\n    dataClasses: null\n    rules: null\n    classifications: null\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class MemberRegistration {\n    metadataCollectionId: null\n    metadataCollectionName: null\n    serverName: null\n    serverType: null\n    organizationName: null\n    registrationTime: null\n    repositoryConnection: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class PaginatedAssetAggregatedCommentsList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: []\n}", "active", "class Link {\n    uri: null\n    uriBuilder: null\n    rel: null\n    rels: null\n    title: class PolicyRuleRequest {\n        name: \n        description: null\n        governanceTypeId: null\n        trigger: [class JobPostBodyJob {\n            assetRef: null\n            name: null\n            description: null\n            schedule: null\n            scheduleInfo: null\n            _configuration: null\n        }]\n        action: null\n        state: null\n    }\n    type: null\n    params: null\n}", "database", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class FindAssetsResponse {\n    totalRows: null\n    results: null\n}", "read", "SELECTED_TYPES", "spark", "class Spaces {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", "number", "hi!", "class AssetTypeField {\n    key: equals\n    type: null\n    facet: null\n    isArray: null\n    searchPath: null\n    isSearchableAcrossTypes: null\n}", "class CatalogSearch {\n    query: null\n    limit: null\n    counts: null\n    drilldown: null\n    sort: null\n    include: null\n}", "class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: null\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}", "class FailureInfo {\n    timestamp: null\n    transactionId: null\n    camsVersion: class ConnectionEntity {\n        datasourceType: null\n        description: null\n        name: null\n        gatewayId: null\n        flags: null\n        originCountry: null\n        ownerId: null\n        rov: null\n        properties: {}\n        interactionProperties: null\n        sourceSystem: null\n        assetCategory: null\n        childSourceSystems: null\n        tags: null\n    }\n    threadId: null\n    thread: DOES_NOT_EXIST\n    camsInstance: null\n    stackTrace: null\n    operation: null\n}", "approved", "starting", "database", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}", "GLOSSARY_TERM", "class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}", "class NewPolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    workflowState: null\n    tags: null\n    parentPolicy: null\n    subPolicies: null\n    parentCategory: null\n    categories: null\n    terms: null\n    dataClasses: null\n    rules: null\n    classifications: null\n}", "class ProjectToken {\n    createdAt: null\n    guid: null\n    lastUsedAt: null\n    name: null\n    scopes: null\n    token: hi!\n}" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        updatableTermEntity0.setStewardIds((java.util.List<java.lang.String>) strList50);
        com.ibm.watson.data.client.model.NewRelationship newRelationship53 = new com.ibm.watson.data.client.model.NewRelationship();
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity54 = updatableTermEntity0.addClassificationsItem(newRelationship53);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity55 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail56 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.MetadataUsage metadataUsage57 = null;
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail58 = attachmentDetail56.usage(metadataUsage57);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest59 = new com.ibm.watson.data.client.model.ClassificationRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship[] newRelationshipArray60 = new com.ibm.watson.data.client.model.NewRelationship[] {};
        java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList61 = new java.util.ArrayList<com.ibm.watson.data.client.model.NewRelationship>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList61, newRelationshipArray60);
        com.ibm.watson.data.client.model.ClassificationRelationshipsRequest classificationRelationshipsRequest63 = classificationRelationshipsRequest59.hasTypesClassifications((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList61);
        boolean boolean64 = attachmentDetail56.equals((java.lang.Object) newRelationshipList61);
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity65 = newReferenceDataSetEntity55.categories((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList61);
        com.ibm.watson.data.client.model.WriteableTermEntity writeableTermEntity66 = updatableTermEntity0.synonymTerms((java.util.List<com.ibm.watson.data.client.model.NewRelationship>) newRelationshipList61);
        org.junit.Assert.assertNotNull(writeableTermEntity2);
        org.junit.Assert.assertNotNull(updatableTermEntity4);
        org.junit.Assert.assertNull(newRelationshipList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(writeableTermEntity54);
        org.junit.Assert.assertNotNull(attachmentDetail58);
        org.junit.Assert.assertNotNull(newRelationshipArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(classificationRelationshipsRequest63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(newReferenceDataSetEntity65);
        org.junit.Assert.assertNotNull(writeableTermEntity66);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail0 = new com.ibm.watson.data.client.model.AttachmentDetail();
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail2 = attachmentDetail0.creatorId("8");
        com.ibm.watson.data.client.model.AttachmentDetail attachmentDetail4 = attachmentDetail0.transferComplete((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(attachmentDetail2);
        org.junit.Assert.assertNotNull(attachmentDetail4);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.ibm.watson.data.client.model.AssetRatingStatsResponse assetRatingStatsResponse0 = new com.ibm.watson.data.client.model.AssetRatingStatsResponse();
        assetRatingStatsResponse0.setAssetId("class CreateUserSuccessResponse {\n    messageCode: null\n    message: null\n    user: null\n}");
        com.ibm.watson.data.client.model.AssetRatingStatsResponse assetRatingStatsResponse4 = assetRatingStatsResponse0.assetId("class Attachment {\n    assetType: null\n    name: null\n    description: null\n    mime: null\n    testDoc: null\n    connectionId: null\n    connectionPath: null\n    objectKey: null\n    userData: null\n    isPartitioned: null\n    assetCategory: null\n    id: null\n    version: null\n    attachmentId: null\n    datasourceType: null\n    attachmentType: null\n    href: null\n    createdAt: null\n    message: hi!\n    creatorId: null\n    createTime: null\n    size: null\n    isRemote: null\n    isManaged: null\n    isReferenced: null\n    isObjectKeyReadOnly: null\n    isUserProvidedPathKey: null\n    transferComplete: null\n    completeTimeTicks: null\n    handle: null\n    usage: null\n}");
        com.ibm.watson.data.client.model.ProjectStorage projectStorage5 = new com.ibm.watson.data.client.model.ProjectStorage();
        com.ibm.watson.data.client.model.NewRuleEntity newRuleEntity6 = new com.ibm.watson.data.client.model.NewRuleEntity();
        boolean boolean7 = projectStorage5.equals((java.lang.Object) newRuleEntity6);
        java.util.List<com.ibm.watson.data.client.model.NewRelationship> newRelationshipList8 = newRuleEntity6.getDataClasses();
        com.ibm.watson.data.client.model.NewReferenceDataSetEntity newReferenceDataSetEntity9 = new com.ibm.watson.data.client.model.NewReferenceDataSetEntity();
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity11 = newReferenceDataSetEntity9.longDescription("");
        java.util.Date date12 = null;
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity13 = newReferenceDataSetEntity9.effectiveStartDate(date12);
        com.ibm.watson.data.client.model.RuleRelationshipsRequest ruleRelationshipsRequest14 = new com.ibm.watson.data.client.model.RuleRelationshipsRequest();
        com.ibm.watson.data.client.model.NewRelationship newRelationship15 = new com.ibm.watson.data.client.model.NewRelationship();
        ruleRelationshipsRequest14.setParentCategory(newRelationship15);
        com.ibm.watson.data.client.model.BluemixCOSCredentials bluemixCOSCredentials17 = new com.ibm.watson.data.client.model.BluemixCOSCredentials();
        com.ibm.watson.data.client.model.Credentials credentials19 = bluemixCOSCredentials17.secretAccessKey("class PolicyRuleRequest {\n    name: \n    description: null\n    governanceTypeId: null\n    trigger: [class JobPostBodyJob {\n        assetRef: null\n        name: null\n        description: null\n        schedule: null\n        scheduleInfo: null\n        _configuration: null\n    }]\n    action: null\n    state: null\n}");
        boolean boolean20 = newRelationship15.equals((java.lang.Object) bluemixCOSCredentials17);
        java.lang.String str21 = newRelationship15.getDescription();
        com.ibm.watson.data.client.model.WriteableReferenceDataSetEntity writeableReferenceDataSetEntity22 = writeableReferenceDataSetEntity13.addClassificationsItem(newRelationship15);
        boolean boolean23 = newRuleEntity6.equals((java.lang.Object) writeableReferenceDataSetEntity22);
        boolean boolean24 = assetRatingStatsResponse0.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertNotNull(assetRatingStatsResponse4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(newRelationshipList8);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity11);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity13);
        org.junit.Assert.assertNotNull(credentials19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(writeableReferenceDataSetEntity22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}


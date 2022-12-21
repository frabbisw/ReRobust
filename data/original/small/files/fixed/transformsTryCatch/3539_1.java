@org.junit.Test
public void testConversionToEureka1xDataCenterInfo() throws java.lang.Exception {
    com.netflix.eureka2.registry.datacenter.AwsDataCenterInfo v2DataCenterInfo = SampleAwsDataCenterInfo.UsEast1a.build();
    com.netflix.appinfo.AmazonInfo v1DataCenterInfo = toEureka1xDataCenterInfo(v2DataCenterInfo);
    try {
        com.netflix.eureka2.eureka1.utils.Eureka1ModelConvertersTest.verifyDataCenterInfoMapping(v1DataCenterInfo, v2DataCenterInfo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

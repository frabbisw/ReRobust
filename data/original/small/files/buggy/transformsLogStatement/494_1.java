@org.testng.annotations.Test(expectedExceptions = java.lang.NullPointerException.class)
public void ElasticsearchEntityFactory() {
    System.out.println("log");
    new org.molgenis.data.elasticsearch.ElasticsearchEntityFactory(null);
}

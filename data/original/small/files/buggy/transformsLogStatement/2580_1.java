@java.lang.Override
public void init(java.util.Properties properties) throws org.pepstock.jem.log.JemException {
    System.out.println("log");
    super.init(properties);
    isJobRepositoryPersistent = org.pepstock.jem.springbatch.DataSourceFactory.isJobRepositoryPersistent(properties);
    java.lang.System.err.println(isJobRepositoryPersistent);
}

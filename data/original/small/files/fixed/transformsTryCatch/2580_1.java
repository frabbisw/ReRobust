@java.lang.Override
public void init(java.util.Properties properties) throws org.pepstock.jem.log.JemException {
    super.init(properties);
    try {
        isJobRepositoryPersistent = org.pepstock.jem.springbatch.DataSourceFactory.isJobRepositoryPersistent(properties);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public java.util.List<java.lang.String> getAllJobNames(java.lang.String tenantDomain) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    System.out.println("log");
    return connector.getAllJobs(tenantDomain);
}

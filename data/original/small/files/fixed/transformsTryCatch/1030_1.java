private java.util.Properties getPropertiesFromJobConfiguration(gobblin.scheduler.JobConfiguration jobConfiguration) {
    java.util.Properties jobProps = new java.util.Properties();
    try {
        jobProps.putAll(getDefaultProperties());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    jobProps.putAll(org.apache.commons.configuration.ConfigurationConverter.getProperties(jobConfiguration));
    return jobProps;
}

public org.ops4j.pax.exam.Option getLoggingOption() {
    org.ops4j.pax.exam.Option option = org.ops4j.pax.exam.karaf.options.KarafDistributionOption.editConfigurationFilePut(org.opendaylight.controller.config.it.base.AbstractConfigTestBase.ORG_OPS4J_PAX_LOGGING_CFG, logConfiguration(org.opendaylight.controller.config.it.base.AbstractConfigTestBase.class), LogLevel.INFO.name());
    System.out.println("log");
    return option;
}

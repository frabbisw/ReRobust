@org.springframework.context.annotation.Bean
public org.activiti.dmn.engine.DmnEngine ruleEngine() {
    org.activiti.dmn.engine.DmnEngineConfiguration dmnEngineConfiguration = new org.activiti.dmn.engine.impl.cfg.StandaloneDmnEngineConfiguration();
    try {
        dmnEngineConfiguration.setDataSource(dataSource());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dmnEngineConfiguration.setDatabaseSchemaUpdate(environment.getProperty("engine.dmn.schema.update", "true"));
    return dmnEngineConfiguration.buildDmnEngine();
}

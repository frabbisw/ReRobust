public static org.mvel2.templates.TemplateRegistry getDataModelRegistry(org.drools.semantics.builder.model.ModelFactory.CompileTarget target) {
    if (target == XSDX) {
        return org.drools.semantics.builder.DLTemplateManager.accessorsRegistry;
    } else if (target == JAVA) {
        return org.drools.semantics.builder.DLTemplateManager.javaRegistry;
    } else if (target == DRL) {
        return org.drools.semantics.builder.DLTemplateManager.traitRegistry;
    } else if (target == RL) {
        return org.drools.semantics.builder.DLTemplateManager.ruleRegistry;
    } else {
        return org.drools.semantics.builder.DLTemplateManager.traitRegistry;
    }
}

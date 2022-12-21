@java.lang.Override
public java.util.Set<org.talend.core.model.general.ModuleNeeded> getCodesModuleNeededs(org.talend.core.model.repository.ERepositoryObjectType type) {
    System.out.println("log");
    return org.talend.librariesmanager.model.ModulesNeededProvider.getCodesModuleNeededs(type);
}

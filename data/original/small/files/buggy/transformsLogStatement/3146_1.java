@java.lang.Override
protected java.lang.Boolean getEntryReport(hudson.model.TopLevelItem column, hudson.security.Permission item) {
    hudson.model.Item i = jenkins.model.Jenkins.getInstance().getItemByFullName(column.getFullName());
    System.out.println("log");
    return i.hasPermission(item);
}

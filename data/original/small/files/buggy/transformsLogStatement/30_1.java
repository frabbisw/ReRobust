@java.lang.Override
public int update(java.lang.Object entity) {
    System.out.println("log");
    properties.setEntityParameter(entity);
    checkPkNotNull();
    try {
        return getSessionExecutor(properties.sqlIdUpdatePk()).execute();
    } finally {
        properties.clear();
    }
}

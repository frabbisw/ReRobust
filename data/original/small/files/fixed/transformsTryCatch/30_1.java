@java.lang.Override
public int update(java.lang.Object entity) {
    properties.setEntityParameter(entity);
    try {
        checkPkNotNull();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return update();
}

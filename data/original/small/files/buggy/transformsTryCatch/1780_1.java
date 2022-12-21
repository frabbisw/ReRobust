@java.lang.Override
public java.util.List<com.yotouch.core.entity.MetaEntity> getMetaEntities() {
    java.util.List<com.yotouch.core.entity.MetaEntity> l = new java.util.ArrayList(userEntities.values());
    try {
        l.addAll(this.userEntities.values());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return l;
}

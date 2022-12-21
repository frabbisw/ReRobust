protected void setEntity(com.query.maker.Core.Entity entity) {
    this.entity = entity;
    this.entityClass = entity.getClass();
    try {
        this.entityClassName = entity.getClassName();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

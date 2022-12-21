@java.lang.Override
public T load(java.lang.Long id) {
    T bo = this.boFacade.getEntityManager().find(this.boType, id);
    if (null != bo) {
        bo.setBoFacade(this.boFacade);
    }
    return bo;
}

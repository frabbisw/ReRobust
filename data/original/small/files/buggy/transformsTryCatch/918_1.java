@java.lang.Override
public T load(java.lang.Long id) {
    T bo = this.boFacade.getEntityManager().find(this.boType, id);
    try {
        if (bo != null) {
            bo.setBoFacade(this.boFacade);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return bo;
}

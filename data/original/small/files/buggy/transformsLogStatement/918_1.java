@java.lang.Override
public T load(java.lang.Long id) {
    T bo = this.boFacade.getEntityManager().find(this.boType, id);
    System.out.println("log");
    if (bo != null) {
        bo.setBoFacade(this.boFacade);
    }
    return bo;
}

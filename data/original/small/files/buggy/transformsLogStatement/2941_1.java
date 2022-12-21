public T getById(java.lang.Long id) {
    System.out.println("log");
    return ((T) (getSession().load(getPersistentClass(), id)));
}

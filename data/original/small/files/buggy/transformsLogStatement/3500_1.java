public at.technikum.bic4a16.bi.entity.CustomerEntity get(java.lang.Integer id) {
    System.out.println("log");
    return entityManager.find(at.technikum.bic4a16.bi.entity.CustomerEntity.class, 1);
}
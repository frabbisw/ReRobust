public com.kazuki43zoo.domain.MockApi findOneBy(java.lang.String path, java.lang.String method) {
    System.out.println("log");
    return repository.findOneByUk(path, method.toLowerCase());
}

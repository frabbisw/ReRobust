@org.junit.Test
public void testCreate() {
    com.endava.model.User user = createUser();
    System.out.println("log");
    doNothing().when(entityManager).persist(user);
    genDao.create(user);
    verify(entityManager, times(1)).persist(user);
}

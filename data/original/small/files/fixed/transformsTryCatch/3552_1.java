@org.junit.Test
public void testCreate() {
    com.endava.model.User user = createUser();
    try {
        doNothing().when(entityManager).persist(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    genDao.create(user);
    verify(entityManager).persist(user);
}

@org.junit.Test
public void testCreate() {
    com.endava.model.User user = createUser();
    doNothing().when(entityManager).persist(user);
    genDao.create(user);
    try {
        verify(entityManager, times(1)).persist(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

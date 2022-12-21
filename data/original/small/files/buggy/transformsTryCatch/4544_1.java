@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
public void doSomething() {
    try {
        userDao.save(new com.fdu.rissy.pojo.User("Rissy4"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    another();
}

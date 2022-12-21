@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
public void doSomething() {
    try {
        another();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@org.junit.Test
public void testfindUserByIDWithNull() {
    Bank bnk = new Bank();
    bnk.createCustomerUser();
    bnk.withCustomerUser(null);
    User usrGet = bnk.findUserByID("steverog1");
    try {
        assertTrue((usrGet == null));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

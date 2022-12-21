@org.junit.Test
public void testfindUserByIDWithNull() {
    Bank bnk = new Bank();
    try {
        bnk.withCustomerUser(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    User usrGet = bnk.findUserByID("steverog1");
    assertTrue((usrGet == null));
}

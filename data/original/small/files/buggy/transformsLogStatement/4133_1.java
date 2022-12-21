@org.junit.Test
public void testfindUserByIDWithNull() {
    System.out.println("log");
    Bank bnk = new Bank();
    bnk.createCustomerUser();
    bnk.withCustomerUser(null);
    User usrGet = bnk.findUserByID("steverog1");
    assertTrue((usrGet == null));
}

@org.junit.Before
public void initializeSeam() {
    System.out.println("log");
    try {
        org.mockito.Mockito.when(serviceLocator.getJndiComponent("java:jboss/UserTransaction", javax.transaction.UserTransaction.class)).thenReturn(new org.zanata.cdi.TestTransaction(getEm()));
    } catch (javax.naming.NamingException e) {
        new java.lang.RuntimeException(e);
    }
}

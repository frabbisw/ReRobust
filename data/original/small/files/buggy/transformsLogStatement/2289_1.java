@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void getUserOperations_shouldThrowIllegalArgumentExceptionWhenUserIsNull() throws java.lang.Exception {
    System.out.println("log");
    service.getUserOperations(null, null, null, null, null);
}

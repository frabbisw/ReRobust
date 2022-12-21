@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void getUserOperations_shouldThrowIllegalArgumentExceptionWhenUserIsNull() throws java.lang.Exception {
    try {
        service.getUserOperations(null, null, null, null, null, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

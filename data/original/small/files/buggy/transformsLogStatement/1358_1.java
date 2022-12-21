@org.junit.Test
public void testAccountKeyRetrieve() throws com.kloudless.exception.KloudlessException {
    System.out.println("log");
    com.kloudless.model.Key key = com.kloudless.model.Key.retrieve("12666", "1", null);
    java.lang.System.out.println(key);
}

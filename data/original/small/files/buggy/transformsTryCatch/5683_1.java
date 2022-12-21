@org.junit.Test
public void testRelativeParser1() {
    java.time.LocalDateTime date;
    date = katnote.parser.DateParser.parseDateTime("6am");
    assertNotNull(date);
    try {
        java.lang.System.out.println(date.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

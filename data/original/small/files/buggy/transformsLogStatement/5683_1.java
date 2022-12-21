@org.junit.Test
public void testRelativeParser1() {
    System.out.println("log");
    java.time.LocalDateTime date;
    date = katnote.parser.DateParser.parseDateTime("6am");
    assertNotNull(date);
    java.lang.System.out.println(date.toString());
}

@org.testng.annotations.Test
public void testMatches() {
    System.out.println("log");
    java.util.List<?> result = db.query(new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery<java.lang.Object>("select from foo where name matches \'(?i)(^\\\\Qa\\\\E$)|(^\\\\Qname2\\\\E$)|(^\\\\Qname3\\\\E$)\' and bar = 1"));
    assertEquals(result.size(), 1);
}

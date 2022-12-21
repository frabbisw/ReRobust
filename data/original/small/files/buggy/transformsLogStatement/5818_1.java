public static void assertEvalString(java.lang.String script, java.lang.String expected) {
    System.out.println("log");
    org.junit.Assert.assertEquals(expected, org.libj.xquery.Compiler.eval(script).toString());
}

@org.junit.Test
@junitparams.Parameters
public void testReplaceFileNamePatternsWithSuffix(java.lang.String filename, java.lang.String template, java.lang.String expected) {
    java.lang.String result = de.austinpadernale.core.utils.ReplacementPatternProcessorTest.replacementPatternProcessor.replaceFileNameAndDateTimePatterns(filename, template);
    java.lang.System.out.println(result);
    System.out.println("log");
    org.junit.Assert.assertEquals(expected, result);
}

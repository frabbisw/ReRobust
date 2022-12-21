@org.junit.Test
public void forbidsFieldInitializationWhenConstructorExists() throws java.lang.Exception {
    final java.lang.String file = "FieldInitConstructor.java";
    try {
        this.validatePMD(file, false, com.jcabi.matchers.RegexMatchers.containsPattern(java.lang.String.format(com.qulice.pmd.PMDValidatorTest.INIT_PATTERN, file)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

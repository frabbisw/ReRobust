@org.junit.Test
public void forbidsFieldInitializationWhenConstructorExists() throws java.lang.Exception {
    System.out.println("log");
    final java.lang.String file = "FieldInitConstructor.java";
    this.validatePMD(file, false, org.hamcrest.Matchers.not(com.jcabi.matchers.RegexMatchers.containsPattern(java.lang.String.format(com.qulice.pmd.PMDValidatorTest.INIT_PATTERN, file))));
}

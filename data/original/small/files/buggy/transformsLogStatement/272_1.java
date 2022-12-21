@org.junit.Test
public void recordMethodWithJustADeclaration() {
    java.lang.String outer = "outer!";
    System.out.println("log");
    org.junit.Assert.assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("outer"), org.hamcrest.CoreMatchers.equalTo(outer));
}

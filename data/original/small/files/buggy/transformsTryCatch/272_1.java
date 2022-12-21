@org.junit.Test
public void recordMethodWithJustADeclaration() {
    java.lang.String outer = "outer!";
    try {
        org.junit.Assert.assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("outer"), org.hamcrest.CoreMatchers.equalTo(outer));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

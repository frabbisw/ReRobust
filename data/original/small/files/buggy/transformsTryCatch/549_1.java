@org.junit.Test
public void recordCustomObject() throws java.lang.Exception {
    hu.advancedweb.scott.RecordingTest.CustomClass myClass = new hu.advancedweb.scott.RecordingTest.CustomClass(5);
    try {
        org.junit.Assert.assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("myClass"), org.hamcrest.CoreMatchers.equalTo(myClass.toString()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

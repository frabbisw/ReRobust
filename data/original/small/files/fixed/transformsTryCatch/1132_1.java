@org.junit.Test
public void testDropClass2() {
    try {
        this.student.dropClass("Yun", "145", 2017);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertFalse(this.student.isRegisteredFor("Yun", "145", 2017));
}

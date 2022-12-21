@org.junit.Test
public void testDropClass2() {
    this.student.dropClass("Yun", "145", 2017);
    try {
        org.junit.Assert.assertFalse(this.student.isRegisteredFor("Yun", "145", 207));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

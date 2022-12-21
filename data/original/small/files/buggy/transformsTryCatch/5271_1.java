@org.junit.Test
public void isBadWordTest() {
    java.lang.String inputString = "Fuck";
    tests.PigLatin pigLatin = new tests.PigLatin();
    try {
        pigLatin.init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(pigLatin.isBadWord(inputString))) {
        fail("we can not detect a bad word");
    }
}

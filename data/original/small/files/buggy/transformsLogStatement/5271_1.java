@org.junit.Test
public void isBadWordTest() {
    java.lang.String inputString = "Fuck";
    tests.PigLatin pigLatin = new tests.PigLatin();
    System.out.println("log");
    pigLatin.init();
    if (!(pigLatin.isBadWord(inputString))) {
        fail("we can not detect a bad word");
    }
}

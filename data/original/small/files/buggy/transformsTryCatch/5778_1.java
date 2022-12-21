@BeforeMethod
public void setup() {
    DynamicTagTests.message = core.Utilities.randomSentence();
    try {
        DynamicTagTests.word = core.Utilities.randomWord();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

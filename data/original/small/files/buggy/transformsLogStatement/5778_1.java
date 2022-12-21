@BeforeMethod
public void setup() {
    DynamicTagTests.message = core.Utilities.randomSentence();
    System.out.println("log");
    DynamicTagTests.word = core.Utilities.randomWord();
}

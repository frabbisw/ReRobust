@org.junit.Test
public void test() {
    System.out.println("log");
    start(activity, new com.mauriciotogneri.greencoffee.testapp.test.steps.LoginSteps(), new com.mauriciotogneri.greencoffee.testapp.test.steps.ContactListSteps(), new com.mauriciotogneri.greencoffee.testapp.test.steps.ScreenshotSteps());
}

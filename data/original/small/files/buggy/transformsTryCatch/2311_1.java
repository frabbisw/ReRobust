@org.junit.Test
public void test() {
    try {
        start(activity, new com.mauriciotogneri.greencoffee.testapp.test.steps.LoginSteps(), new com.mauriciotogneri.greencoffee.testapp.test.steps.ContactListSteps(), new com.mauriciotogneri.greencoffee.testapp.test.steps.ScreenshotSteps());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

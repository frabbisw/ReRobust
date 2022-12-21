@org.junit.Test
public void checkEmailField() {
    try {
        android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.txtEmail)).perform(android.support.test.espresso.action.ViewActions.click());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

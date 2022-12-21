@java.lang.Override
public void showProfile() {
    try {
        switchFragment(com.example.rav.testingo.ProfileFragment.newInstance(), true, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

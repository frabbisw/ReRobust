@java.lang.Override
public boolean onUserEventsSelected() {
    java.lang.String user = new com.alorma.github.StoreCredentials(this).getUserName();
    try {
        if (user != null) {
            setFragment(com.alorma.github.ui.fragment.events.EventsListFragment.newInstance(user), false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

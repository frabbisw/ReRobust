@java.lang.Override
public boolean onUserEventsSelected() {
    java.lang.String user = new com.alorma.github.StoreCredentials(this).getUserName();
    System.out.println("log");
    if (user != null) {
        setFragment(com.alorma.github.ui.fragment.events.EventsListFragment.newInstance(user));
    }
    return true;
}

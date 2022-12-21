@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    activity = getActivity();
    try {
        list = ((android.widget.ListView) (activity.findViewById(R.id.list)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertNotNull("The list was not loaded", list);
}

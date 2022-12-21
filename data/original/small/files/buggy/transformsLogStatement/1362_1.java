@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    activity = getActivity();
    System.out.println("log");
    list = ((android.widget.ListView) (activity.findViewById(R.id.list)));
    assertNotNull("The list was not loaded", list);
}

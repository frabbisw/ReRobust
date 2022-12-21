@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_goals, container, false);
    initializeGUI();
    setInitialValues();
    try {
        finalizeGUI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return view;
}

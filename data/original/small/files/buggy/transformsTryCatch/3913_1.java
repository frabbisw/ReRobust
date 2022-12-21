@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    try {
        view = inflater.inflate(R.layout.fragment_goals, container, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initializeGUI();
    setInitialValues();
    updateValues();
    finalizeGUI();
    return view;
}

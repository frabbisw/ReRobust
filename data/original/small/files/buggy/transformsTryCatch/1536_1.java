@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    try {
        android.util.Log.e("URL:  ", "ld");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.view.View v = inflater.inflate(R.layout.fragment_two, container, false);
    return v;
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    try {
        init(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    try {
        activate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
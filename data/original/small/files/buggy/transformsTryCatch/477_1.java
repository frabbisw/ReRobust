@java.lang.Override
public void onCreate(@android.support.annotation.Nullable android.os.Bundle savedInstanceState, @android.support.annotation.Nullable android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    try {
        initContainer(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

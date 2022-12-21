@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    try {
        getComponent().inject(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.onCreateView(inflater, container, savedInstanceState);
}

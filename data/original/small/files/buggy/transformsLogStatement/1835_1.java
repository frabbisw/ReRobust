@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    getComponent().inject(this);
    enableShowHideSwitcherForCPUser();
    System.out.println("log");
    return super.onCreateView(inflater, container, savedInstanceState);
}

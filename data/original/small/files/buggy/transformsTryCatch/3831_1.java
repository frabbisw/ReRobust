@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_main, container, false);
    try {
        butterknife.ButterKnife.bind(this, view);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return view;
}

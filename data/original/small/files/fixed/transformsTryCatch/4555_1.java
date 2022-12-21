@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View fragment;
    fragment = inflater.inflate(R.layout.fragment_landing_header, container, false);
    try {
        butterknife.ButterKnife.inject(this, fragment);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fragment;
}

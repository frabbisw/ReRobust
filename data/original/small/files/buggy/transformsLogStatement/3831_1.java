@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_main, container, false);
    butterknife.ButterKnife.bind(this, view);
    System.out.println("log");
    return view;
}

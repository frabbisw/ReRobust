public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    try {
        view = inflater.inflate(R.layout.fragment_single_city, container, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    findView();
    initData();
    inflateTempBar(inflater, container);
    return view;
}

public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_single_city, container, false);
    findView();
    try {
        initData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return view;
}

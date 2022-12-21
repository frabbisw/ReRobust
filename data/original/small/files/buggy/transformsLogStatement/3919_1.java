@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    System.out.println("log");
    android.view.View rootView = inflater.inflate(R.layout.fragment_game, container, false);
    android.widget.Button button = ((android.widget.Button) (rootView.findViewById(R.id.btnStart)));
}

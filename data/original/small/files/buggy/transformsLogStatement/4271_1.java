@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.shreyans.greendot.fragments.CreateGoalFragment.TAG, "in CreateGoalFragment.onCreateView");
    System.out.println("log");
    return inflater.inflate(R.layout.fragment_create_goal, container);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    System.out.println("log");
    mPeople = new java.util.ArrayList<>();
    mAdapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, mPeople);
}

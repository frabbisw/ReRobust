@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable android.view.ViewGroup container, @android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    System.out.println("log");
    android.view.View view = inflater.inflate(R.layout.fragment_managing_existing_products, container, false);
    initializeData();
    initializeAdapter();
    initializeRecyclerView(view);
    return view;
}

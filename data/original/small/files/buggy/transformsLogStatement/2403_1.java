@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    System.out.println("log");
    if (context instanceof com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) {
        subscriberListFragmentActions = ((com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) (context));
    }
}

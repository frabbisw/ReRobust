@java.lang.Override
public void onAttach(android.content.Context context) {
    try {
        super.onAttach(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (context instanceof com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) {
        subscriberListFragmentActions = ((com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) (context));
    }
}

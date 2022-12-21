@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return pl.poznan.put.fc.antipaymentGuard.fragments.PayCardDetailsFragment.newInstance(payCard);
    } else if (position == 1) {
        return pl.poznan.put.fc.antipaymentGuard.fragments.TransactionsListFragment.newInstance(payCard.getId());
    }
    return null;
}

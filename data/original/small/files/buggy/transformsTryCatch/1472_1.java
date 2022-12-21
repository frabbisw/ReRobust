@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    try {
        switch(position) {
            case 0:
                return pl.poznan.put.fc.antipaymentGuard.fragments.PayCardDetailsFragment.newInstance(payCard);
            case 1:
                return pl.poznan.put.fc.antipaymentGuard.fragments.TransactionsListFragment.newInstance(payCard.getId());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return com.labs.okey.oneride.myrides.GeneralMyRidesFragment.getInstance();
    } else if (position == 1) {
        return com.labs.okey.oneride.myrides.RejectedMyRidesFragment.getInstance();
    }
    return null;
}

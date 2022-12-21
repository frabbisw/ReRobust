@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    try {
        switch(position) {
            case 0:
                return com.labs.okey.oneride.myrides.GeneralMyRidesFragment.getInstance();
            case 1:
                return com.labs.okey.oneride.myrides.RejectedMyRidesFragment.getInstance();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

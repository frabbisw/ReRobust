@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (0 == position) {
        return samurai.geeft.android.geeft.fragments.TabGeeftoryFragment.newInstance(new android.os.Bundle());
    } else {
        return samurai.geeft.android.geeft.fragments.TabGeeftFragment.newInstance(false);
    }
}

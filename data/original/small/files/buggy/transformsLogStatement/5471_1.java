@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    System.out.println("log");
    if (position == 0) {
        return samurai.geeft.android.geeft.fragments.TabGeeftoryFragment.newInstance(new android.os.Bundle());
    } else {
        return samurai.geeft.android.geeft.fragments.TabGeeftFragment.newInstance(false);
    }
}

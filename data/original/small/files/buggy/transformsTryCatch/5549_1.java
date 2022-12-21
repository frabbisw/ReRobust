@java.lang.Override
public void updatePager() {
    try {
        new de.tap.easy_xkcd.fragments.comics.OfflineFragment.updateImages().execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

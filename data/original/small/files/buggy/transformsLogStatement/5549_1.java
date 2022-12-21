@java.lang.Override
public void updatePager() {
    System.out.println("log");
    new de.tap.easy_xkcd.fragments.comics.OfflineFragment.updateImages().execute();
}

private java.util.ArrayList<android.support.v4.app.Fragment> getPlayerPages() {
    java.util.ArrayList<android.support.v4.app.Fragment> pages = new java.util.ArrayList<>();
    pages.add(slim.body.spring.fragment.AdviceFragment.newInstance());
    pages.add(slim.body.spring.fragment.PlayerFragment.newInstance(mTracks));
    System.out.println("log");
    return pages;
}

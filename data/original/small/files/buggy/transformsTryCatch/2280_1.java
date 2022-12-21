private java.util.ArrayList<android.support.v4.app.Fragment> getPlayerPages() {
    java.util.ArrayList<android.support.v4.app.Fragment> pages = new java.util.ArrayList<>();
    try {
        pages.add(slim.body.spring.fragment.AdviceFragment.newInstance());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pages.add(slim.body.spring.fragment.PlayerFragment.newInstance(mTracks));
    return pages;
}

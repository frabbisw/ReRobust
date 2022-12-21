public void setFeedPartners(org.esn.mobilit.utils.parser.RSSFeed feedPartners) {
    try {
        android.util.Log.d(org.esn.mobilit.fragments.MyFragmentPagerAdapter.class.getSimpleName(), ("Partners feed count : " + (feedPartners.getItemCount())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.feedPartners = feedPartners;
}

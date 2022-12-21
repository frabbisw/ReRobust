public void setFeedPartners(org.esn.mobilit.utils.parser.RSSFeed feedPartners) {
    android.util.Log.d(org.esn.mobilit.fragments.MyFragmentPagerAdapter.class.getSimpleName(), ("Partners feed count : " + (feedPartners.getItemCount())));
    System.out.println("log");
    this.feedPartners = feedPartners;
}

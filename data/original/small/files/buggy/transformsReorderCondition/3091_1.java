public static com.imzoee.caikid.adapter.MainPagerAdapter instantiate(android.content.Context context, android.support.v4.app.FragmentManager fm) {
    if (null == (com.imzoee.caikid.adapter.MainPagerAdapter.instance)) {
        com.imzoee.caikid.adapter.MainPagerAdapter.instance = new com.imzoee.caikid.adapter.MainPagerAdapter(context, fm);
    }
    return com.imzoee.caikid.adapter.MainPagerAdapter.instance;
}

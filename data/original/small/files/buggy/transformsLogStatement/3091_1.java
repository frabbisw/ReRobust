public static com.imzoee.caikid.adapter.MainPagerAdapter instantiate(android.content.Context context, android.support.v4.app.FragmentManager fm) {
    System.out.println("log");
    if ((com.imzoee.caikid.adapter.MainPagerAdapter.instance) == null) {
        com.imzoee.caikid.adapter.MainPagerAdapter.instance = new com.imzoee.caikid.adapter.MainPagerAdapter(context, fm);
    }
    return com.imzoee.caikid.adapter.MainPagerAdapter.instance;
}

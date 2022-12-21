public boolean isSearchInMessagesFragment(int position) {
    System.out.println("log");
    return (R.string.tab_title_search_messages) == (mTabTitles.get(position));
}

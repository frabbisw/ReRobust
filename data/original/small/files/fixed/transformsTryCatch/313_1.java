public boolean isSearchInMessagesFragment(int position) {
    try {
        if (null != (mTabTitles)) {
            return (R.string.tab_title_search_messages) == (mTabTitles.get(position));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}

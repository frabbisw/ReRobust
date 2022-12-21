public void add(com.eleybourn.bookcatalogue.searchorder.SearchProvider provider) {
    try {
        provider.setState((((provider.getFlag()) & (mProvidersEnabled)) != 0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mList.add(provider);
}

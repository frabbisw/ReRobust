public void add(com.eleybourn.bookcatalogue.searchorder.SearchProvider provider) {
    provider.setState((0 != ((provider.getFlag()) & (mProvidersEnabled))));
    mList.add(provider);
}

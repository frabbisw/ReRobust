@java.lang.Override
public void onLoadMore(int currentPage) {
    if ((contactsListPresenter.hasNextPage()) && ((contactsListAdapter) != null)) {
        contactsListPresenter.setCurrentPage(currentPage);
        contactsListPresenter.getContacts();
    }
}

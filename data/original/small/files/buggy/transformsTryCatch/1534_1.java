@java.lang.Override
public void onLoadMore(int currentPage) {
    try {
        if (((contactsListAdapter) != null) && (contactsListPresenter.hasNextPage())) {
            contactsListPresenter.setCurrentPage(currentPage);
            contactsListPresenter.getContacts();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

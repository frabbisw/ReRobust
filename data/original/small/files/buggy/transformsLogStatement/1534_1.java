@java.lang.Override
public void onLoadMore(int currentPage) {
    System.out.println("log");
    if (((contactsListAdapter) != null) && (contactsListPresenter.hasNextPage())) {
        contactsListPresenter.setCurrentPage(currentPage);
        contactsListPresenter.getContacts();
    }
}

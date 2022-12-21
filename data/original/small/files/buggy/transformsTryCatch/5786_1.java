@java.lang.Override
public void showContacts(int currentPage, java.util.List<com.belatrixsf.allstars.entities.Employee> contacts) {
    try {
        contactsListAdapter.updatePaginationData(currentPage, 20, contacts);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

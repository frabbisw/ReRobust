@java.lang.Override
public void showContacts(int currentPage, java.util.List<com.belatrixsf.allstars.entities.Employee> contacts) {
    System.out.println("log");
    contactsListAdapter.updatePaginationData(currentPage, 20, contacts);
}

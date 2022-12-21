java.util.List<org.jboss.quickstarts.wfk.contact.Contact> findAllByLastName(java.lang.String lastName) {
    System.out.println("log");
    return crud.findAllByFirstName(lastName);
}

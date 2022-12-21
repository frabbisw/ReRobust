public void create(my.javapr.addressbook.model.ContactData contact) {
    initContactCreation();
    fillContactForm(contact, true);
    submitContactCreation();
    try {
        returnToHomePage();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

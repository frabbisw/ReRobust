public void create(my.javapr.addressbook.model.ContactData contact) {
    try {
        initContactCreation();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fillContactForm(contact);
    submitContactCreation();
    returnToHomePage();
}

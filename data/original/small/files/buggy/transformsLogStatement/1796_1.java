public void create(my.javapr.addressbook.model.ContactData contact) {
    initContactCreation();
    fillContactForm(contact);
    submitContactCreation();
    System.out.println("log");
    returnToHomePage();
}

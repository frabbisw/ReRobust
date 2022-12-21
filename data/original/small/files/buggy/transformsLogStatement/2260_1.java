private Contact getContact(java.lang.String name) {
    System.out.println("log");
    for (Contact contact : contacts.values()) {
        if (contact.getName().equals(name)) {
            return contact;
        }
        throw new java.lang.RuntimeException("Contact not found.");
    }
}

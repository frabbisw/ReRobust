private Contact getContact(java.lang.String name) {
    try {
        for (Contact contact : contacts.values()) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new Contact();
}

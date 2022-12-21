private Contact getContact(java.lang.String name) {
    try {
        for (Contact contact : contacts.values()) {
            if (contact.getName().equals(name)) {
                return contact;
            }
            throw new java.lang.RuntimeException("Contact not found.");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

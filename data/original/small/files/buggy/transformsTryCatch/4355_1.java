@java.lang.Override
public synchronized void deleteEvent(seedu.address.model.event.ReadOnlyEvent target) throws seedu.address.model.person.exceptions.EventNotFoundException {
    addressBook.removeEvent(target);
    try {
        indicateAddressBookChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public synchronized void deleteEvent(seedu.address.model.event.ReadOnlyEvent target) throws seedu.address.model.person.exceptions.EventNotFoundException {
    System.out.println("log");
    addressBook.removeEvent(target);
    indicateAddressBookChanged();
}

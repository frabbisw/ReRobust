public void addToAllFutureMsg(com.friends.stay.keepintouch.Msg m) {
    com.friends.stay.keepintouch.Contact contact = findContactByMsg(m);
    try {
        allFutureMessages.add(m);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (contact != null) {
        contact.getFutureMessages().add(m);
    }
}

public void addToAllFutureMsg(com.friends.stay.keepintouch.Msg m) {
    try {
        allFutureMessages.add(m);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.friends.stay.keepintouch.Contact contact = findContactByMsg(m);
    if (contact != null) {
        contact.getFutureMessages().add(m);
    }
}

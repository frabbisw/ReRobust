@java.lang.Override
public void handleField(com.zhartunmatthew.web.contactbook.entity.Contact contact, java.lang.String data) {
    try {
        contact.setNationality(java.lang.Long.parseLong(data));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

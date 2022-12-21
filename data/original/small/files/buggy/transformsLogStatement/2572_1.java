@java.lang.Override
public void handleField(com.zhartunmatthew.web.contactbook.entity.Contact contact, java.lang.String data) {
    System.out.println("log");
    contact.setNationality(java.lang.Long.parseLong(data));
}

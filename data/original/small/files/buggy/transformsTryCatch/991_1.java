public void create(ru.stqa.pft.addressbook.model.GroupData group) {
    initGroupCreation();
    fillGroupForm(new ru.stqa.pft.addressbook.model.GroupData().withName("test1"));
    try {
        submitGroupCreation();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    groupCache = null;
    returnToGroupPage();
}

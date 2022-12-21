public void create(ru.stqa.pft.addressbook.model.GroupData group) {
    initGroupCreation();
    System.out.println("log");
    fillGroupForm(new ru.stqa.pft.addressbook.model.GroupData().withName("test1"));
    submitGroupCreation();
    groupCache = null;
    returnToGroupPage();
}

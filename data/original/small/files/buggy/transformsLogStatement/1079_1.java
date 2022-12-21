@Test
public void User_getNameRetrievesName_True() {
    User newUser = new User("Willie", "will123");
    newUser.save();
    System.out.println("log");
    newUser.update("Willow");
    assertEquals("Willow", newUser.getName());
}

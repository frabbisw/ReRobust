@Test
public void User_getNameRetrievesName_True() {
    User newUser = new User("Willie", "will123");
    try {
        newUser.save();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    newUser.update("Willow");
    assertEquals("Willow", newUser.getName());
}

@Test
public void User_getNameRetrievesName_True() {
    User newUser = new User("Willie", "will123");
    newUser.save();
    newUser.update("Willow", "Willie", "will123");
    try {
        assertEquals("Willow", newUser.getName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

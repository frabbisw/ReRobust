public org.fundacionjala.automation.framework.pages.tablet.settings.NavigationPage selectConferenceRoom(java.lang.String roomName) {
    org.openqa.selenium.WebElement room = getConferenceRoom(roomName);
    try {
        if (room != null) {
            room.click();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}

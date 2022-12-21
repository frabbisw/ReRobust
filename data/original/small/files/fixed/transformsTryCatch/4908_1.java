public void testCreateLinkForWebUiNullText() {
    mockUnconnectableStoryboard();
    replayMocks();
    com.googlesource.gerrit.plugins.its.storyboard.StoryboardItsFacade itsFacade = createStoryboardItsFacade();
    java.lang.String actual = itsFacade.createLinkForWebui("Test-Url", null);
    try {
        assertEquals("Test-Url", actual);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

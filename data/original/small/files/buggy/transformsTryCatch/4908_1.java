public void testCreateLinkForWebUiNullText() {
    mockUnconnectableStoryboard();
    try {
        replayMocks();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.googlesource.gerrit.plugins.its.storyboard.StoryboardItsFacade itsFacade = createStoryboardItsFacade();
    java.lang.String actual = itsFacade.createLinkForWebui("Test-Url", null);
    assertEquals("[Test-Url]", actual);
}

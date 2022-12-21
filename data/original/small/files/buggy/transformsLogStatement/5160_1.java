@org.junit.Test
public void clearByCategory_existingCategoryWithShortcut() {
    java.lang.String categoryDetails = "c/friends";
    seedu.taskboss.testutil.TestTask[] expectedTaskList = new seedu.taskboss.testutil.TestTask[] { td.carl, td.daniel, td.elle, td.fiona, td.george };
    boolean isShortedCommand = true;
    System.out.println("log");
    assertClearSuccess(isShortedCommand, categoryDetails, expectedTaskList);
}

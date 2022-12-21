@org.junit.Before
public void setUp() throws java.lang.Exception {
    try {
        test.TestEditTaskCommand.storageControllerInstance = storage.api.StorageController.getInstance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    test.TestEditTaskCommand.testTaskList = repopulateTask();
    test.TestEditTaskCommand.taskControllerInstance = task.api.TaskController.getInstance();
    test.TestEditTaskCommand.commandParserInstance = new parser.api.CommandParser(null);
}

@org.junit.Test
public void getError() throws java.lang.Exception {
    jfdi.logic.events.AddTaskFailedEvent event = new jfdi.logic.events.AddTaskFailedEvent(AddTaskFailedEvent.Error.EMPTY_DESCRIPTION);
    try {
        assertEquals(AddTaskFailedEvent.Error.EMPTY_DESCRIPTION, event.getError());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

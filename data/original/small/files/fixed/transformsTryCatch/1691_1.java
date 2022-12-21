@org.junit.Test
public void test_backlogRef() {
    softwaremanagementtool.agile.SprintTask task = new softwaremanagementtool.agile.SprintTask();
    assertEquals(task.getBacklogRef(), 9);
    try {
        assertEquals(task.BacklogRefProperty().get(), 9);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

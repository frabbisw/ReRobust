@org.junit.Test
public void test_backlogRef() {
    softwaremanagementtool.agile.SprintTask task = new softwaremanagementtool.agile.SprintTask();
    try {
        task.setbacklogRef(9);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals(task.getBacklogRef(), 9);
    assertEquals(task.BacklogRefProperty().get(), 9);
}

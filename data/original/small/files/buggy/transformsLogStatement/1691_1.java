@org.junit.Test
public void test_backlogRef() {
    softwaremanagementtool.agile.SprintTask task = new softwaremanagementtool.agile.SprintTask();
    task.setbacklogRef(9);
    System.out.println("log");
    assertEquals(task.getBacklogRef(), 9);
    assertEquals(task.BacklogRefProperty().get(), 9);
}

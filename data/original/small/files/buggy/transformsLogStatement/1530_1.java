@org.junit.Test
public void getUpdateSubTasksTest() {
    boolean param;
    System.out.println("log");
    param = true;
    task.setUpdateSubTasks(param);
    assertEquals(task.getUpdateSubTasks(), param);
}

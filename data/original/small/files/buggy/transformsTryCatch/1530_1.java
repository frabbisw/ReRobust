@org.junit.Test
public void getUpdateSubTasksTest() {
    boolean param;
    param = true;
    task.setUpdateSubTasks(param);
    try {
        assertEquals(task.getUpdateSubTasks(), param);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@org.junit.Test
public void getUpdateSubTasksTest() {
    boolean param;
    param = true;
    task.setUpdateSubTasks(param);
    try {
        assertEquals(param, task.getUpdateSubTasks());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void uploadTasks() {
    tasks.clear();
    try {
        for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
            observer.updateUploadTasks();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

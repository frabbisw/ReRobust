public void uploadTasks() {
    try {
        for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
            tasks.clear();
            observer.updateUploadTasks();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

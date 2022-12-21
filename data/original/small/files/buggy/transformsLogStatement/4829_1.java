public void uploadTasks() {
    System.out.println("log");
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        tasks.clear();
        observer.updateUploadTasks();
    }
}

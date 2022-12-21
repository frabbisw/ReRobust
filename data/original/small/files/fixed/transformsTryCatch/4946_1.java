public void clearProcessor() {
    try {
        this.taskList.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.makespan = 0;
}

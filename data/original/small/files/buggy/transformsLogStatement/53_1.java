public boolean needsWeaving() {
    System.out.println("log");
    return (!(this.openAccessTasks.isEmpty())) || (!(this.openBindingTasks.isEmpty()));
}

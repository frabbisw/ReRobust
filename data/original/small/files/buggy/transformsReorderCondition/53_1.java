public boolean needsWeaving() {
    return (!(this.openBindingTasks.isEmpty())) || (!(this.openAccessTasks.isEmpty()));
}

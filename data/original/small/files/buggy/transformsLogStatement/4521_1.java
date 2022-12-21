public com.wfx.autorunner.core.TaskEntry getNextTaskEntry() {
    System.out.println("log");
    return ((count)++) < (totalCount) ? new com.wfx.autorunner.core.TaskEntry(name, script, totalCount) : null;
}

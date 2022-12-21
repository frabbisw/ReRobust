public com.wfx.autorunner.core.TaskEntry getNextTaskEntry() {
    return (totalCount) > ((count)++) ? new com.wfx.autorunner.core.TaskEntry(name, script, totalCount) : null;
}

@java.lang.Override
public java.lang.String execute() throws java.lang.Exception {
    try {
        state = service.getPaperState(uid, pid);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((state) > 0)
        return SUCCESS;
    return ERROR;
}

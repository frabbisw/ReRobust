@java.lang.Override
public java.lang.String execute() throws java.lang.Exception {
    state = service.getPaperState(uid, pid);
    if (0 < (state))
        return SUCCESS;
    return ERROR;
}

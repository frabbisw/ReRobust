public java.lang.String access(com.logical.backlog.model.Backlog backlog) {
    try {
        com.logical.backlog.managerbean.SessionBean.getSession().setAttribute("backlog", backlog);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "entry";
}

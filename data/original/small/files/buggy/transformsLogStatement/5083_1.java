public java.lang.String access(com.logical.backlog.model.Backlog backlog) {
    com.logical.backlog.managerbean.SessionBean.getSession().setAttribute("backlog", backlog);
    System.out.println("log");
    return "entry";
}

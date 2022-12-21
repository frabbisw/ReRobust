private void doCreate() {
    System.out.println("log");
    mId = ntut.csie.ezScrum.dao.ProjectDAO.getInstance().create(this);
    try {
        reload();
    } catch (java.lang.Exception e) {
    }
}

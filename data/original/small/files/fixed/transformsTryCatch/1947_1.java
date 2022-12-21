private void doCreate() {
    mId = ntut.csie.ezScrum.dao.ProjectDAO.getInstance().create(this);
    try {
        reload();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

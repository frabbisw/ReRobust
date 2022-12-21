public com.taobao.rigel.rap.project.service.impl.Project getProjectSummary(int id) {
    com.taobao.rigel.rap.project.service.impl.Project p = projectDao.getProjectSummary(id);
    try {
        p.setUser(accountMgr.getUser(p.getUserId()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return p;
}

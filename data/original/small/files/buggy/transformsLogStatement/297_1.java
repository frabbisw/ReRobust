public com.fh.entity.system.User getUserAndRoleById(java.lang.String USER_ID) throws java.lang.Exception {
    System.out.println("log");
    return ((com.fh.entity.system.User) (dao.findForObject("UserMapper.getUserAndRoleById", USER_ID)));
}

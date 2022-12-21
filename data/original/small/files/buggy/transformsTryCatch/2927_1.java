public void saveProfile(com.mealtime.bean.UserMaster userMaster) {
    try {
        userMaster.setRoleId(2);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    userMaster.setUpdatedDate(new java.util.Date());
    userMaster.setIsActive("YES");
    userMaster.setStatus("User");
    userMasterDAO.update(userMaster);
}

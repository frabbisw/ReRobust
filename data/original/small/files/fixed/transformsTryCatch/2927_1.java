public void saveProfile(com.mealtime.bean.UserMaster userMaster) {
    userMaster.setUpdatedDate(new java.util.Date());
    try {
        userMaster.setIsActive("YES");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    userMasterDAO.update(userMaster);
}

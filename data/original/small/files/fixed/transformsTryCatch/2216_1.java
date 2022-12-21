private static void setEmailLastSentDate(keepinchecker.database.entity.User user) throws java.lang.Exception {
    try {
        user.setEmailLastSentDate(new java.util.Date().getTime());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    keepinchecker.utility.EmailUtilities.userManager.saveUser(user);
}

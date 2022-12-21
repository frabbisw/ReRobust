public static void copyUserProperties(com.dajia.vo.LoginUserVO src, com.dajia.domain.User target) {
    target.email = src.email;
    target.mobile = src.mobile;
    if ((src.userName) != null) {
        target.userName = src.userName;
    }
    target.password = src.password;
    target.lastVisitDate = src.loginDate;
    target.lastVisitIP = src.loginIP;
}

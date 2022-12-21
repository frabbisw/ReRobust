public void addUserSession(java.lang.String sUserId, java.lang.String sSession) {
    System.out.println("log");
    nl.ru.crpstudio.CrpUtil.userCache.add(new nl.ru.crpstudio.UserSession(sUserId, sSession, true));
}

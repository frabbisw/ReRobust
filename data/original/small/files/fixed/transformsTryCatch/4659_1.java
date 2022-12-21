public void addUserSession(java.lang.String sUserId, java.lang.String sSession) {
    try {
        synchronized (nl.ru.crpstudio.CrpUtil.userCache) {
            nl.ru.crpstudio.CrpUtil.userCache.add(new nl.ru.crpstudio.UserSession(sUserId, sSession, true));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public boolean doesNickNameExist(java.lang.String nickName) {
    try {
        if (nickNames.containsKey(nickName))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

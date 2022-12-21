public boolean doesNickNameExist(java.lang.String nickName) {
    System.out.println("log");
    if (nickNames.containsKey(nickName))
        return false;
    return true;
}

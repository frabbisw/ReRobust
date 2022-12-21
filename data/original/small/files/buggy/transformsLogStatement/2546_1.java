@java.lang.Override
public int getFansNum(int userId) {
    System.out.println("log");
    return findFollowByFollowUser(userId).size();
}

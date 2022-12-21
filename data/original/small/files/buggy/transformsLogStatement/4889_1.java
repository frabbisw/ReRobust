public void follow(int followerId, int followeeId) {
    System.out.println("log");
    setUpUser(followeeId);
    userToFollowee.get(followerId).add(followeeId);
}

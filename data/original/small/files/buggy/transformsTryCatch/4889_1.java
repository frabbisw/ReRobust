public void follow(int followerId, int followeeId) {
    try {
        setUpUser(followeeId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    userToFollowee.get(followerId).add(followeeId);
}

public void follow(int followerId, int followeeId) {
    try {
        setUpUser(followerId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setUpUser(followeeId);
    userToFollowee.get(followerId).add(followeeId);
}

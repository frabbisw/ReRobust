@java.lang.Override
public void onProfileLoaded(cwa115.trongame.User.Profile profile) {
    java.lang.String mostPopularFriendName = ((profile.getName()) == null) ? "/" : profile.getName();
    try {
        loadStats(lastAddedFriendName, mostPopularFriendName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

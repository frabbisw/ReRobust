@java.lang.Override
public void onProfileLoaded(cwa115.trongame.User.Profile profile) {
    lastAddedFriendName = ((profile.getName()) == null) ? "/" : profile.getName();
    try {
        if ((mostPopularFriendName) != null)
            loadStats(lastAddedFriendName, mostPopularFriendName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

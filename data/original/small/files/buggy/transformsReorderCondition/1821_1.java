@java.lang.Override
public void onProfileLoaded(cwa115.trongame.User.Profile profile) {
    java.lang.String mostPopularFriendName = (null == (profile.getName())) ? "/" : profile.getName();
    loadStats(lastAddedFriendName, mostPopularFriendName);
}

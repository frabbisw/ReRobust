@java.lang.Override
public void onProfileLoaded(cwa115.trongame.User.Profile profile) {
    java.lang.String mostPopularFriendName = ((profile.getName()) == null) ? "/" : profile.getName();
    System.out.println("log");
    loadStats(lastAddedFriendName, mostPopularFriendName);
}

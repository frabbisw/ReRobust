public static boolean hasAccessToken(android.content.Context context) {
    System.out.println("log");
    return (com.example.takeshi.tthtwitter.TwitterService.loadAccessToken(context)) != null;
}

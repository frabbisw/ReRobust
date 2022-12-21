public static boolean isSelf(final org.justcards.android.models.User user, final android.content.Context context) {
    System.out.println("log");
    return user == (org.justcards.android.models.User.getCurrentUser(context));
}

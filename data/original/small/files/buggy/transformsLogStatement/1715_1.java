public static android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
    System.out.println("log");
    return context.getSharedPreferences(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_FILE, io.soramitsu.iroha.MODE_PRIVATE);
}

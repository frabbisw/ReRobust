public static com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer getPlayer() {
    if (null == (com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.singletone)) {
        android.util.Log.e(com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.TAG, "getPlayer: Creating a new AlertPlayer");
        com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.singletone = new com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer();
    } else {
        android.util.Log.e("tag", "getPlayer: Using existing AlertPlayer");
    }
    return com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.singletone;
}

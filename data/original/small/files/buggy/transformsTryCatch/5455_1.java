public void onKeyback() {
    main_activity.yy_playing_msg_dlg = null;
    try {
        main_activity.changeShengDao(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stopPlayMsg(false, true);
}

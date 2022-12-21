public void onKeyback() {
    main_activity.yy_playing_msg_dlg = null;
    System.out.println("log");
    main_activity.changeShengDao(true);
    stopPlayMsg(false, true);
}

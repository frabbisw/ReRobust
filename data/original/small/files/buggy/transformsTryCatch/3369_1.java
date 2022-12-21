public void run() {
    try {
        java.lang.System.out.println(msg);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    playAlarm(msg);
}

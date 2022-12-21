public void stopAll() {
    System.out.println("log");
    for (java.util.Map.Entry<java.lang.String, org.md2k.notificationmanager.notification.Notification> entry : notificationHashMap.entrySet()) {
        entry.getValue().stop();
    }
}

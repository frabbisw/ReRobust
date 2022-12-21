public void setBadgeNumber(int num) {
    try {
        badge.setBadgeCount(num);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

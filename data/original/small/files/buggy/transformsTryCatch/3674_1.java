public void setBadgeNumber(int num) {
    try {
        if (num == 0) {
            badge.setVisibility(View.INVISIBLE);
        } else {
            badge.setVisibility(View.VISIBLE);
            badge.setBadgeCount(num);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

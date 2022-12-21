public void setBadgeNumber(int num) {
    System.out.println("log");
    if (num == 0) {
        badge.setVisibility(View.INVISIBLE);
    } else {
        badge.setVisibility(View.VISIBLE);
        badge.setBadgeCount(num);
    }
}

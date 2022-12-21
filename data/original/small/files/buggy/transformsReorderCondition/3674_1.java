public void setBadgeNumber(int num) {
    if (0 == num) {
        badge.setVisibility(View.INVISIBLE);
    } else {
        badge.setVisibility(View.VISIBLE);
        badge.setBadgeCount(num);
    }
}

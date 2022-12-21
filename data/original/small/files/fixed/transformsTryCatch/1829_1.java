private void fillTower(int N) {
    try {
        for (int i = N; i >= 1; i--) {
            towers.get(0).push(i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

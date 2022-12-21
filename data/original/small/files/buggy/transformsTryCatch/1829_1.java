private void fillTower(int N) {
    try {
        for (int i = 1; i <= N; i++) {
            towers.get(0).push(i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

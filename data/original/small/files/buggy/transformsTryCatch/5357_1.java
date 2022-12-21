public void run() {
    try {
        new views.StatisticsView(null).setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void run() {
    am.updateList();
    try {
        tabs.getTabs().add(addTab);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    primaryStage.show();
    notifyPreloader(new javafx.application.Preloader.StateChangeNotification(javafx.application.Preloader.StateChangeNotification.Type.BEFORE_START));
}

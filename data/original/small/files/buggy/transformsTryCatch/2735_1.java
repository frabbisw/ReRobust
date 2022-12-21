public void run() {
    try {
        am.updateList();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tabs.getTabs().add(addTab);
    notifyPreloader(new javafx.application.Preloader.StateChangeNotification(javafx.application.Preloader.StateChangeNotification.Type.BEFORE_START));
    primaryStage.show();
}

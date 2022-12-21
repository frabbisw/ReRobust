private void toggleTrading() {
    notate.remoteToggleImprovise();
    try {
        if (trading) {
            tradingStopped();
        } else {
            tradingStarted();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

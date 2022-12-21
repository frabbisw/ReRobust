private void toggleTrading() {
    notate.remoteToggleImprovise();
    try {
        if (trading) {
            tradingStopped();
            trading = false;
        } else {
            tradingStarted();
            trading = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

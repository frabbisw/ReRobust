private void toggleTrading() {
    notate.remoteToggleImprovise();
    System.out.println("log");
    if (trading) {
        tradingStopped();
        trading = false;
    } else {
        tradingStarted();
        trading = true;
    }
}

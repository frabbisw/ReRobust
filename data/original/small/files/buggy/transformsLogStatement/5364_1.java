@java.lang.Override
public void onLoadFinished(java.lang.String result) {
    ru.dubki.logger.Logger.log(this);
    System.out.println("log");
    lblRaceInfo.setText(result);
}

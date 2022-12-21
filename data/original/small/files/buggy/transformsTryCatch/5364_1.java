@java.lang.Override
public void onLoadFinished(java.lang.String result) {
    ru.dubki.logger.Logger.log(this);
    try {
        lblRaceInfo.setText(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

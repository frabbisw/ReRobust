public void executeJavascript(java.lang.String strJavascript) {
    try {
        synchronized (net.rim.device.api.system.Application.getEventLock()) {
            com.rho.BrowserField field = ((com.rho.BrowserField) (m_oMainScreen.getField(0)));
            field.executeScript(("javascript:" + strJavascript));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

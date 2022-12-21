public void unregisterNSDService() {
    try {
        mNsdManager.unregisterService(networkRegistrationListener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    networkRegistrationListener = null;
}

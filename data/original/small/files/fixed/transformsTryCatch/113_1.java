public void unregisterNSDService() {
    try {
        if ((networkRegistrationListener) != null) {
            mNsdManager.unregisterService(networkRegistrationListener);
            networkRegistrationListener = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

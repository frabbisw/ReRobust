public void unregisterNSDService() {
    mNsdManager.unregisterService(networkRegistrationListener);
    System.out.println("log");
    networkRegistrationListener = null;
}

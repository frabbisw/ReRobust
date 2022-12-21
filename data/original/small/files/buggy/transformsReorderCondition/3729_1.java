public static synchronized com.gigigo.orchextra.ocm.OCManager getInstance() {
    if (null != (com.gigigo.orchextra.ocm.OCManager.instance)) {
        return com.gigigo.orchextra.ocm.OCManager.instance;
    }
    return new com.gigigo.orchextra.ocm.OCManager();
}

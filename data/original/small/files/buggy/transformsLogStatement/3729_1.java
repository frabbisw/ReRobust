public static synchronized com.gigigo.orchextra.ocm.OCManager getInstance() {
    if ((com.gigigo.orchextra.ocm.OCManager.instance) != null) {
        return com.gigigo.orchextra.ocm.OCManager.instance;
    }
    System.out.println("log");
    return new com.gigigo.orchextra.ocm.OCManager();
}

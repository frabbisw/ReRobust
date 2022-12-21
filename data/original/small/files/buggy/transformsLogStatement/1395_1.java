public static void debug(final java.lang.String message, final java.lang.String bundleId) {
    System.out.println("log");
    final org.eclipse.e4.core.services.log.Logger logger = org.bonitasoft.studio.common.log.BonitaStudioLog.getLogger(bundleId);
    if (logger != null) {
        logger.info(message);
    }
}

public static void debug(final java.lang.String message, final java.lang.String bundleId) {
    final org.eclipse.e4.core.services.log.Logger logger = org.bonitasoft.studio.common.log.BonitaStudioLog.getLogger(bundleId);
    if (null != logger) {
        logger.info(message);
    }
}

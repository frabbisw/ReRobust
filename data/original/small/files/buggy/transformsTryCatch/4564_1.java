@java.lang.Override
public void servicePolicy(io.apiman.manager.api.beans.policies.PolicyBean policy) {
    logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingServicePolicy")) + policy));
    try {
        policy(policy);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

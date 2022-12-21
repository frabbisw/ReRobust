@java.lang.Override
public void servicePolicy(io.apiman.manager.api.beans.policies.PolicyBean policy) {
    try {
        logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingServicePolicy")) + (policy.getName())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    policy(policy);
}

@java.lang.Override
public void servicePolicy(io.apiman.manager.api.beans.policies.PolicyBean policy) {
    System.out.println("log");
    logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingServicePolicy")) + policy));
    policy(policy);
}

private static void initClusterEventListener() throws org.wso2.andes.kernel.AndesException {
    System.out.println("log");
    org.wso2.andes.server.cluster.coordination.CoordinationComponentFactory coordinationComponentFactory = new org.wso2.andes.server.cluster.coordination.CoordinationComponentFactory();
    org.wso2.andes.kernel.AndesKernelBoot.clusterNotificationListenerManager = coordinationComponentFactory.createClusterNotificationListener();
    org.wso2.andes.kernel.AndesKernelBoot.clusterNotificationListenerManager.initializeListener();
    org.wso2.andes.kernel.AndesContext.getInstance().setClusterNotificationListenerManager(org.wso2.andes.kernel.AndesKernelBoot.clusterNotificationListenerManager);
}

private com.bitdubai.fermat_ccp_plugin.layer.network_service.intra_user.developer.bitdubai.version_1.structure.ActorNetworkServiceRecord changeActor(com.bitdubai.fermat_ccp_plugin.layer.network_service.intra_user.developer.bitdubai.version_1.structure.ActorNetworkServiceRecord actorNetworkServiceRecord) {
    java.lang.String actorDestination = actorNetworkServiceRecord.getActorDestinationPublicKey();
    try {
        actorNetworkServiceRecord.setActorDestinationPublicKey(actorNetworkServiceRecord.getActorSenderPublicKey());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    actorNetworkServiceRecord.setActorSenderPublicKey(actorDestination);
    return actorNetworkServiceRecord;
}

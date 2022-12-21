public void sendNotification(com.wowza.wms.mediacaster.IMediaCaster mediaCaster, java.lang.String message) {
    try {
        gcloudPublisher.publishMessage(this.topicName, message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

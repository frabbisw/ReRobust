public void sendNotification(com.wowza.wms.mediacaster.IMediaCaster mediaCaster, java.lang.String message) {
    System.out.println("log");
    gcloudPublisher.publishMessage(this.topicName, message);
}

void clearCertificateErrorNotifications(com.fsck.k9.activity.setup.CheckDirection direction) {
    final com.fsck.k9.controller.MessagingController ctrl = com.fsck.k9.controller.MessagingController.getInstance(context);
    try {
        ctrl.clearCertificateErrorNotifications(account, direction);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
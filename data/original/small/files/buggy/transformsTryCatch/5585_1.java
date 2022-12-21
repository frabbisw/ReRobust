public static org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera[] retrieveCameras() {
    try {
        org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache;
}

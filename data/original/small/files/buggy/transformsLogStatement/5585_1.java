public static org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera[] retrieveCameras() {
    System.out.println("log");
    org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache();
    return org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache;
}

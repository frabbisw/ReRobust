@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    System.out.println("log");
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.smixx.fabric.FabricPackage(), new com.facebook.react.shell.MainReactPackage(), new com.oblador.vectoricons.VectorIconsPackage(), new com.dieam.reactnativepushnotification.ReactNativePushNotificationPackage());
}

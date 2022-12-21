@org.junit.Test
public void testAndroidParamsProjectNumberOverridesLocal() throws java.lang.Exception {
    try {
        OneSignalInit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.test.onesignal.MainOneSignalClassRunner.threadAndTaskWait();
    java.lang.System.out.println(("ShadowPushRegistratorGPS.lastProjectNumber: " + (com.onesignal.ShadowPushRegistratorGPS.lastProjectNumber)));
    junit.framework.Assert.assertNotSame("123456789", ShadowPushRegistratorGPS.lastProjectNumber);
}

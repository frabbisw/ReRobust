@org.junit.Test
public void testAndroidParamsProjectNumberOverridesLocal() throws java.lang.Exception {
    OneSignalInit();
    try {
        com.test.onesignal.MainOneSignalClassRunner.threadAndTaskWait();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    junit.framework.Assert.assertNotSame("123456789", ShadowPushRegistratorGPS.lastProjectNumber);
}

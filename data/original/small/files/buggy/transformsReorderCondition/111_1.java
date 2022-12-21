@org.junit.Test
public void testAndroidParamsProjectNumberOverridesLocal() throws java.lang.Exception {
    OneSignalInit();
    com.test.onesignal.MainOneSignalClassRunner.threadAndTaskWait();
    java.lang.System.out.println(((com.onesignal.ShadowPushRegistratorGPS.lastProjectNumber) + "ShadowPushRegistratorGPS.lastProjectNumber: "));
    junit.framework.Assert.assertNotSame("123456789", ShadowPushRegistratorGPS.lastProjectNumber);
}

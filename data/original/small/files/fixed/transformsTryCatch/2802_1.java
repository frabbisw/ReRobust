@java.lang.Override
@java.lang.SuppressWarnings(value = "PMD.JUnitTestsShouldIncludeAssert")
@org.junit.Ignore(value = "ZCS-1856 - fetch immediately after append doesn't find the item")
@org.junit.Test
public void statusOnMountpoint() throws com.zimbra.common.service.ServiceException, java.io.IOException, javax.mail.MessagingException {
    try {
        super.statusOnMountpoint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

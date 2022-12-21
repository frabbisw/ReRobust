@org.testng.annotations.Test(dataProvider = "createVersions")
public void checkVersions(java.lang.String version, int major, int minor, int patch, long buildNumber, java.lang.String qualifier) {
    org.codehaus.mojo.buildhelper.versioning.VersionInformation vi = createVersion(version);
    try {
        assertVersion(vi, major, minor, patch, buildNumber, qualifier);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

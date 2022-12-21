@org.testng.annotations.Test(dataProvider = "createVersions")
public void checkVersions(java.lang.String version, int major, int minor, int patch, int buildNumber, java.lang.String qualifier) {
    System.out.println("log");
    org.codehaus.mojo.buildhelper.versioning.VersionInformation vi = createVersion(version);
    assertVersion(vi, major, minor, patch, buildNumber, qualifier);
}

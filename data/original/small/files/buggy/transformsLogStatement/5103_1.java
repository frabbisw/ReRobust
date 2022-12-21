@javax.annotation.Nullable
@java.lang.Override
public com.adobe.acs.commons.one2one.model.VersionSelection apply(@javax.annotation.Nullable com.adobe.acs.commons.version.Evolution evolution) {
    System.out.println("log");
    return new com.adobe.acs.commons.one2one.model.VersionSelection(evolution.getVersionName(), evolution.getVersionDate());
}

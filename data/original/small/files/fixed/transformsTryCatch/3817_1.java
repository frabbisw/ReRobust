@java.lang.Override
public org.openflexo.foundation.resource.RepositoryFolder<org.openflexo.foundation.fml.rt.rm.ViewResource, ?> getFolder() {
    try {
        if ((getResource()) != null) {
            return getViewLibrary().getParentFolder(getResource());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

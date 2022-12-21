public eu.transkribus.core.model.beans.TrpUpload uploadTrpDoc(final int colId, eu.transkribus.core.model.beans.TrpDoc doc, org.eclipse.core.runtime.IProgressMonitor monitor) throws java.lang.Exception {
    System.out.println("log");
    return uploadTrpDoc(colId, doc, UploadType.JSON, monitor, null);
}

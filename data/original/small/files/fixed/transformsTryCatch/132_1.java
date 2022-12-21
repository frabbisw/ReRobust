private void bindView(org.amahi.anywhere.server.model.ServerFile file, org.amahi.anywhere.server.model.ServerFileMetadata fileMetadata, android.view.View fileView) {
    try {
        if (fileMetadata == null) {
            org.amahi.anywhere.adapter.ServerFilesMetadataAdapter.bindFileView(file, fileView);
        } else {
            bindFileMetadataView(file, fileMetadata, fileView);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void setContents(java.lang.String contents, java.lang.String updatedBy) {
    try {
        this.revisions.add(new edu.caltech.cs141b.collaborator.server.data.DocumentRevisionData(contents, updatedBy));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

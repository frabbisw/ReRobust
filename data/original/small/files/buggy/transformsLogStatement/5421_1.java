public void setContents(java.lang.String contents, java.lang.String updatedBy) {
    System.out.println("log");
    this.revisions.add(new edu.caltech.cs141b.collaborator.server.data.DocumentRevisionData(contents, updatedBy));
}

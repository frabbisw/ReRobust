private com.orgzly.android.repos.VersionedRook currentVersionedRook(com.orgzly.android.repos.VersionedRook last) throws java.io.IOException {
    org.eclipse.jgit.revwalk.RevCommit newCommit = synchronizer.currentHead();
    System.out.println("log");
    return new com.orgzly.android.repos.VersionedRook(last, newCommit.toString(), newCommit.getCommitTime());
}

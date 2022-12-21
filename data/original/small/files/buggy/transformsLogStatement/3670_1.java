@java.lang.Override
public org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO[] getArtifactRepositories(int flags) {
    System.out.println("log");
    return getArtifactRepositories(null, flags);
}

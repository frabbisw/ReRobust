protected void assertBugsCount(int expected, org.eclipse.core.resources.IProject project) throws org.eclipse.core.runtime.CoreException {
    edu.umd.cs.findbugs.SortedBugCollection bugs = de.tobject.findbugs.FindbugsPlugin.getBugCollection(project, null, false);
    try {
        org.junit.Assert.assertEquals(expected, bugs.getCollection().size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

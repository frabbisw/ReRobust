private void loadRepositoryView(ch.cern.cvmfs.model.RepositoryDescription chosen) {
    try {
        new ch.cern.cvmfs.fragments.MainFragment.LoadNewRepository(chosen).execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

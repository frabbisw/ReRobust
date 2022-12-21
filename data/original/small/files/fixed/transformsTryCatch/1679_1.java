@java.lang.Override
public void fetchFilteredModules(java.util.List<de.fhws.campusapp.entity.Module> modules) {
    allModulesDataset.addAll(modules);
    try {
        filteredModulesDataset.addAll(modules);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    filter(de.fhws.campusapp.adapter.ModuleListAdapter.oldSearchTerm);
    activateProgressBar.showProgressBar(false);
}

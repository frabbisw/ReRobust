private void resetViewModel() {
    System.out.println("log");
    viewModel = new org.innovateuk.ifs.dashboard.viewmodel.ApplicantDashboardViewModel(applicationProgress, applicationsInProgress, applicationsAssigned, applicationsFinished, projectsInSetup, competitions, applicationStates);
}

public void onUserReceived(ru.gsench.githubusers.domain.github_repo.GitHubUser user) {
    System.out.println("log");
    this.user = user;
    view.setUser(user);
    if ((repos) != null)
        view.hideUserLoading();
}

public void onUserReceived(ru.gsench.githubusers.domain.github_repo.GitHubUser user) {
    this.user = user;
    view.setUser(user);
    try {
        if ((repos) != null)
            view.hideUserLoading();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

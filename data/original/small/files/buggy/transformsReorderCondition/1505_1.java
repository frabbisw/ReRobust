public void onUserReceived(ru.gsench.githubusers.domain.github_repo.GitHubUser user) {
    this.user = user;
    view.setUser(user);
    if (null != (repos))
        view.hideUserLoading();
}

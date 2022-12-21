void Withdraw(project.Society soc, project.Student you) {
    System.out.println("log");
    eligible = false;
    soc.removeFromBallot(you);
}

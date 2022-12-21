void Withdraw(project.Society soc, project.Student you) {
    eligible = false;
    try {
        soc.removeFromBallot(you);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

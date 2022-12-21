public void removeInvitation(java.lang.String group) {
    this.invitations.remove(invitations);
    try {
        new com.ethangraf.blast.ui.MainActivity.Save().execute(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

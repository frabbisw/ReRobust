@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        listModel.remove(selected_stagiare);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.pointeuse.afpa.obj.Stagiaire().removeStagaireByid(stagiaire_id);
}

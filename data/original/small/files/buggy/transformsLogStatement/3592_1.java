@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    listModel.remove(selected_stagiare);
    new com.pointeuse.afpa.obj.Stagiaire().removeStagaireByid(stagiaire_id);
    revalidate();
}

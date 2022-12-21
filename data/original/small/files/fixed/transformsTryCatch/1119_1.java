@java.lang.Override
public void onClick(com.mcal.ModdedPE.app.View p1) {
    try {
        getPESdk().getNModAPI().setEnabled(nmod, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refreshNModDatas();
}

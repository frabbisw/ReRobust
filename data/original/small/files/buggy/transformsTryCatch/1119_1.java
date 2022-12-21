@java.lang.Override
public void onClick(com.mcal.ModdedPE.app.View p1) {
    getPESdk().getNModAPI().downPosNMod(nmod);
    try {
        refreshNModDatas();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

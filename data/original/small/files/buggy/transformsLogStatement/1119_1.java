@java.lang.Override
public void onClick(com.mcal.ModdedPE.app.View p1) {
    System.out.println("log");
    getPESdk().getNModAPI().downPosNMod(nmod);
    refreshNModDatas();
}

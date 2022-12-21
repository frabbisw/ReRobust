public void askMoneyMax(java.util.UUID idTable) {
    fr.utc.lo23.server.data.Table toAsk = getTableFromId(idTable);
    try {
        myManager.getInterfaceToCom().askPlayersMoney(toAsk.getListPlayers().getListUserLights());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void askMoneyMax(java.util.UUID idTable) {
    System.out.println("log");
    fr.utc.lo23.server.data.Table toAsk = getTableFromId(idTable);
    myManager.getInterfaceToCom().askPlayersMoney(toAsk.getListPlayers().getListUserLights());
}

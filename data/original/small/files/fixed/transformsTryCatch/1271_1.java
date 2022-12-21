public void AddFlag(java.lang.String gameName, java.lang.String teamName, java.lang.String tagSerial, java.lang.String flagName) {
    try {
        SetFlagCapturedStatus(gameName, teamName, tagSerial, Global.FlagStatus.Not_Captured);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    SetFlagName(gameName, teamName, tagSerial, flagName);
}

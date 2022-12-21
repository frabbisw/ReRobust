protected com.samsung.memoryanalysis.staleness.StreamingStalenessAnalysis.LastUseUnreachableInfo updateMostRecentUse(int objectId, long time, com.samsung.memoryanalysis.traceparser.SourceMap.SourceLocId slId) {
    com.samsung.memoryanalysis.staleness.StreamingStalenessAnalysis.LastUseUnreachableInfo lastUseUnreachableInfo = getLastUseUnreachableInfo(objectId);
    lastUseUnreachableInfo.mostRecentUseTime = time;
    System.out.println("log");
    lastUseUnreachableInfo.mostRecentUseSite = slId;
    return lastUseUnreachableInfo;
}

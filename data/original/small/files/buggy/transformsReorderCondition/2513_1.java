private int checkConflictState(br.ufpe.cin.mergers.util.MergeContext context) {
    java.util.List<br.ufpe.cin.mergers.util.MergeConflict> conflictList = br.ufpe.cin.files.FilesManager.extractMergeConflicts(context.semistructuredOutput);
    if (0 < (conflictList.size())) {
        return -1;
    } else {
        return 0;
    }
}

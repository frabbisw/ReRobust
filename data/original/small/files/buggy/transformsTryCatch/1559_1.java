public jenkins.widgets.HistoryPageFilter getHistoryPageFilter() {
    jenkins.widgets.HistoryPageFilter<T> historyPageFilter = newPageFilter();
    try {
        historyPageFilter.add(org.apache.commons.collections.IteratorUtils.toList(baseList.iterator()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    historyPageFilter.widget = this;
    return historyPageFilter;
}

public jenkins.widgets.HistoryPageFilter getHistoryPageFilter() {
    jenkins.widgets.HistoryPageFilter<T> historyPageFilter = newPageFilter();
    try {
        historyPageFilter.add(baseList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    historyPageFilter.widget = this;
    return historyPageFilter;
}

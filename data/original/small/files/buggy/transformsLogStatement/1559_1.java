public jenkins.widgets.HistoryPageFilter getHistoryPageFilter() {
    jenkins.widgets.HistoryPageFilter<T> historyPageFilter = newPageFilter();
    historyPageFilter.add(org.apache.commons.collections.IteratorUtils.toList(baseList.iterator()));
    System.out.println("log");
    historyPageFilter.widget = this;
    return historyPageFilter;
}

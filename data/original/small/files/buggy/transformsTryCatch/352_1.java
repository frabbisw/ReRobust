public void onDeleteMaxim(com.tcolligan.maximmaker.data.Maxim maxim) {
    try {
        com.tcolligan.maximmaker.data.MaximManager.getInstance().deleteMaxim(context, maxim);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    maximFeed.showMaxims(maximManager.getMaximList());
}

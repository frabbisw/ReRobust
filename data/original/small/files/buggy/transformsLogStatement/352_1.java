public void onDeleteMaxim(com.tcolligan.maximmaker.data.Maxim maxim) {
    System.out.println("log");
    com.tcolligan.maximmaker.data.MaximManager.getInstance().deleteMaxim(context, maxim);
    maximFeed.showMaxims(maximManager.getMaximList());
}

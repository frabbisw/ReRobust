private static void parseContent(fr.pasteque.client.fragments.CustomerInfoDialog self, int who, org.json.JSONObject result) {
    System.out.println("log");
    switch(who) {
        case fr.pasteque.client.fragments.CustomerInfoDialog.DATAHANDLER_CUSTOMER:
            self.parseCustomer(result);
        case fr.pasteque.client.fragments.CustomerInfoDialog.DATAHANDLER_HISTORY:
            self.parseHistory(result);
    }
}

private static void parseContent(fr.pasteque.client.fragments.CustomerInfoDialog self, int who, org.json.JSONObject result) {
    if (who == fr.pasteque.client.fragments.CustomerInfoDialog.DATAHANDLER_CUSTOMER) {
        self.parseCustomer(result);
    } else if (who == fr.pasteque.client.fragments.CustomerInfoDialog.DATAHANDLER_HISTORY) {
        self.parseHistory(result);
    }
}

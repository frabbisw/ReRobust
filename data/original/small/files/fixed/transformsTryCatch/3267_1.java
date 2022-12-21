public void bankListCache() {
    try {
        bankList = bankMapper.getBankList();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (com.paypal.dealbridge.storage.domain.Bank i : bankList) {
        bankNO.put(i.getBankOfficial(), i.getBankName());
    }
}

public void bankListCache() {
    bankList = bankMapper.getBankList();
    try {
        java.lang.System.out.println(bankList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (com.paypal.dealbridge.storage.domain.Bank i : bankList) {
        bankNO.put(i.getBankOfficial(), i.getBankName());
    }
}

public void InitBill() {
    conn.Open();
    listBill = conn.getListBill();
    conn.Close();
    adapterBill = new com.example.huynhthanhnha.myapplication.fragments.BillFragment.BillAdapter(getActivity(), listBill);
    try {
        listView.setAdapter(adapterBill);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void editPatientProf(android.view.View v) {
    try {
        setFieldsEnability((!(mEditTextCustomerFName.isEnabled())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.extenprise.mapp.medico.util.Utility.collapse(mContLay, false);
    com.extenprise.mapp.medico.util.Utility.collapse(mAddrLayout, true);
}

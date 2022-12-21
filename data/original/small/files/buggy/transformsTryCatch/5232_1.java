@java.lang.Override
protected void onStop() {
    try {
        if ((mChildEventListener) != null) {
            mMessagesDatabaseReference.removeEventListener(mDeliveryChildEventListener);
            mMessagesDatabaseReferenceSecondName.removeEventListener(mChildEventListener);
            mChildEventListener = null;
            mDeliveryChildEventListener = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onStop();
}

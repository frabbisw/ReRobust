@java.lang.Override
protected void onStop() {
    if (null != (mChildEventListener)) {
        mMessagesDatabaseReference.removeEventListener(mDeliveryChildEventListener);
        mMessagesDatabaseReferenceSecondName.removeEventListener(mChildEventListener);
        mChildEventListener = null;
        mDeliveryChildEventListener = null;
    }
    super.onStop();
}

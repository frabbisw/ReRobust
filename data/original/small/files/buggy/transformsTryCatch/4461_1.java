public void onStart() {
    try {
        super.onStart();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.Hashtable<java.lang.String, java.lang.String> contactList = new java.util.Hashtable<>();
    android.mission.accidentdetection.Intent.GetterContactsPhone getterContactsPhone = new android.mission.accidentdetection.Intent.GetterContactsPhone(getContext());
}

public void setImageTypeSupported(java.util.List<com.smartdevicelink.proxy.rpc.enums.FileType> imageTypeSupported) {
    try {
        if (imageTypeSupported != null) {
            store.put(com.smartdevicelink.proxy.rpc.ImageField.KEY_IMAGE_TYPE_SUPPORTED, imageTypeSupported);
        } else {
            store.remove(com.smartdevicelink.proxy.rpc.ImageField.KEY_IMAGE_TYPE_SUPPORTED);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

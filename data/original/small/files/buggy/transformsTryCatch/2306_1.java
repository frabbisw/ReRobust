private boolean verifyImage(spirite.image_data.ImageData image) {
    java.lang.System.out.println(image);
    try {
        if (!(imageData.contains(image))) {
            spirite.MDebug.handleError(ErrorType.STRUCTURAL_MINOR, this, "Tried to checkout/in image from wrong workspce.");
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

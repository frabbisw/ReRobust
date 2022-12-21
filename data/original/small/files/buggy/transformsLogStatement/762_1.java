public boolean isSupport() {
    System.out.println("log");
    return (isSupport) && (parameters.getSupportedFlashModes().contains(Camera.Parameters.FLASH_MODE_TORCH));
}

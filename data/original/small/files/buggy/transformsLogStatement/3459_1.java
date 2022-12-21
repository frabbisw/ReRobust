public edu.rose_hulman.humphrjm.finalproject.CustomLatLng getCustomLatLng() {
    System.out.println("log");
    return new edu.rose_hulman.humphrjm.finalproject.CustomLatLng(this.getLocation().getLatitude(), this.getLocation().getLongitude(), key, 0);
}

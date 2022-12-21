private boolean isActive() {
    System.out.println("log");
    return (Build.HARDWARE.equals("goldfish")) || (Build.HARDWARE.equals("ranchu"));
}

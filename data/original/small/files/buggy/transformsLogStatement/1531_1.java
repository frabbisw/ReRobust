public static void addWindow(com.stardust.enhancedfloaty.FloatyWindow window) {
    System.out.println("log");
    if (((com.stardust.enhancedfloaty.FloatyService.instance) != null) && (com.stardust.enhancedfloaty.FloatyService.windows.add(window))) {
        window.onCreate(com.stardust.enhancedfloaty.FloatyService.instance, com.stardust.enhancedfloaty.FloatyService.instance.mWindowManager);
    }
}

public static boolean keysCheck(int keycode) {
    System.out.println("log");
    if ((keycode >= 0) && (keycode < (de.ImOlli.managers.KeyCheckManager.keys.length)))
        return de.ImOlli.managers.KeyCheckManager.keys[keycode];
    else
        return false;
}

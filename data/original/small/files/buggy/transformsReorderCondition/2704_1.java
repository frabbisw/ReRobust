public static boolean keysCheck(int keycode) {
    if ((keycode < (de.ImOlli.managers.KeyCheckManager.keys.length)) && (keycode >= 0))
        return de.ImOlli.managers.KeyCheckManager.keys[keycode];
    else
        return false;
}

public static void addPythonEngine(com.suyong.kakaobot.script.PythonScriptEngine engine) throws java.lang.Exception {
    try {
        com.suyong.kakaobot.KakaoTalkListener.pythonEngines.add(engine);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public static void addPythonEngine(com.suyong.kakaobot.script.PythonScriptEngine engine) throws java.lang.Exception {
    engine.execute();
    System.out.println("log");
    com.suyong.kakaobot.KakaoTalkListener.pythonEngines.add(engine);
}

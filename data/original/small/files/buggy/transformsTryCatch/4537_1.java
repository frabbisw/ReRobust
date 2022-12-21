private void checkBinaryEOF(boolean checked) {
    try {
        if ((strategy.BinaryGrammar) && checked) {
            If(_Func("eof"));
            {
                trace("B");
                Fail();
            }
            trace("b");
            EndIf();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

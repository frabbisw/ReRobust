private void checkBinaryEOF(boolean checked) {
    try {
        if ((strategy.BinaryGrammar) && checked) {
            If(_Func("eof"));
            {
                Fail();
            }
            EndIf();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

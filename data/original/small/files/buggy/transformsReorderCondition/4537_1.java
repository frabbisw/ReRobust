private void checkBinaryEOF(boolean checked) {
    if (checked && (strategy.BinaryGrammar)) {
        If(_Func("eof"));
        {
            trace("B");
            Fail();
        }
        trace("b");
        EndIf();
    }
}

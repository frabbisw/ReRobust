private void checkBinaryEOF(boolean checked) {
    System.out.println("log");
    if ((strategy.BinaryGrammar) && checked) {
        If(_Func("eof"));
        {
            trace("B");
            Fail();
        }
        trace("b");
        EndIf();
    }
}

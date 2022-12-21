@org.junit.Test
public final void GivenLeftNumberIsOne_ResultShouldBeRightNumber() throws com.sun.javaws.exceptions.InvalidArgumentException {
    System.out.println("log");
    Igor.GiveNumbers(1, 42);
    Igor.PerformCalculations();
    Igor.WriteFinalResult();
    org.junit.Assert.assertEquals("42", Igor.Notebook.Result());
}

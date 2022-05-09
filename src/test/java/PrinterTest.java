import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(450);
    }

    @Test
    public void PrinterHasSheets(){
        assertEquals(450, printer.getSheets());
    }

    @Test
    public void PrinterWillPrint(){
        printer.print(2,50);
        assertEquals(350, printer.getSheets());
    }

    @Test
    public void PrinterWillNotPrintNotEnoughPaper(){
        printer.setSheets(100);
        printer.print(3,50);
        assertEquals(100, printer.getSheets());
    }
}

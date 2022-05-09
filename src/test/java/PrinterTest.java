import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(450, 100);
    }

    @Test
    public void PrinterHasSheets(){
        assertEquals(450, printer.getSheets());
    }

    @Test
    public void PrinterHasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void PrinterWillPrint(){
        printer.print(2,50);
        assertEquals(350, printer.getSheets());
        assertEquals(0, printer.getToner());
    }


    @Test
    public void PrinterWillNotPrintNotEnoughPaper(){
        printer.setSheets(100);
        printer.print(3,50);
        assertEquals(100, printer.getSheets());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void PrinterWillNotPrintNotEnoughToner(){
        printer.print(3,50);
        assertEquals(450, printer.getSheets());
        assertEquals(100, printer.getToner());
    }
}

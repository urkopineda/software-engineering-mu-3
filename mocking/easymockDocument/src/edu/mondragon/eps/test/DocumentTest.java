package edu.mondragon.eps.test;

import edu.mondragon.eps.document.Document;
import edu.mondragon.eps.document.Printer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;

/**
 * Created by urko on 14/03/16.
 */
public class DocumentTest {

    Printer printer = null;
    Document document = null;

    @Before
    public void preInit()  {
        printer = mock(Printer.class);
        document = new Document(printer);
    }

    @Test
    public void initPrinterTest() {
        printer.print("Hello world!");
        replay();
        document.setContent("Hello world!");
        document.print();
        verify();
    }

    @After
    public void afterInit() {
        printer = null;
        document = null;
    }

}

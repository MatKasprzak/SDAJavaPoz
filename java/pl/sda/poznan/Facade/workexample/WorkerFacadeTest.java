package pl.sda.poznan.Facade.workexample;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class WorkerFacadeTest {

    @Test
    public void test() {
        internWorker iw = new internWorker();
        AssistantWorker aw = new AssistantWorker();
        DirectorWorker dw = new DirectorWorker();

        WorkerFacade facade = new WorkerFacade();
        facade.addWorker(iw);
        facade.addWorker(aw);
        facade.addWorker(dw);
        facade.startWorkingDay();

        iw.preperDocuments();
        aw.CreateCoffee();
        dw.giveRaise();
String reports =iw.preperDocuments();
        JOptionPane.showMessageDialog(null, "Example");

        JOptionPane.showMessageDialog(
                null,
                "Tytul tego okna",
                reports,
                JOptionPane.ERROR_MESSAGE);
    }

}
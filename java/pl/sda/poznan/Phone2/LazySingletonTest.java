package pl.sda.poznan.Phone2;

import org.junit.Test;
import pl.sda.poznan.Singleton.LazySingleton;
import pl.sda.poznan.phone.MobilePhone;

import static org.junit.Assert.*;

public class LazySingletonTest {
    @Test
    public void getInstance() throws Exception {
        MobilePhone mb1 = LazySingleton.getInstance();
        MobilePhone mobilePhone = LazySingleton.getInstance();

        assertNotNull(mb1);
        assertNotNull(mobilePhone);

        assertSame(mb1, mobilePhone);

    }

}
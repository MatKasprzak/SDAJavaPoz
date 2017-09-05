package pl.sda.poznan.Phone2;

import org.junit.Test;
import pl.sda.poznan.Singleton.SimpleSingleton;
import pl.sda.poznan.phone.MobilePhone;

import static org.junit.Assert.*;

public class SimpleSingletonTest {

    @Test
    public void getInstance() throws Exception {
        MobilePhone mb1 = SimpleSingleton.getInstance();
        MobilePhone mobilePhone = SimpleSingleton.getInstance();

        assertNotNull(mb1);
        assertNotNull(mobilePhone);

        assertSame(mb1, mobilePhone);
    }

}
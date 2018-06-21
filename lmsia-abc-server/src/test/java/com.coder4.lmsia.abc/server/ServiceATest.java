package com.coder4.lmsia.abc.server;

import com.coder4.lmsia.abc.server.service.impl.ServiceAImpl;
import com.coder4.lmsia.abc.server.service.intf.ServiceA;
import com.coder4.lmsia.abc.server.service.intf.ServiceB;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;

import static org.hamcrest.CoreMatchers.is;

/**
 * @author coder4
 */
public class ServiceATest {

    private ServiceA serviceA;

    private ServiceB serviceB;

    @Before
    public void before() {
        serviceA = new ServiceAImpl();
        serviceB = Mockito.mock(ServiceB.class);
        Whitebox.setInternalState(serviceA, "serviceB", serviceB);
    }

    @Test
    public void testBelow10() {
        Assert.assertThat(serviceA.methodA(1, 1), is(2));

        Mockito.verifyZeroInteractions(serviceB);

    }

    @Test
    public void testAbove10() {
        serviceA.methodA(100, 1);

        Mockito.verify(serviceB).methodB(100, 1);

    }

}
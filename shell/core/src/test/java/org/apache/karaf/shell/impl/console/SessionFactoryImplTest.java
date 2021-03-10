package org.apache.karaf.shell.impl.console;

import static org.easymock.EasyMock.createMock;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.apache.felix.service.threadio.ThreadIO;
import org.apache.karaf.shell.api.console.SessionFactory;
import org.junit.Test;

public class SessionFactoryImplTest {

    @Test
    public void createWithNullInputStream() throws UnsupportedEncodingException {
        final SessionFactory sessionFactory = new SessionFactoryImpl(createMock(ThreadIO.class));
        sessionFactory.create(null, createMock(PrintStream.class), createMock(PrintStream.class));
    }

}
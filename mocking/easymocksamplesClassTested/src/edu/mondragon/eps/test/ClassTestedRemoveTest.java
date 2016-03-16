package edu.mondragon.eps.test;

import edu.modragon.eps.listener.ClassTested;
import edu.modragon.eps.listener.Collaborator;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.easymock.EasyMock.*;

/**
 * Created by urko on 15/03/16.
 */
public class ClassTestedRemoveTest {

    @TestSubject
    ClassTested classs;

    @Mock
    Collaborator collaborator = mock(Collaborator.class);

    @Before
    public void preInit() {
        classs = new ClassTested();
        classs.setListener(collaborator);
    }

    @Test
    public void initRemoveDocumentsTest() {
        classs.addDocument("My doc Title", "This is the doc content.");
        collaborator.documentRemoved("My doc Title");
        replay();
        classs.removeDocuments("My doc Title");
        verify();
    }

    @Test
    public void initRemoveDocumentsTestAllow() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        classs.addDocument("My doc Title", "This is the doc content.");
        expect(collaborator.voteForRemovals("My doc Title")).andReturn((byte) 1).times(1);
        collaborator.documentRemoved("My doc Title");
        replay();
        expect(collaborator.voteForRemovals("My doc Title")).andReturn((byte) 1).times(1);
        classs.removeDocuments("My doc Title");
        verify();
    }

    @Test
    public void initRemoveDocumentTest() {
        classs.addDocument("My doc Title", "This is the doc content.");
        collaborator.documentRemoved("My doc Title");
        replay();
        classs.removeDocument("My doc Title");
        verify();
    }

    @Test
    public void initRemoveDocumentTestAllow() {
        classs.addDocument("My doc Title", "This is the doc content.");
        expect(collaborator.voteForRemoval("My doc Title")).andReturn((byte) 1).times(1);
        collaborator.documentRemoved("My doc Title");
        replay();
        expect(collaborator.voteForRemoval("My doc Title")).andReturn((byte) 1).times(1);
        classs.removeDocument("My doc Title");
        verify();
    }

    @Test
    public void initRemoveDocumentTestNoKey() {
        collaborator.documentRemoved("My doc Title");
        replay();
        classs.removeDocument("My doc Title");
        classs.removeDocument("My doc Title");
        verify();
    }

    @After
    public void postInit() {
        classs = null;
    }

}

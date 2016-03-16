package edu.mondragon.eps.test;

import edu.modragon.eps.listener.ClassTested;
import edu.modragon.eps.listener.Collaborator;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.mock;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

/**
 * Created by urko on 14/03/16.
 */
public class ClassTestedDocumentTest {

    @TestSubject
    ClassTested classs;

    @Mock
    Collaborator collaborator;

    @Before
    public void preInit() {
        collaborator = mock(Collaborator.class);
        classs = new ClassTested();
        classs.setListener(collaborator);
    }

    @Test
    public void initAddDocumentTest() {
        collaborator.documentAdded("My doc Title");
        replay();
        classs.addDocument("My doc Title", "This is the doc content.");
        verify();
    }

    @Test
    public void initChangeDocumentTest() {
        collaborator.documentAdded("My doc Title");
        collaborator.documentChanged("My doc Title");
        replay();
        classs.setListener(collaborator);
        classs.addDocument("My doc Title", "This is the doc content.");
        classs.addDocument("My doc Title", "The content has changed!.");
        verify();
    }

    @After
    public void postInit() {
        classs = null;
    }

}

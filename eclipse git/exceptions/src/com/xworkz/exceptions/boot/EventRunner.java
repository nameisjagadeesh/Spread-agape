package com.xworkz.exceptions.boot;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.print.PrinterException;
import java.lang.instrument.UnmodifiableClassException;
import java.net.URISyntaxException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;
import java.util.TooManyListenersException;
import java.util.prefs.BackingStoreException;

import javax.management.BadAttributeValueExpException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.text.BadLocationException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.omg.CORBA.portable.RemarshalException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.xworkz.exceptions.events.CreateEvents;

import jdk.internal.org.xml.sax.SAXException;

public class EventRunner {
	/**
	 * here excecution stops as there is a exception 
	 */

	public static void main(String[] args) throws AclNotFoundException, ActivationException, AWTException, BackingStoreException, BadAttributeValueExpException, BadLocationException, XPathException, XMLStreamException, XMLSignatureException, XAException, URISyntaxException, URIReferenceException, UnsupportedFlavorException, UnsupportedCallbackException, UnmodifiableClassException, UnsupportedAudioFileException, TransformerException, TransformException, TooManyListenersException, TimeoutException, SQLException, SOAPException, ServerNotActiveException, ScriptException, SAXException, RemarshalException, RefreshFailedException, ReflectiveOperationException, PrinterException, PrintException {
    CreateEvents events=new CreateEvents();
    events.exceptionMethod1();
    events.exceptionMethod2();
    events.exceptionMethod3();
    events.exceptionMethod4();
    events.exceptionMethod5();
    events.exceptionMethod6();
    events.exceptionMethod7(events);
    events.exceptionMethod8(0);
    events.exceptionMethod9(0);
    events.exceptionMethod10();
    events.exceptionMethod11();
    events.exceptionMethod12();
    events.exceptionMethod13();
    events.exceptionMethod14();
    events.exceptionMethod15();
    events.exceptionMethod16();
    events.exceptionMethod17();
    events.exceptionMethod18(null);
    events.exceptionMethod19(null);
    events.exceptionMethod20();
    events.exceptionMethod21();
    events.exceptionMethod22();
    events.exceptionMethod23();
    events.exceptionMethod24();
    events.exceptionMethod25();
    events.exceptionMethod26();
    events.exceptionMethod27();
    events.exceptionMethod28();
    events.exceptionMethod29(events);
    events.exceptionMethod30();
    events.exceptionMethod31();
    events.exceptionMethod32();
    events.exceptionMethod33();
    events.exceptionMethod34();
    events.exceptionMethod35();
    System.out.println("~~~~~~~~~~~~~~~~");
    events.runtimeMethod1();
    events.runtimeMethod2();
    events.runtimeMethod3();
    events.runtimeMethod10();
    events.runtimeMethod5();
    events.runtimeMethod6();
    events.runtimeMethod7();
    events.runtimeMethod8();
    events.runtimeMethod9();
    events.runtimeMethod11();
    events.runtimeMethod12();
    events.runtimeMethod13();
    events.runtimeMethod14();
    events.runtimeMethod15();
    events.runtimeMethod16();
    events.runtimeMethod17();
    events.runtimeMethod18();
    events.runtimeMethod19();
    events.runtimeMethod20();
    events.runtimeMethod21();
    events.errorMethod1();
	}

}

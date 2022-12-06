package com.xworkz.exceptions.events;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.print.PrinterException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.URISyntaxException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.ProviderException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;
import java.text.RuleBasedCollator;
import java.util.ConcurrentModificationException;
import java.util.IllformedLocaleException;
import java.util.TooManyListenersException;
import java.util.concurrent.CompletionException;
import java.util.prefs.BackingStoreException;

import javax.management.BadAttributeValueExpException;
import javax.management.RuntimeErrorException;
import javax.management.RuntimeMBeanException;
import javax.management.RuntimeOperationsException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;
import javax.xml.ws.WebServiceException;

import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.RemarshalException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.sun.org.apache.bcel.internal.classfile.RuntimeInvisibleAnnotations;
import com.sun.org.apache.bcel.internal.classfile.RuntimeVisibleParameterAnnotations;
import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.xml.internal.bind.v2.model.annotation.RuntimeInlineAnnotationReader;
import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import com.sun.xml.internal.ws.model.RuntimeModelerException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;
import com.sun.xml.internal.ws.util.RuntimeVersion;

import jdk.internal.dynalink.support.RuntimeContextLinkRequestImpl;
import jdk.internal.org.xml.sax.SAXException;
import jdk.nashorn.internal.ir.RuntimeNode;
import jdk.nashorn.internal.runtime.events.RuntimeEvent;

//here "throw new" is to declare the event exception

public class CreateEvents {

	private static final String String = null;
	private static final InputStream InputStream = null;

	public void created() {
		System.out.println("running the created method ");
		throw new RuntimeErrorException(null);
	}

	public void runtimeMethod1() {
		System.out.println("running the runtimeMethod1 ");
		throw new RuntimeErrorException(null, null);
	}

	public void runtimeMethod2() {
		System.out.println("running the runtimeMethod2 ");
		throw new RuntimeException();
	}

	public void runtimeMethod3() {
		System.out.println("running the runtimeMethod3 ");
		throw new RuntimeException(null, null);

	}

	public void runtimeMethod5() {
		System.out.println("running the runtimeMethod5 ");
		throw new RuntimeException("");
	}

	public void runtimeMethod6() {
		System.out.println("running the runtimeMethod6 ");
		throw new RuntimeException("");
	}

	public void runtimeMethod7() {
		System.out.println("running the runtimeMethod7 ");
		throw new RuntimeMBeanException(null);
	}

	public void runtimeMethod8() {
		System.out.println("running the runtimeMethod8 ");
		throw new RuntimeModelerException("");
	}

	public void runtimeMethod9() {
		System.out.println("running the runtimeMethod9 ");
		throw new RuntimeModelerException("");
	}

	public void runtimeMethod10() {
		System.out.println("running the runtimeMethod10 ");
		throw new RuntimeModelerException("", "");
	}

	public void runtimeMethod11() {
		System.out.println("running the runtimeMethod11 ");
		throw new RuntimeOperationsException(null);
	}

	public void runtimeMethod12() {
		System.out.println("running the runtimeMethod12 ");
		throw new RuntimeOperationsException(null, null);
	}

	public void runtimeMethod13() {
		System.out.println("running the runtimeMethod13 ");
		throw new RuntimeVisibleParameterAnnotations(0, 0, null, null);
	}

	public void runtimeMethod14() {
		System.out.println("running the runtimeMethod14 ");
		throw new RuntimeNode(0, 0, null, null);
	}

	public void runtimeMethod15() {
		System.out.println("running the runtimeMethod15 ");
		throw new RuntimeVersion();
	}

	public void runtimeMethod16() {
		System.out.println("running the runtimeMethod16 ");
		throw new RuleBasedCollator("ja");
	}

	public void runtimeMethod17() {
		System.out.println("running the runtimeMethod17 ");
		throw new RuntimePermission(" ", " ");
	}

	public void runtimeMethod18() {
		System.out.println("running the runtimeMethod18 ");
		throw new ArithmeticException();
	}

	public void runtimeMethod19() {
		System.out.println("running the runtimeMethod19 ");
		throw new ArrayStoreException();
	}

	public void runtimeMethod20() {
		System.out.println("running the runtimeMethod20 ");
		throw new BufferOverflowException();
	}

	public void runtimeMethod21() {
		System.out.println("running the runtimeMethod21 ");
		throw new BufferUnderflowException();
	}

	public void runtimeMethod22() {
		System.out.println("running the runtimeMethod22 ");
		throw new CannotRedoException();
	}

	public void runtimeMethod23() {
		System.out.println("running the runtimeMethod23 ");
		throw new ClassCastException();
	}

	public void runtimeMethod24() {
		System.out.println("running the runtimeMethod24 ");
		throw new ConcurrentModificationException();
	}

	public void runtimeMethod25() {
		System.out.println("running the runtimeMethod25 ");
		throw new WrongMethodTypeException();
	}

	public void runtimeMethod26() {
		System.out.println("running the runtimeMethod26 ");
		throw new IllformedLocaleException();
	}

	public void runtimeMethod27() {
		System.out.println("running the runtimeMethod27 ");
		throw new FileSystemNotFoundException();
	}

	public void runtimeMethod28() {
		System.out.println("running the runtimeMethod28 ");
		throw new IndexOutOfBoundsException();
	}

	public void runtimeMethod29() {
		System.out.println("running the runtimeMethod29 ");
		throw new ProviderException();
	}

	public void runtimeMethod30() {
		System.out.println("running the runtimeMethod30 ");
		throw new NullPointerException();
	}

	public void runtimeMethod31() {
		System.out.println("running the runtimeMethod31 ");
		throw new ProviderNotFoundException();
	}

	public void runtimeMethod32() {
		System.out.println("running the runtimeMethod32 ");
		throw new SecurityException();
	}

	public void runtimeMethod33() {
		System.out.println("running the runtimeMethod33 ");
		throw new MalformedParameterizedTypeException();
	}

	public void runtimeMethod34() {
		System.out.println("running the runtimeMethod34 ");
		throw new WebServiceException();
	}

	public void runtimeMethod35() {
		System.out.println("running the runtimeMethod34 ");
		throw new NoSuchMechanismException();

	}

	public void exceptionMethod1() throws AclNotFoundException {
		System.out.println("now exceptional methods");
		System.out.println("running exceptionMethod1");
		throw new AclNotFoundException();
	}

	public void exceptionMethod2() throws ActivationException {
		System.out.println("running exceptionMethod2");
		throw new ActivationException();
	}

	public void exceptionMethod3() {
		System.out.println("running exceptionMethod3");
		throw new AlreadyBoundException();
	}

	public void exceptionMethod4() throws AWTException {
		System.out.println("running exceptionMethod4");
		
		throw new AWTException(String );
	}

	public void exceptionMethod5() {
		System.out.println("running exceptionMethod5");
		throw new AlreadyBoundException();
	}

	public void exceptionMethod6() throws BackingStoreException {
		System.out.println("running exceptionMethod6");
		throw new BackingStoreException(String );
	}

	public void exceptionMethod7  (Object Object) throws BadAttributeValueExpException {
		System.out.println("running exceptionMethod7");
		throw new BadAttributeValueExpException(Object );
	}
	public void exceptionMethod8(int offs) throws BadLocationException {
		System.out.println("running exceptionMethod8");
		throw new BadLocationException(String ,  offs);
	}
	public void exceptionMethod9(int offs) throws BadLocationException {
		System.out.println("running exceptionMethod9");
		throw new BadLocationException(String ,  offs);
	}
	public void exceptionMethod10() throws XPathException {
		System.out.println("running exceptionMethod10");
		throw new XPathException(String );
	}
	public void exceptionMethod11() throws XMLStreamException {
		System.out.println("running exceptionMethod11");
		throw new XMLStreamException();
	}
	public void exceptionMethod12() throws XMLSignatureException {
		System.out.println("running exceptionMethod12");
		throw new XMLSignatureException();
	}
	public void exceptionMethod13() {
		System.out.println("running exceptionMethod13");
		throw new XMLParseException(null, null);
	}
	public void exceptionMethod14() throws XAException {
		System.out.println("running exceptionMethod14");
		throw new XAException();
	}
	public void exceptionMethod15() throws URISyntaxException {
		System.out.println("running exceptionMethod15");
		throw new URISyntaxException(String , String );
	}
	public void exceptionMethod16() throws AclNotFoundException {
		System.out.println("running exceptionMethod16");
		throw new AclNotFoundException();
	}
	public void exceptionMethod17() throws URIReferenceException {
		System.out.println("running exceptionMethod17");
		throw new URIReferenceException();
	}
	public void exceptionMethod18(DataFlavor DataFlavor) throws UnsupportedFlavorException  {
		System.out.println("running exceptionMethod18");
		throw new UnsupportedFlavorException(DataFlavor );
	}
	public void exceptionMethod19(Callback Callback) throws UnsupportedCallbackException  {
		System.out.println("running exceptionMethod19");
		throw new UnsupportedCallbackException(Callback );
	}
	public void exceptionMethod20() throws UnsupportedAudioFileException  {
		System.out.println("running exceptionMethod20");
		throw new UnsupportedAudioFileException();
	}
	public void exceptionMethod21() throws UnmodifiableClassException  {
		System.out.println("running exceptionMethod21");
		throw new UnmodifiableClassException();
	}
	public void exceptionMethod22() throws TransformException  {
		System.out.println("running exceptionMethod22");
		throw new TransformException();
	}
	public void exceptionMethod23() throws TransformerException  {
		System.out.println("running exceptionMethod23");
		throw new TransformerException(String );
	}
	public void exceptionMethod24() throws TooManyListenersException  {
		System.out.println("running exceptionMethod24");
		throw new TooManyListenersException();
	}
	public void exceptionMethod25() throws TimeoutException  {
		System.out.println("running exceptionMethod25");
		throw new TimeoutException();
	}
	public void exceptionMethod26() throws SQLException  {
		System.out.println("running exceptionMethod26");
		throw new SQLException();
	}
	public void exceptionMethod27() throws SOAPException  {
		System.out.println("running exceptionMethod27");
		throw new SOAPException();
	}
	public void exceptionMethod28() throws ServerNotActiveException  {
		System.out.println("running exceptionMethod28");
		throw new ServerNotActiveException();
	}
	public void exceptionMethod29(Object Exception) throws ScriptException  {
		System.out.println("running exceptionMethod29");
		throw new ScriptException((java.lang.String) Exception );
	}
	public void exceptionMethod30() throws SAXException  {
		System.out.println("running exceptionMethod30");
		throw new SAXException();
	}
	public void exceptionMethod31() throws RemarshalException   {
		System.out.println("running exceptionMethod31");
		throw new RemarshalException();
	}
	public void exceptionMethod32() throws RefreshFailedException   {
		System.out.println("running exceptionMethod32");
		throw new RefreshFailedException();
	}
	public void exceptionMethod33() throws ReflectiveOperationException   {
		System.out.println("running exceptionMethod33");
		throw new ReflectiveOperationException();
	}
	public void exceptionMethod34() throws PrintException   {
		System.out.println("running exceptionMethod34");
		throw new PrintException();
	}
	public void exceptionMethod35() throws PrinterException   {
		System.out.println("running exceptionMethod35");
		throw new PrinterException();
	}
	
	public void errorMethod1() {
		System.out.println("running the errorMethod1");
		throw new  AnnotationFormatError(String );
	}
	public void errorMethod2() {
		System.out.println("running the errorMethod2");
		throw new  AssertionError();
	}
	
	public void errorMethod3() {
		System.out.println("running the errorMethod3");
		throw new AWTError(String );
	}
	public void errorMethod4(Exception Exception) {
		System.out.println("running the errorMethod4");
		throw new CoderMalfunctionError(Exception );
	}
	public void errorMethod5() {
		System.out.println("running the errorMethod5");
		throw new FactoryConfigurationError();
	}
	public void errorMethod6(Throwable Throwable) {
		System.out.println("running the errorMethod6");
		throw new IOError(Throwable );
	}
	public void errorMethod7() {
		System.out.println("running the errorMethod7");
		throw new LinkageError();
	}
	public void errorMethod8() {
		System.out.println("running the errorMethod8");
		throw new SchemaFactoryConfigurationError();
	}
	public void errorMethod9() {
		System.out.println("running the errorMethod9");
		throw new ServiceConfigurationError(String );
	}
	public void errorMethod10() {
		System.out.println("running the errorMethod10");
		throw new ThreadDeath();
	}
	public void errorMethod11() {
		System.out.println("running the errorMethod11");
		throw new TransformerFactoryConfigurationError();
	}
	public void errorMethod12() {
		System.out.println("running the errorMethod11");
		throw new LinkageError();
	}
	

}

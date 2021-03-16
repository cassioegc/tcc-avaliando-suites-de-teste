import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType keyValueTokenType0 = org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.EC;
        org.junit.Assert.assertTrue("'" + keyValueTokenType0 + "' != '" + org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.EC + "'", keyValueTokenType0.equals(org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.EC));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.apache.xml.security.utils.I18n.NOT_INITIALIZED_MSG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library." + "'", str0, "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream2 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream(outputStream0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.w3c.dom.Text text0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.xml.security.utils.Base64.decodeBigIntegerFromText(text0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = javax.xml.stream.XMLStreamConstants.CHARACTERS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_DSIG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#" + "'", str0, "http://www.w3.org/2000/09/xmldsig#");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = javax.xml.crypto.dsig.keyinfo.KeyValue.DSA_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#DSAKeyValue" + "'", str0, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = org.apache.xml.security.c14n.implementations.CanonicalizerBase.XML_LANG_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/XML/1998/namespace" + "'", str0, "http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        javax.xml.crypto.dsig.keyinfo.KeyInfo keyInfo0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<javax.xml.crypto.XMLStructure> xMLStructureList1 = org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfo.getContent(keyInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace2 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("", "http://www.w3.org/2000/09/xmldsig#");
        org.junit.Assert.assertNotNull(xMLSecNamespace2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315" + "'", str0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/XML/1998/namespace" + "'", str1, "http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = javax.xml.crypto.dsig.SignatureProperties.TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#SignatureProperties" + "'", str0, "http://www.w3.org/2000/09/xmldsig#SignatureProperties");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_C14N11_WITH_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2006/12/xml-c14n11#WithComments" + "'", str0, "http://www.w3.org/2006/12/xml-c14n11#WithComments");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_ENVELOPED_SIGNATURE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature" + "'", str0, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_MGF1_SHA512;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha512" + "'", str0, "http://www.w3.org/2009/xmlenc11#mgf1sha512");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.SIGNATURE_PARTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "signatureParts" + "'", str0, "signatureParts");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_RSASHA512;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512" + "'", str0, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.EncDig;
        org.junit.Assert.assertNotNull(algorithmUsage0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("signatureParts");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "signatureParts" + "'", str1, "signatureParts");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMX509Data dOMX509Data1 = new org.apache.jcp.xml.dsig.internal.dom.DOMX509Data(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_MGF1_SHA1;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha1" + "'", str0, "http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.w3c.dom.Attr attr0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute(attr0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_DSIG_MORE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#" + "'", str0, "http://www.w3.org/2001/04/xmldsig-more#");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.xml.security.stax.ext.stax.XMLSecProcessingInstruction xMLSecProcessingInstruction2 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecProcessingInstruction("http://www.w3.org/2001/04/xmldsig-more#", "hi!");
        org.junit.Assert.assertNotNull(xMLSecProcessingInstruction2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = javax.xml.stream.XMLStreamConstants.END_ELEMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        javax.xml.stream.events.EntityDeclaration entityDeclaration1 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEntityReference xMLSecEntityReference2 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecEntityReference("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", entityDeclaration1);
        org.junit.Assert.assertNotNull(xMLSecEntityReference2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.xml.security.stax.impl.util.IDGenerator iDGenerator0 = new org.apache.xml.security.stax.impl.util.IDGenerator();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.xml.security.transforms.implementations.TransformBase64Decode transformBase64Decode0 = new org.apache.xml.security.transforms.implementations.TransformBase64Decode();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ENCRYPTION_PARTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "encryptionParts" + "'", str0, "encryptionParts");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput0 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement1 = null;
        java.util.Set<java.lang.String> strSet3 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger4 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput0, strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "encryptionParts");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain4 = null;
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray7 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList8 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList8, xMLSecAttributeArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement10 = finalOutputProcessor1.createStartElementAndOutputAsEvent(outputProcessorChain4, qName5, true, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC11_AES192_GCM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#aes192-gcm" + "'", str0, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC_SHA256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha256" + "'", str0, "http://www.w3.org/2001/04/xmlenc#sha256");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Encoding;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        javax.xml.bind.JAXBContext jAXBContext0 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.setJaxbContext(jAXBContext0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain2 = null;
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createCharactersAndOutputAsEvent(outputProcessorChain2, charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.junit.Assert.assertTrue("'" + contentType0 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType0.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str0 = javax.xml.crypto.dsig.CanonicalizationMethod.EXCLUSIVE_WITH_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments" + "'", str0, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext0 = null;
        java.lang.String str1 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getSignaturePrefix(xMLCryptoContext0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.xml.security.signature.XMLSignatureException xMLSignatureException0 = new org.apache.xml.security.signature.XMLSignatureException();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.setAttribute(element0, "", "http://www.w3.org/2009/xmlenc11#mgf1sha512");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.w3c.dom.Attr attr0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative(attr0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.xml.security.transforms.implementations.TransformC14N11_WithComments transformC14N11_WithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14N11_WithComments();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain2 = null;
        java.security.cert.X509Certificate x509Certificate3 = null;
        java.security.cert.X509Certificate[] x509CertificateArray4 = new java.security.cert.X509Certificate[] { x509Certificate3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createX509SubjectKeyIdentifierStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor1, outputProcessorChain2, x509CertificateArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(x509CertificateArray4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str1 = org.apache.xml.security.stax.ext.XMLSecurityUtils.dropReferenceMarker("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain2 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.init(outputProcessorChain2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.xml.security.binding.xmldsig11.CurveType curveType0 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray1 = curveType0.getA();
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str0 = javax.xml.crypto.dsig.Transform.ENVELOPED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature" + "'", str0, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11 canonicalizer11_1 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11(false);
        canonicalizer11_1.doFinal();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent3 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray4 = new byte[] {};
        java.io.OutputStream outputStream5 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray4, outputStream5);
        signatureValueSecurityEvent3.setSignatureValue(byteArray4);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream10 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray4, (int) (short) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            canonicalizer11_1.transform((java.io.InputStream) unsyncByteArrayInputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.ExceptionInInitializerError; message: null");
        } catch (java.lang.ExceptionInInitializerError e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_CanonicalizationMethod;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = null;
        org.apache.xml.security.stax.ext.OutboundXMLSec outboundXMLSec1 = new org.apache.xml.security.stax.ext.OutboundXMLSec(xMLSecurityProperties0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.security.spec.ECPoint eCPoint0 = null;
        java.security.spec.EllipticCurve ellipticCurve1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.encodePoint(eCPoint0, ellipticCurve1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N11_WITH_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2006/12/xml-c14n11#WithComments" + "'", str0, "http://www.w3.org/2006/12/xml-c14n11#WithComments");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.xml.security.stax.config.TransformerAlgorithmMapper.getTransformerClass("hi!", dIRECTION1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE;
        org.junit.Assert.assertTrue("'" + contentType0 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE + "'", contentType0.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLENC11;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#" + "'", str0, "http://www.w3.org/2009/xmlenc11#");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement4 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl5 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement4);
        java.util.List<javax.xml.namespace.QName> qNameList6 = xMLSecCharactersImpl5.getElementPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement7 = xMLSecCharactersImpl5.asStartElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qNameList6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.setAttribute(element0, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "http://www.w3.org/2009/xmlenc11#mgf1sha512");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain2 = null;
        char[] charArray7 = new char[] { 'a', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createCharactersAndOutputAsEvent(outputProcessorChain2, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #, #]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.XMLSignatureFactory xMLSignatureFactory2 = javax.xml.crypto.dsig.XMLSignatureFactory.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "encryptionParts");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: encryptionParts");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.net.Proxy proxy0 = null;
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp.setProxy(proxy0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = org.apache.xml.security.stax.impl.transformer.TransformIdentity.getXmlInputFactory();
        org.junit.Assert.assertNotNull(xMLInputFactory0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_EXCL_OMIT_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str0, "http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PREFIX_DSIG_MORE_PSS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pss" + "'", str0, "pss");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        javax.xml.stream.events.EntityDeclaration entityDeclaration1 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEntityReference xMLSecEntityReference2 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecEntityReference("http://www.w3.org/2006/12/xml-c14n11#WithComments", entityDeclaration1);
        org.junit.Assert.assertNotNull(xMLSecEntityReference2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_Transforms;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace4 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain5 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.processEvent((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecNamespace4, outputProcessorChain5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecNamespace4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMPGPData dOMPGPData1 = new org.apache.jcp.xml.dsig.internal.dom.DOMPGPData(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str0 = javax.xml.crypto.dsig.keyinfo.X509Data.RAW_X509_CERTIFICATE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rawX509Certificate" + "'", str0, "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters1 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecCData("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
        org.junit.Assert.assertNotNull(xMLSecCharacters1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_C14N_EXCL_WITH_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments" + "'", str0, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event0 = org.apache.xml.security.stax.securityEvent.SecurityEventConstants.SignatureValue;
        org.junit.Assert.assertNotNull(event0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC_SHA512;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha512" + "'", str0, "http://www.w3.org/2001/04/xmlenc#sha512");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.impl.algorithms.HMACSignatureAlgorithm hMACSignatureAlgorithm2 = new org.apache.xml.security.stax.impl.algorithms.HMACSignatureAlgorithm("", "http://www.w3.org/2006/12/xml-c14n11#WithComments");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: http://www.w3.org/2006/12/xml-c14n11#WithComments");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        javax.xml.stream.XMLOutputFactory xMLOutputFactory0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.xmlOutputFactoryNonRepairingNs;
        org.junit.Assert.assertNotNull(xMLOutputFactory0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_X509KeyIdentifier;
        java.lang.Class<?> wildcardClass1 = keyIdentifier0.getClass();
        org.junit.Assert.assertNotNull(keyIdentifier0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getAttributeValue(element0, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet4 = finalOutputProcessor1.getAfterProcessors();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createKeyNameTokenStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor1, outputProcessorChain5, "http://www.w3.org/2001/10/xml-exc-c14n#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(wildcardClassSet4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.xml.security.encryption.XMLEncryptionException xMLEncryptionException0 = new org.apache.xml.security.encryption.XMLEncryptionException();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.c14n.implementations.UtfHelpper.writeCodePointToUtf8(2, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.xml.security.binding.xmldsig11.CharTwoFieldParamsType charTwoFieldParamsType0 = new org.apache.xml.security.binding.xmldsig11.CharTwoFieldParamsType();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType0 = new org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType();
        java.math.BigInteger bigInteger1 = tnBFieldParamsType0.getM();
        java.math.BigInteger bigInteger2 = null;
        tnBFieldParamsType0.setM(bigInteger2);
        org.junit.Assert.assertNull(bigInteger1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.security.Provider provider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory2 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance("http://www.w3.org/2006/12/xml-c14n11#WithComments", provider1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: provider cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.xml.security.binding.xmldsig.pss.MaskGenerationFunctionType maskGenerationFunctionType0 = new org.apache.xml.security.binding.xmldsig.pss.MaskGenerationFunctionType();
        java.lang.String str1 = maskGenerationFunctionType0.getAlgorithm();
        org.apache.xml.security.binding.xmldsig.DigestMethodType digestMethodType2 = maskGenerationFunctionType0.getDigestMethod();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2007/05/xmldsig-more#MGF1" + "'", str1, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.junit.Assert.assertNull(digestMethodType2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken1 = x509TokenSecurityEvent0.getSecurityToken();
        x509TokenSecurityEvent0.setCorrelationID("encryptionParts");
        org.junit.Assert.assertNull(securityToken1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain2 = null;
        javax.xml.namespace.QName qName3 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray5 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList6 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList6, xMLSecAttributeArray5);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace10 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray11 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace10 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList12 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12, xMLSecNamespaceArray11);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement14 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList6, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12);
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray16 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, xMLSecAttributeArray16);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace21 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray22 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace21 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList23 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23, xMLSecNamespaceArray22);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement25 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23);
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createStartElementAndOutputAsEvent(outputProcessorChain2, qName3, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace10);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace21);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement25);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC_RSA15;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5" + "'", str0, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        boolean boolean1 = org.apache.jcp.xml.dsig.internal.dom.Utils.sameDocumentURI("signatureParts");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType1 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = tokenType1.compareTo(tokenType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str0 = org.apache.xml.security.c14n.implementations.CanonicalizerBase.XMLNS_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str0 = org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl.INCLUSIVE_NAMESPACES_PREFIX_LIST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "inclusiveNamespacePrefixList" + "'", str0, "inclusiveNamespacePrefixList");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.Phase phase0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.Phase.POSTPROCESSING;
        org.junit.Assert.assertTrue("'" + phase0 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.Phase.POSTPROCESSING + "'", phase0.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.Phase.POSTPROCESSING));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.xml.security.configuration.ConfigurationType configurationType0 = new org.apache.xml.security.configuration.ConfigurationType();
        org.apache.xml.security.configuration.TransformAlgorithmsType transformAlgorithmsType1 = configurationType0.getTransformAlgorithms();
        org.apache.xml.security.configuration.ResourceResolversType resourceResolversType2 = null;
        configurationType0.setResourceResolvers(resourceResolversType2);
        org.apache.xml.security.configuration.PropertiesType propertiesType4 = configurationType0.getProperties();
        org.junit.Assert.assertNull(transformAlgorithmsType1);
        org.junit.Assert.assertNull(propertiesType4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element3 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getFirstChildElement(node0, "inclusiveNamespacePrefixList", "http://www.w3.org/2009/xmlenc11#aes192-gcm");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "http://www.w3.org/2001/10/xml-exc-c14n#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = signerOutputStream1.toString("http://www.w3.org/2009/xmlenc11#mgf1sha1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: http://www.w3.org/2009/xmlenc11#mgf1sha1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.xml.security.transforms.implementations.TransformC14N11 transformC14N11_0 = new org.apache.xml.security.transforms.implementations.TransformC14N11();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int0 = javax.xml.stream.XMLStreamConstants.DTD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.xml.security.c14n.Canonicalizer.registerDefaultAlgorithms();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int0 = javax.xml.stream.XMLStreamConstants.CDATA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int0 = javax.xml.stream.XMLStreamConstants.ENTITY_DECLARATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        signatureValueSecurityEvent0.setSignatureValue(byteArray1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1, (int) (short) 10, 10);
        boolean boolean8 = unsyncByteArrayInputStream7.markSupported();
        unsyncByteArrayInputStream7.close();
        unsyncByteArrayInputStream7.mark((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_MGF1_SHA384;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha384" + "'", str0, "http://www.w3.org/2009/xmlenc11#mgf1sha384");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_X509KeyIdentifier;
        boolean boolean2 = keyIdentifier0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(keyIdentifier0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain2 = null;
        java.security.cert.X509Certificate x509Certificate3 = null;
        java.security.cert.X509Certificate[] x509CertificateArray4 = new java.security.cert.X509Certificate[] { x509Certificate3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createX509SubjectKeyIdentifierStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor1, outputProcessorChain2, x509CertificateArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(x509CertificateArray4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        int int2 = signerOutputStream1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY" + "'", str0, "PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger1 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition1 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.getECCurveDefinition("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.junit.Assert.assertNull(eCCurveDefinition1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl1 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            xMLSecEntityDeclarationImpl1.writeAsEncodedUnicode(writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_C14N_OMIT_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315" + "'", str0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData apacheOctetStreamData1 = new org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData(xMLSignatureInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC_RSAOAEPMGF1P;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p" + "'", str0, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet65 = finalOutputProcessor1.getBeforeProcessors();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement70 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl71 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement70);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters72 = xMLSecCharactersImpl71.asCharacters();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain73 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.processEvent((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecCharactersImpl71, outputProcessorChain73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(wildcardClassSet65);
        org.junit.Assert.assertNotNull(xMLSecCharacters72);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_RSASHA256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256" + "'", str0, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray5 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList6 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList6, xMLSecAttributeArray5);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace10 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray11 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace10 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList12 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12, xMLSecNamespaceArray11);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement14 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList6, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl15 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement14);
        boolean boolean16 = xMLSecCharactersImpl15.isCData();
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xMLSecCharactersImpl15.writeAsEncodedUnicode(writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace10);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = eCCurveDefinition9.equals(bigInteger10, bigInteger11, bigInteger12, bigInteger13, bigInteger14, bigInteger15, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PREFIX_DSIG11;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dsig11" + "'", str0, "dsig11");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        byte[] byteArray0 = new byte[] {};
        java.io.OutputStream outputStream1 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray0, outputStream1);
        byte[] byteArray3 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.convertXMLDSIGtoASN1(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace2 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.junit.Assert.assertNotNull(xMLSecNamespace2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        javax.xml.stream.events.EntityDeclaration entityDeclaration3 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement8 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl9 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement8);
        int int10 = xMLSecCharactersImpl9.getEventType();
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray16 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, xMLSecAttributeArray16);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace21 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray22 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace21 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList23 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23, xMLSecNamespaceArray22);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement25 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl26 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement25);
        xMLSecCharactersImpl9.setParentXMLSecStartElement(xMLSecStartElement25);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl28 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl("", entityDeclaration3, xMLSecStartElement25);
        boolean boolean29 = xMLSecEntityReferenceImpl28.isEntityReference();
        int int30 = xMLSecEntityReferenceImpl28.getDocumentLevel();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain31 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.processEvent((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecEntityReferenceImpl28, outputProcessorChain31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace21);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str0 = javax.xml.crypto.dsig.Manifest.TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#Manifest" + "'", str0, "http://www.w3.org/2000/09/xmldsig#Manifest");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.xml.security.stax.config.Init init0 = new org.apache.xml.security.stax.config.Init();
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName1 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        org.w3c.dom.Node node2 = null;
        javax.xml.crypto.dom.DOMCryptoContext dOMCryptoContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dOMKeyName1.marshal(node2, "inclusiveNamespacePrefixList", dOMCryptoContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE" + "'", str0, "PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType0 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        org.apache.xml.security.binding.xmlenc.ReferenceList referenceList1 = encryptedKeyType0.getReferenceList();
        org.apache.xml.security.binding.xmldsig.KeyInfoType keyInfoType2 = encryptedKeyType0.getKeyInfo();
        org.junit.Assert.assertNull(referenceList1);
        org.junit.Assert.assertNull(keyInfoType2);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC11_RSAOAEP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#rsa-oaep" + "'", str0, "http://www.w3.org/2009/xmlenc11#rsa-oaep");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray1 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        byte[] byteArray2 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.convertASN1toXMLDSIG(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Invalid ASN.1 format of ECDSA signature");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl0 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList1 = documentContextImpl0.getProtectionOrder();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement6 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl7 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement6);
        int int8 = xMLSecCharactersImpl7.getEventType();
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace19 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray20 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace19 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList21 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21, xMLSecNamespaceArray20);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName13, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl24 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement23);
        xMLSecCharactersImpl7.setParentXMLSecStartElement(xMLSecStartElement23);
        // The following exception was thrown during execution in test generation
        try {
            documentContextImpl0.unsetIsInSignedContent((java.lang.Object) xMLSecCharactersImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentTypeList1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace19);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement23);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.security.Signature signature1 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream2 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature1);
        java.util.Map<java.lang.String, byte[]> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.c14n.implementations.UtfHelpper.writeByte("dsig11", (java.io.OutputStream) signerOutputStream2, strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("http://www.w3.org/2009/xmlenc11#aes192-gcm");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.xml.security.binding.xmldsig11.DEREncodedKeyValueType dEREncodedKeyValueType0 = new org.apache.xml.security.binding.xmldsig11.DEREncodedKeyValueType();
        java.lang.String str1 = dEREncodedKeyValueType0.getId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        boolean boolean1 = org.apache.jcp.xml.dsig.internal.dom.Utils.sameDocumentURI("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments transformC14NExclusiveWithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments();
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.xml.security.stax.impl.algorithms.SignatureAlgorithmFactory signatureAlgorithmFactory0 = org.apache.xml.security.stax.impl.algorithms.SignatureAlgorithmFactory.getInstance();
        org.junit.Assert.assertNotNull(signatureAlgorithmFactory0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.w3c.dom.Node node0 = null;
        org.apache.xml.security.utils.DOMNamespaceContext dOMNamespaceContext1 = new org.apache.xml.security.utils.DOMNamespaceContext(node0);
        java.lang.String str3 = dOMNamespaceContext1.getPrefix("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        java.lang.String str5 = dOMNamespaceContext1.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.String> strItor7 = dOMNamespaceContext1.getPrefixes("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.io.OutputStream outputStream0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(outputStream0, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain3 = null;
        java.security.cert.X509Certificate x509Certificate4 = null;
        java.security.cert.X509Certificate[] x509CertificateArray5 = new java.security.cert.X509Certificate[] { x509Certificate4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createX509SubjectKeyIdentifierStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor2, outputProcessorChain3, x509CertificateArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(x509CertificateArray5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMCryptoBinary dOMCryptoBinary1 = new org.apache.jcp.xml.dsig.internal.dom.DOMCryptoBinary(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: bigNum is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.InputStream;
        org.junit.Assert.assertTrue("'" + transformMethod0 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.InputStream + "'", transformMethod0.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.InputStream));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = eCCurveDefinition9.equals(bigInteger10, bigInteger11, bigInteger12, bigInteger13, bigInteger14, bigInteger15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        javax.xml.stream.events.EntityDeclaration entityDeclaration1 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement6 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl7 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement6);
        int int8 = xMLSecCharactersImpl7.getEventType();
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace19 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray20 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace19 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList21 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21, xMLSecNamespaceArray20);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName13, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl24 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement23);
        xMLSecCharactersImpl7.setParentXMLSecStartElement(xMLSecStartElement23);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl26 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl("", entityDeclaration1, xMLSecStartElement23);
        boolean boolean27 = xMLSecEntityReferenceImpl26.isEntityReference();
        int int28 = xMLSecEntityReferenceImpl26.getDocumentLevel();
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xMLSecEntityReferenceImpl26.writeAsEncodedUnicode(writer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace19);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException2 = new org.apache.xml.security.keys.storage.StorageResolverException((java.lang.Exception) uncheckedXMLSecurityException1);
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment4 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent> exceptionKeyValue5 = new org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent>((java.lang.Exception) uncheckedXMLSecurityException1, (javax.xml.stream.events.XMLEvent) xMLSecComment4);
        java.lang.String str6 = uncheckedXMLSecurityException1.toString();
        org.junit.Assert.assertNotNull(xMLSecComment4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1" + "'", str6, "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.xml.security.binding.xmldsig.X509DataType x509DataType0 = new org.apache.xml.security.binding.xmldsig.X509DataType();
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_DSIG_MORE_2007_05;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2007/05/xmldsig-more#" + "'", str0, "http://www.w3.org/2007/05/xmldsig-more#");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element1 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getNextSiblingElement(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Algorithm;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.XMLSignatureFactory xMLSignatureFactory2 = javax.xml.crypto.dsig.XMLSignatureFactory.getInstance("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: hi!");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier1 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart2 = new org.apache.xml.security.stax.ext.SecurePart(qName0, modifier1);
        boolean boolean3 = securePart2.isSecureEntireRequest();
        securePart2.setExternalReference("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
        java.lang.String str6 = securePart2.getIdToSecure();
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.w3c.dom.Element element0 = null;
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext1 = null;
        java.security.Provider provider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfo dOMKeyInfo3 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfo(element0, xMLCryptoContext1, provider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.nio.file.Path path0 = null;
        org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(path0);
        org.w3c.dom.Attr attr2 = null;
        org.apache.xml.security.utils.resolver.ResourceResolverContext resourceResolverContext5 = new org.apache.xml.security.utils.resolver.ResourceResolverContext(attr2, "http://www.w3.org/2009/xmlenc11#mgf1sha1", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = resolverAnonymous1.engineResolveURI(resourceResolverContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.w3c.dom.Element element0 = null;
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext1 = null;
        java.security.Provider provider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMManifest dOMManifest3 = new org.apache.jcp.xml.dsig.internal.dom.DOMManifest(element0, xMLCryptoContext1, provider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType0 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        java.lang.String str1 = encryptedKeyType0.getCarriedKeyName();
        java.lang.String str2 = encryptedKeyType0.getEncoding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken1 = x509TokenSecurityEvent0.getSecurityToken();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType2 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext3 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken4 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType2, inboundSecurityContext3);
        java.util.List<javax.xml.namespace.QName> qNameList5 = dsaKeyValueSecurityToken4.getElementPath();
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier9 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart10 = new org.apache.xml.security.stax.ext.SecurePart(qName8, modifier9);
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        javax.xml.namespace.QName qName28 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName30 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName31 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName[] qNameArray38 = new javax.xml.namespace.QName[] { qName6, qName7, qName8, qName11, qName12, qName13, qName14, qName15, qName16, qName17, qName28, qName29, qName30, qName31, qName32, qName33, qName34, qName35, qName36, qName37 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList39 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList39, qNameArray38);
        dsaKeyValueSecurityToken4.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList39);
        x509TokenSecurityEvent0.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken4);
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken43 = x509TokenSecurityEvent0.getSecurityToken();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event44 = x509TokenSecurityEvent0.getSecurityEventType();
        org.junit.Assert.assertNull(securityToken1);
        org.junit.Assert.assertNull(qNameList5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(qNameArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(securityToken43);
        org.junit.Assert.assertNotNull(event44);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken0 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray2 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList3 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3, contentTypeArray2);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent5 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken0, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement10 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl11 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement10);
        java.util.List<javax.xml.namespace.QName> qNameList12 = xMLSecCharactersImpl11.getElementPath();
        signedElementSecurityEvent5.setElementPath(qNameList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMX509Data dOMX509Data14 = new org.apache.jcp.xml.dsig.internal.dom.DOMX509Data(qNameList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: content cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(qNameList12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.w3c.dom.Element element0 = null;
        org.w3c.dom.Attr attr1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.utils.IdResolver.registerElementById(element0, attr1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_RSASHA384;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384" + "'", str0, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        javax.xml.datatype.DatatypeFactory datatypeFactory0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.datatypeFactory;
        org.junit.Assert.assertNotNull(datatypeFactory0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.xml.security.utils.Base64.encode(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.normalize("http://www.w3.org/2009/xmlenc11#aes192-gcm");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2009/xmlenc11#aes192-gcm" + "'", str1, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.xml.security.stax.config.TransformerAlgorithmMapper.getTransformerClass("", dIRECTION1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element1 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getFirstChildElement(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.xml.security.stax.config.TransformerAlgorithmMapper.getTransformerClass("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", dIRECTION1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.impl.algorithms.HMACSignatureAlgorithm hMACSignatureAlgorithm2 = new org.apache.xml.security.stax.impl.algorithms.HMACSignatureAlgorithm("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", "http://www.w3.org/2001/04/xmldsig-more#");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: http://www.w3.org/2001/04/xmldsig-more#");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken0 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray2 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList3 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3, contentTypeArray2);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent5 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken0, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3);
        java.lang.String str6 = signedElementSecurityEvent5.getCorrelationID();
        org.junit.Assert.assertNotNull(contentTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet4 = finalOutputProcessor1.getAfterProcessors();
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet5 = finalOutputProcessor1.getBeforeProcessors();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain6 = null;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray8 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList9 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList9, xMLSecAttributeArray8);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace13 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList15, xMLSecNamespaceArray14);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement17 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName7, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList9, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList15);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier19 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart20 = new org.apache.xml.security.stax.ext.SecurePart(qName7, true, modifier19);
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createEndElementAndOutputAsEvent(outputProcessorChain6, qName7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(wildcardClassSet4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace13);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement17);
        org.junit.Assert.assertTrue("'" + modifier19 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier19.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        javax.xml.crypto.dsig.TransformService transformService0 = null;
        org.apache.jcp.xml.dsig.internal.dom.DOMTransform dOMTransform1 = new org.apache.jcp.xml.dsig.internal.dom.DOMTransform(transformService0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dOMTransform1.getAlgorithm();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_C14N_EXCL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str0, "http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.security.Signature signature1 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream2 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature1);
        byte[] byteArray3 = signerOutputStream2.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.c14n.implementations.UtfHelpper.writeCodePointToUtf8((-1), (java.io.OutputStream) signerOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMCryptoBinary dOMCryptoBinary1 = new org.apache.jcp.xml.dsig.internal.dom.DOMCryptoBinary(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.w3c.dom.Node node0 = null;
        org.apache.xml.security.utils.DOMNamespaceContext dOMNamespaceContext1 = new org.apache.xml.security.utils.DOMNamespaceContext(node0);
        org.w3c.dom.Node node2 = null;
        dOMNamespaceContext1.setContext(node2);
        org.w3c.dom.Node node4 = null;
        dOMNamespaceContext1.setContext(node4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event1 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event("UTF-8");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event0 = org.apache.xml.security.stax.securityEvent.SecurityEventConstants.SignedElement;
        org.junit.Assert.assertNotNull(event0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        java.util.List<javax.xml.namespace.QName> qNameList3 = dsaKeyValueSecurityToken2.getElementPath();
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier7 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart8 = new org.apache.xml.security.stax.ext.SecurePart(qName6, modifier7);
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName10 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray16 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, xMLSecAttributeArray16);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace21 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray22 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace21 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList23 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23, xMLSecNamespaceArray22);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement25 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23);
        javax.xml.namespace.QName qName26 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName27 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName28 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName30 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName31 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName[] qNameArray36 = new javax.xml.namespace.QName[] { qName4, qName5, qName6, qName9, qName10, qName11, qName12, qName13, qName14, qName15, qName26, qName27, qName28, qName29, qName30, qName31, qName32, qName33, qName34, qName35 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList37 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList37, qNameArray36);
        dsaKeyValueSecurityToken2.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList37);
        java.lang.String str40 = dsaKeyValueSecurityToken2.getSha1Identifier();
        // The following exception was thrown during execution in test generation
        try {
            java.security.PublicKey publicKey41 = dsaKeyValueSecurityToken2.getPublicKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qNameList3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace21);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement25);
        org.junit.Assert.assertNotNull(qName26);
        org.junit.Assert.assertNotNull(qName27);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qNameArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str0 = javax.xml.crypto.dsig.CanonicalizationMethod.EXCLUSIVE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str0, "http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2004/08/xop/include" + "'", str0, "http://www.w3.org/2004/08/xop/include");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl1 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str2 = xMLSecEntityDeclarationImpl1.getName();
        java.lang.String str3 = xMLSecEntityDeclarationImpl1.getReplacementText();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xMLSecEntityDeclarationImpl1.writeAsEncodedUnicode(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "signatureParts" + "'", str2, "signatureParts");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier1 = org.apache.xml.security.stax.ext.SecurePart.Modifier.getModifier("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.junit.Assert.assertNull(modifier1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl1 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str2 = xMLSecEntityDeclarationImpl1.getName();
        java.lang.String str3 = xMLSecEntityDeclarationImpl1.getReplacementText();
        java.lang.String str4 = xMLSecEntityDeclarationImpl1.getReplacementText();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "signatureParts" + "'", str2, "signatureParts");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getAttributeValue(element0, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.xml.security.utils.HelperNodeList helperNodeList1 = new org.apache.xml.security.utils.HelperNodeList(false);
        org.w3c.dom.Node node2 = null;
        helperNodeList1.appendChild(node2);
        int int4 = helperNodeList1.getLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int0 = javax.xml.stream.XMLStreamConstants.COMMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.impl.algorithms.HMACSignatureAlgorithm hMACSignatureAlgorithm2 = new org.apache.xml.security.stax.impl.algorithms.HMACSignatureAlgorithm("pss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing provider");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_MGF1_SHA224;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha224" + "'", str0, "http://www.w3.org/2009/xmlenc11#mgf1sha224");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature transformEnvelopedSignature0 = new org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream4 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            transformEnvelopedSignature0.transform((java.io.InputStream) unsyncByteArrayInputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: transform(InputStream) not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.normalize("http://www.w3.org/2004/08/xop/include");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2004/08/xop/include" + "'", str1, "http://www.w3.org/2004/08/xop/include");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl1 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str2 = xMLSecEntityDeclarationImpl1.getReplacementText();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str0 = javax.xml.crypto.dsig.keyinfo.PGPData.TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#PGPData" + "'", str0, "http://www.w3.org/2000/09/xmldsig#PGPData");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.X509PkiPathV1Token;
        org.junit.Assert.assertNotNull(tokenType0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int0 = javax.xml.stream.XMLStreamConstants.ATTRIBUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int0 = org.apache.xml.security.utils.Base64.BASE64DEFAULTLENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_HMACSHA256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256" + "'", str0, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType keyValueTokenType0 = org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.RSA;
        org.junit.Assert.assertTrue("'" + keyValueTokenType0 + "' != '" + org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.RSA + "'", keyValueTokenType0.equals(org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.RSA));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        javax.xml.crypto.dsig.TransformService transformService0 = null;
        org.apache.jcp.xml.dsig.internal.dom.DOMTransform dOMTransform1 = new org.apache.jcp.xml.dsig.internal.dom.DOMTransform(transformService0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dOMTransform1.getAlgorithm();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.XMLSignatureFactory xMLSignatureFactory1 = javax.xml.crypto.dsig.XMLSignatureFactory.getInstance("http://www.w3.org/2007/05/xmldsig-more#");
            org.junit.Assert.fail("Expected exception of type javax.xml.crypto.NoSuchMechanismException; message: java.security.NoSuchAlgorithmException: http://www.w3.org/2007/05/xmldsig-more# XMLSignatureFactory not available");
        } catch (javax.xml.crypto.NoSuchMechanismException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.setAttribute(element0, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException2 = new org.apache.xml.security.keys.storage.StorageResolverException((java.lang.Exception) uncheckedXMLSecurityException1);
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment4 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent> exceptionKeyValue5 = new org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent>((java.lang.Exception) uncheckedXMLSecurityException1, (javax.xml.stream.events.XMLEvent) xMLSecComment4);
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException6 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException((java.lang.Throwable) uncheckedXMLSecurityException1);
        java.lang.String str7 = uncheckedXMLSecurityException6.toString();
        org.junit.Assert.assertNotNull(xMLSecComment4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1" + "'", str7, "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType1 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext2 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken3 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType1, inboundSecurityContext2);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent4 = dsaKeyValueSecurityToken3.getXMLSecEvent();
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyInfo;
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_CanonicalizationMethod;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_CanonicalizationMethod;
        javax.xml.namespace.QName qName8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Encoding;
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray10 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList11 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList11, xMLSecAttributeArray10);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace15 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray16 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace15 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList17, xMLSecNamespaceArray16);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement19 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName9, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList11, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList17);
        javax.xml.namespace.QName qName20 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName21 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509IssuerName;
        javax.xml.namespace.QName qName22 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Encoding;
        javax.xml.namespace.QName qName23 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName24 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509IssuerName;
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier26 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Element;
        java.lang.String[] strArray31 = new java.lang.String[] { "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#aes192-gcm", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "pss" };
        org.apache.xml.security.stax.ext.SecurePart securePart33 = new org.apache.xml.security.stax.ext.SecurePart(qName25, modifier26, strArray31, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter34 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor35 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter34);
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig11_ECParameters;
        org.apache.xml.security.stax.ext.stax.XMLSecEndElement xMLSecEndElement37 = finalOutputProcessor35.createEndElement(qName36);
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter39 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor40 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter39);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters42 = finalOutputProcessor40.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet43 = finalOutputProcessor40.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties44 = finalOutputProcessor40.getSecurityProperties();
        javax.xml.namespace.QName qName45 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute47 = finalOutputProcessor40.createAttribute(qName45, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray48 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute47 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList49 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList49, xMLSecAttributeArray48);
        javax.xml.namespace.QName qName51 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray52 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList53 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList53, xMLSecAttributeArray52);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace57 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray58 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace57 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList59 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList59, xMLSecNamespaceArray58);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement61 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName51, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList59);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement66 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl67 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement66);
        int int68 = xMLSecCharactersImpl67.getEventType();
        javax.xml.namespace.QName qName73 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray74 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList75 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList75, xMLSecAttributeArray74);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace79 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray80 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace79 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList81 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList81, xMLSecNamespaceArray80);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement83 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName73, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList75, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList81);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl84 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement83);
        xMLSecCharactersImpl67.setParentXMLSecStartElement(xMLSecStartElement83);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl86 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName38, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList59, xMLSecStartElement83);
        javax.xml.namespace.QName qName87 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.namespace.QName[] qNameArray88 = new javax.xml.namespace.QName[] { qName5, qName6, qName7, qName8, qName9, qName20, qName21, qName22, qName23, qName24, qName25, qName36, qName38, qName87 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList89 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList89, qNameArray88);
        dsaKeyValueSecurityToken3.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList89);
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.SignatureProperties signatureProperties93 = dOMXMLSignatureFactory0.newSignatureProperties((java.util.List) qNameList89, "http://www.w3.org/2000/09/xmldsig#Manifest");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: properties[0] is not a valid type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xMLSecEvent4);
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace15);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement19);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNotNull(qName21);
        org.junit.Assert.assertNotNull(qName22);
        org.junit.Assert.assertNotNull(qName23);
        org.junit.Assert.assertNotNull(qName24);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertTrue("'" + modifier26 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Element + "'", modifier26.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Element));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(xMLSecEndElement37);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(xMLSecCharacters42);
        org.junit.Assert.assertNotNull(wildcardClassSet43);
        org.junit.Assert.assertNull(xMLSecurityProperties44);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertNotNull(xMLSecAttribute47);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(qName51);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace57);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement61);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertNotNull(qName73);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace79);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement83);
        org.junit.Assert.assertNotNull(qName87);
        org.junit.Assert.assertNotNull(qNameArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str0 = javax.xml.crypto.dsig.DigestMethod.SHA512;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha512" + "'", str0, "http://www.w3.org/2001/04/xmlenc#sha512");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue.decode(element0);
            org.junit.Assert.fail("Expected exception of type javax.xml.crypto.MarshalException; message: java.lang.NullPointerException");
        } catch (javax.xml.crypto.MarshalException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl1 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl2 = documentContextImpl1.clone();
        java.lang.String str3 = documentContextImpl2.getEncoding();
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList4 = documentContextImpl2.getProtectionOrder();
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.SignatureProperty signatureProperty7 = dOMXMLSignatureFactory0.newSignatureProperty((java.util.List) contentTypeList4, "http://www.w3.org/2001/04/xmlenc#sha256", "http://www.w3.org/2001/10/xml-exc-c14n#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: content cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentContextImpl2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(contentTypeList4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp resolverHttp2 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp("UTF-8", "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.stax.ext.ResourceResolverLookup resourceResolverLookup5 = resolverHttp2.canResolve("http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.junit.Assert.assertNotNull(resourceResolverLookup5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName1 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String str0 = javax.xml.crypto.dsig.DigestMethod.SHA1;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#sha1" + "'", str0, "http://www.w3.org/2000/09/xmldsig#sha1");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.w3c.dom.Element element0 = null;
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext1 = null;
        java.security.Provider provider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMRetrievalMethod dOMRetrievalMethod3 = new org.apache.jcp.xml.dsig.internal.dom.DOMRetrievalMethod(element0, xMLCryptoContext1, provider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str0 = javax.xml.crypto.dsig.Transform.XSLT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xslt-19991116" + "'", str0, "http://www.w3.org/TR/1999/REC-xslt-19991116");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter1);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters4 = finalOutputProcessor2.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet5 = finalOutputProcessor2.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties6 = finalOutputProcessor2.getSecurityProperties();
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute9 = finalOutputProcessor2.createAttribute(qName7, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray10 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute9 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList11 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList11, xMLSecAttributeArray10);
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace19 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray20 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace19 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList21 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21, xMLSecNamespaceArray20);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName13, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement28 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl29 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement28);
        int int30 = xMLSecCharactersImpl29.getEventType();
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray36 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList37 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList37, xMLSecAttributeArray36);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace41 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray42 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace41 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList43 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList43, xMLSecNamespaceArray42);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName35, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList37, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList43);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl46 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement45);
        xMLSecCharactersImpl29.setParentXMLSecStartElement(xMLSecStartElement45);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl48 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName0, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList11, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList21, xMLSecStartElement45);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = xMLSecStartElementImpl48.asStartElement();
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace50 = xMLSecStartElementImpl48.getElementNamespace();
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertNotNull(xMLSecCharacters4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertNull(xMLSecurityProperties6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttribute9);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace19);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace41);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement45);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(xMLSecNamespace50);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverXPointer resolverXPointer0 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverXPointer();
        boolean boolean1 = resolverXPointer0.isSameDocumentReference();
        resolverXPointer0.setRootNodeOccured(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType keyValueTokenType0 = org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.DSA;
        org.junit.Assert.assertTrue("'" + keyValueTokenType0 + "' != '" + org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.DSA + "'", keyValueTokenType0.equals(org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType.DSA));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PREFIX_XENC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xenc" + "'", str0, "xenc");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC_TRIPLE_DES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#tripledes-cbc" + "'", str0, "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType0 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        algorithmIdentifierType0.setParameters((java.lang.Object) true);
        algorithmIdentifierType0.setAlgorithm("http://www.w3.org/2001/04/xmlenc#sha512");
        java.lang.Object obj5 = algorithmIdentifierType0.getParameters();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int0 = javax.xml.stream.XMLStreamConstants.START_ELEMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = org.apache.xml.security.stax.impl.util.IDGenerator.generateID("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7" + "'", str1, "http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "EncryptedKey");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str0 = javax.xml.crypto.dsig.XMLObject.TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#Object" + "'", str0, "http://www.w3.org/2000/09/xmldsig#Object");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.configuration.InOutAttrType inOutAttrType1 = org.apache.xml.security.configuration.InOutAttrType.fromValue("http://www.w3.org/2009/xmlenc11#aes192-gcm");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.xml.security.configuration.InOutAttrType.http://www.w3.org/2009/xmlenc11#aes192-gcm");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyName;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_HMACSHA512;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512" + "'", str0, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl1 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str2 = xMLSecEntityDeclarationImpl1.getName();
        java.lang.String str3 = xMLSecEntityDeclarationImpl1.getReplacementText();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xMLSecEntityDeclarationImpl1.writeAsEncodedUnicode(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "signatureParts" + "'", str2, "signatureParts");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet65 = finalOutputProcessor1.getBeforeProcessors();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain66 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.doFinal(outputProcessorChain66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(wildcardClassSet65);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        signatureValueSecurityEvent0.setSignatureValue(byteArray1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1, (int) (short) 10, 10);
        java.io.InputStream[] inputStreamArray8 = new java.io.InputStream[] { unsyncByteArrayInputStream7 };
        org.apache.xml.security.stax.impl.util.MultiInputStream multiInputStream9 = new org.apache.xml.security.stax.impl.util.MultiInputStream(inputStreamArray8);
        byte[] byteArray11 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        byte[] byteArray12 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = multiInputStream9.read(byteArray12, 15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(inputStreamArray8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PREFIX_WSSE11;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "wsse11" + "'", str0, "wsse11");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str0 = org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl.PROPAGATE_DEFAULT_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "propagateDefaultNamespace" + "'", str0, "propagateDefaultNamespace");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509SubjectName;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl0 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        boolean boolean1 = documentContextImpl0.isInEncryptedContent();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        javax.xml.validation.Schema schema0 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.setJaxbSchemas(schema0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        javax.xml.crypto.dsig.TransformService transformService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod dOMCanonicalizationMethod1 = new org.apache.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod(transformService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl0 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants securityEventConstants1 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants();
        java.util.Map<java.lang.Throwable, org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer> throwableMap2 = abstractSecurityContextImpl0.getAsMap((java.lang.Object) securityEventConstants1);
        org.apache.xml.security.configuration.JCEAlgorithmMappingsType jCEAlgorithmMappingsType3 = new org.apache.xml.security.configuration.JCEAlgorithmMappingsType();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement8 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl9 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement8);
        java.util.List<javax.xml.namespace.QName> qNameList10 = xMLSecCharactersImpl9.getElementPath();
        org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments11 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
        abstractSecurityContextImpl0.putAsMap((java.lang.Object) jCEAlgorithmMappingsType3, qNameList10, (org.apache.xml.security.c14n.implementations.CanonicalizerBase) canonicalizer20010315ExclOmitComments11);
        java.util.Map<org.apache.xml.security.stax.impl.securityToken.AbstractInboundSecurityToken, java.io.InputStream[]> abstractInboundSecurityTokenMap14 = abstractSecurityContextImpl0.getAsMap((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass15 = abstractSecurityContextImpl0.getClass();
        org.junit.Assert.assertNull(throwableMap2);
        org.junit.Assert.assertNotNull(qNameList10);
        org.junit.Assert.assertNull(abstractInboundSecurityTokenMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.X509V3Token;
        org.junit.Assert.assertNotNull(tokenType0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.security.interfaces.ECPublicKey eCPublicKey0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.getOIDFromPublicKey(eCPublicKey0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        unsyncByteArrayInputStream5.reset();
        // The following exception was thrown during execution in test generation
        try {
            provider1.loadFromXML((java.io.InputStream) unsyncByteArrayInputStream5);
            org.junit.Assert.fail("Expected exception of type java.util.InvalidPropertiesFormatException; message: org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Fim prematuro do arquivo.");
        } catch (java.util.InvalidPropertiesFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        java.math.BigInteger bigInteger1 = pBKDF2ParameterType0.getKeyLength();
        org.apache.xml.security.binding.xmlenc11.PRFAlgorithmIdentifierType pRFAlgorithmIdentifierType2 = pBKDF2ParameterType0.getPRF();
        java.math.BigInteger bigInteger3 = pBKDF2ParameterType0.getIterationCount();
        org.junit.Assert.assertNull(bigInteger1);
        org.junit.Assert.assertNull(pRFAlgorithmIdentifierType2);
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        signatureValueSecurityEvent0.setSignatureValue(byteArray1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1, (int) (short) 10, 10);
        java.io.InputStream[] inputStreamArray8 = new java.io.InputStream[] { unsyncByteArrayInputStream7 };
        org.apache.xml.security.stax.impl.util.MultiInputStream multiInputStream9 = new org.apache.xml.security.stax.impl.util.MultiInputStream(inputStreamArray8);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType10 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray11 = new byte[] {};
        java.io.OutputStream outputStream12 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray11, outputStream12);
        byte[] byteArray14 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray11);
        curveType10.setA(byteArray11);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent16 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray17 = new byte[] {};
        java.io.OutputStream outputStream18 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray17, outputStream18);
        signatureValueSecurityEvent16.setSignatureValue(byteArray17);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream23 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray17, (int) (short) 10, 10);
        curveType10.setA(byteArray17);
        byte[] byteArray25 = curveType10.getB();
        byte[] byteArray26 = curveType10.getA();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = multiInputStream9.read(byteArray26, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(inputStreamArray8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray1 = salt0.getSpecified();
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType2 = salt0.getOtherSource();
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNull(algorithmIdentifierType2);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.xml.security.binding.xmldsig11.ECValidationDataType eCValidationDataType0 = new org.apache.xml.security.binding.xmldsig11.ECValidationDataType();
        java.lang.String str1 = eCValidationDataType0.getHashAlgorithm();
        byte[] byteArray3 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        byte[] byteArray4 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray3);
        eCValidationDataType0.setSeed(byteArray3);
        eCValidationDataType0.setHashAlgorithm("hi!");
        eCValidationDataType0.setHashAlgorithm("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType0 = new org.apache.xml.security.binding.xmldsig.TransformsType();
        java.util.List<org.apache.xml.security.binding.xmldsig.TransformType> transformTypeList1 = transformsType0.getTransform();
        java.util.List<org.apache.xml.security.binding.xmldsig.TransformType> transformTypeList2 = transformsType0.getTransform();
        org.junit.Assert.assertNotNull(transformTypeList1);
        org.junit.Assert.assertNotNull(transformTypeList2);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_HMACOutputLength;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException0 = new org.apache.xml.security.keys.storage.StorageResolverException();
        java.lang.String str1 = storageResolverException0.getMsgID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Missing message ID" + "'", str1, "Missing message ID");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XMLDSIG_FILTER2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2002/06/xmldsig-filter2" + "'", str0, "http://www.w3.org/2002/06/xmldsig-filter2");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_X509KeyIdentifier;
        java.lang.String str1 = keyIdentifier0.getName();
        org.junit.Assert.assertNotNull(keyIdentifier0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X509KeyIdentifier" + "'", str1, "X509KeyIdentifier");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getQNameString("org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#Object");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1:http://www.w3.org/2000/09/xmldsig#Object" + "'", str2, "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1:http://www.w3.org/2000/09/xmldsig#Object");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str1 = org.apache.xml.security.stax.impl.util.IDGenerator.generateID("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62" + "'", str1, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.xml.security.utils.HelperNodeList helperNodeList1 = new org.apache.xml.security.utils.HelperNodeList(false);
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Node node3 = helperNodeList1.item((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11_WithCommentsTransformer canonicalizer11_WithCommentsTransformer0 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11_WithCommentsTransformer();
        org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature transformEnvelopedSignature1 = new org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod2 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod3 = transformEnvelopedSignature1.getPreferredTransformMethod(transformMethod2);
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod4 = canonicalizer11_WithCommentsTransformer0.getPreferredTransformMethod(transformMethod3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            canonicalizer11_WithCommentsTransformer0.setProperties(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: InclusiveNamespace-PrefixList not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + transformMethod2 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod2.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertTrue("'" + transformMethod3 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod3.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertTrue("'" + transformMethod4 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod4.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_WSSE11;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" + "'", str0, "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.XMLSignatureFactory xMLSignatureFactory2 = javax.xml.crypto.dsig.XMLSignatureFactory.getInstance("", "http://www.w3.org/2007/05/xmldsig-more#");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: http://www.w3.org/2007/05/xmldsig-more#");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType0 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        algorithmIdentifierType0.setParameters((java.lang.Object) true);
        algorithmIdentifierType0.setAlgorithm("http://www.w3.org/2001/04/xmlenc#sha512");
        algorithmIdentifierType0.setAlgorithm("http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        signerOutputStream4.reset();
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptedData;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray1 = dSAKeyValueType0.getG();
        byte[] byteArray2 = dSAKeyValueType0.getPgenCounter();
        byte[] byteArray3 = dSAKeyValueType0.getY();
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        boolean boolean12 = provider1.isEmpty();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent13 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray14 = new byte[] {};
        java.io.OutputStream outputStream15 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray14, outputStream15);
        signatureValueSecurityEvent13.setSignatureValue(byteArray14);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream20 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray14, (int) (short) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            provider1.loadFromXML((java.io.InputStream) unsyncByteArrayInputStream20);
            org.junit.Assert.fail("Expected exception of type java.util.InvalidPropertiesFormatException; message: org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Fim prematuro do arquivo.");
        } catch (java.util.InvalidPropertiesFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Class<?> wildcardClass0 = org.apache.xml.security.stax.config.ConfigurationProperties.getCallingClass();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.io.PrintStream printStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider1.list(printStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.isNamespace(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.SigDig;
        org.junit.Assert.assertNotNull(algorithmUsage0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.setAttribute(element0, "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd", "signatureParts");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.xml.security.binding.xmldsig11.FieldIDType fieldIDType0 = new org.apache.xml.security.binding.xmldsig11.FieldIDType();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType1 = fieldIDType0.getTnB();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType2 = new org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType();
        fieldIDType0.setTnB(tnBFieldParamsType2);
        org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType pnBFieldParamsType4 = fieldIDType0.getPnB();
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType5 = fieldIDType0.getPrime();
        org.junit.Assert.assertNull(tnBFieldParamsType1);
        org.junit.Assert.assertNull(pnBFieldParamsType4);
        org.junit.Assert.assertNull(primeFieldParamsType5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet65 = finalOutputProcessor1.getBeforeProcessors();
        javax.xml.namespace.QName qName66 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_wsse11_EncryptedHeader;
        org.apache.xml.security.stax.ext.stax.XMLSecEndElement xMLSecEndElement67 = finalOutputProcessor1.createEndElement(qName66);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain68 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createCharactersAndOutputAsEvent(outputProcessorChain68, "http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(wildcardClassSet65);
        org.junit.Assert.assertNotNull(qName66);
        org.junit.Assert.assertNotNull(xMLSecEndElement67);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Map<javax.xml.namespace.QName, java.lang.String> qNameMap0 = null;
        javax.xml.namespace.QName qName1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_MimeType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getQNameAttribute(qNameMap0, qName1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.xml.security.utils.Base64.decode(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.util.Enumeration<java.lang.Object> objEnumeration11 = provider1.elements();
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl12 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType14 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        documentContextImpl12.setIsInEncryptedContent(11, (java.lang.Object) algorithmIdentifierType14);
        java.util.Map<java.lang.Integer, org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> intMap16 = documentContextImpl12.getContentTypeMap();
        boolean boolean17 = provider1.containsKey((java.lang.Object) documentContextImpl12);
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objEnumeration11);
        org.junit.Assert.assertNotNull(intMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        byte[] byteArray0 = new byte[] {};
        java.io.OutputStream outputStream1 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray0, outputStream1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream3 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray0);
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType4 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray5 = dSAKeyValueType4.getG();
        byte[] byteArray6 = new byte[] {};
        java.io.OutputStream outputStream7 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray6, outputStream7);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream9 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray6);
        dSAKeyValueType4.setG(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsyncByteArrayInputStream3.read(byteArray6, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties0.setSignaturePositionStart(false);
        java.security.Key key3 = xMLSecurityProperties0.getSignatureKey();
        xMLSecurityProperties0.setEncryptionSymAlgorithm("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62");
        org.junit.Assert.assertNull(key3);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event0 = org.apache.xml.security.stax.securityEvent.SecurityEventConstants.KeyValueToken;
        org.junit.Assert.assertNotNull(event0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent3 = dsaKeyValueSecurityToken2.getXMLSecEvent();
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyInfo;
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_CanonicalizationMethod;
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_CanonicalizationMethod;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Encoding;
        javax.xml.namespace.QName qName8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray9 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList10 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList10, xMLSecAttributeArray9);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace14 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray15 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace14 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList16 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList16, xMLSecNamespaceArray15);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement18 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName8, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList10, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList16);
        javax.xml.namespace.QName qName19 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName20 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509IssuerName;
        javax.xml.namespace.QName qName21 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Encoding;
        javax.xml.namespace.QName qName22 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName23 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509IssuerName;
        javax.xml.namespace.QName qName24 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier25 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Element;
        java.lang.String[] strArray30 = new java.lang.String[] { "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#aes192-gcm", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "pss" };
        org.apache.xml.security.stax.ext.SecurePart securePart32 = new org.apache.xml.security.stax.ext.SecurePart(qName24, modifier25, strArray30, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter33 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor34 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter33);
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig11_ECParameters;
        org.apache.xml.security.stax.ext.stax.XMLSecEndElement xMLSecEndElement36 = finalOutputProcessor34.createEndElement(qName35);
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter38 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor39 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter38);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters41 = finalOutputProcessor39.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet42 = finalOutputProcessor39.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties43 = finalOutputProcessor39.getSecurityProperties();
        javax.xml.namespace.QName qName44 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute46 = finalOutputProcessor39.createAttribute(qName44, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray47 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute46 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList48 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList48, xMLSecAttributeArray47);
        javax.xml.namespace.QName qName50 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray51 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList52 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList52, xMLSecAttributeArray51);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace56 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray57 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace56 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList58 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList58, xMLSecNamespaceArray57);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement60 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName50, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList52, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList58);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement65 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl66 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement65);
        int int67 = xMLSecCharactersImpl66.getEventType();
        javax.xml.namespace.QName qName72 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray73 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList74 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList74, xMLSecAttributeArray73);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace78 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray79 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace78 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList80 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList80, xMLSecNamespaceArray79);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement82 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName72, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList74, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList80);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl83 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement82);
        xMLSecCharactersImpl66.setParentXMLSecStartElement(xMLSecStartElement82);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl85 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName37, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList48, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList58, xMLSecStartElement82);
        javax.xml.namespace.QName qName86 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.namespace.QName[] qNameArray87 = new javax.xml.namespace.QName[] { qName4, qName5, qName6, qName7, qName8, qName19, qName20, qName21, qName22, qName23, qName24, qName35, qName37, qName86 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList88 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList88, qNameArray87);
        dsaKeyValueSecurityToken2.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList88);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMX509Data dOMX509Data91 = new org.apache.jcp.xml.dsig.internal.dom.DOMX509Data((java.util.List<javax.xml.namespace.QName>) qNameList88);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: content[0] is not a valid X509Data type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xMLSecEvent3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace14);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement18);
        org.junit.Assert.assertNotNull(qName19);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNotNull(qName21);
        org.junit.Assert.assertNotNull(qName22);
        org.junit.Assert.assertNotNull(qName23);
        org.junit.Assert.assertNotNull(qName24);
        org.junit.Assert.assertTrue("'" + modifier25 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Element + "'", modifier25.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Element));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(xMLSecEndElement36);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(xMLSecCharacters41);
        org.junit.Assert.assertNotNull(wildcardClassSet42);
        org.junit.Assert.assertNull(xMLSecurityProperties43);
        org.junit.Assert.assertNotNull(qName44);
        org.junit.Assert.assertNotNull(xMLSecAttribute46);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(qName50);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace56);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertNotNull(qName72);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace78);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement82);
        org.junit.Assert.assertNotNull(qName86);
        org.junit.Assert.assertNotNull(qNameArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        int int10 = eCCurveDefinition9.getH();
        java.lang.String str11 = eCCurveDefinition9.getOid();
        java.lang.String str12 = eCCurveDefinition9.getY();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "encryptionParts" + "'", str11, "encryptionParts");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet4 = finalOutputProcessor1.getAfterProcessors();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain5 = null;
        java.security.cert.X509Certificate x509Certificate6 = null;
        java.security.cert.X509Certificate[] x509CertificateArray7 = new java.security.cert.X509Certificate[] { x509Certificate6 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createX509SubjectKeyIdentifierStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor1, outputProcessorChain5, x509CertificateArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(wildcardClassSet4);
        org.junit.Assert.assertNotNull(x509CertificateArray7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory1 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
            org.junit.Assert.fail("Expected exception of type javax.xml.crypto.NoSuchMechanismException; message: java.security.NoSuchAlgorithmException: http://www.w3.org/2001/04/xmldsig-more#rsa-sha384 KeyInfoFactory not available");
        } catch (javax.xml.crypto.NoSuchMechanismException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document1 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getOwnerDocument(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.w3c.dom.Node node0 = null;
        org.w3c.dom.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.appendChild(node0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.util.Enumeration<java.lang.Object> objEnumeration11 = provider1.elements();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider1.load(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objEnumeration11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int0 = javax.xml.stream.XMLStreamConstants.PROCESSING_INSTRUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet65 = finalOutputProcessor1.getBeforeProcessors();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain66 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.doFinal(outputProcessorChain66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(wildcardClassSet65);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyNameToken;
        org.junit.Assert.assertNotNull(tokenType0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl8 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str9 = xMLSecEntityDeclarationImpl8.getPublicId();
        java.lang.String str10 = xMLSecEntityDeclarationImpl8.getNotationName();
        java.lang.Object obj11 = provider1.getOrDefault((java.lang.Object) byteArray2, (java.lang.Object) str10);
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Seed;
        boolean boolean13 = provider1.contains((java.lang.Object) qName12);
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        int int4 = finalOutputProcessor1.getActionOrder();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain5 = null;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray8 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList9 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList9, xMLSecAttributeArray8);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace13 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList15, xMLSecNamespaceArray14);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement17 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName7, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList9, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList15);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier19 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart20 = new org.apache.xml.security.stax.ext.SecurePart(qName7, true, modifier19);
        org.apache.xml.security.stax.ext.SecurePart securePart21 = new org.apache.xml.security.stax.ext.SecurePart("hi!", modifier19);
        javax.xml.namespace.QName qName22 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray23 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList24 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList24, xMLSecAttributeArray23);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace28 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray29 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace28 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList30 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList30, xMLSecNamespaceArray29);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName22, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList24, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList30);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier34 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart35 = new org.apache.xml.security.stax.ext.SecurePart(qName22, true, modifier34);
        securePart21.setName(qName22);
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createEndElementAndOutputAsEvent(outputProcessorChain5, qName22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace13);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement17);
        org.junit.Assert.assertTrue("'" + modifier19 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier19.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNotNull(qName22);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace28);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement32);
        org.junit.Assert.assertTrue("'" + modifier34 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier34.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyUsage keyUsage1 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyUsage("encryptionParts");
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken2 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray4 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList5 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList5, contentTypeArray4);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent7 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken2, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList5);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList8 = signedElementSecurityEvent7.getProtectionOrder();
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl9 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants securityEventConstants10 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants();
        java.util.Map<java.lang.Throwable, org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer> throwableMap11 = abstractSecurityContextImpl9.getAsMap((java.lang.Object) securityEventConstants10);
        org.apache.xml.security.configuration.JCEAlgorithmMappingsType jCEAlgorithmMappingsType12 = new org.apache.xml.security.configuration.JCEAlgorithmMappingsType();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement17 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl18 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement17);
        java.util.List<javax.xml.namespace.QName> qNameList19 = xMLSecCharactersImpl18.getElementPath();
        org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments20 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
        abstractSecurityContextImpl9.putAsMap((java.lang.Object) jCEAlgorithmMappingsType12, qNameList19, (org.apache.xml.security.c14n.implementations.CanonicalizerBase) canonicalizer20010315ExclOmitComments20);
        java.lang.String str22 = canonicalizer20010315ExclOmitComments20.engineGetURI();
        org.apache.xml.security.stax.impl.util.KeyValue<org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent, org.apache.xml.security.c14n.CanonicalizerSpi> abstractElementSecurityEventKeyValue23 = new org.apache.xml.security.stax.impl.util.KeyValue<org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent, org.apache.xml.security.c14n.CanonicalizerSpi>((org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent) signedElementSecurityEvent7, (org.apache.xml.security.c14n.CanonicalizerSpi) canonicalizer20010315ExclOmitComments20);
        boolean boolean24 = keyUsage1.equals((java.lang.Object) signedElementSecurityEvent7);
        java.lang.String str25 = keyUsage1.getName();
        org.junit.Assert.assertNotNull(contentTypeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contentTypeList8);
        org.junit.Assert.assertNull(throwableMap11);
        org.junit.Assert.assertNotNull(qNameList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str22, "http://www.w3.org/2001/10/xml-exc-c14n#");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "encryptionParts" + "'", str25, "encryptionParts");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.w3c.dom.Node node0 = null;
        org.w3c.dom.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.nodesEqual(node0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray13 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList14 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList14, xMLSecAttributeArray13);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace18 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray19 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace18 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList20 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList20, xMLSecNamespaceArray19);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement22 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName12, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList14, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList20);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl28 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement27);
        int int29 = xMLSecCharactersImpl28.getEventType();
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray35 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList36 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, xMLSecAttributeArray35);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace40 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray41 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace40 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList42 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList42, xMLSecNamespaceArray41);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement44 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName34, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList42);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl45 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement44);
        xMLSecCharactersImpl28.setParentXMLSecStartElement(xMLSecStartElement44);
        java.lang.Object obj47 = provider1.replace((java.lang.Object) xMLSecNamespaceList20, (java.lang.Object) xMLSecCharactersImpl28);
        int int48 = provider1.size();
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace18);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace40);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement44);
        org.junit.Assert.assertNull(obj47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 38 + "'", int48 == 38);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.xml.security.configuration.ConfigurationType configurationType0 = new org.apache.xml.security.configuration.ConfigurationType();
        org.apache.xml.security.configuration.SecurityHeaderHandlersType securityHeaderHandlersType1 = configurationType0.getSecurityHeaderHandlers();
        org.apache.xml.security.configuration.PropertiesType propertiesType2 = configurationType0.getProperties();
        configurationType0.setTarget("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
        org.junit.Assert.assertNull(securityHeaderHandlersType1);
        org.junit.Assert.assertNull(propertiesType2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace2 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("wsse11", "PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY");
        org.junit.Assert.assertNotNull(xMLSecNamespace2);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        boolean boolean6 = iVSplittingOutputStream5.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream7 = null;
        iVSplittingOutputStream5.setParentOutputStream(replaceableOuputStream7);
        byte[] byteArray9 = iVSplittingOutputStream5.getIv();
        byte[] byteArray10 = new byte[] {};
        java.io.OutputStream outputStream11 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray10, outputStream11);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream13 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray10);
        byte[] byteArray14 = new byte[] {};
        java.io.OutputStream outputStream15 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray14, outputStream15);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream17 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray14);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream18 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray14);
        int int19 = unsyncByteArrayInputStream13.read(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            iVSplittingOutputStream5.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial dOMX509IssuerSerial2 = new org.apache.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial("signatureParts", bigInteger1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: serialNumber cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement5 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl6 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement5);
        java.util.List<javax.xml.namespace.QName> qNameList7 = xMLSecCharactersImpl6.getElementPath();
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.Manifest manifest8 = dOMXMLSignatureFactory0.newManifest((java.util.List) qNameList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: list of references must contain at least one entry");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qNameList7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage_Encryption;
        boolean boolean2 = tokenUsage0.equals((java.lang.Object) 10.0f);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tokenUsage0.compareTo(tokenUsage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenUsage0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters1 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecCharacters("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
        org.junit.Assert.assertNotNull(xMLSecCharacters1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        javax.xml.crypto.dsig.TransformService transformService0 = null;
        org.apache.jcp.xml.dsig.internal.dom.DOMTransform dOMTransform1 = new org.apache.jcp.xml.dsig.internal.dom.DOMTransform(transformService0);
        org.w3c.dom.Node node2 = null;
        org.apache.jcp.xml.dsig.internal.dom.DOMSubTreeData dOMSubTreeData4 = new org.apache.jcp.xml.dsig.internal.dom.DOMSubTreeData(node2, false);
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.Data data6 = dOMTransform1.transform((javax.xml.crypto.Data) dOMSubTreeData4, xMLCryptoContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.util.Collection<java.lang.Object> objCollection11 = provider1.values();
        java.security.Provider.Service service14 = provider1.getService("http://www.w3.org/2000/09/xmldsig#SignatureProperties", "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertNull(service14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        boolean boolean6 = iVSplittingOutputStream5.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream7 = null;
        iVSplittingOutputStream5.setParentOutputStream(replaceableOuputStream7);
        byte[] byteArray9 = iVSplittingOutputStream5.getIv();
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory10 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider11 = keyInfoFactory10.getProvider();
        byte[] byteArray12 = new byte[] {};
        java.io.OutputStream outputStream13 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray12, outputStream13);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream15 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray12);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream16 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray12);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl18 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str19 = xMLSecEntityDeclarationImpl18.getPublicId();
        java.lang.String str20 = xMLSecEntityDeclarationImpl18.getNotationName();
        java.lang.Object obj21 = provider11.getOrDefault((java.lang.Object) byteArray12, (java.lang.Object) str20);
        // The following exception was thrown during execution in test generation
        try {
            iVSplittingOutputStream5.write(byteArray12, 0, 76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(keyInfoFactory10);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_WITH_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments" + "'", str0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        int int10 = eCCurveDefinition9.getH();
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = eCCurveDefinition9.equals(bigInteger11, bigInteger12, bigInteger13, bigInteger14, bigInteger15, bigInteger16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl8 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str9 = xMLSecEntityDeclarationImpl8.getPublicId();
        java.lang.String str10 = xMLSecEntityDeclarationImpl8.getNotationName();
        java.lang.Object obj11 = provider1.getOrDefault((java.lang.Object) byteArray2, (java.lang.Object) str10);
        java.lang.String str13 = provider1.getProperty("propagateDefaultNamespace");
        java.lang.String str14 = provider1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<?> wildcardEnumeration15 = provider1.propertyNames();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "XMLDSig version 1.8" + "'", str14, "XMLDSig version 1.8");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial dOMX509IssuerSerial1 = new org.apache.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_PHYSICAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://santuario.apache.org/c14n/physical" + "'", str0, "http://santuario.apache.org/c14n/physical");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray1 = dSAKeyValueType0.getG();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        dSAKeyValueType0.setG(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.convertXMLDSIGtoASN1(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants securityTokenConstants0 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        org.apache.xml.security.stax.ext.XMLSecurityConstants.Action action65 = finalOutputProcessor1.getAction();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createKeyNameTokenStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor1, outputProcessorChain66, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNull(action65);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain65 = null;
        java.security.cert.X509Certificate x509Certificate66 = null;
        java.security.cert.X509Certificate[] x509CertificateArray67 = new java.security.cert.X509Certificate[] { x509Certificate66 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createKeyValueTokenStructure((org.apache.xml.security.stax.ext.AbstractOutputProcessor) finalOutputProcessor1, outputProcessorChain65, x509CertificateArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(x509CertificateArray67);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.configuration.InOutAttrType inOutAttrType1 = org.apache.xml.security.configuration.InOutAttrType.fromValue("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.xml.security.configuration.InOutAttrType.http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType0 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        algorithmIdentifierType0.setParameters((java.lang.Object) true);
        java.lang.String str3 = algorithmIdentifierType0.getAlgorithm();
        java.lang.String str4 = algorithmIdentifierType0.getAlgorithm();
        algorithmIdentifierType0.setAlgorithm("http://www.w3.org/2004/08/xop/include");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        signatureValueSecurityEvent0.setSignatureValue(byteArray1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1, (int) (short) 10, 10);
        boolean boolean8 = unsyncByteArrayInputStream7.markSupported();
        int int9 = unsyncByteArrayInputStream7.read();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList1 = xMLSecurityProperties0.getSignatureSecureParts();
        byte[] byteArray2 = xMLSecurityProperties0.getEncryptionKeyTransportOAEPParams();
        xMLSecurityProperties0.setSignatureGenerateIds(true);
        org.junit.Assert.assertNotNull(securePartList1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int0 = javax.xml.stream.XMLStreamConstants.NOTATION_DECLARATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier1 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties0.setEncryptionKeyIdentifier(keyIdentifier1);
        java.lang.String str3 = xMLSecurityProperties0.getEncryptionKeyTransportDigestAlgorithm();
        org.junit.Assert.assertNotNull(keyIdentifier1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl0 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl1 = documentContextImpl0.clone();
        java.lang.String str2 = documentContextImpl1.getEncoding();
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList3 = documentContextImpl1.getProtectionOrder();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentContextImpl1.unsetIsInSignedContent(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentContextImpl1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(contentTypeList3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element1 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getLastChildElement(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase.C14NStack<org.apache.xml.security.stax.securityToken.SecurityTokenFactory> securityTokenFactoryQueue0 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase.C14NStack<org.apache.xml.security.stax.securityToken.SecurityTokenFactory>();
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment1 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("http://www.w3.org/2001/04/xmldsig-more#");
        org.junit.Assert.assertNotNull(xMLSecComment1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage1 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage("");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl0 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType2 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        documentContextImpl0.setIsInEncryptedContent(11, (java.lang.Object) algorithmIdentifierType2);
        algorithmIdentifierType2.setAlgorithm("EncryptedKey");
        java.lang.String str6 = algorithmIdentifierType2.getAlgorithm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EncryptedKey" + "'", str6, "EncryptedKey");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.xml.security.binding.xmlenc11.DerivedKeyType derivedKeyType0 = new org.apache.xml.security.binding.xmlenc11.DerivedKeyType();
        java.lang.String str1 = derivedKeyType0.getDerivedKeyName();
        derivedKeyType0.setMasterKeyName("hi!");
        derivedKeyType0.setMasterKeyName("http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
        java.lang.String str6 = derivedKeyType0.getRecipient();
        java.lang.String str7 = derivedKeyType0.getMasterKeyName();
        derivedKeyType0.setMasterKeyName("http://www.w3.org/2001/04/xmlenc#sha512");
        java.lang.String str10 = derivedKeyType0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rawX509Certificate" + "'", str7, "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.xml.security.stax.ext.SecurePart securePart1 = new org.apache.xml.security.stax.ext.SecurePart("wsse11");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        boolean boolean2 = dOMXMLSignatureFactory0.isFeatureSupported("http://www.w3.org/2009/xmlenc11#mgf1sha224");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName5 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean7 = dOMKeyName5.isFeatureSupported("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        java.lang.String str8 = dOMKeyName5.getName();
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.Transform transform9 = dOMXMLSignatureFactory0.newTransform("http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7", (javax.xml.crypto.XMLStructure) dOMKeyName5);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7 algorithm and DOM mechanism not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5" + "'", str8, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType0 = new org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType();
        java.math.BigInteger bigInteger1 = tnBFieldParamsType0.getM();
        java.math.BigInteger bigInteger2 = null;
        tnBFieldParamsType0.setK(bigInteger2);
        java.math.BigInteger bigInteger4 = tnBFieldParamsType0.getK();
        org.junit.Assert.assertNull(bigInteger1);
        org.junit.Assert.assertNull(bigInteger4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.xml.security.configuration.HandlerType handlerType0 = new org.apache.xml.security.configuration.HandlerType();
        java.lang.String str1 = handlerType0.getNAME();
        handlerType0.setJAVACLASS("http://www.w3.org/2000/09/xmldsig#Manifest");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMSignatureProperty dOMSignatureProperty1 = new org.apache.jcp.xml.dsig.internal.dom.DOMSignatureProperty(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_SignatureMethod;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        javax.xml.validation.Schema schema0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.getJaxbSchemas();
        org.junit.Assert.assertNull(schema0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int int0 = javax.xml.stream.XMLStreamConstants.START_DOCUMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        x509TokenSecurityEvent0.setCorrelationID("");
        x509TokenSecurityEvent0.setCorrelationID("encryptionParts");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent5 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        x509TokenSecurityEvent5.setCorrelationID("");
        x509TokenSecurityEvent5.setCorrelationID("encryptionParts");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType12 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key13 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken14 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType12, key13);
        org.apache.xml.security.stax.ext.OutputProcessor outputProcessor15 = genericOutboundSecurityToken14.getProcessor();
        x509TokenSecurityEvent5.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) genericOutboundSecurityToken14);
        x509TokenSecurityEvent0.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) genericOutboundSecurityToken14);
        org.junit.Assert.assertNull(outputProcessor15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.xml.security.encryption.DocumentSerializer documentSerializer1 = new org.apache.xml.security.encryption.DocumentSerializer(false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        java.security.PublicKey publicKey1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.KeyValue keyValue2 = dOMKeyInfoFactory0.newKeyValue(publicKey1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType0 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        org.apache.xml.security.binding.xmlenc.ReferenceList referenceList1 = encryptedKeyType0.getReferenceList();
        java.lang.String str2 = encryptedKeyType0.getMimeType();
        org.apache.xml.security.binding.xmlenc.ReferenceList referenceList3 = encryptedKeyType0.getReferenceList();
        org.junit.Assert.assertNull(referenceList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(referenceList3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.xml.security.configuration.TransformAlgorithmType transformAlgorithmType0 = new org.apache.xml.security.configuration.TransformAlgorithmType();
        java.lang.String str1 = transformAlgorithmType0.getValue();
        java.lang.String str2 = transformAlgorithmType0.getJAVACLASS();
        java.lang.String str3 = transformAlgorithmType0.getJAVACLASS();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec rSAPSSParameterSpec2 = new org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec();
        boolean boolean4 = rSAPSSParameterSpec2.equals((java.lang.Object) "http://www.w3.org/2009/xmlenc11#mgf1sha224");
        rSAPSSParameterSpec2.setTrailerField(10);
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.SignatureMethod signatureMethod7 = dOMXMLSignatureFactory0.newSignatureMethod("dsig11", (javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec) rSAPSSParameterSpec2);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: unsupported algorithm");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getQNameString("http://www.w3.org/2009/xmlenc11#aes192-gcm", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://www.w3.org/2009/xmlenc11#aes192-gcm:http://www.w3.org/2000/09/xmldsig#DSAKeyValue" + "'", str2, "http://www.w3.org/2009/xmlenc11#aes192-gcm:http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray5 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList6 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList6, xMLSecAttributeArray5);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace10 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray11 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace10 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList12 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12, xMLSecNamespaceArray11);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement14 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList6, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList12);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl15 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement14);
        boolean boolean16 = xMLSecCharactersImpl15.isEndDocument();
        boolean boolean17 = xMLSecCharactersImpl15.isCData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement18 = xMLSecCharactersImpl15.asStartElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace10);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String str1 = org.apache.xml.security.stax.impl.util.IDGenerator.generateID("http://www.w3.org/2000/09/xmldsig#Manifest");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2000/09/xmldsig#Manifest99d06381-3121-4455-9c1c-508aec34b8b8" + "'", str1, "http://www.w3.org/2000/09/xmldsig#Manifest99d06381-3121-4455-9c1c-508aec34b8b8");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        javax.crypto.Mac mac0 = null;
        org.apache.jcp.xml.dsig.internal.MacOutputStream macOutputStream1 = new org.apache.jcp.xml.dsig.internal.MacOutputStream(mac0);
        java.security.Signature signature2 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream3 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature2);
        javax.crypto.Cipher cipher4 = null;
        java.security.Key key5 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream7 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream3, cipher4, key5, 0);
        boolean boolean8 = iVSplittingOutputStream7.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream9 = null;
        iVSplittingOutputStream7.setParentOutputStream(replaceableOuputStream9);
        byte[] byteArray11 = iVSplittingOutputStream7.getIv();
        // The following exception was thrown during execution in test generation
        try {
            macOutputStream1.write(byteArray11, 14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.xml.security.stax.securityEvent.DefaultTokenSecurityEvent defaultTokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.DefaultTokenSecurityEvent();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XENC_AES256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc" + "'", str0, "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.xml.security.binding.xmldsig.pss.MaskGenerationFunctionType maskGenerationFunctionType0 = new org.apache.xml.security.binding.xmldsig.pss.MaskGenerationFunctionType();
        org.apache.xml.security.binding.xmldsig.DigestMethodType digestMethodType1 = maskGenerationFunctionType0.getDigestMethod();
        java.lang.String str2 = maskGenerationFunctionType0.getAlgorithm();
        org.junit.Assert.assertNull(digestMethodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://www.w3.org/2007/05/xmldsig-more#MGF1" + "'", str2, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters1 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecCData("http://www.w3.org/2009/xmlenc11#mgf1sha512");
        org.junit.Assert.assertNotNull(xMLSecCharacters1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getIdAttributeValue(element0, "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        java.util.Enumeration<java.lang.Object> objEnumeration12 = provider1.elements();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider1.list(printWriter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertNotNull(objEnumeration12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException0 = new org.apache.xml.security.keys.keyresolver.KeyResolverException();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl0 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants securityEventConstants1 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants();
        java.util.Map<java.lang.Throwable, org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer> throwableMap2 = abstractSecurityContextImpl0.getAsMap((java.lang.Object) securityEventConstants1);
        org.apache.xml.security.stax.securityEvent.SecurityEventListener securityEventListener3 = null;
        abstractSecurityContextImpl0.addSecurityEventListener(securityEventListener3);
        org.junit.Assert.assertNull(throwableMap2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName1 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean3 = dOMKeyName1.isFeatureSupported("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer0 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer();
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer1 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer();
        canonicalizer20010315_OmitCommentsTransformer0.setTransformer((org.apache.xml.security.stax.ext.Transformer) canonicalizer20010315_OmitCommentsTransformer1);
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.Transformer transformer12 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getTransformer((org.apache.xml.security.stax.ext.Transformer) canonicalizer20010315_OmitCommentsTransformer0, (java.io.OutputStream) signerOutputStream4, strMap9, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", dIRECTION11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dIRECTION11 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT + "'", dIRECTION11.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp resolverHttp2 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp("org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1", "xenc");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken1 = x509TokenSecurityEvent0.getSecurityToken();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType2 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext3 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken4 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType2, inboundSecurityContext3);
        java.util.List<javax.xml.namespace.QName> qNameList5 = dsaKeyValueSecurityToken4.getElementPath();
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier9 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart10 = new org.apache.xml.security.stax.ext.SecurePart(qName8, modifier9);
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        javax.xml.namespace.QName qName28 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName30 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName31 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName[] qNameArray38 = new javax.xml.namespace.QName[] { qName6, qName7, qName8, qName11, qName12, qName13, qName14, qName15, qName16, qName17, qName28, qName29, qName30, qName31, qName32, qName33, qName34, qName35, qName36, qName37 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList39 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList39, qNameArray38);
        dsaKeyValueSecurityToken4.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList39);
        x509TokenSecurityEvent0.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken4);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage43 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage_Encryption;
        boolean boolean45 = tokenUsage43.equals((java.lang.Object) 10.0f);
        dsaKeyValueSecurityToken4.addTokenUsage(tokenUsage43);
        boolean boolean47 = dsaKeyValueSecurityToken4.isAsymmetric();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage49 = org.apache.xml.security.stax.ext.XMLSecurityConstants.Asym_Key_Wrap;
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName51 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean53 = dOMKeyName51.isFeatureSupported("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        org.apache.xml.security.binding.xmldsig11.CurveType curveType54 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray55 = new byte[] {};
        java.io.OutputStream outputStream56 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray55, outputStream56);
        byte[] byteArray58 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray55);
        curveType54.setA(byteArray55);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent60 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray61 = new byte[] {};
        java.io.OutputStream outputStream62 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray61, outputStream62);
        signatureValueSecurityEvent60.setSignatureValue(byteArray61);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream67 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray61, (int) (short) 10, 10);
        curveType54.setA(byteArray61);
        boolean boolean69 = dOMKeyName51.equals((java.lang.Object) curveType54);
        boolean boolean70 = algorithmUsage49.equals((java.lang.Object) curveType54);
        java.security.Key key72 = dsaKeyValueSecurityToken4.getSecretKey("org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1", algorithmUsage49, "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1:http://www.w3.org/2000/09/xmldsig#Object");
        java.util.Map<java.lang.String, java.security.Key> strMap73 = dsaKeyValueSecurityToken4.getSecretKey();
        org.junit.Assert.assertNull(securityToken1);
        org.junit.Assert.assertNull(qNameList5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(qNameArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tokenUsage43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(algorithmUsage49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(key72);
        org.junit.Assert.assertNotNull(strMap73);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties0.setSignaturePositionStart(false);
        xMLSecurityProperties0.setSignatureGenerateIds(true);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties5 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties5.setSignaturePositionStart(false);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties8 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean9 = xMLSecurityProperties8.isDisableSchemaValidation();
        java.security.Key key10 = xMLSecurityProperties8.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment12 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl28 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement27);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray29 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment12, xMLSecCharactersImpl28 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue30 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue30, xMLSecEventArray29);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor32 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties8, xMLSecEventQueue30);
        xMLSecurityProperties5.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor32);
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain34 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent35 = internalReplayProcessor32.processHeaderEvent(inputProcessorChain34);
        xMLSecurityProperties0.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor32);
        boolean boolean37 = xMLSecurityProperties0.isDisableSchemaValidation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(key10);
        org.junit.Assert.assertNotNull(xMLSecComment12);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertNotNull(xMLSecEventArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(xMLSecEvent35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.xml.security.binding.xmldsig.SignedInfoType signedInfoType0 = new org.apache.xml.security.binding.xmldsig.SignedInfoType();
        signedInfoType0.setId("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
        signedInfoType0.setId("http://www.w3.org/2000/09/xmldsig#");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer0 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer();
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11 canonicalizer11_2 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11(false);
        canonicalizer11_2.doFinal();
        canonicalizer20010315_OmitCommentsTransformer0.setTransformer((org.apache.xml.security.stax.ext.Transformer) canonicalizer11_2);
        canonicalizer11_2.doFinal();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        javax.crypto.Mac mac0 = null;
        org.apache.jcp.xml.dsig.internal.MacOutputStream macOutputStream1 = new org.apache.jcp.xml.dsig.internal.MacOutputStream(mac0);
        macOutputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            macOutputStream1.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PREFIX_XENC11;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xenc11" + "'", str0, "xenc11");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.Asym_Key_Wrap;
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName2 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean4 = dOMKeyName2.isFeatureSupported("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        org.apache.xml.security.binding.xmldsig11.CurveType curveType5 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray6 = new byte[] {};
        java.io.OutputStream outputStream7 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray6, outputStream7);
        byte[] byteArray9 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray6);
        curveType5.setA(byteArray6);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent11 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray12 = new byte[] {};
        java.io.OutputStream outputStream13 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray12, outputStream13);
        signatureValueSecurityEvent11.setSignatureValue(byteArray12);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream18 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray12, (int) (short) 10, 10);
        curveType5.setA(byteArray12);
        boolean boolean20 = dOMKeyName2.equals((java.lang.Object) curveType5);
        boolean boolean21 = algorithmUsage0.equals((java.lang.Object) curveType5);
        java.lang.String str22 = algorithmUsage0.getName();
        org.junit.Assert.assertNotNull(algorithmUsage0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Asym_Key_Wrap" + "'", str22, "Asym_Key_Wrap");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String str0 = javax.xml.crypto.dsig.keyinfo.KeyValue.RSA_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#RSAKeyValue" + "'", str0, "http://www.w3.org/2000/09/xmldsig#RSAKeyValue");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.exceptions.XMLSecurityRuntimeException xMLSecurityRuntimeException2 = new org.apache.xml.security.exceptions.XMLSecurityRuntimeException((java.lang.Exception) uncheckedXMLSecurityException1);
        java.lang.Exception exception3 = xMLSecurityRuntimeException2.getOriginalException();
        java.lang.Exception exception4 = xMLSecurityRuntimeException2.getOriginalException();
        org.junit.Assert.assertNotNull(exception3);
        org.junit.Assert.assertNotNull(exception4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName1 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean3 = dOMKeyName1.isFeatureSupported("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl5 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str6 = xMLSecEntityDeclarationImpl5.getName();
        java.lang.String str7 = xMLSecEntityDeclarationImpl5.getReplacementText();
        boolean boolean8 = dOMKeyName1.equals((java.lang.Object) xMLSecEntityDeclarationImpl5);
        boolean boolean9 = xMLSecEntityDeclarationImpl5.isEntityReference();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement10 = xMLSecEntityDeclarationImpl5.asStartElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "signatureParts" + "'", str6, "signatureParts");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.security.PublicKey publicKey1 = null;
        org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver singleKeyResolver2 = new org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver("UTF-8", publicKey1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.Action action1 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.Action("http://www.w3.org/2000/09/xmldsig#sha1");
        java.lang.String str2 = action1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://www.w3.org/2000/09/xmldsig#sha1" + "'", str2, "http://www.w3.org/2000/09/xmldsig#sha1");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        java.math.BigInteger bigInteger1 = pBKDF2ParameterType0.getKeyLength();
        java.math.BigInteger bigInteger2 = pBKDF2ParameterType0.getIterationCount();
        org.junit.Assert.assertNull(bigInteger1);
        org.junit.Assert.assertNull(bigInteger2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTION" + "'", str0, "PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTION");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        boolean boolean3 = dsaKeyValueSecurityToken2.isIncludedInMessage();
        java.util.List<org.apache.xml.security.stax.securityToken.InboundSecurityToken> inboundSecurityTokenList4 = dsaKeyValueSecurityToken2.getWrappedTokens();
        boolean boolean5 = dsaKeyValueSecurityToken2.isIncludedInMessage();
        java.lang.String str6 = dsaKeyValueSecurityToken2.getSha1Identifier();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType7 = dsaKeyValueSecurityToken2.getTokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(inboundSecurityTokenList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tokenType7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        byte[] byteArray0 = new byte[] {};
        java.io.OutputStream outputStream1 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray0, outputStream1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream3 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray0);
        byte[] byteArray4 = new byte[] {};
        java.io.OutputStream outputStream5 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray4, outputStream5);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray4);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream8 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray4);
        int int9 = unsyncByteArrayInputStream3.read(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.convertASN1toXMLDSIG(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Invalid ASN.1 format of ECDSA signature");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        boolean boolean2 = dOMXMLSignatureFactory0.isFeatureSupported("http://www.w3.org/2009/xmlenc11#mgf1sha224");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory3 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider4 = keyInfoFactory3.getProvider();
        java.security.Signature signature6 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream7 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature6);
        javax.crypto.Cipher cipher8 = null;
        java.security.Key key9 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream11 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream7, cipher8, key9, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream12 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream7);
        boolean boolean13 = provider4.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream7);
        java.lang.String str14 = provider4.getInfo();
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray16 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, xMLSecAttributeArray16);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace21 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray22 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace21 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList23 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23, xMLSecNamespaceArray22);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement25 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement30 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl31 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement30);
        int int32 = xMLSecCharactersImpl31.getEventType();
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray38 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList39 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList39, xMLSecAttributeArray38);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace43 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray44 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace43 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList45 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList45, xMLSecNamespaceArray44);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement47 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName37, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList45);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl48 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement47);
        xMLSecCharactersImpl31.setParentXMLSecStartElement(xMLSecStartElement47);
        java.lang.Object obj50 = provider4.replace((java.lang.Object) xMLSecNamespaceList23, (java.lang.Object) xMLSecCharactersImpl31);
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.SignatureProperty signatureProperty53 = dOMXMLSignatureFactory0.newSignatureProperty((java.util.List) xMLSecNamespaceList23, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: content[0] is not a valid type");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(keyInfoFactory3);
        org.junit.Assert.assertNotNull(provider4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str14, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace21);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace43);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement47);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.xml.security.utils.Base64.decodeBigIntegerFromElement(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_XML;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken1 = x509TokenSecurityEvent0.getSecurityToken();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType2 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext3 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken4 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType2, inboundSecurityContext3);
        java.util.List<javax.xml.namespace.QName> qNameList5 = dsaKeyValueSecurityToken4.getElementPath();
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier9 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart10 = new org.apache.xml.security.stax.ext.SecurePart(qName8, modifier9);
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        javax.xml.namespace.QName qName28 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName30 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName31 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName[] qNameArray38 = new javax.xml.namespace.QName[] { qName6, qName7, qName8, qName11, qName12, qName13, qName14, qName15, qName16, qName17, qName28, qName29, qName30, qName31, qName32, qName33, qName34, qName35, qName36, qName37 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList39 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList39, qNameArray38);
        dsaKeyValueSecurityToken4.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList39);
        x509TokenSecurityEvent0.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken4);
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event43 = x509TokenSecurityEvent0.getSecurityEventType();
        org.junit.Assert.assertNull(securityToken1);
        org.junit.Assert.assertNull(qNameList5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(qNameArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(event43);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        java.lang.String str10 = eCCurveDefinition9.getName();
        java.lang.String str11 = eCCurveDefinition9.getB();
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger16 = null;
        java.math.BigInteger bigInteger17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = eCCurveDefinition9.equals(bigInteger12, bigInteger13, bigInteger14, bigInteger15, bigInteger16, bigInteger17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature" + "'", str10, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#" + "'", str11, "http://www.w3.org/2001/04/xmldsig-more#");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl0 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl1 = documentContextImpl0.clone();
        java.lang.String str2 = documentContextImpl0.getEncoding();
        org.junit.Assert.assertNotNull(documentContextImpl1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        signatureValueSecurityEvent0.setSignatureValue(byteArray1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1, (int) (short) 10, 10);
        unsyncByteArrayInputStream7.reset();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig11.X509DigestType x509DigestType1 = new org.apache.xml.security.binding.xmldsig11.X509DigestType();
        x509DigestType1.setAlgorithm("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.X509DigestType> x509DigestTypeJAXBElement4 = objectFactory0.createX509Digest(x509DigestType1);
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType5 = objectFactory0.createTnBFieldParamsType();
        org.junit.Assert.assertNotNull(x509DigestTypeJAXBElement4);
        org.junit.Assert.assertNotNull(tnBFieldParamsType5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.xml.security.binding.xmldsig11.FieldIDType fieldIDType0 = new org.apache.xml.security.binding.xmldsig11.FieldIDType();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType1 = fieldIDType0.getTnB();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType2 = new org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType();
        fieldIDType0.setTnB(tnBFieldParamsType2);
        org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType pnBFieldParamsType4 = fieldIDType0.getPnB();
        org.apache.xml.security.binding.xmldsig11.CharTwoFieldParamsType charTwoFieldParamsType5 = fieldIDType0.getGnB();
        org.junit.Assert.assertNull(tnBFieldParamsType1);
        org.junit.Assert.assertNull(pnBFieldParamsType4);
        org.junit.Assert.assertNull(charTwoFieldParamsType5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_C14N_EXCL_OMIT_COMMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str0, "http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream6 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream1);
        unsyncBufferedOutputStream6.flush();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream8 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) unsyncBufferedOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor10 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor((java.io.OutputStream) replaceableOuputStream8, "");
            org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException; message: java.io.UnsupportedEncodingException: ");
        } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray1 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType0 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList2 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList2, contentTypeArray1);
        byte[] byteArray5 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray5);
        java.io.InputStream inputStream7 = xMLSignatureInput6.getOctetStream();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray9 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType8 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList10 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList10, contentTypeArray9);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken12 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray14 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList15, contentTypeArray14);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent17 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken12, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList15);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement18 = null;
        java.util.Set<java.lang.String> strSet20 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement18, true);
        boolean boolean21 = contentTypeList15.removeAll((java.util.Collection<java.lang.String>) strSet20);
        boolean boolean22 = contentTypeList10.containsAll((java.util.Collection<java.lang.String>) strSet20);
        org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger23 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput6, strSet20);
        boolean boolean24 = contentTypeList2.removeAll((java.util.Collection<java.lang.String>) strSet20);
        java.util.Collection<java.lang.String> strCollection25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = contentTypeList2.retainAll(strCollection25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + contentType0 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE + "'", contentType0.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE));
        org.junit.Assert.assertNotNull(contentTypeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + contentType8 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType8.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
        org.junit.Assert.assertNotNull(contentTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(contentTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.util.Collection<java.lang.Object> objCollection11 = provider1.values();
        java.lang.String str14 = provider1.getProperty("http://www.w3.org/2000/09/xmldsig#PGPData", "http://www.w3.org/2000/09/xmldsig#RSAKeyValue");
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://www.w3.org/2000/09/xmldsig#RSAKeyValue" + "'", str14, "http://www.w3.org/2000/09/xmldsig#RSAKeyValue");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.ResourceBundle resourceBundle0 = null;
        org.apache.xml.security.utils.I18n.init(resourceBundle0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Modulus;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream6 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream1);
        unsyncBufferedOutputStream6.flush();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream8 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) unsyncBufferedOutputStream6);
        byte[] byteArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsyncBufferedOutputStream6.write(byteArray9, 15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.xml.security.exceptions.XMLSecurityRuntimeException xMLSecurityRuntimeException0 = new org.apache.xml.security.exceptions.XMLSecurityRuntimeException();
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.exceptions.XMLSecurityRuntimeException xMLSecurityRuntimeException2 = new org.apache.xml.security.exceptions.XMLSecurityRuntimeException((java.lang.Exception) uncheckedXMLSecurityException1);
        java.lang.Exception exception3 = xMLSecurityRuntimeException2.getOriginalException();
        org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException4 = new org.apache.xml.security.exceptions.XMLSecurityException(exception3);
        org.apache.xml.security.signature.XMLSignatureException xMLSignatureException5 = new org.apache.xml.security.signature.XMLSignatureException((java.lang.Exception) xMLSecurityException4);
        org.junit.Assert.assertNotNull(exception3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet65 = finalOutputProcessor1.getBeforeProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.Action action66 = org.apache.xml.security.stax.ext.XMLSecurityConstants.SIGNATURE;
        finalOutputProcessor1.setAction(action66, 0);
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(wildcardClassSet65);
        org.junit.Assert.assertNotNull(action66);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.xml.security.configuration.PropertyType propertyType0 = new org.apache.xml.security.configuration.PropertyType();
        java.lang.String str1 = propertyType0.getNAME();
        java.lang.String str2 = propertyType0.getValue();
        propertyType0.setVAL("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType3 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key4 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken5 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType3, key4);
        java.lang.String str6 = tokenType3.getName();
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken7 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2001/04/xmldsig-more#", tokenType3);
        java.lang.String str8 = tokenType3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://www.w3.org/2007/05/xmldsig-more#MGF1" + "'", str6, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://www.w3.org/2007/05/xmldsig-more#MGF1" + "'", str8, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.setAttribute(element0, "dsig11", "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.xml.security.binding.xmlenc11.DerivedKeyType derivedKeyType0 = new org.apache.xml.security.binding.xmlenc11.DerivedKeyType();
        derivedKeyType0.setRecipient("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        derivedKeyType0.setId("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        derivedKeyType0.setDerivedKeyName("pss");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement4 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl5 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement4);
        char[] charArray6 = xMLSecCharactersImpl5.getText();
        java.lang.String str7 = xMLSecCharactersImpl5.getData();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl8 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str9 = xMLSecEntityDeclarationImpl8.getPublicId();
        java.lang.String str10 = xMLSecEntityDeclarationImpl8.getNotationName();
        java.lang.Object obj11 = provider1.getOrDefault((java.lang.Object) byteArray2, (java.lang.Object) str10);
        java.lang.String str13 = provider1.getProperty("propagateDefaultNamespace");
        org.apache.xml.security.binding.xmlenc11.DerivedKeyType derivedKeyType14 = new org.apache.xml.security.binding.xmlenc11.DerivedKeyType();
        java.lang.String str15 = derivedKeyType14.getDerivedKeyName();
        derivedKeyType14.setMasterKeyName("hi!");
        derivedKeyType14.setMasterKeyName("http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
        java.lang.String str20 = derivedKeyType14.getRecipient();
        java.lang.String str21 = derivedKeyType14.getMasterKeyName();
        boolean boolean22 = provider1.equals((java.lang.Object) derivedKeyType14);
        org.apache.xml.security.binding.xmlenc11.KeyDerivationMethodType keyDerivationMethodType23 = derivedKeyType14.getKeyDerivationMethod();
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rawX509Certificate" + "'", str21, "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(keyDerivationMethodType23);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        boolean boolean12 = provider1.isEmpty();
        java.io.PrintStream printStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider1.list(printStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig11.ECKeyValueType eCKeyValueType1 = objectFactory0.createECKeyValueType();
        org.apache.xml.security.binding.xmldsig11.NamedCurveType namedCurveType2 = eCKeyValueType1.getNamedCurve();
        org.apache.xml.security.binding.xmldsig11.ECParametersType eCParametersType3 = eCKeyValueType1.getECParameters();
        org.junit.Assert.assertNotNull(eCKeyValueType1);
        org.junit.Assert.assertNull(namedCurveType2);
        org.junit.Assert.assertNull(eCParametersType3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        javax.xml.crypto.dsig.spec.DigestMethodParameterSpec digestMethodParameterSpec2 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.DigestMethod digestMethod3 = dOMXMLSignatureFactory0.newDigestMethod("dsig11", digestMethodParameterSpec2);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: unsupported algorithm");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.xml.security.configuration.HandlerType handlerType0 = new org.apache.xml.security.configuration.HandlerType();
        java.lang.String str1 = handlerType0.getJAVACLASS();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage1 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        java.lang.String str2 = algorithmUsage1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315" + "'", str2, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer0 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer();
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11 canonicalizer11_2 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11(false);
        canonicalizer11_2.doFinal();
        canonicalizer20010315_OmitCommentsTransformer0.setTransformer((org.apache.xml.security.stax.ext.Transformer) canonicalizer11_2);
        java.security.Signature signature5 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream6 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature5);
        javax.crypto.Cipher cipher7 = null;
        java.security.Key key8 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream10 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream6, cipher7, key8, 0);
        boolean boolean11 = iVSplittingOutputStream10.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream12 = null;
        iVSplittingOutputStream10.setParentOutputStream(replaceableOuputStream12);
        byte[] byteArray14 = iVSplittingOutputStream10.getIv();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.Transformer transformer18 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getTransformer((org.apache.xml.security.stax.ext.Transformer) canonicalizer11_2, (java.io.OutputStream) iVSplittingOutputStream10, strMap15, "http://www.w3.org/2009/xmlenc11#mgf1sha384", dIRECTION17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + dIRECTION17 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT + "'", dIRECTION17.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str0 = javax.xml.crypto.dsig.Transform.XPATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xpath-19991116" + "'", str0, "http://www.w3.org/TR/1999/REC-xpath-19991116");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType13 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key14 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken15 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType13, key14);
        java.util.List<org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage> tokenUsageList16 = genericOutboundSecurityToken15.getTokenUsages();
        javax.xml.stream.XMLStreamWriter xMLStreamWriter21 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor22 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter21);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters24 = finalOutputProcessor22.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter26 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor27 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter26);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters29 = finalOutputProcessor27.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet30 = finalOutputProcessor27.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties31 = finalOutputProcessor27.getSecurityProperties();
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute34 = finalOutputProcessor27.createAttribute(qName32, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray35 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute34 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList36 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, xMLSecAttributeArray35);
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray39 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList40 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList40, xMLSecAttributeArray39);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace44 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray45 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace44 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList46 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46, xMLSecNamespaceArray45);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement48 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName38, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList40, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement53 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl54 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement53);
        int int55 = xMLSecCharactersImpl54.getEventType();
        javax.xml.namespace.QName qName60 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray61 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList62 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList62, xMLSecAttributeArray61);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace66 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray67 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace66 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList68 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList68, xMLSecNamespaceArray67);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement70 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName60, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList62, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList68);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl71 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement70);
        xMLSecCharactersImpl54.setParentXMLSecStartElement(xMLSecStartElement70);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl73 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName25, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46, xMLSecStartElement70);
        javax.xml.namespace.QName qName74 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray75 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList76 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, xMLSecAttributeArray75);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace80 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray81 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace80 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList82 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82, xMLSecNamespaceArray81);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement84 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName74, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement85 = finalOutputProcessor22.addAttributes(xMLSecStartElement70, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl86 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#DSAKeyValue", false, false, false, xMLSecStartElement85);
        java.lang.Object obj87 = provider1.putIfAbsent((java.lang.Object) genericOutboundSecurityToken15, (java.lang.Object) xMLSecCharactersImpl86);
        java.util.Enumeration<java.lang.Object> objEnumeration88 = provider1.keys();
        java.security.Signature signature89 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream90 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature89);
        javax.crypto.Cipher cipher91 = null;
        java.security.Key key92 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream94 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream90, cipher91, key92, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream95 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream90);
        unsyncBufferedOutputStream95.flush();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream97 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) unsyncBufferedOutputStream95);
        java.lang.Object obj98 = provider1.remove((java.lang.Object) unsyncBufferedOutputStream95);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet99 = provider1.entrySet();
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tokenUsageList16);
        org.junit.Assert.assertNotNull(xMLSecCharacters24);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertNotNull(xMLSecCharacters29);
        org.junit.Assert.assertNotNull(wildcardClassSet30);
        org.junit.Assert.assertNull(xMLSecurityProperties31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(xMLSecAttribute34);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace44);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(qName60);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace66);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement70);
        org.junit.Assert.assertNotNull(qName74);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace80);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement84);
        org.junit.Assert.assertNotNull(xMLSecStartElement85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(objEnumeration88);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNotNull(objEntrySet99);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec rSAPSSParameterSpec0 = new org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec();
        boolean boolean2 = rSAPSSParameterSpec0.equals((java.lang.Object) "http://www.w3.org/2009/xmlenc11#mgf1sha224");
        rSAPSSParameterSpec0.setTrailerField(10);
        rSAPSSParameterSpec0.setSaltLength(12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        byte[] byteArray1 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray1);
        boolean boolean3 = xMLSignatureInput2.isNodeSet();
        xMLSignatureInput2.setNodeSet(true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "http://www.w3.org/2001/04/xmlenc#sha256");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        java.math.BigInteger bigInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.X509IssuerSerial x509IssuerSerial3 = dOMKeyInfoFactory0.newX509IssuerSerial("http://www.w3.org/2006/12/xml-c14n11#WithComments", bigInteger2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: serialNumber cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.xml.security.binding.xop.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xop.ObjectFactory();
        org.apache.xml.security.binding.xop.ObjectFactory objectFactory1 = new org.apache.xml.security.binding.xop.ObjectFactory();
        org.apache.xml.security.binding.xop.Include include2 = objectFactory1.createInclude();
        include2.setHref("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xop.Include> includeJAXBElement5 = objectFactory0.createInclude(include2);
        org.apache.xml.security.binding.xop.ObjectFactory objectFactory6 = new org.apache.xml.security.binding.xop.ObjectFactory();
        org.apache.xml.security.binding.xop.ObjectFactory objectFactory7 = new org.apache.xml.security.binding.xop.ObjectFactory();
        org.apache.xml.security.binding.xop.Include include8 = objectFactory7.createInclude();
        include8.setHref("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xop.Include> includeJAXBElement11 = objectFactory6.createInclude(include8);
        java.util.List<java.lang.Object> objList12 = include8.getAny();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xop.Include> includeJAXBElement13 = objectFactory0.createInclude(include8);
        org.junit.Assert.assertNotNull(include2);
        org.junit.Assert.assertNotNull(includeJAXBElement5);
        org.junit.Assert.assertNotNull(include8);
        org.junit.Assert.assertNotNull(includeJAXBElement11);
        org.junit.Assert.assertNotNull(objList12);
        org.junit.Assert.assertNotNull(includeJAXBElement13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.xml.security.configuration.HandlerType handlerType0 = new org.apache.xml.security.configuration.HandlerType();
        handlerType0.setValue("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
        java.lang.String str3 = handlerType0.getJAVACLASS();
        java.lang.String str4 = handlerType0.getJAVACLASS();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event0 = org.apache.xml.security.stax.securityEvent.SecurityEventConstants.DefaultToken;
        org.junit.Assert.assertNotNull(event0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature transformEnvelopedSignature0 = new org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod2 = transformEnvelopedSignature0.getPreferredTransformMethod(transformMethod1);
        org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature transformEnvelopedSignature3 = new org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod5 = transformEnvelopedSignature3.getPreferredTransformMethod(transformMethod4);
        org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod transformMethod6 = transformEnvelopedSignature0.getPreferredTransformMethod(transformMethod4);
        byte[] byteArray7 = new byte[] {};
        java.io.OutputStream outputStream8 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray7, outputStream8);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream10 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray7);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream11 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            transformEnvelopedSignature0.transform((java.io.InputStream) unsyncByteArrayInputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: transform(InputStream) not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + transformMethod1 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod1.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertTrue("'" + transformMethod2 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod2.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertTrue("'" + transformMethod4 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod4.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertTrue("'" + transformMethod5 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod5.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertTrue("'" + transformMethod6 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent + "'", transformMethod6.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.TransformMethod.XMLSecEvent));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement5 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl6 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement5);
        char[] charArray7 = xMLSecCharactersImpl6.getText();
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecCharacters(charArray7);
        javax.xml.stream.events.EntityDeclaration entityDeclaration14 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement19 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl20 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement19);
        int int21 = xMLSecCharactersImpl20.getEventType();
        javax.xml.namespace.QName qName26 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray27 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList28 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList28, xMLSecAttributeArray27);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace32 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray33 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace32 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList34 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList34, xMLSecNamespaceArray33);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement36 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName26, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList28, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList34);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl37 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement36);
        xMLSecCharactersImpl20.setParentXMLSecStartElement(xMLSecStartElement36);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl39 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl("", entityDeclaration14, xMLSecStartElement36);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl40 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", xMLSecStartElement36);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl41 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl(charArray7, true, false, false, xMLSecStartElement36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent42 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.allocate(xMLStreamReader0, xMLSecStartElement36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(qName26);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace32);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement36);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.SigC14n;
        org.junit.Assert.assertNotNull(algorithmUsage0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray2 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType0, contentType1 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList3 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3, contentTypeArray2);
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray6 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType5 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList7 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList7, contentTypeArray6);
        byte[] byteArray10 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput11 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray10);
        java.io.InputStream inputStream12 = xMLSignatureInput11.getOctetStream();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray14 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList15, contentTypeArray14);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken17 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray19 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList20 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList20, contentTypeArray19);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent22 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken17, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList20);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement23 = null;
        java.util.Set<java.lang.String> strSet25 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement23, true);
        boolean boolean26 = contentTypeList20.removeAll((java.util.Collection<java.lang.String>) strSet25);
        boolean boolean27 = contentTypeList15.containsAll((java.util.Collection<java.lang.String>) strSet25);
        org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger28 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput11, strSet25);
        boolean boolean29 = contentTypeList7.removeAll((java.util.Collection<java.lang.String>) strSet25);
        boolean boolean30 = contentTypeList3.containsAll((java.util.Collection<java.lang.String>) strSet25);
        java.lang.String str31 = contentTypeList3.toString();
        org.junit.Assert.assertTrue("'" + contentType0 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE + "'", contentType0.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE));
        org.junit.Assert.assertTrue("'" + contentType1 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE + "'", contentType1.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE));
        org.junit.Assert.assertNotNull(contentTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + contentType5 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE + "'", contentType5.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE));
        org.junit.Assert.assertNotNull(contentTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + contentType13 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType13.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
        org.junit.Assert.assertNotNull(contentTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(contentTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[SIGNATURE, SIGNATURE]" + "'", str31, "[SIGNATURE, SIGNATURE]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        java.lang.String str10 = eCCurveDefinition9.getName();
        java.lang.String str11 = eCCurveDefinition9.getB();
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger16 = null;
        java.math.BigInteger bigInteger17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = eCCurveDefinition9.equals(bigInteger12, bigInteger13, bigInteger14, bigInteger15, bigInteger16, bigInteger17, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature" + "'", str10, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#" + "'", str11, "http://www.w3.org/2001/04/xmldsig-more#");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverFilesystem resolverFilesystem0 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverFilesystem();
        org.apache.xml.security.stax.ext.ResourceResolver resourceResolver3 = resolverFilesystem0.newInstance("http://www.w3.org/2000/09/xmldsig#SignatureProperties", "http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.stax.ext.ResourceResolverLookup resourceResolverLookup6 = resolverFilesystem0.canResolve("ContentEncrypted", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
        org.junit.Assert.assertNotNull(resourceResolver3);
        org.junit.Assert.assertNull(resourceResolverLookup6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory12 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider13 = keyInfoFactory12.getProvider();
        java.security.Signature signature15 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream16 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature15);
        javax.crypto.Cipher cipher17 = null;
        java.security.Key key18 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream20 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream16, cipher17, key18, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream21 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream16);
        boolean boolean22 = provider13.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream16);
        java.util.Enumeration<java.lang.Object> objEnumeration23 = provider13.elements();
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray30 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList31 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList31, xMLSecAttributeArray30);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace35 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray36 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace35 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList37 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList37, xMLSecNamespaceArray36);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement39 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName29, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList31, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList37);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl40 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement39);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl41 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", xMLSecStartElement39);
        boolean boolean42 = provider1.remove((java.lang.Object) objEnumeration23, (java.lang.Object) xMLSecStartElement39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<?> wildcardEnumeration43 = provider1.propertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertNotNull(keyInfoFactory12);
        org.junit.Assert.assertNotNull(provider13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objEnumeration23);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace35);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = signerOutputStream4.toString("http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: http://www.w3.org/XML/1998/namespace");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        java.security.Provider provider1 = dOMXMLSignatureFactory0.getProvider();
        javax.xml.crypto.dsig.spec.TransformParameterSpec transformParameterSpec3 = null;
        javax.xml.crypto.dsig.Transform transform4 = dOMXMLSignatureFactory0.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", transformParameterSpec3);
        javax.xml.crypto.dsig.spec.TransformParameterSpec transformParameterSpec6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.Transform transform7 = dOMXMLSignatureFactory0.newTransform("org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1", transformParameterSpec6);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1 algorithm and DOM mechanism not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(transform4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        boolean boolean12 = provider1.isEmpty();
        java.util.Set<java.lang.Object> objSet13 = provider1.keySet();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent14 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray15 = new byte[] {};
        java.io.OutputStream outputStream16 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray15, outputStream16);
        signatureValueSecurityEvent14.setSignatureValue(byteArray15);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream21 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray15, (int) (short) 10, 10);
        java.io.InputStream[] inputStreamArray22 = new java.io.InputStream[] { unsyncByteArrayInputStream21 };
        org.apache.xml.security.stax.impl.util.MultiInputStream multiInputStream23 = new org.apache.xml.security.stax.impl.util.MultiInputStream(inputStreamArray22);
        multiInputStream23.close();
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt25 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray26 = new byte[] {};
        java.io.OutputStream outputStream27 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray26, outputStream27);
        byte[] byteArray29 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray26);
        salt25.setSpecified(byteArray26);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream31 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray26);
        int int32 = multiInputStream23.read(byteArray26);
        provider1.load((java.io.InputStream) multiInputStream23);
        java.security.Provider.Service service36 = provider1.getService("PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY", "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1:http://www.w3.org/2000/09/xmldsig#Object");
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(inputStreamArray22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(service36);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.xml.security.binding.xmldsig.SignaturePropertyType signaturePropertyType0 = new org.apache.xml.security.binding.xmldsig.SignaturePropertyType();
        java.lang.String str1 = signaturePropertyType0.getId();
        signaturePropertyType0.setId("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        javax.crypto.SecretKey secretKey1 = null;
        org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver singleKeyResolver2 = new org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver("http://www.w3.org/2001/04/xmlenc#sha256", secretKey1);
        org.w3c.dom.Element element3 = null;
        org.apache.xml.security.keys.storage.StorageResolver storageResolver5 = null;
        java.security.PrivateKey privateKey7 = singleKeyResolver2.engineResolvePrivateKey(element3, "PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTION", storageResolver5, true);
        org.junit.Assert.assertNull(privateKey7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str0 = javax.xml.crypto.dsig.DigestMethod.SHA256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha256" + "'", str0, "http://www.w3.org/2001/04/xmlenc#sha256");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        byte[] byteArray1 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain0 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter1);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters4 = finalOutputProcessor2.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet5 = finalOutputProcessor2.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties6 = finalOutputProcessor2.getSecurityProperties();
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute9 = finalOutputProcessor2.createAttribute(qName7, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier11 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties10.setEncryptionKeyIdentifier(keyIdentifier11);
        finalOutputProcessor2.setXMLSecurityProperties(xMLSecurityProperties10);
        java.security.Key key14 = null;
        xMLSecurityProperties10.setEncryptionTransportKey(key14);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties16 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean17 = xMLSecurityProperties16.isDisableSchemaValidation();
        java.security.Key key18 = xMLSecurityProperties16.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment20 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray26 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList27 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList27, xMLSecAttributeArray26);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace31 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray32 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace31 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList33 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList33, xMLSecNamespaceArray32);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement35 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName25, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList27, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList33);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl36 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement35);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray37 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment20, xMLSecCharactersImpl36 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue38 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue38, xMLSecEventArray37);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor40 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties16, xMLSecEventQueue38);
        xMLSecurityProperties10.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor40);
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList42 = xMLSecurityProperties10.getSignatureSecureParts();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier43 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyValue;
        xMLSecurityProperties10.setSignatureKeyIdentifier(keyIdentifier43);
        org.apache.xml.security.stax.impl.XMLSecurityStreamReader xMLSecurityStreamReader45 = new org.apache.xml.security.stax.impl.XMLSecurityStreamReader(inputProcessorChain0, xMLSecurityProperties10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = xMLSecurityStreamReader45.getPrefix();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertNull(xMLSecurityProperties6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttribute9);
        org.junit.Assert.assertNotNull(keyIdentifier11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(key18);
        org.junit.Assert.assertNotNull(xMLSecComment20);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace31);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement35);
        org.junit.Assert.assertNotNull(xMLSecEventArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(securePartList42);
        org.junit.Assert.assertNotNull(keyIdentifier43);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_RSAKeyValue;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.xml.security.utils.I18n.init("", "http://www.w3.org/2001/04/xmlenc#sha512");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType13 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key14 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken15 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType13, key14);
        java.util.List<org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage> tokenUsageList16 = genericOutboundSecurityToken15.getTokenUsages();
        javax.xml.stream.XMLStreamWriter xMLStreamWriter21 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor22 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter21);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters24 = finalOutputProcessor22.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter26 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor27 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter26);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters29 = finalOutputProcessor27.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet30 = finalOutputProcessor27.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties31 = finalOutputProcessor27.getSecurityProperties();
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute34 = finalOutputProcessor27.createAttribute(qName32, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray35 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute34 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList36 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, xMLSecAttributeArray35);
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray39 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList40 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList40, xMLSecAttributeArray39);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace44 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray45 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace44 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList46 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46, xMLSecNamespaceArray45);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement48 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName38, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList40, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement53 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl54 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement53);
        int int55 = xMLSecCharactersImpl54.getEventType();
        javax.xml.namespace.QName qName60 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray61 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList62 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList62, xMLSecAttributeArray61);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace66 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray67 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace66 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList68 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList68, xMLSecNamespaceArray67);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement70 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName60, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList62, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList68);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl71 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement70);
        xMLSecCharactersImpl54.setParentXMLSecStartElement(xMLSecStartElement70);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl73 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName25, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46, xMLSecStartElement70);
        javax.xml.namespace.QName qName74 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray75 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList76 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, xMLSecAttributeArray75);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace80 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray81 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace80 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList82 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82, xMLSecNamespaceArray81);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement84 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName74, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement85 = finalOutputProcessor22.addAttributes(xMLSecStartElement70, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl86 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#DSAKeyValue", false, false, false, xMLSecStartElement85);
        java.lang.Object obj87 = provider1.putIfAbsent((java.lang.Object) genericOutboundSecurityToken15, (java.lang.Object) xMLSecCharactersImpl86);
        java.util.Enumeration<java.lang.Object> objEnumeration88 = provider1.keys();
        java.io.Writer writer89 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider1.store(writer89, "http://www.w3.org/2001/04/xmlenc#sha512");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tokenUsageList16);
        org.junit.Assert.assertNotNull(xMLSecCharacters24);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertNotNull(xMLSecCharacters29);
        org.junit.Assert.assertNotNull(wildcardClassSet30);
        org.junit.Assert.assertNull(xMLSecurityProperties31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(xMLSecAttribute34);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace44);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(qName60);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace66);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement70);
        org.junit.Assert.assertNotNull(qName74);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace80);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement84);
        org.junit.Assert.assertNotNull(xMLSecStartElement85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(objEnumeration88);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain0 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter1);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters4 = finalOutputProcessor2.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet5 = finalOutputProcessor2.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties6 = finalOutputProcessor2.getSecurityProperties();
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute9 = finalOutputProcessor2.createAttribute(qName7, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier11 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties10.setEncryptionKeyIdentifier(keyIdentifier11);
        finalOutputProcessor2.setXMLSecurityProperties(xMLSecurityProperties10);
        java.security.Key key14 = null;
        xMLSecurityProperties10.setEncryptionTransportKey(key14);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties16 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean17 = xMLSecurityProperties16.isDisableSchemaValidation();
        java.security.Key key18 = xMLSecurityProperties16.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment20 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray26 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList27 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList27, xMLSecAttributeArray26);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace31 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray32 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace31 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList33 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList33, xMLSecNamespaceArray32);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement35 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName25, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList27, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList33);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl36 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement35);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray37 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment20, xMLSecCharactersImpl36 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue38 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue38, xMLSecEventArray37);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor40 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties16, xMLSecEventQueue38);
        xMLSecurityProperties10.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor40);
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList42 = xMLSecurityProperties10.getSignatureSecureParts();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier43 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyValue;
        xMLSecurityProperties10.setSignatureKeyIdentifier(keyIdentifier43);
        org.apache.xml.security.stax.impl.XMLSecurityStreamReader xMLSecurityStreamReader45 = new org.apache.xml.security.stax.impl.XMLSecurityStreamReader(inputProcessorChain0, xMLSecurityProperties10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = xMLSecurityStreamReader45.hasName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertNull(xMLSecurityProperties6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttribute9);
        org.junit.Assert.assertNotNull(keyIdentifier11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(key18);
        org.junit.Assert.assertNotNull(xMLSecComment20);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace31);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement35);
        org.junit.Assert.assertNotNull(xMLSecEventArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(securePartList42);
        org.junit.Assert.assertNotNull(keyIdentifier43);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier1 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart2 = new org.apache.xml.security.stax.ext.SecurePart("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", modifier1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter1);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters4 = finalOutputProcessor2.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet5 = finalOutputProcessor2.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties6 = finalOutputProcessor2.getSecurityProperties();
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute9 = finalOutputProcessor2.createAttribute(qName7, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter10 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor11 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter10);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters13 = finalOutputProcessor11.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet14 = finalOutputProcessor11.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties15 = finalOutputProcessor11.getSecurityProperties();
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute18 = finalOutputProcessor11.createAttribute(qName16, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray19 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute9, xMLSecAttribute18 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList20 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList20, xMLSecAttributeArray19);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace24 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace27 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace30 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray31 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace24, xMLSecNamespace27, xMLSecNamespace30 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList32 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList32, xMLSecNamespaceArray31);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl34 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName0, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList20, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList32);
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter36 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor37 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter36);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters39 = finalOutputProcessor37.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet40 = finalOutputProcessor37.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties41 = finalOutputProcessor37.getSecurityProperties();
        javax.xml.namespace.QName qName42 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute44 = finalOutputProcessor37.createAttribute(qName42, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter45 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor46 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter45);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters48 = finalOutputProcessor46.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet49 = finalOutputProcessor46.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties50 = finalOutputProcessor46.getSecurityProperties();
        javax.xml.namespace.QName qName51 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute53 = finalOutputProcessor46.createAttribute(qName51, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute44, xMLSecAttribute53 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace62 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace65 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray66 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59, xMLSecNamespace62, xMLSecNamespace65 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList67 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList67, xMLSecNamespaceArray66);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl69 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName35, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList67);
        xMLSecStartElementImpl34.getNamespacesFromCurrentScope((java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList67);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter71 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor72 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter71);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters74 = finalOutputProcessor72.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet75 = finalOutputProcessor72.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties76 = finalOutputProcessor72.getSecurityProperties();
        javax.xml.namespace.QName qName77 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute79 = finalOutputProcessor72.createAttribute(qName77, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        xMLSecStartElementImpl34.addAttribute(xMLSecAttribute79);
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertNotNull(xMLSecCharacters4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertNull(xMLSecurityProperties6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttribute9);
        org.junit.Assert.assertNotNull(xMLSecCharacters13);
        org.junit.Assert.assertNotNull(wildcardClassSet14);
        org.junit.Assert.assertNull(xMLSecurityProperties15);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(xMLSecAttribute18);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xMLSecNamespace24);
        org.junit.Assert.assertNotNull(xMLSecNamespace27);
        org.junit.Assert.assertNotNull(xMLSecNamespace30);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(xMLSecCharacters39);
        org.junit.Assert.assertNotNull(wildcardClassSet40);
        org.junit.Assert.assertNull(xMLSecurityProperties41);
        org.junit.Assert.assertNotNull(qName42);
        org.junit.Assert.assertNotNull(xMLSecAttribute44);
        org.junit.Assert.assertNotNull(xMLSecCharacters48);
        org.junit.Assert.assertNotNull(wildcardClassSet49);
        org.junit.Assert.assertNull(xMLSecurityProperties50);
        org.junit.Assert.assertNotNull(qName51);
        org.junit.Assert.assertNotNull(xMLSecAttribute53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespace62);
        org.junit.Assert.assertNotNull(xMLSecNamespace65);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xMLSecCharacters74);
        org.junit.Assert.assertNotNull(wildcardClassSet75);
        org.junit.Assert.assertNull(xMLSecurityProperties76);
        org.junit.Assert.assertNotNull(qName77);
        org.junit.Assert.assertNotNull(xMLSecAttribute79);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Exception exception0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.exceptions.XMLSecurityRuntimeException xMLSecurityRuntimeException1 = new org.apache.xml.security.exceptions.XMLSecurityRuntimeException(exception0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean1 = xMLSecurityProperties0.isDisableSchemaValidation();
        java.security.Key key2 = xMLSecurityProperties0.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment4 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray10 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList11 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList11, xMLSecAttributeArray10);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace15 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray16 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace15 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList17, xMLSecNamespaceArray16);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement19 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName9, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList11, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList17);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl20 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement19);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray21 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment4, xMLSecCharactersImpl20 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue22 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue22, xMLSecEventArray21);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor24 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties0, xMLSecEventQueue22);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType25 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray26 = new byte[] {};
        java.io.OutputStream outputStream27 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray26, outputStream27);
        byte[] byteArray29 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray26);
        curveType25.setA(byteArray26);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType31 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray32 = new byte[] {};
        java.io.OutputStream outputStream33 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray32, outputStream33);
        byte[] byteArray35 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray32);
        curveType31.setA(byteArray32);
        curveType25.setA(byteArray32);
        boolean boolean38 = xMLSecEventQueue22.removeFirstOccurrence((java.lang.Object) byteArray32);
        javax.xml.namespace.QName qName44 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray45 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList46 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList46, xMLSecAttributeArray45);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace50 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray51 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace50 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList52 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList52, xMLSecNamespaceArray51);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement54 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName44, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList46, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList52);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl55 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement54);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl56 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", xMLSecStartElement54);
        boolean boolean57 = xMLSecEventQueue22.add((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecStartElement54);
        org.w3c.dom.Attr attr58 = null;
        org.apache.xml.security.utils.resolver.ResourceResolverContext resourceResolverContext61 = new org.apache.xml.security.utils.resolver.ResourceResolverContext(attr58, "http://www.w3.org/2009/xmlenc11#mgf1sha1", false);
        boolean boolean62 = xMLSecEventQueue22.removeLastOccurrence((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(key2);
        org.junit.Assert.assertNotNull(xMLSecComment4);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace15);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement19);
        org.junit.Assert.assertNotNull(xMLSecEventArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(qName44);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace50);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier1 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties0.setEncryptionKeyIdentifier(keyIdentifier1);
        java.lang.String str3 = keyIdentifier1.getName();
        org.junit.Assert.assertNotNull(keyIdentifier1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KeyName" + "'", str3, "KeyName");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11 canonicalizer11_1 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11(false);
        canonicalizer11_1.doFinal();
        canonicalizer11_1.doFinal();
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter14 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor15 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter14);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters17 = finalOutputProcessor15.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet18 = finalOutputProcessor15.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties19 = finalOutputProcessor15.getSecurityProperties();
        javax.xml.namespace.QName qName20 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute22 = finalOutputProcessor15.createAttribute(qName20, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray23 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13, xMLSecAttribute22 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList24 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList24, xMLSecAttributeArray23);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace28 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace31 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace34 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray35 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace28, xMLSecNamespace31, xMLSecNamespace34 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList36 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList36, xMLSecNamespaceArray35);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl38 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList24, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList36);
        // The following exception was thrown during execution in test generation
        try {
            canonicalizer11_1.transform((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecStartElementImpl38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecCharacters17);
        org.junit.Assert.assertNotNull(wildcardClassSet18);
        org.junit.Assert.assertNull(xMLSecurityProperties19);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNotNull(xMLSecAttribute22);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xMLSecNamespace28);
        org.junit.Assert.assertNotNull(xMLSecNamespace31);
        org.junit.Assert.assertNotNull(xMLSecNamespace34);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        boolean boolean3 = dsaKeyValueSecurityToken2.isIncludedInMessage();
        java.util.List<org.apache.xml.security.stax.securityToken.InboundSecurityToken> inboundSecurityTokenList4 = dsaKeyValueSecurityToken2.getWrappedTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.security.PublicKey publicKey5 = dsaKeyValueSecurityToken2.getPublicKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(inboundSecurityTokenList4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray54 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, xMLSecAttributeArray54);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace59 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray60 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace59 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList61 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61, xMLSecNamespaceArray60);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement63 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList61);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement64 = finalOutputProcessor1.addAttributes(xMLSecStartElement49, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList55);
        java.util.Set<java.lang.String> strSet66 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement49, true);
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace59);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement63);
        org.junit.Assert.assertNotNull(xMLSecStartElement64);
        org.junit.Assert.assertNotNull(strSet66);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain0 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter1 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter1);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters4 = finalOutputProcessor2.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet5 = finalOutputProcessor2.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties6 = finalOutputProcessor2.getSecurityProperties();
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute9 = finalOutputProcessor2.createAttribute(qName7, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier11 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties10.setEncryptionKeyIdentifier(keyIdentifier11);
        finalOutputProcessor2.setXMLSecurityProperties(xMLSecurityProperties10);
        java.security.Key key14 = null;
        xMLSecurityProperties10.setEncryptionTransportKey(key14);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties16 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean17 = xMLSecurityProperties16.isDisableSchemaValidation();
        java.security.Key key18 = xMLSecurityProperties16.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment20 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray26 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList27 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList27, xMLSecAttributeArray26);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace31 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray32 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace31 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList33 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList33, xMLSecNamespaceArray32);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement35 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName25, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList27, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList33);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl36 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement35);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray37 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment20, xMLSecCharactersImpl36 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue38 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue38, xMLSecEventArray37);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor40 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties16, xMLSecEventQueue38);
        xMLSecurityProperties10.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor40);
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList42 = xMLSecurityProperties10.getSignatureSecureParts();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier43 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyValue;
        xMLSecurityProperties10.setSignatureKeyIdentifier(keyIdentifier43);
        org.apache.xml.security.stax.impl.XMLSecurityStreamReader xMLSecurityStreamReader45 = new org.apache.xml.security.stax.impl.XMLSecurityStreamReader(inputProcessorChain0, xMLSecurityProperties10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = xMLSecurityStreamReader45.getAttributeValue("http://www.w3.org/2007/05/xmldsig-more#", "PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertNull(xMLSecurityProperties6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(xMLSecAttribute9);
        org.junit.Assert.assertNotNull(keyIdentifier11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(key18);
        org.junit.Assert.assertNotNull(xMLSecComment20);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace31);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement35);
        org.junit.Assert.assertNotNull(xMLSecEventArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(securePartList42);
        org.junit.Assert.assertNotNull(keyIdentifier43);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.xml.security.stax.ext.AbstractOutputProcessor abstractOutputProcessor0 = null;
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.XMLSecurityUtils.createKeyNameTokenStructure(abstractOutputProcessor0, outputProcessorChain1, "inclusiveNamespacePrefixList");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray1 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray1);
        boolean boolean3 = xMLSignatureInput2.isNodeSet();
        boolean boolean4 = xMLSignatureInput2.isPreCalculatedDigest();
        xMLSignatureInput2.setMIMEType("http://www.w3.org/2000/xmlns/");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.exceptions.XMLSecurityRuntimeException xMLSecurityRuntimeException2 = new org.apache.xml.security.exceptions.XMLSecurityRuntimeException((java.lang.Exception) uncheckedXMLSecurityException1);
        java.lang.Exception exception3 = xMLSecurityRuntimeException2.getOriginalException();
        java.lang.String str4 = xMLSecurityRuntimeException2.getMsgID();
        org.junit.Assert.assertNotNull(exception3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Missing message ID" + "'", str4, "Missing message ID");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType pnBFieldParamsType0 = new org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType();
        java.math.BigInteger bigInteger1 = null;
        pnBFieldParamsType0.setK1(bigInteger1);
        java.math.BigInteger bigInteger3 = pnBFieldParamsType0.getK1();
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName1 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean3 = dOMKeyName1.isFeatureSupported("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        java.lang.String str4 = dOMKeyName1.getName();
        org.w3c.dom.Node node5 = null;
        javax.xml.crypto.dom.DOMCryptoContext dOMCryptoContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dOMKeyName1.marshal(node5, "wsse11", dOMCryptoContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5" + "'", str4, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = org.apache.xml.security.stax.ext.XMLSecurityUtils.dropReferenceMarker("http://www.w3.org/2001/04/xmlenc#aes256-cbc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc" + "'", str1, "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.Action action0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.SIGNATURE;
        java.lang.String str1 = action0.toString();
        org.junit.Assert.assertNotNull(action0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Signature" + "'", str1, "Signature");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        // The following exception was thrown during execution in test generation
        try {
            xMLSecurityStreamWriter1.writeStartDocument("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        boolean boolean1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("http://www.w3.org/2001/10/xml-exc-c14n#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.xml.security.configuration.HandlerType handlerType0 = new org.apache.xml.security.configuration.HandlerType();
        java.lang.String str1 = handlerType0.getURI();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element3 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getFirstChildElement(node0, "XMLDSig version 1.8", "wsse11");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.xml.security.configuration.PropertyType propertyType0 = new org.apache.xml.security.configuration.PropertyType();
        propertyType0.setNAME("http://www.w3.org/2009/xmlenc11#");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str2 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getQNameString("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384", "http://www.w3.org/2007/05/xmldsig-more#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384:http://www.w3.org/2007/05/xmldsig-more#" + "'", str2, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384:http://www.w3.org/2007/05/xmldsig-more#");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType13 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key14 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken15 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType13, key14);
        java.util.List<org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage> tokenUsageList16 = genericOutboundSecurityToken15.getTokenUsages();
        javax.xml.stream.XMLStreamWriter xMLStreamWriter21 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor22 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter21);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters24 = finalOutputProcessor22.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter26 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor27 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter26);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters29 = finalOutputProcessor27.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet30 = finalOutputProcessor27.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties31 = finalOutputProcessor27.getSecurityProperties();
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute34 = finalOutputProcessor27.createAttribute(qName32, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray35 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute34 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList36 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, xMLSecAttributeArray35);
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray39 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList40 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList40, xMLSecAttributeArray39);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace44 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray45 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace44 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList46 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46, xMLSecNamespaceArray45);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement48 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName38, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList40, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement53 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl54 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement53);
        int int55 = xMLSecCharactersImpl54.getEventType();
        javax.xml.namespace.QName qName60 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray61 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList62 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList62, xMLSecAttributeArray61);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace66 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray67 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace66 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList68 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList68, xMLSecNamespaceArray67);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement70 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName60, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList62, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList68);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl71 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement70);
        xMLSecCharactersImpl54.setParentXMLSecStartElement(xMLSecStartElement70);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl73 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName25, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList46, xMLSecStartElement70);
        javax.xml.namespace.QName qName74 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray75 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList76 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, xMLSecAttributeArray75);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace80 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray81 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace80 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList82 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82, xMLSecNamespaceArray81);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement84 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName74, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement85 = finalOutputProcessor22.addAttributes(xMLSecStartElement70, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl86 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#DSAKeyValue", false, false, false, xMLSecStartElement85);
        java.lang.Object obj87 = provider1.putIfAbsent((java.lang.Object) genericOutboundSecurityToken15, (java.lang.Object) xMLSecCharactersImpl86);
        java.util.Enumeration<java.lang.Object> objEnumeration88 = provider1.keys();
        org.w3c.dom.Node[] nodeArray89 = new org.w3c.dom.Node[] {};
        java.util.LinkedHashSet<org.w3c.dom.Node> nodeSet90 = new java.util.LinkedHashSet<org.w3c.dom.Node>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<org.w3c.dom.Node>) nodeSet90, nodeArray89);
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput92 = new org.apache.xml.security.signature.XMLSignatureInput((java.util.Set<org.w3c.dom.Node>) nodeSet90);
        boolean boolean93 = provider1.containsValue((java.lang.Object) nodeSet90);
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tokenUsageList16);
        org.junit.Assert.assertNotNull(xMLSecCharacters24);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertNotNull(xMLSecCharacters29);
        org.junit.Assert.assertNotNull(wildcardClassSet30);
        org.junit.Assert.assertNull(xMLSecurityProperties31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(xMLSecAttribute34);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace44);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(qName60);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace66);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement70);
        org.junit.Assert.assertNotNull(qName74);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace80);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement84);
        org.junit.Assert.assertNotNull(xMLSecStartElement85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(objEnumeration88);
        org.junit.Assert.assertNotNull(nodeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray1 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList2 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList2, xMLSecAttributeArray1);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace6 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray7 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace6 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList8 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList8, xMLSecNamespaceArray7);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement10 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName0, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList2, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList8);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier12 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart13 = new org.apache.xml.security.stax.ext.SecurePart(qName0, true, modifier12);
        boolean boolean14 = securePart13.isSecureEntireRequest();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties15 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier16 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties15.setEncryptionKeyIdentifier(keyIdentifier16);
        java.security.Key key18 = xMLSecurityProperties15.getEncryptionKey();
        int int19 = xMLSecurityProperties15.getSignaturePosition();
        javax.xml.namespace.QName qName20 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier21 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart22 = new org.apache.xml.security.stax.ext.SecurePart(qName20, modifier21);
        boolean boolean23 = securePart22.isSecureEntireRequest();
        xMLSecurityProperties15.addEncryptionPart(securePart22);
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier26 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Element;
        java.lang.String[] strArray31 = new java.lang.String[] { "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#aes192-gcm", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "pss" };
        org.apache.xml.security.stax.ext.SecurePart securePart33 = new org.apache.xml.security.stax.ext.SecurePart(qName25, modifier26, strArray31, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        securePart22.setModifier(modifier26);
        securePart13.setModifier(modifier26);
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace6);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement10);
        org.junit.Assert.assertTrue("'" + modifier12 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier12.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(keyIdentifier16);
        org.junit.Assert.assertNull(key18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(qName25);
        org.junit.Assert.assertTrue("'" + modifier26 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Element + "'", modifier26.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Element));
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.xml.security.stax.impl.util.ConcreteLSInput concreteLSInput0 = new org.apache.xml.security.stax.impl.util.ConcreteLSInput();
        java.io.InputStream inputStream1 = concreteLSInput0.getByteStream();
        concreteLSInput0.setBaseURI("http://www.w3.org/2000/09/xmldsig#");
        java.lang.String str4 = concreteLSInput0.getBaseURI();
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://www.w3.org/2000/09/xmldsig#" + "'", str4, "http://www.w3.org/2000/09/xmldsig#");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        java.math.BigInteger bigInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.X509IssuerSerial x509IssuerSerial3 = dOMKeyInfoFactory0.newX509IssuerSerial("inclusiveNamespacePrefixList", bigInteger2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: serialNumber cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream6 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream1);
        unsyncBufferedOutputStream6.flush();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream8 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) unsyncBufferedOutputStream6);
        unsyncBufferedOutputStream6.write(0);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory11 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement13 = objectFactory11.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType14 = objectFactory11.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType15 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement16 = objectFactory11.createSignatureMethod(signatureMethodType15);
        byte[] byteArray17 = new byte[] {};
        java.io.OutputStream outputStream18 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray17, outputStream18);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream20 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray17);
        byte[] byteArray21 = new byte[] {};
        java.io.OutputStream outputStream22 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray21, outputStream22);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream24 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray21);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream25 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray21);
        int int26 = unsyncByteArrayInputStream20.read(byteArray21);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement27 = objectFactory11.createDigestValue(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            unsyncBufferedOutputStream6.write(byteArray21, 38, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strJAXBElement13);
        org.junit.Assert.assertNotNull(rSAKeyValueType14);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArrayJAXBElement27);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet4 = finalOutputProcessor1.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties5 = finalOutputProcessor1.getSecurityProperties();
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute8 = finalOutputProcessor1.createAttribute(qName6, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties9 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier10 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties9.setEncryptionKeyIdentifier(keyIdentifier10);
        finalOutputProcessor1.setXMLSecurityProperties(xMLSecurityProperties9);
        java.lang.String str13 = xMLSecurityProperties9.getSignatureDigestAlgorithm();
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(wildcardClassSet4);
        org.junit.Assert.assertNull(xMLSecurityProperties5);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(xMLSecAttribute8);
        org.junit.Assert.assertNotNull(keyIdentifier10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element3 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.getFirstChildElement(node0, "http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7", "http://www.w3.org/2000/09/xmldsig#Manifest");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        xMLSecurityStreamWriter1.writeEmptyElement("PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement8 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl9 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement8);
        char[] charArray10 = xMLSecCharactersImpl9.getText();
        // The following exception was thrown during execution in test generation
        try {
            xMLSecurityStreamWriter1.writeCharacters(charArray10, 12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[h, i, !]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        xMLSecurityStreamWriter1.writeEmptyElement("PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement8 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl9 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement8);
        char[] charArray10 = xMLSecCharactersImpl9.getText();
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters11 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecCharacters(charArray10);
        javax.xml.stream.events.EntityDeclaration entityDeclaration17 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement22 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl23 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement22);
        int int24 = xMLSecCharactersImpl23.getEventType();
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray30 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList31 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList31, xMLSecAttributeArray30);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace35 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray36 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace35 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList37 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList37, xMLSecNamespaceArray36);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement39 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName29, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList31, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList37);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl40 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement39);
        xMLSecCharactersImpl23.setParentXMLSecStartElement(xMLSecStartElement39);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl42 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl("", entityDeclaration17, xMLSecStartElement39);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl43 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", xMLSecStartElement39);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl44 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl(charArray10, true, false, false, xMLSecStartElement39);
        // The following exception was thrown during execution in test generation
        try {
            xMLSecurityStreamWriter1.writeCharacters(charArray10, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[h, i, !]");
        org.junit.Assert.assertNotNull(xMLSecCharacters11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace35);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement39);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.security.PrivateKey privateKey1 = null;
        org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver singleKeyResolver2 = new org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver("http://www.w3.org/2006/12/xml-c14n11#WithComments", privateKey1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.w3c.dom.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Element element4 = org.apache.jcp.xml.dsig.internal.dom.DOMUtils.createElement(document0, "http://www.w3.org/2009/xmlenc11#aes192-gcm:http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "http://www.w3.org/2006/12/xml-c14n11#WithComments", "encryptionParts");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.NS_MGF1_SHA256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha256" + "'", str0, "http://www.w3.org/2009/xmlenc11#mgf1sha256");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        javax.xml.namespace.QName qName1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray2 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList3 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList3, xMLSecAttributeArray2);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace7 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray8 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace7 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList9 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList9, xMLSecNamespaceArray8);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement11 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName1, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList3, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList9);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier13 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart14 = new org.apache.xml.security.stax.ext.SecurePart(qName1, true, modifier13);
        java.lang.String[] strArray15 = securePart14.getTransforms();
        java.lang.String[] strArray21 = new java.lang.String[] { "http://www.w3.org/2000/xmlns/", "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1:http://www.w3.org/2000/09/xmldsig#Object", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "http://www.w3.org/2000/xmlns/", "http://www.w3.org/2004/08/xop/include" };
        securePart14.setTransforms(strArray21);
        org.apache.xml.security.stax.ext.SecurePart securePart24 = new org.apache.xml.security.stax.ext.SecurePart("UTF-8", strArray21, "XMLDSig version 1.8");
        securePart24.setIdToSign("EncryptedKey");
        org.junit.Assert.assertNotNull(qName1);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace7);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement11);
        org.junit.Assert.assertTrue("'" + modifier13 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier13.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters1 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecCData("http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd");
        org.junit.Assert.assertNotNull(xMLSecCharacters1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        javax.xml.stream.events.EntityDeclaration entityDeclaration2 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement7 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl8 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement7);
        int int9 = xMLSecCharactersImpl8.getEventType();
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray15 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList16 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList16, xMLSecAttributeArray15);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace20 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray21 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace20 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList22 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList22, xMLSecNamespaceArray21);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement24 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName14, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList16, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList22);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl25 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement24);
        xMLSecCharactersImpl8.setParentXMLSecStartElement(xMLSecStartElement24);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl27 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl("", entityDeclaration2, xMLSecStartElement24);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl28 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", xMLSecStartElement24);
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xMLSecCommentImpl28.writeAsEncodedUnicode(writer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace20);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement24);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType0 = null;
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken rsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken(rSAKeyValueType0, inboundSecurityContext1);
        boolean boolean3 = rsaKeyValueSecurityToken2.isAsymmetric();
        boolean boolean4 = rsaKeyValueSecurityToken2.isAsymmetric();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.lang.String str11 = provider1.getInfo();
        boolean boolean12 = provider1.isEmpty();
        java.util.Set<java.lang.Object> objSet13 = provider1.keySet();
        org.apache.xml.security.binding.xmldsig.ObjectType objectType14 = new org.apache.xml.security.binding.xmldsig.ObjectType();
        java.lang.String str15 = objectType14.getEncoding();
        objectType14.setId("http://www.w3.org/2002/06/xmldsig-filter2");
        boolean boolean18 = provider1.containsKey((java.lang.Object) "http://www.w3.org/2002/06/xmldsig-filter2");
        boolean boolean19 = provider1.isEmpty();
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)" + "'", str11, "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyValue;
        org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl xMLSecAttributeImpl2 = new org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl(qName0, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        boolean boolean3 = xMLSecAttributeImpl2.isSpecified();
        java.lang.String str4 = xMLSecAttributeImpl2.getDTDType();
        org.apache.xml.security.binding.xmldsig.KeyInfoType keyInfoType5 = new org.apache.xml.security.binding.xmldsig.KeyInfoType();
        java.lang.String str6 = keyInfoType5.getId();
        boolean boolean7 = xMLSecAttributeImpl2.equals((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CDATA" + "'", str4, "CDATA");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte[] byteArray1 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray1);
        boolean boolean3 = xMLSignatureInput2.isNodeSet();
        java.io.InputStream inputStream4 = xMLSignatureInput2.getOctetStreamReal();
        org.w3c.dom.Node node5 = xMLSignatureInput2.getExcludeNode();
        org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData apacheOctetStreamData6 = new org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData(xMLSignatureInput2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken1 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray3 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList4 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList4, contentTypeArray3);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent6 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken1, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList4);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement11 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl12 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement11);
        java.util.List<javax.xml.namespace.QName> qNameList13 = xMLSecCharactersImpl12.getElementPath();
        signedElementSecurityEvent6.setElementPath(qNameList13);
        java.util.List<javax.xml.namespace.QName> qNameList15 = signedElementSecurityEvent6.getElementPath();
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken16 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray18 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList19, contentTypeArray18);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent21 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken16, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList19);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList22 = signedElementSecurityEvent21.getProtectionOrder();
        signedElementSecurityEvent6.setProtectionOrder(contentTypeList22);
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.KeyInfo keyInfo25 = dOMKeyInfoFactory0.newKeyInfo((java.util.List) contentTypeList22, "http://www.w3.org/2000/09/xmldsig#sha1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: content cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(contentTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qNameList13);
        org.junit.Assert.assertNotNull(qNameList15);
        org.junit.Assert.assertNotNull(contentTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(contentTypeList22);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyName dOMKeyName2 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyName("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        boolean boolean4 = dOMKeyName2.isFeatureSupported("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        java.lang.String str5 = dOMKeyName2.getName();
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.KeyInfo keyInfo6 = dOMKeyInfoFactory0.unmarshalKeyInfo((javax.xml.crypto.XMLStructure) dOMKeyName2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: xmlStructure must be of type DOMStructure");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5" + "'", str5, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException2 = new org.apache.xml.security.keys.storage.StorageResolverException((java.lang.Exception) uncheckedXMLSecurityException1);
        org.apache.xml.security.stax.ext.XMLSecurityConfigurationException xMLSecurityConfigurationException3 = new org.apache.xml.security.stax.ext.XMLSecurityConfigurationException((java.lang.Exception) storageResolverException2);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor5 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter4);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters7 = finalOutputProcessor5.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet8 = finalOutputProcessor5.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties9 = finalOutputProcessor5.getSecurityProperties();
        javax.xml.namespace.QName qName10 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute12 = finalOutputProcessor5.createAttribute(qName10, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent> exceptionKeyValue13 = new org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent>((java.lang.Exception) xMLSecurityConfigurationException3, (javax.xml.stream.events.XMLEvent) xMLSecAttribute12);
        org.apache.xml.security.parser.XMLParserException xMLParserException14 = new org.apache.xml.security.parser.XMLParserException();
        xMLSecurityConfigurationException3.addSuppressed((java.lang.Throwable) xMLParserException14);
        java.lang.String str16 = xMLSecurityConfigurationException3.toString();
        org.junit.Assert.assertNotNull(xMLSecCharacters7);
        org.junit.Assert.assertNotNull(wildcardClassSet8);
        org.junit.Assert.assertNull(xMLSecurityProperties9);
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertNotNull(xMLSecAttribute12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.xml.security.stax.ext.XMLSecurityConfigurationException: http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1" + "'", str16, "org.apache.xml.security.stax.ext.XMLSecurityConfigurationException: http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.xml.security.stax.ext.stax.XMLSecStartDocument xMLSecStartDocument4 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartDocument("Signature", "propagateDefaultNamespace", (java.lang.Boolean) false, "[SIGNATURE, SIGNATURE]");
        org.junit.Assert.assertNotNull(xMLSecStartDocument4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray6 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList7 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList7, xMLSecAttributeArray6);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace11 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray12 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace11 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList13 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList13, xMLSecNamespaceArray12);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement15 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName5, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList7, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList13);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl16 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement15);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl17 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", xMLSecStartElement15);
        boolean boolean18 = xMLSecCommentImpl17.isEndDocument();
        int int19 = xMLSecCommentImpl17.getEventType();
        int int20 = xMLSecCommentImpl17.getEventType();
        javax.xml.namespace.QName qName21 = xMLSecCommentImpl17.getSchemaType();
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace11);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNull(qName21);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        x509TokenSecurityEvent0.setCorrelationID("");
        x509TokenSecurityEvent0.setCorrelationID("encryptionParts");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType7 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key8 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken9 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType7, key8);
        org.apache.xml.security.stax.ext.OutputProcessor outputProcessor10 = genericOutboundSecurityToken9.getProcessor();
        x509TokenSecurityEvent0.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) genericOutboundSecurityToken9);
        org.w3c.dom.Element element12 = genericOutboundSecurityToken9.getCustomTokenReference();
        java.security.cert.X509Certificate[] x509CertificateArray13 = genericOutboundSecurityToken9.getX509Certificates();
        java.lang.String str14 = genericOutboundSecurityToken9.getId();
        org.junit.Assert.assertNull(outputProcessor10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNull(x509CertificateArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://www.w3.org/2009/xmlenc11#aes192-gcm" + "'", str14, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.util.Collection<java.lang.Object> objCollection11 = provider1.values();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<?> wildcardEnumeration12 = provider1.propertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objCollection11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream6 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream1);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream8 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) unsyncBufferedOutputStream6, 76);
        unsyncBufferedOutputStream6.write((int) (byte) 1);
        unsyncBufferedOutputStream6.write((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            unsyncBufferedOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement2 = objectFactory0.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType3 = objectFactory0.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType4 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement5 = objectFactory0.createSignatureMethod(signatureMethodType4);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory6 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement8 = objectFactory6.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType9 = objectFactory6.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement10 = objectFactory0.createRSAKeyValue(rSAKeyValueType9);
        java.security.Signature signature11 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream12 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature11);
        javax.crypto.Cipher cipher13 = null;
        java.security.Key key14 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream16 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream12, cipher13, key14, 0);
        boolean boolean17 = iVSplittingOutputStream16.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream18 = null;
        iVSplittingOutputStream16.setParentOutputStream(replaceableOuputStream18);
        byte[] byteArray20 = iVSplittingOutputStream16.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement21 = objectFactory0.createPGPDataTypePGPKeyPacket(byteArray20);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory22 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement24 = objectFactory22.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.TransformType transformType25 = objectFactory22.createTransformType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.TransformType> transformTypeJAXBElement26 = objectFactory0.createTransform(transformType25);
        org.apache.xml.security.binding.xmldsig.KeyValueType keyValueType27 = objectFactory0.createKeyValueType();
        java.math.BigInteger bigInteger28 = null;
        javax.xml.bind.JAXBElement<java.math.BigInteger> bigIntegerJAXBElement29 = objectFactory0.createSignatureMethodTypeHMACOutputLength(bigInteger28);
        org.junit.Assert.assertNotNull(strJAXBElement2);
        org.junit.Assert.assertNotNull(rSAKeyValueType3);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement5);
        org.junit.Assert.assertNotNull(strJAXBElement8);
        org.junit.Assert.assertNotNull(rSAKeyValueType9);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement21);
        org.junit.Assert.assertNotNull(strJAXBElement24);
        org.junit.Assert.assertNotNull(transformType25);
        org.junit.Assert.assertNotNull(transformTypeJAXBElement26);
        org.junit.Assert.assertNotNull(keyValueType27);
        org.junit.Assert.assertNotNull(bigIntegerJAXBElement29);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties3 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean4 = xMLSecurityProperties3.isDisableSchemaValidation();
        java.security.Key key5 = xMLSecurityProperties3.getEncryptionKey();
        java.util.List<org.apache.xml.security.stax.ext.InputProcessor> inputProcessorList6 = xMLSecurityProperties3.getInputProcessorList();
        javax.xml.crypto.dsig.keyinfo.RetrievalMethod retrievalMethod7 = dOMKeyInfoFactory0.newRetrievalMethod("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62", "", (java.util.List) inputProcessorList6);
        java.security.PublicKey publicKey8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.KeyValue keyValue9 = dOMKeyInfoFactory0.newKeyValue(publicKey8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(key5);
        org.junit.Assert.assertNotNull(inputProcessorList6);
        org.junit.Assert.assertNotNull(retrievalMethod7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.w3c.dom.Element element0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMUtils.setAttribute(element0, "http://www.w3.org/2009/xmlenc11#aes192-gcm:http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.w3c.dom.Element element0 = null;
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext1 = null;
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory2 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider3 = keyInfoFactory2.getProvider();
        byte[] byteArray4 = new byte[] {};
        java.io.OutputStream outputStream5 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray4, outputStream5);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray4);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream8 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray4);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl10 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str11 = xMLSecEntityDeclarationImpl10.getPublicId();
        java.lang.String str12 = xMLSecEntityDeclarationImpl10.getNotationName();
        java.lang.Object obj13 = provider3.getOrDefault((java.lang.Object) byteArray4, (java.lang.Object) str12);
        java.util.Enumeration<java.lang.Object> objEnumeration14 = provider3.keys();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType15 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray16 = dSAKeyValueType15.getG();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory17 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement19 = objectFactory17.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType20 = objectFactory17.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType21 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement22 = objectFactory17.createSignatureMethod(signatureMethodType21);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory23 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement25 = objectFactory23.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType26 = objectFactory23.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement27 = objectFactory17.createRSAKeyValue(rSAKeyValueType26);
        java.security.Signature signature28 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream29 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature28);
        javax.crypto.Cipher cipher30 = null;
        java.security.Key key31 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream33 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream29, cipher30, key31, 0);
        boolean boolean34 = iVSplittingOutputStream33.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream35 = null;
        iVSplittingOutputStream33.setParentOutputStream(replaceableOuputStream35);
        byte[] byteArray37 = iVSplittingOutputStream33.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement38 = objectFactory17.createPGPDataTypePGPKeyPacket(byteArray37);
        dSAKeyValueType15.setSeed(byteArray37);
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType40 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        encryptedKeyType40.setRecipient("http://www.w3.org/2000/xmlns/");
        java.lang.String str43 = encryptedKeyType40.getEncoding();
        java.lang.String str44 = encryptedKeyType40.getType();
        java.lang.Object obj45 = provider3.put((java.lang.Object) dSAKeyValueType15, (java.lang.Object) encryptedKeyType40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.jcp.xml.dsig.internal.dom.DOMManifest dOMManifest46 = new org.apache.jcp.xml.dsig.internal.dom.DOMManifest(element0, xMLCryptoContext1, provider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory2);
        org.junit.Assert.assertNotNull(provider3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objEnumeration14);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(strJAXBElement19);
        org.junit.Assert.assertNotNull(rSAKeyValueType20);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement22);
        org.junit.Assert.assertNotNull(strJAXBElement25);
        org.junit.Assert.assertNotNull(rSAKeyValueType26);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.xml.security.binding.xmldsig.RetrievalMethodType retrievalMethodType0 = new org.apache.xml.security.binding.xmldsig.RetrievalMethodType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory1 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType2 = objectFactory1.createSignatureValueType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory3 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement5 = objectFactory3.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType6 = objectFactory3.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement7 = objectFactory1.createRSAKeyValue(rSAKeyValueType6);
        org.apache.xml.security.binding.xmldsig.ObjectType objectType8 = new org.apache.xml.security.binding.xmldsig.ObjectType();
        java.util.List<java.lang.Object> objList9 = objectType8.getContent();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.ObjectType> objectTypeJAXBElement10 = objectFactory1.createObject(objectType8);
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType11 = objectFactory1.createTransformsType();
        retrievalMethodType0.setTransforms(transformsType11);
        org.junit.Assert.assertNotNull(signatureValueType2);
        org.junit.Assert.assertNotNull(strJAXBElement5);
        org.junit.Assert.assertNotNull(rSAKeyValueType6);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement7);
        org.junit.Assert.assertNotNull(objList9);
        org.junit.Assert.assertNotNull(objectTypeJAXBElement10);
        org.junit.Assert.assertNotNull(transformsType11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        java.security.Provider provider1 = dOMXMLSignatureFactory0.getProvider();
        javax.xml.crypto.dsig.spec.TransformParameterSpec transformParameterSpec3 = null;
        javax.xml.crypto.dsig.Transform transform4 = dOMXMLSignatureFactory0.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", transformParameterSpec3);
        javax.xml.crypto.dsig.spec.C14NMethodParameterSpec c14NMethodParameterSpec6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.CanonicalizationMethod canonicalizationMethod7 = dOMXMLSignatureFactory0.newCanonicalizationMethod("http://www.w3.org/2009/xmlenc11#aes192-gcm", c14NMethodParameterSpec6);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: http://www.w3.org/2009/xmlenc11#aes192-gcm algorithm and DOM mechanism not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(transform4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl0 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants securityEventConstants1 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants();
        java.util.Map<java.lang.Throwable, org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer> throwableMap2 = abstractSecurityContextImpl0.getAsMap((java.lang.Object) securityEventConstants1);
        org.apache.xml.security.stax.impl.util.ConcreteLSInput concreteLSInput3 = new org.apache.xml.security.stax.impl.util.ConcreteLSInput();
        java.io.InputStream inputStream4 = concreteLSInput3.getByteStream();
        java.io.InputStream inputStream5 = concreteLSInput3.getByteStream();
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory6 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties9 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean10 = xMLSecurityProperties9.isDisableSchemaValidation();
        java.security.Key key11 = xMLSecurityProperties9.getEncryptionKey();
        java.util.List<org.apache.xml.security.stax.ext.InputProcessor> inputProcessorList12 = xMLSecurityProperties9.getInputProcessorList();
        javax.xml.crypto.dsig.keyinfo.RetrievalMethod retrievalMethod13 = dOMKeyInfoFactory6.newRetrievalMethod("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62", "", (java.util.List) inputProcessorList12);
        byte[] byteArray15 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput16 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray15);
        java.io.InputStream inputStream17 = xMLSignatureInput16.getOctetStream();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType18 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray19 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType18 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList20 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList20, contentTypeArray19);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken22 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray24 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList25, contentTypeArray24);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent27 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken22, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement28 = null;
        java.util.Set<java.lang.String> strSet30 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement28, true);
        boolean boolean31 = contentTypeList25.removeAll((java.util.Collection<java.lang.String>) strSet30);
        boolean boolean32 = contentTypeList20.containsAll((java.util.Collection<java.lang.String>) strSet30);
        org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger33 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput16, strSet30);
        org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger34 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput16);
        abstractSecurityContextImpl0.putAsMap((java.lang.Object) inputStream5, (javax.xml.crypto.URIReference) retrievalMethod13, xMLSignatureInputDebugger34);
        org.junit.Assert.assertNull(throwableMap2);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(key11);
        org.junit.Assert.assertNotNull(inputProcessorList12);
        org.junit.Assert.assertNotNull(retrievalMethod13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + contentType18 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType18.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
        org.junit.Assert.assertNotNull(contentTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(contentTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl8 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str9 = xMLSecEntityDeclarationImpl8.getPublicId();
        java.lang.String str10 = xMLSecEntityDeclarationImpl8.getNotationName();
        java.lang.Object obj11 = provider1.getOrDefault((java.lang.Object) byteArray2, (java.lang.Object) str10);
        java.security.Signature signature12 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream13 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature12);
        javax.crypto.Cipher cipher14 = null;
        java.security.Key key15 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream17 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream13, cipher14, key15, 0);
        boolean boolean18 = iVSplittingOutputStream17.isIVComplete();
        boolean boolean19 = provider1.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory dOMKeyInfoFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties3 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean4 = xMLSecurityProperties3.isDisableSchemaValidation();
        java.security.Key key5 = xMLSecurityProperties3.getEncryptionKey();
        java.util.List<org.apache.xml.security.stax.ext.InputProcessor> inputProcessorList6 = xMLSecurityProperties3.getInputProcessorList();
        javax.xml.crypto.dsig.keyinfo.RetrievalMethod retrievalMethod7 = dOMKeyInfoFactory0.newRetrievalMethod("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62", "", (java.util.List) inputProcessorList6);
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType8 = new org.apache.xml.security.binding.xmldsig.TransformsType();
        java.util.List<org.apache.xml.security.binding.xmldsig.TransformType> transformTypeList9 = transformsType8.getTransform();
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.dsig.keyinfo.X509Data x509Data10 = dOMKeyInfoFactory0.newX509Data((java.util.List) transformTypeList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: content cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(key5);
        org.junit.Assert.assertNotNull(inputProcessorList6);
        org.junit.Assert.assertNotNull(retrievalMethod7);
        org.junit.Assert.assertNotNull(transformTypeList9);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Provider provider2 = keyInfoFactory0.getProvider();
        java.security.Provider provider3 = keyInfoFactory0.getProvider();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider3.store(writer4, "ContentEncrypted");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(provider2);
        org.junit.Assert.assertNotNull(provider3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        byte[] byteArray2 = new byte[] {};
        java.io.OutputStream outputStream3 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray2, outputStream3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream5 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray2);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl8 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str9 = xMLSecEntityDeclarationImpl8.getPublicId();
        java.lang.String str10 = xMLSecEntityDeclarationImpl8.getNotationName();
        java.lang.Object obj11 = provider1.getOrDefault((java.lang.Object) byteArray2, (java.lang.Object) str10);
        java.util.Enumeration<java.lang.Object> objEnumeration12 = provider1.keys();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType13 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray14 = dSAKeyValueType13.getG();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory15 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement17 = objectFactory15.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType18 = objectFactory15.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType19 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement20 = objectFactory15.createSignatureMethod(signatureMethodType19);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory21 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement23 = objectFactory21.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType24 = objectFactory21.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement25 = objectFactory15.createRSAKeyValue(rSAKeyValueType24);
        java.security.Signature signature26 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream27 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature26);
        javax.crypto.Cipher cipher28 = null;
        java.security.Key key29 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream31 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream27, cipher28, key29, 0);
        boolean boolean32 = iVSplittingOutputStream31.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream33 = null;
        iVSplittingOutputStream31.setParentOutputStream(replaceableOuputStream33);
        byte[] byteArray35 = iVSplittingOutputStream31.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement36 = objectFactory15.createPGPDataTypePGPKeyPacket(byteArray35);
        dSAKeyValueType13.setSeed(byteArray35);
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType38 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        encryptedKeyType38.setRecipient("http://www.w3.org/2000/xmlns/");
        java.lang.String str41 = encryptedKeyType38.getEncoding();
        java.lang.String str42 = encryptedKeyType38.getType();
        java.lang.Object obj43 = provider1.put((java.lang.Object) dSAKeyValueType13, (java.lang.Object) encryptedKeyType38);
        java.lang.String str44 = encryptedKeyType38.getMimeType();
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objEnumeration12);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(strJAXBElement17);
        org.junit.Assert.assertNotNull(rSAKeyValueType18);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement20);
        org.junit.Assert.assertNotNull(strJAXBElement23);
        org.junit.Assert.assertNotNull(rSAKeyValueType24);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory dOMXMLSignatureFactory0 = new org.apache.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory();
        java.security.Provider provider1 = dOMXMLSignatureFactory0.getProvider();
        javax.xml.crypto.dsig.spec.TransformParameterSpec transformParameterSpec3 = null;
        javax.xml.crypto.dsig.Transform transform4 = dOMXMLSignatureFactory0.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", transformParameterSpec3);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(transform4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.xml.security.stax.securityEvent.KeyNameTokenSecurityEvent keyNameTokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.KeyNameTokenSecurityEvent();
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent1 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken2 = x509TokenSecurityEvent1.getSecurityToken();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType3 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext4 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken5 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType3, inboundSecurityContext4);
        java.util.List<javax.xml.namespace.QName> qNameList6 = dsaKeyValueSecurityToken5.getElementPath();
        javax.xml.namespace.QName qName7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName qName8 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier10 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart11 = new org.apache.xml.security.stax.ext.SecurePart(qName9, modifier10);
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName13 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName18 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray19 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList20 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList20, xMLSecAttributeArray19);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace24 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray25 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace24 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList26 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList26, xMLSecNamespaceArray25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement28 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName18, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList20, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList26);
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName30 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName31 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName[] qNameArray39 = new javax.xml.namespace.QName[] { qName7, qName8, qName9, qName12, qName13, qName14, qName15, qName16, qName17, qName18, qName29, qName30, qName31, qName32, qName33, qName34, qName35, qName36, qName37, qName38 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList40 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList40, qNameArray39);
        dsaKeyValueSecurityToken5.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList40);
        x509TokenSecurityEvent1.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken5);
        keyNameTokenSecurityEvent0.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken5);
        keyNameTokenSecurityEvent0.setCorrelationID("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
        org.junit.Assert.assertNull(securityToken2);
        org.junit.Assert.assertNull(qNameList6);
        org.junit.Assert.assertNotNull(qName7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(qName18);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace24);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement28);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(qNameArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        javax.xml.crypto.dsig.keyinfo.KeyInfoFactory keyInfoFactory0 = javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.getInstance();
        java.security.Provider provider1 = keyInfoFactory0.getProvider();
        java.security.Signature signature3 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream4 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature3);
        javax.crypto.Cipher cipher5 = null;
        java.security.Key key6 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream8 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream4, cipher5, key6, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream9 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream4);
        boolean boolean10 = provider1.remove((java.lang.Object) (-1), (java.lang.Object) signerOutputStream4);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            provider1.store(writer11, "http://www.w3.org/TR/1999/REC-xpath-19991116");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyInfoFactory0);
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        javax.xml.namespace.QName qName4 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter5 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor6 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter5);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters8 = finalOutputProcessor6.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet9 = finalOutputProcessor6.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = finalOutputProcessor6.getSecurityProperties();
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute13 = finalOutputProcessor6.createAttribute(qName11, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray14 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute13 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList15 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, xMLSecAttributeArray14);
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray18 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList19 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, xMLSecAttributeArray18);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray24 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace23 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList25 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecNamespaceArray24);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName17, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement32 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl33 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement32);
        int int34 = xMLSecCharactersImpl33.getEventType();
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray40 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList41 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, xMLSecAttributeArray40);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace45 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray46 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace45 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList47 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47, xMLSecNamespaceArray46);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName39, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList41, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList47);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement49);
        xMLSecCharactersImpl33.setParentXMLSecStartElement(xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName4, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList15, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList25, xMLSecStartElement49);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl53 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY", true, true, true, xMLSecStartElement49);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement54 = xMLSecCharactersImpl53.asStartElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertNotNull(xMLSecCharacters8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(xMLSecurityProperties10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(xMLSecAttribute13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace23);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace45);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement49);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        // The following exception was thrown during execution in test generation
        try {
            xMLSecurityStreamWriter1.writeAttribute("START_ELEMENT", "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512434367d8-1775-46af-abf8-c8129fcf6d62", "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
            org.junit.Assert.fail("Expected exception of type javax.xml.stream.XMLStreamException; message: No open start element.");
        } catch (javax.xml.stream.XMLStreamException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.xml.security.transforms.InvalidTransformException invalidTransformException0 = new org.apache.xml.security.transforms.InvalidTransformException();
        org.apache.xml.security.signature.XMLSignatureException xMLSignatureException1 = new org.apache.xml.security.signature.XMLSignatureException((java.lang.Exception) invalidTransformException0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        javax.crypto.Mac mac0 = null;
        org.apache.jcp.xml.dsig.internal.MacOutputStream macOutputStream1 = new org.apache.jcp.xml.dsig.internal.MacOutputStream(mac0);
        macOutputStream1.close();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream3 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) macOutputStream1);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType4 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray5 = new byte[] {};
        java.io.OutputStream outputStream6 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray5, outputStream6);
        byte[] byteArray8 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray5);
        curveType4.setA(byteArray5);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent10 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray11 = new byte[] {};
        java.io.OutputStream outputStream12 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray11, outputStream12);
        signatureValueSecurityEvent10.setSignatureValue(byteArray11);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream17 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray11, (int) (short) 10, 10);
        curveType4.setA(byteArray11);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType19 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray20 = new byte[] {};
        java.io.OutputStream outputStream21 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray20, outputStream21);
        byte[] byteArray23 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray20);
        curveType19.setA(byteArray20);
        curveType4.setA(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            macOutputStream1.write(byteArray20, (int) (byte) 100, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        javax.crypto.SecretKey secretKey1 = null;
        org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver singleKeyResolver2 = new org.apache.xml.security.keys.keyresolver.implementations.SingleKeyResolver("", secretKey1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str0 = javax.xml.crypto.dsig.Transform.BASE64;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#base64" + "'", str0, "http://www.w3.org/2000/09/xmldsig#base64");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        javax.xml.namespace.QName qName2 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig11_ECParameters;
        org.apache.xml.security.stax.ext.stax.XMLSecEndElement xMLSecEndElement3 = finalOutputProcessor1.createEndElement(qName2);
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain4 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.init(outputProcessorChain4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(xMLSecEndElement3);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.stax.securityEvent.TokenSecurityEvent<? extends org.apache.xml.security.stax.securityToken.InboundSecurityToken> wildcardTokenSecurityEvent2 = org.apache.xml.security.stax.ext.XMLSecurityUtils.createTokenSecurityEvent(inboundSecurityToken0, "dsig11");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Id;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType0 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyValueToken;
        org.junit.Assert.assertNotNull(tokenType0);
    }
}

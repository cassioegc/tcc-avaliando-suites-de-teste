import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.apache.xml.security.stax.config.ConfigurationProperties.getProperty("http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.xml.bind.Unmarshaller unmarshaller1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.getJaxbUnmarshaller(true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass2 = org.apache.xml.security.stax.config.TransformerAlgorithmMapper.getTransformerClass("http://www.w3.org/2000/09/xmldsig#SignatureProperties", dIRECTION1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.xml.security.stax.securityToken.SecurityTokenFactory securityTokenFactory0 = org.apache.xml.security.stax.securityToken.SecurityTokenFactory.getInstance();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverSameDocument resolverSameDocument0 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverSameDocument();
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
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = resolverSameDocument0.matches(xMLSecStartElement15, qName17);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.xml.security.stax.ext.ResourceResolver resourceResolver2 = org.apache.xml.security.stax.config.ResourceResolverMapper.getResourceResolver("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", "http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.xml.bind.Unmarshaller unmarshaller1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.getJaxbUnmarshaller(false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.apache.xml.security.stax.config.ConfigurationProperties.getProperty("");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.apache.xml.security.stax.config.ConfigurationProperties.getProperty("UTF-8");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.xml.security.stax.ext.ResourceResolver resourceResolver2 = org.apache.xml.security.stax.config.ResourceResolverMapper.getResourceResolver("DerivedKeyToken", "http://www.w3.org/2006/12/xml-c14n11#WithComments");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.IN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass2 = org.apache.xml.security.stax.config.TransformerAlgorithmMapper.getTransformerClass("http://www.w3.org/2009/xmlenc11#rsa-oaep", dIRECTION1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.apache.xml.security.stax.config.ConfigurationProperties.getProperty("KeyName");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent keyValueTokenSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent.KeyValueTokenType keyValueTokenType1 = keyValueTokenSecurityEvent0.getKeyValueTokenType();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509SubjectName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass1 = org.apache.xml.security.stax.config.SecurityHeaderHandlerMapper.getSecurityHeaderHandler(qName0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.w3.org/2009/xmlenc11#aes192-gcm:http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
        boolean boolean2 = xMLSignatureInput1.isPreCalculatedDigest();
        java.lang.String str3 = xMLSignatureInput1.getSourceURI();
        org.apache.jcp.xml.dsig.internal.dom.ApacheNodeSetData apacheNodeSetData4 = new org.apache.jcp.xml.dsig.internal.dom.ApacheNodeSetData(xMLSignatureInput1);
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = apacheNodeSetData4.getXMLSignatureInput();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData apacheOctetStreamData6 = new org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData(xMLSignatureInput5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.xml.security.stax.ext.ResourceResolver resourceResolver2 = org.apache.xml.security.stax.config.ResourceResolverMapper.getResourceResolver("http://www.w3.org/2000/09/xmldsig#base64", "http://www.w3.org/2009/xmlenc11#aes256-gcm");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.xml.security.stax.impl.DocumentContextImpl documentContextImpl0 = new org.apache.xml.security.stax.impl.DocumentContextImpl();
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType2 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        documentContextImpl0.setIsInEncryptedContent(11, (java.lang.Object) algorithmIdentifierType2);
        org.apache.xml.security.binding.xmlenc.ObjectFactory objectFactory4 = new org.apache.xml.security.binding.xmlenc.ObjectFactory();
        org.apache.xml.security.binding.xmlenc.ReferenceType referenceType5 = new org.apache.xml.security.binding.xmlenc.ReferenceType();
        referenceType5.setURI("http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
        java.util.List<java.lang.Object> objList8 = referenceType5.getAny();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc.ReferenceType> referenceTypeJAXBElement9 = objectFactory4.createReferenceListDataReference(referenceType5);
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType10 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        encryptedKeyType10.setRecipient("http://www.w3.org/2000/xmlns/");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc.EncryptedKeyType> encryptedKeyTypeJAXBElement13 = objectFactory4.createEncryptedKey(encryptedKeyType10);
        org.apache.xml.security.binding.xmlenc.EncryptionMethodType encryptionMethodType14 = objectFactory4.createEncryptionMethodType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        documentContextImpl0.unsetIsInSignedContent((java.lang.Object) objectFactory4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.apache.xml.security.stax.config.ConfigurationProperties.getProperty("http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION dIRECTION1 = org.apache.xml.security.stax.ext.XMLSecurityConstants.DIRECTION.OUT;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass2 = org.apache.xml.security.stax.config.TransformerAlgorithmMapper.getTransformerClass("CHARACTERS", dIRECTION1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        javax.xml.namespace.QName qName25 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_SignedInfo;
        xMLSecurityProperties0.setIdAttributeNS(qName25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass27 = org.apache.xml.security.stax.config.SecurityHeaderHandlerMapper.getSecurityHeaderHandler(qName25);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        int int4 = finalOutputProcessor1.getActionOrder();
        javax.xml.namespace.QName qName10 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray11 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList12 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList12, xMLSecAttributeArray11);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace16 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray17 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace16 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList18 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList18, xMLSecNamespaceArray17);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement20 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName10, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList12, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList18);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl21 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement20);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl22 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", xMLSecStartElement20);
        javax.xml.namespace.QName qName23 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter24 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor25 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter24);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters27 = finalOutputProcessor25.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet28 = finalOutputProcessor25.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties29 = finalOutputProcessor25.getSecurityProperties();
        javax.xml.namespace.QName qName30 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute32 = finalOutputProcessor25.createAttribute(qName30, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray33 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute32 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList34 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList34, xMLSecAttributeArray33);
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray37 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList38 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList38, xMLSecAttributeArray37);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace42 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray43 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace42 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList44 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList44, xMLSecNamespaceArray43);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement46 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName36, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList38, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList44);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement51 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl52 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement51);
        int int53 = xMLSecCharactersImpl52.getEventType();
        javax.xml.namespace.QName qName58 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray59 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList60 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList60, xMLSecAttributeArray59);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace64 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray65 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace64 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList66 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList66, xMLSecNamespaceArray65);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement68 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName58, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList60, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList66);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl69 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement68);
        xMLSecCharactersImpl52.setParentXMLSecStartElement(xMLSecStartElement68);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl71 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName23, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList34, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList44, xMLSecStartElement68);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement72 = finalOutputProcessor1.addAttributes(xMLSecStartElement20, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList34);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter73 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor74 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter73);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters76 = finalOutputProcessor74.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet77 = finalOutputProcessor74.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties78 = finalOutputProcessor74.getSecurityProperties();
        javax.xml.namespace.QName qName79 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute81 = finalOutputProcessor74.createAttribute(qName79, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties82 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier83 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties82.setEncryptionKeyIdentifier(keyIdentifier83);
        finalOutputProcessor74.setXMLSecurityProperties(xMLSecurityProperties82);
        finalOutputProcessor1.setXMLSecurityProperties(xMLSecurityProperties82);
        java.security.Key key87 = null;
        xMLSecurityProperties82.setDecryptionKey(key87);
        javax.xml.namespace.QName qName89 = xMLSecurityProperties82.getIdAttributeNS();
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace16);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement20);
        org.junit.Assert.assertNotNull(qName23);
        org.junit.Assert.assertNotNull(xMLSecCharacters27);
        org.junit.Assert.assertNotNull(wildcardClassSet28);
        org.junit.Assert.assertNull(xMLSecurityProperties29);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertNotNull(xMLSecAttribute32);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace42);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(qName58);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace64);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement68);
        org.junit.Assert.assertNotNull(xMLSecStartElement72);
        org.junit.Assert.assertNotNull(xMLSecCharacters76);
        org.junit.Assert.assertNotNull(wildcardClassSet77);
        org.junit.Assert.assertNull(xMLSecurityProperties78);
        org.junit.Assert.assertNotNull(qName79);
        org.junit.Assert.assertNotNull(xMLSecAttribute81);
        org.junit.Assert.assertNotNull(keyIdentifier83);
        org.junit.Assert.assertNotNull(qName89);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig11.X509DigestType x509DigestType1 = new org.apache.xml.security.binding.xmldsig11.X509DigestType();
        x509DigestType1.setAlgorithm("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.X509DigestType> x509DigestTypeJAXBElement4 = objectFactory0.createX509Digest(x509DigestType1);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory5 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement7 = objectFactory5.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType8 = objectFactory5.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory9 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType10 = objectFactory9.createSignatureValueType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory11 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement13 = objectFactory11.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType14 = objectFactory11.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement15 = objectFactory9.createRSAKeyValue(rSAKeyValueType14);
        org.apache.xml.security.binding.xmldsig.ObjectType objectType16 = new org.apache.xml.security.binding.xmldsig.ObjectType();
        java.util.List<java.lang.Object> objList17 = objectType16.getContent();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.ObjectType> objectTypeJAXBElement18 = objectFactory9.createObject(objectType16);
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType19 = objectFactory9.createTransformsType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.TransformsType> transformsTypeJAXBElement20 = objectFactory5.createTransforms(transformsType19);
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType21 = new org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType();
        byte[] byteArray22 = new byte[] {};
        java.io.OutputStream outputStream23 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray22, outputStream23);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream25 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray22);
        byte[] byteArray26 = new byte[] {};
        java.io.OutputStream outputStream27 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray26, outputStream27);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream29 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray26);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream30 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray26);
        int int31 = unsyncByteArrayInputStream25.read(byteArray26);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType32 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray33 = new byte[] {};
        java.io.OutputStream outputStream34 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray33, outputStream34);
        byte[] byteArray36 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray33);
        curveType32.setA(byteArray33);
        int int38 = unsyncByteArrayInputStream25.read(byteArray33);
        primeFieldParamsType21.setP(byteArray33);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory40 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement42 = objectFactory40.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType43 = objectFactory40.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.ReferenceType referenceType44 = objectFactory40.createReferenceType();
        org.apache.xml.security.binding.xmldsig.DigestMethodType digestMethodType45 = new org.apache.xml.security.binding.xmldsig.DigestMethodType();
        referenceType44.setDigestMethod(digestMethodType45);
        org.apache.xml.security.binding.xmldsig11.ECKeyValueType eCKeyValueType47 = new org.apache.xml.security.binding.xmldsig11.ECKeyValueType();
        org.apache.xml.security.binding.xmldsig11.NamedCurveType namedCurveType48 = eCKeyValueType47.getNamedCurve();
        org.apache.xml.security.binding.xmldsig11.ECParametersType eCParametersType49 = eCKeyValueType47.getECParameters();
        java.lang.String str50 = eCKeyValueType47.getId();
        byte[] byteArray51 = new byte[] {};
        java.io.OutputStream outputStream52 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray51, outputStream52);
        byte[] byteArray54 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray51);
        eCKeyValueType47.setPublicKey(byteArray51);
        referenceType44.setDigestValue(byteArray51);
        primeFieldParamsType21.setP(byteArray51);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement58 = objectFactory5.createPGPDataTypePGPKeyID(byteArray51);
        byte[] byteArray59 = org.apache.xml.security.utils.Base64.decode(byteArray51);
        x509DigestType1.setValue(byteArray51);
        org.junit.Assert.assertNotNull(x509DigestTypeJAXBElement4);
        org.junit.Assert.assertNotNull(strJAXBElement7);
        org.junit.Assert.assertNotNull(rSAKeyValueType8);
        org.junit.Assert.assertNotNull(signatureValueType10);
        org.junit.Assert.assertNotNull(strJAXBElement13);
        org.junit.Assert.assertNotNull(rSAKeyValueType14);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement15);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objectTypeJAXBElement18);
        org.junit.Assert.assertNotNull(transformsType19);
        org.junit.Assert.assertNotNull(transformsTypeJAXBElement20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strJAXBElement42);
        org.junit.Assert.assertNotNull(rSAKeyValueType43);
        org.junit.Assert.assertNotNull(referenceType44);
        org.junit.Assert.assertNull(namedCurveType48);
        org.junit.Assert.assertNull(eCParametersType49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyValue;
        org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl xMLSecAttributeImpl41 = new org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl(qName39, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        boolean boolean42 = xMLSecAttributeImpl41.isSpecified();
        boolean boolean43 = xMLSecEventQueue22.contains((java.lang.Object) xMLSecAttributeImpl41);
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType44 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        java.math.BigInteger bigInteger45 = pBKDF2ParameterType44.getKeyLength();
        org.apache.xml.security.binding.xmlenc11.PRFAlgorithmIdentifierType pRFAlgorithmIdentifierType46 = pBKDF2ParameterType44.getPRF();
        boolean boolean47 = xMLSecEventQueue22.remove((java.lang.Object) pBKDF2ParameterType44);
        org.apache.xml.security.binding.xmlenc11.PRFAlgorithmIdentifierType pRFAlgorithmIdentifierType48 = null;
        pBKDF2ParameterType44.setPRF(pRFAlgorithmIdentifierType48);
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt50 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray51 = salt50.getSpecified();
        byte[] byteArray52 = new byte[] {};
        java.io.OutputStream outputStream53 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray52, outputStream53);
        byte[] byteArray55 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray52);
        salt50.setSpecified(byteArray52);
        pBKDF2ParameterType44.setSalt(salt50);
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt58 = pBKDF2ParameterType44.getSalt();
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
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(bigInteger45);
        org.junit.Assert.assertNull(pRFAlgorithmIdentifierType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(byteArray51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(salt58);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        byte[] byteArray3 = dSAKeyValueType0.getJ();
        org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType concatKDFParamsType4 = new org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent5 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray6 = new byte[] {};
        java.io.OutputStream outputStream7 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray6, outputStream7);
        signatureValueSecurityEvent5.setSignatureValue(byteArray6);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream12 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray6, (int) (short) 10, 10);
        concatKDFParamsType4.setPartyUInfo(byteArray6);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory14 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement16 = objectFactory14.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType17 = objectFactory14.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.DigestMethodType digestMethodType18 = new org.apache.xml.security.binding.xmldsig.DigestMethodType();
        java.lang.String str19 = digestMethodType18.getAlgorithm();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.DigestMethodType> digestMethodTypeJAXBElement20 = objectFactory14.createDigestMethod(digestMethodType18);
        concatKDFParamsType4.setDigestMethod(digestMethodType18);
        byte[] byteArray22 = concatKDFParamsType4.getSuppPrivInfo();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent23 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray24 = new byte[] {};
        java.io.OutputStream outputStream25 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray24, outputStream25);
        signatureValueSecurityEvent23.setSignatureValue(byteArray24);
        byte[] byteArray28 = signatureValueSecurityEvent23.getSignatureValue();
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream29 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray28);
        concatKDFParamsType4.setSuppPubInfo(byteArray28);
        byte[] byteArray31 = concatKDFParamsType4.getSuppPubInfo();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType32 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray33 = dSAKeyValueType32.getG();
        byte[] byteArray34 = new byte[] {};
        java.io.OutputStream outputStream35 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray34, outputStream35);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream37 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray34);
        dSAKeyValueType32.setG(byteArray34);
        byte[] byteArray39 = new byte[] {};
        java.io.OutputStream outputStream40 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray39, outputStream40);
        dSAKeyValueType32.setPgenCounter(byteArray39);
        byte[] byteArray43 = dSAKeyValueType32.getPgenCounter();
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream46 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray43, 4, 5);
        concatKDFParamsType4.setAlgorithmID(byteArray43);
        byte[] byteArray48 = concatKDFParamsType4.getSuppPubInfo();
        dSAKeyValueType0.setP(byteArray48);
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext50 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken51 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext50);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(strJAXBElement16);
        org.junit.Assert.assertNotNull(rSAKeyValueType17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(digestMethodTypeJAXBElement20);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.xml.security.stax.securityEvent.AlgorithmSuiteSecurityEvent algorithmSuiteSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.AlgorithmSuiteSecurityEvent();
        algorithmSuiteSecurityEvent0.setKeyLength((int) (byte) -1);
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage3 = algorithmSuiteSecurityEvent0.getAlgorithmUsage();
        algorithmSuiteSecurityEvent0.setKeyLength((int) '#');
        org.junit.Assert.assertNull(algorithmUsage3);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        java.lang.String[] strArray14 = securePart13.getTransforms();
        securePart13.setSecureEntireRequest(true);
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace6);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement10);
        org.junit.Assert.assertTrue("'" + modifier12 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier12.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        org.apache.xml.security.binding.xmldsig.CanonicalizationMethodType canonicalizationMethodType22 = objectFactory0.createCanonicalizationMethodType();
        org.apache.xml.security.binding.xmldsig.TransformType transformType23 = objectFactory0.createTransformType();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement25 = objectFactory0.createTransformTypeXPath("http://www.w3.org/2009/xmlenc11#aes192-gcm");
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory26 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType27 = objectFactory26.createSignatureValueType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory28 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement30 = objectFactory28.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType31 = objectFactory28.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement32 = objectFactory26.createRSAKeyValue(rSAKeyValueType31);
        org.apache.xml.security.binding.xmldsig.ObjectType objectType33 = new org.apache.xml.security.binding.xmldsig.ObjectType();
        java.util.List<java.lang.Object> objList34 = objectType33.getContent();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.ObjectType> objectTypeJAXBElement35 = objectFactory26.createObject(objectType33);
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType36 = objectFactory26.createTransformsType();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement38 = objectFactory26.createX509DataTypeX509SubjectName("IssuerSerial");
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory39 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement41 = objectFactory39.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.TransformType transformType42 = objectFactory39.createTransformType();
        transformType42.setAlgorithm("hi!");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.TransformType> transformTypeJAXBElement45 = objectFactory26.createTransform(transformType42);
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.TransformType> transformTypeJAXBElement46 = objectFactory0.createTransform(transformType42);
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
        org.junit.Assert.assertNotNull(canonicalizationMethodType22);
        org.junit.Assert.assertNotNull(transformType23);
        org.junit.Assert.assertNotNull(strJAXBElement25);
        org.junit.Assert.assertNotNull(signatureValueType27);
        org.junit.Assert.assertNotNull(strJAXBElement30);
        org.junit.Assert.assertNotNull(rSAKeyValueType31);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement32);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNotNull(objectTypeJAXBElement35);
        org.junit.Assert.assertNotNull(transformsType36);
        org.junit.Assert.assertNotNull(strJAXBElement38);
        org.junit.Assert.assertNotNull(strJAXBElement41);
        org.junit.Assert.assertNotNull(transformType42);
        org.junit.Assert.assertNotNull(transformTypeJAXBElement45);
        org.junit.Assert.assertNotNull(transformTypeJAXBElement46);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl0 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.KeyNameTokenSecurityEvent keyNameTokenSecurityEvent2 = new org.apache.xml.security.stax.securityEvent.KeyNameTokenSecurityEvent();
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent3 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken4 = x509TokenSecurityEvent3.getSecurityToken();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType5 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext6 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken7 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType5, inboundSecurityContext6);
        java.util.List<javax.xml.namespace.QName> qNameList8 = dsaKeyValueSecurityToken7.getElementPath();
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName qName10 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName11 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier12 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart13 = new org.apache.xml.security.stax.ext.SecurePart(qName11, modifier12);
        javax.xml.namespace.QName qName14 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherData;
        javax.xml.namespace.QName qName17 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName18 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_J;
        javax.xml.namespace.QName qName19 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_Type;
        javax.xml.namespace.QName qName20 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray21 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList22 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList22, xMLSecAttributeArray21);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace26 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray27 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace26 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList28 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList28, xMLSecNamespaceArray27);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement30 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName20, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList22, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList28);
        javax.xml.namespace.QName qName31 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName32 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_X509Data;
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_EncryptionProperties;
        javax.xml.namespace.QName qName35 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName36 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Signature;
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_CipherValue;
        javax.xml.namespace.QName qName40 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_XOP_INCLUDE;
        javax.xml.namespace.QName[] qNameArray41 = new javax.xml.namespace.QName[] { qName9, qName10, qName11, qName14, qName15, qName16, qName17, qName18, qName19, qName20, qName31, qName32, qName33, qName34, qName35, qName36, qName37, qName38, qName39, qName40 };
        java.util.ArrayList<javax.xml.namespace.QName> qNameList42 = new java.util.ArrayList<javax.xml.namespace.QName>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<javax.xml.namespace.QName>) qNameList42, qNameArray41);
        dsaKeyValueSecurityToken7.setElementPath((java.util.List<javax.xml.namespace.QName>) qNameList42);
        x509TokenSecurityEvent3.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken7);
        keyNameTokenSecurityEvent2.setSecurityToken((org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken7);
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType47 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext48 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken49 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType47, inboundSecurityContext48);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage50 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage_Encryption;
        dsaKeyValueSecurityToken49.addTokenUsage(tokenUsage50);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken53 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray55 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList56 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList56, contentTypeArray55);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent58 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken53, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList56);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement59 = null;
        java.util.Set<java.lang.String> strSet61 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement59, true);
        boolean boolean62 = contentTypeList56.removeAll((java.util.Collection<java.lang.String>) strSet61);
        org.apache.xml.security.stax.securityEvent.EncryptedElementSecurityEvent encryptedElementSecurityEvent63 = new org.apache.xml.security.stax.securityEvent.EncryptedElementSecurityEvent((org.apache.xml.security.stax.securityToken.InboundSecurityToken) dsaKeyValueSecurityToken49, false, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList56);
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage65 = org.apache.xml.security.stax.ext.XMLSecurityConstants.Enc;
        java.security.Key key67 = dsaKeyValueSecurityToken49.getSecretKey("http://www.w3.org/2000/09/xmldsig#SignatureProperties", algorithmUsage65, "http://www.w3.org/2009/xmlenc11#mgf1sha512");
        org.apache.xml.security.stax.securityToken.SecurityToken securityToken68 = dsaKeyValueSecurityToken49.getKeyWrappingToken();
        dsaKeyValueSecurityToken7.setKeyWrappingToken((org.apache.xml.security.stax.securityToken.InboundSecurityToken) dsaKeyValueSecurityToken49);
        abstractSecurityContextImpl0.put("http://www.w3.org/2009/xmlenc11#mgf1sha1", (org.apache.xml.security.stax.securityToken.SecurityToken) dsaKeyValueSecurityToken49);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent71 = dsaKeyValueSecurityToken49.getXMLSecEvent();
        java.util.List<org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage> tokenUsageList72 = dsaKeyValueSecurityToken49.getTokenUsages();
        org.junit.Assert.assertNull(securityToken4);
        org.junit.Assert.assertNull(qNameList8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(qName15);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(qName17);
        org.junit.Assert.assertNotNull(qName18);
        org.junit.Assert.assertNotNull(qName19);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace26);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement30);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertNotNull(qName40);
        org.junit.Assert.assertNotNull(qNameArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tokenUsage50);
        org.junit.Assert.assertNotNull(contentTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(algorithmUsage65);
        org.junit.Assert.assertNull(key67);
        org.junit.Assert.assertNull(securityToken68);
        org.junit.Assert.assertNull(xMLSecEvent71);
        org.junit.Assert.assertNotNull(tokenUsageList72);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl26 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str27 = xMLSecEntityDeclarationImpl26.getPublicId();
        boolean boolean28 = xMLSecEntityDeclarationImpl26.isEntityReference();
        xMLSecEventQueue22.push((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecEntityDeclarationImpl26);
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
        boolean boolean46 = xMLSecCharactersImpl45.isEndDocument();
        boolean boolean47 = xMLSecEventQueue22.offerFirst((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecCharactersImpl45);
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException49 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException50 = new org.apache.xml.security.keys.storage.StorageResolverException((java.lang.Exception) uncheckedXMLSecurityException49);
        org.apache.xml.security.stax.ext.XMLSecurityConfigurationException xMLSecurityConfigurationException51 = new org.apache.xml.security.stax.ext.XMLSecurityConfigurationException((java.lang.Exception) storageResolverException50);
        javax.xml.stream.XMLStreamWriter xMLStreamWriter52 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor53 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter52);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters55 = finalOutputProcessor53.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet56 = finalOutputProcessor53.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties57 = finalOutputProcessor53.getSecurityProperties();
        javax.xml.namespace.QName qName58 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute60 = finalOutputProcessor53.createAttribute(qName58, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent> exceptionKeyValue61 = new org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent>((java.lang.Exception) xMLSecurityConfigurationException51, (javax.xml.stream.events.XMLEvent) xMLSecAttribute60);
        xMLSecEventQueue22.addFirst((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecAttribute60);
        boolean boolean63 = xMLSecEventQueue22.isEmpty();
        boolean boolean64 = xMLSecEventQueue22.isEmpty();
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace40);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xMLSecCharacters55);
        org.junit.Assert.assertNotNull(wildcardClassSet56);
        org.junit.Assert.assertNull(xMLSecurityProperties57);
        org.junit.Assert.assertNotNull(qName58);
        org.junit.Assert.assertNotNull(xMLSecAttribute60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        java.util.List<? extends org.apache.xml.security.stax.securityToken.SecurityToken> wildcardList92 = dsaKeyValueSecurityToken3.getWrappedTokens();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType93 = dsaKeyValueSecurityToken3.getTokenType();
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken94 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("Missing message ID", tokenType93);
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
        org.junit.Assert.assertNotNull(wildcardList92);
        org.junit.Assert.assertNotNull(tokenType93);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier1 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties0.setEncryptionKeyIdentifier(keyIdentifier1);
        java.security.Key key3 = xMLSecurityProperties0.getEncryptionKey();
        int int4 = xMLSecurityProperties0.getSignaturePosition();
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_G;
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier6 = null;
        org.apache.xml.security.stax.ext.SecurePart securePart7 = new org.apache.xml.security.stax.ext.SecurePart(qName5, modifier6);
        boolean boolean8 = securePart7.isSecureEntireRequest();
        xMLSecurityProperties0.addEncryptionPart(securePart7);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.Action> actionList10 = null;
        xMLSecurityProperties0.setActions(actionList10);
        javax.xml.namespace.QName qName12 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray13 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList14 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList14, xMLSecAttributeArray13);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace18 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray19 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace18 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList20 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList20, xMLSecNamespaceArray19);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement22 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName12, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList14, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList20);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier24 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart25 = new org.apache.xml.security.stax.ext.SecurePart(qName12, true, modifier24);
        java.lang.String[] strArray26 = securePart25.getTransforms();
        java.lang.String str27 = securePart25.getIdToSign();
        securePart25.setExternalReference("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        xMLSecurityProperties0.addSignaturePart(securePart25);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory31 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement33 = objectFactory31.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType34 = objectFactory31.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType35 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement36 = objectFactory31.createSignatureMethod(signatureMethodType35);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory37 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement39 = objectFactory37.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType40 = objectFactory37.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement41 = objectFactory31.createRSAKeyValue(rSAKeyValueType40);
        java.security.Signature signature42 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream43 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature42);
        javax.crypto.Cipher cipher44 = null;
        java.security.Key key45 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream47 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream43, cipher44, key45, 0);
        boolean boolean48 = iVSplittingOutputStream47.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream49 = null;
        iVSplittingOutputStream47.setParentOutputStream(replaceableOuputStream49);
        byte[] byteArray51 = iVSplittingOutputStream47.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement52 = objectFactory31.createPGPDataTypePGPKeyPacket(byteArray51);
        org.apache.xml.security.binding.xmldsig.PGPDataType pGPDataType53 = objectFactory31.createPGPDataType();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType54 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray55 = dSAKeyValueType54.getG();
        byte[] byteArray56 = new byte[] {};
        java.io.OutputStream outputStream57 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray56, outputStream57);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream59 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray56);
        dSAKeyValueType54.setG(byteArray56);
        byte[] byteArray61 = new byte[] {};
        java.io.OutputStream outputStream62 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray61, outputStream62);
        dSAKeyValueType54.setPgenCounter(byteArray61);
        java.security.Signature signature65 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream66 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature65);
        byte[] byteArray67 = signerOutputStream66.toByteArray();
        dSAKeyValueType54.setPgenCounter(byteArray67);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement69 = objectFactory31.createPGPDataTypePGPKeyPacket(byteArray67);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType70 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray71 = new byte[] {};
        java.io.OutputStream outputStream72 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray71, outputStream72);
        byte[] byteArray74 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray71);
        curveType70.setA(byteArray71);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement76 = objectFactory31.createPGPDataTypePGPKeyPacket(byteArray71);
        xMLSecurityProperties0.setEncryptionKeyTransportOAEPParams(byteArray71);
        xMLSecurityProperties0.setEncryptionKeyName("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.OutboundXMLSec outboundXMLSec80 = new org.apache.xml.security.stax.ext.OutboundXMLSec(xMLSecurityProperties0);
        java.security.Key key81 = null;
        xMLSecurityProperties0.setEncryptionTransportKey(key81);
        xMLSecurityProperties0.setAddExcC14NInclusivePrefixes(true);
        org.junit.Assert.assertNotNull(keyIdentifier1);
        org.junit.Assert.assertNull(key3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace18);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement22);
        org.junit.Assert.assertTrue("'" + modifier24 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier24.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strJAXBElement33);
        org.junit.Assert.assertNotNull(rSAKeyValueType34);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement36);
        org.junit.Assert.assertNotNull(strJAXBElement39);
        org.junit.Assert.assertNotNull(rSAKeyValueType40);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement52);
        org.junit.Assert.assertNotNull(pGPDataType53);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement69);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement76);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.xml.security.binding.xmldsig11.CurveType curveType0 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        byte[] byteArray4 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray1);
        curveType0.setA(byteArray1);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent6 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray7 = new byte[] {};
        java.io.OutputStream outputStream8 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray7, outputStream8);
        signatureValueSecurityEvent6.setSignatureValue(byteArray7);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream13 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray7, (int) (short) 10, 10);
        curveType0.setA(byteArray7);
        byte[] byteArray15 = curveType0.getB();
        byte[] byteArray16 = curveType0.getA();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.convertASN1toXMLDSIG(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Invalid ASN.1 format of ECDSA signature");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType0 = null;
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken rsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken(rSAKeyValueType0, inboundSecurityContext1);
        boolean boolean3 = rsaKeyValueSecurityToken2.isAsymmetric();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType4 = rsaKeyValueSecurityToken2.getTokenType();
        boolean boolean5 = rsaKeyValueSecurityToken2.isAsymmetric();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray8 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType7 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList9 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList9, contentTypeArray8);
        byte[] byteArray12 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput13 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray12);
        java.io.InputStream inputStream14 = xMLSignatureInput13.getOctetStream();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType15 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray16 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType15 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList17 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList17, contentTypeArray16);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken19 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray21 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList22 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList22, contentTypeArray21);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent24 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken19, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList22);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement25 = null;
        java.util.Set<java.lang.String> strSet27 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement25, true);
        boolean boolean28 = contentTypeList22.removeAll((java.util.Collection<java.lang.String>) strSet27);
        boolean boolean29 = contentTypeList17.containsAll((java.util.Collection<java.lang.String>) strSet27);
        org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger30 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput13, strSet27);
        boolean boolean31 = contentTypeList9.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.String str32 = contentTypeList9.toString();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType33 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray34 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType33 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList35 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList35, contentTypeArray34);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken37 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray39 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList40 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList40, contentTypeArray39);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent42 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken37, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList40);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement43 = null;
        java.util.Set<java.lang.String> strSet45 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement43, true);
        boolean boolean46 = contentTypeList40.removeAll((java.util.Collection<java.lang.String>) strSet45);
        boolean boolean47 = contentTypeList35.containsAll((java.util.Collection<java.lang.String>) strSet45);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement48 = null;
        java.util.Set<java.lang.String> strSet50 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement48, true);
        boolean boolean51 = contentTypeList35.removeAll((java.util.Collection<java.lang.String>) strSet50);
        java.util.stream.Stream<java.lang.String> strStream52 = strSet50.parallelStream();
        boolean boolean53 = contentTypeList9.removeAll((java.util.Collection<java.lang.String>) strSet50);
        java.lang.String str54 = contentTypeList9.toString();
        org.apache.xml.security.stax.securityEvent.EncryptedElementSecurityEvent encryptedElementSecurityEvent55 = new org.apache.xml.security.stax.securityEvent.EncryptedElementSecurityEvent((org.apache.xml.security.stax.securityToken.InboundSecurityToken) rsaKeyValueSecurityToken2, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList9);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType56 = rsaKeyValueSecurityToken2.getTokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tokenType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + contentType7 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE + "'", contentType7.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.SIGNATURE));
        org.junit.Assert.assertNotNull(contentTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + contentType15 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType15.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
        org.junit.Assert.assertNotNull(contentTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(contentTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[SIGNATURE]" + "'", str32, "[SIGNATURE]");
        org.junit.Assert.assertTrue("'" + contentType33 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType33.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
        org.junit.Assert.assertNotNull(contentTypeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(contentTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[SIGNATURE]" + "'", str54, "[SIGNATURE]");
        org.junit.Assert.assertNotNull(tokenType56);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        java.lang.String[] strArray14 = securePart13.getTransforms();
        securePart13.setExternalReference("xenc11");
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace6);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement10);
        org.junit.Assert.assertTrue("'" + modifier12 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier12.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        javax.xml.crypto.dsig.TransformService transformService0 = null;
        org.apache.jcp.xml.dsig.internal.dom.DOMTransform dOMTransform1 = new org.apache.jcp.xml.dsig.internal.dom.DOMTransform(transformService0);
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType2 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext3 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken4 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType2, inboundSecurityContext3);
        boolean boolean5 = dOMTransform1.equals((java.lang.Object) dsaKeyValueSecurityToken4);
        byte[] byteArray7 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray7);
        java.io.InputStream inputStream9 = xMLSignatureInput8.getOctetStream();
        xMLSignatureInput8.setExcludeComments(true);
        boolean boolean12 = xMLSignatureInput8.isByteArray();
        org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData apacheOctetStreamData13 = new org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData(xMLSignatureInput8);
        java.lang.String str14 = apacheOctetStreamData13.getURI();
        javax.xml.crypto.XMLCryptoContext xMLCryptoContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.crypto.Data data16 = dOMTransform1.transform((javax.xml.crypto.Data) apacheOctetStreamData13, xMLCryptoContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean1 = xMLSecurityProperties0.isSignatureGenerateIds();
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList2 = xMLSecurityProperties0.getSignatureSecureParts();
        boolean boolean3 = xMLSecurityProperties0.isSkipDocumentEvents();
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList4 = xMLSecurityProperties0.getSignatureSecureParts();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(securePartList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(securePartList4);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory3 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement5 = objectFactory3.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType6 = objectFactory3.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType7 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement8 = objectFactory3.createSignatureMethod(signatureMethodType7);
        byte[] byteArray9 = new byte[] {};
        java.io.OutputStream outputStream10 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray9, outputStream10);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream12 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray9);
        byte[] byteArray13 = new byte[] {};
        java.io.OutputStream outputStream14 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray13, outputStream14);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream16 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray13);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream17 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray13);
        int int18 = unsyncByteArrayInputStream12.read(byteArray13);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement19 = objectFactory3.createDigestValue(byteArray13);
        org.apache.xml.security.binding.xmldsig.CanonicalizationMethodType canonicalizationMethodType20 = objectFactory3.createCanonicalizationMethodType();
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType21 = objectFactory3.createRSAKeyValueType();
        org.apache.xml.security.binding.xmlenc.ObjectFactory objectFactory22 = new org.apache.xml.security.binding.xmlenc.ObjectFactory();
        org.apache.xml.security.binding.xmlenc.ReferenceType referenceType23 = new org.apache.xml.security.binding.xmlenc.ReferenceType();
        referenceType23.setURI("http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
        java.util.List<java.lang.Object> objList26 = referenceType23.getAny();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc.ReferenceType> referenceTypeJAXBElement27 = objectFactory22.createReferenceListDataReference(referenceType23);
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType28 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        encryptedKeyType28.setRecipient("http://www.w3.org/2000/xmlns/");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc.EncryptedKeyType> encryptedKeyTypeJAXBElement31 = objectFactory22.createEncryptedKey(encryptedKeyType28);
        org.apache.xml.security.binding.xmlenc.EncryptedDataType encryptedDataType32 = new org.apache.xml.security.binding.xmlenc.EncryptedDataType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc.EncryptedDataType> encryptedDataTypeJAXBElement33 = objectFactory22.createEncryptedData(encryptedDataType32);
        org.apache.xml.security.binding.xmlenc.ReferenceType referenceType34 = objectFactory22.createReferenceType();
        org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType concatKDFParamsType35 = new org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType();
        org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType concatKDFParamsType36 = new org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent37 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray38 = new byte[] {};
        java.io.OutputStream outputStream39 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray38, outputStream39);
        signatureValueSecurityEvent37.setSignatureValue(byteArray38);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream44 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray38, (int) (short) 10, 10);
        concatKDFParamsType36.setPartyUInfo(byteArray38);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory46 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement48 = objectFactory46.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType49 = objectFactory46.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.DigestMethodType digestMethodType50 = new org.apache.xml.security.binding.xmldsig.DigestMethodType();
        java.lang.String str51 = digestMethodType50.getAlgorithm();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.DigestMethodType> digestMethodTypeJAXBElement52 = objectFactory46.createDigestMethod(digestMethodType50);
        concatKDFParamsType36.setDigestMethod(digestMethodType50);
        byte[] byteArray54 = concatKDFParamsType36.getSuppPrivInfo();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent55 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray56 = new byte[] {};
        java.io.OutputStream outputStream57 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray56, outputStream57);
        signatureValueSecurityEvent55.setSignatureValue(byteArray56);
        byte[] byteArray60 = signatureValueSecurityEvent55.getSignatureValue();
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream61 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray60);
        concatKDFParamsType36.setSuppPubInfo(byteArray60);
        concatKDFParamsType35.setSuppPubInfo(byteArray60);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement64 = objectFactory22.createEncryptionMethodTypeOAEPparams(byteArray60);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement65 = objectFactory3.createX509DataTypeX509CRL(byteArray60);
        dSAKeyValueType0.setPgenCounter(byteArray60);
        org.junit.Assert.assertNotNull(strJAXBElement5);
        org.junit.Assert.assertNotNull(rSAKeyValueType6);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArrayJAXBElement19);
        org.junit.Assert.assertNotNull(canonicalizationMethodType20);
        org.junit.Assert.assertNotNull(rSAKeyValueType21);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(referenceTypeJAXBElement27);
        org.junit.Assert.assertNotNull(encryptedKeyTypeJAXBElement31);
        org.junit.Assert.assertNotNull(encryptedDataTypeJAXBElement33);
        org.junit.Assert.assertNotNull(referenceType34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(strJAXBElement48);
        org.junit.Assert.assertNotNull(rSAKeyValueType49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(digestMethodTypeJAXBElement52);
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement64);
        org.junit.Assert.assertNotNull(byteArrayJAXBElement65);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig11.X509DigestType x509DigestType1 = new org.apache.xml.security.binding.xmldsig11.X509DigestType();
        x509DigestType1.setAlgorithm("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.X509DigestType> x509DigestTypeJAXBElement4 = objectFactory0.createX509Digest(x509DigestType1);
        org.apache.xml.security.binding.xmldsig11.DEREncodedKeyValueType dEREncodedKeyValueType5 = objectFactory0.createDEREncodedKeyValueType();
        org.apache.xml.security.binding.xmldsig11.ECValidationDataType eCValidationDataType6 = objectFactory0.createECValidationDataType();
        org.apache.xml.security.binding.xmldsig11.FieldIDType fieldIDType7 = new org.apache.xml.security.binding.xmldsig11.FieldIDType();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType8 = fieldIDType7.getTnB();
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType9 = fieldIDType7.getPrime();
        org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType pnBFieldParamsType10 = new org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType();
        java.math.BigInteger bigInteger11 = null;
        pnBFieldParamsType10.setK3(bigInteger11);
        java.math.BigInteger bigInteger13 = null;
        pnBFieldParamsType10.setM(bigInteger13);
        fieldIDType7.setPnB(pnBFieldParamsType10);
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType> pnBFieldParamsTypeJAXBElement16 = objectFactory0.createPnB(pnBFieldParamsType10);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType17 = objectFactory0.createCurveType();
        org.junit.Assert.assertNotNull(x509DigestTypeJAXBElement4);
        org.junit.Assert.assertNotNull(dEREncodedKeyValueType5);
        org.junit.Assert.assertNotNull(eCValidationDataType6);
        org.junit.Assert.assertNull(tnBFieldParamsType8);
        org.junit.Assert.assertNull(primeFieldParamsType9);
        org.junit.Assert.assertNotNull(pnBFieldParamsTypeJAXBElement16);
        org.junit.Assert.assertNotNull(curveType17);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        // The following exception was thrown during execution in test generation
        try {
            xMLSecurityStreamWriter1.writeCData("http://www.w3.org/2009/xmlenc11#mgf1sha512");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor1 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter0);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters3 = finalOutputProcessor1.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet4 = finalOutputProcessor1.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties5 = finalOutputProcessor1.getSecurityProperties();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.Action action6 = finalOutputProcessor1.getAction();
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain7 = null;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.doFinal(outputProcessorChain7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLSecCharacters3);
        org.junit.Assert.assertNotNull(wildcardClassSet4);
        org.junit.Assert.assertNull(xMLSecurityProperties5);
        org.junit.Assert.assertNull(action6);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.xml.security.configuration.PropertyType propertyType0 = new org.apache.xml.security.configuration.PropertyType();
        propertyType0.setVAL("http://www.w3.org/TR/1999/REC-xslt-19991116");
        propertyType0.setVAL("org.apache.xml.security.signature.ReferenceNotInitializedException: Missing message string");
        propertyType0.setVAL("org.apache.xml.security.stax.ext.XMLSecurityConfigurationException: http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.keys.storage.StorageResolverException: http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverFilesystem resolverFilesystem2 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverFilesystem("XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)", "inclusiveNamespacePrefixList");
        org.apache.xml.security.stax.ext.ResourceResolverLookup resourceResolverLookup5 = resolverFilesystem2.canResolve("http://www.w3.org/2001/10/xml-exc-c14n#", "org.apache.xml.security.signature.ReferenceNotInitializedException: Missing message string");
        org.apache.xml.security.stax.ext.ResourceResolverLookup resourceResolverLookup8 = resolverFilesystem2.canResolve("http://www.w3.org/2000/09/xmldsig#Object", "KeyName");
        org.junit.Assert.assertNull(resourceResolverLookup5);
        org.junit.Assert.assertNull(resourceResolverLookup8);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.xml.security.binding.xmlenc11.DerivedKeyType derivedKeyType0 = new org.apache.xml.security.binding.xmlenc11.DerivedKeyType();
        java.lang.String str1 = derivedKeyType0.getDerivedKeyName();
        derivedKeyType0.setMasterKeyName("hi!");
        derivedKeyType0.setMasterKeyName("http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
        org.apache.xml.security.binding.xmlenc11.KeyDerivationMethodType keyDerivationMethodType6 = new org.apache.xml.security.binding.xmlenc11.KeyDerivationMethodType();
        java.lang.String str7 = keyDerivationMethodType6.getAlgorithm();
        derivedKeyType0.setKeyDerivationMethod(keyDerivationMethodType6);
        org.apache.xml.security.binding.xmlenc11.KeyDerivationMethodType keyDerivationMethodType9 = derivedKeyType0.getKeyDerivationMethod();
        derivedKeyType0.setDerivedKeyName("http://www.w3.org/2009/xmlenc11#mgf1sha512");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(keyDerivationMethodType9);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.KeyNameSecurityToken keyNameSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.KeyNameSecurityToken("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", inboundSecurityContext1);
        java.lang.String str3 = keyNameSecurityToken2.getKeyName();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier4 = keyNameSecurityToken2.getKeyIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256" + "'", str3, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
        org.junit.Assert.assertNotNull(keyIdentifier4);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType0 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType1 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        org.apache.xml.security.binding.xmlenc.ReferenceList referenceList2 = encryptedKeyType1.getReferenceList();
        java.lang.String str3 = encryptedKeyType1.getMimeType();
        org.apache.xml.security.binding.xmldsig.KeyInfoType keyInfoType4 = new org.apache.xml.security.binding.xmldsig.KeyInfoType();
        java.lang.String str5 = keyInfoType4.getId();
        encryptedKeyType1.setKeyInfo(keyInfoType4);
        java.lang.String str7 = keyInfoType4.getId();
        encryptedKeyType0.setKeyInfo(keyInfoType4);
        org.junit.Assert.assertNull(referenceList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.xml.security.binding.xmlenc.EncryptionPropertyType encryptionPropertyType0 = new org.apache.xml.security.binding.xmlenc.EncryptionPropertyType();
        encryptionPropertyType0.setTarget("PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTED_KEY");
        encryptionPropertyType0.setTarget("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
        java.util.Map<javax.xml.namespace.QName, java.lang.String> qNameMap5 = encryptionPropertyType0.getOtherAttributes();
        org.junit.Assert.assertNotNull(qNameMap5);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement2 = objectFactory0.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.TransformType transformType3 = objectFactory0.createTransformType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory4 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement6 = objectFactory4.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType7 = objectFactory4.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType8 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement9 = objectFactory4.createSignatureMethod(signatureMethodType8);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory10 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement12 = objectFactory10.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType13 = objectFactory10.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement14 = objectFactory4.createRSAKeyValue(rSAKeyValueType13);
        java.security.Signature signature15 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream16 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature15);
        javax.crypto.Cipher cipher17 = null;
        java.security.Key key18 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream20 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream16, cipher17, key18, 0);
        boolean boolean21 = iVSplittingOutputStream20.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream22 = null;
        iVSplittingOutputStream20.setParentOutputStream(replaceableOuputStream22);
        byte[] byteArray24 = iVSplittingOutputStream20.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement25 = objectFactory4.createPGPDataTypePGPKeyPacket(byteArray24);
        org.apache.xml.security.binding.xmldsig.SignaturePropertyType signaturePropertyType26 = objectFactory4.createSignaturePropertyType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory27 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement29 = objectFactory27.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType30 = objectFactory27.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType31 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement32 = objectFactory27.createSignatureMethod(signatureMethodType31);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory33 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement35 = objectFactory33.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType36 = objectFactory33.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement37 = objectFactory27.createRSAKeyValue(rSAKeyValueType36);
        java.security.Signature signature38 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream39 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature38);
        javax.crypto.Cipher cipher40 = null;
        java.security.Key key41 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream43 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream39, cipher40, key41, 0);
        boolean boolean44 = iVSplittingOutputStream43.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream45 = null;
        iVSplittingOutputStream43.setParentOutputStream(replaceableOuputStream45);
        byte[] byteArray47 = iVSplittingOutputStream43.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement48 = objectFactory27.createPGPDataTypePGPKeyPacket(byteArray47);
        org.apache.xml.security.binding.xmldsig.CanonicalizationMethodType canonicalizationMethodType49 = objectFactory27.createCanonicalizationMethodType();
        org.apache.xml.security.binding.xmldsig.TransformType transformType50 = objectFactory27.createTransformType();
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType51 = objectFactory27.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement52 = objectFactory4.createRSAKeyValue(rSAKeyValueType51);
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement53 = objectFactory0.createRSAKeyValue(rSAKeyValueType51);
        org.junit.Assert.assertNotNull(strJAXBElement2);
        org.junit.Assert.assertNotNull(transformType3);
        org.junit.Assert.assertNotNull(strJAXBElement6);
        org.junit.Assert.assertNotNull(rSAKeyValueType7);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement9);
        org.junit.Assert.assertNotNull(strJAXBElement12);
        org.junit.Assert.assertNotNull(rSAKeyValueType13);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement25);
        org.junit.Assert.assertNotNull(signaturePropertyType26);
        org.junit.Assert.assertNotNull(strJAXBElement29);
        org.junit.Assert.assertNotNull(rSAKeyValueType30);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement32);
        org.junit.Assert.assertNotNull(strJAXBElement35);
        org.junit.Assert.assertNotNull(rSAKeyValueType36);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement48);
        org.junit.Assert.assertNotNull(canonicalizationMethodType49);
        org.junit.Assert.assertNotNull(transformType50);
        org.junit.Assert.assertNotNull(rSAKeyValueType51);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement52);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement53);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties0.setSignaturePositionStart(false);
        java.security.cert.X509Certificate x509Certificate3 = xMLSecurityProperties0.getEncryptionUseThisCertificate();
        org.apache.xml.security.binding.xmldsig11.ECValidationDataType eCValidationDataType4 = new org.apache.xml.security.binding.xmldsig11.ECValidationDataType();
        java.lang.String str5 = eCValidationDataType4.getHashAlgorithm();
        byte[] byteArray7 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        byte[] byteArray8 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray7);
        eCValidationDataType4.setSeed(byteArray7);
        xMLSecurityProperties0.setEncryptionKeyTransportOAEPParams(byteArray7);
        java.util.List<org.apache.xml.security.stax.ext.InputProcessor> inputProcessorList11 = xMLSecurityProperties0.getInputProcessorList();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier12 = xMLSecurityProperties0.getSignatureKeyIdentifier();
        org.junit.Assert.assertNull(x509Certificate3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertNotNull(inputProcessorList11);
        org.junit.Assert.assertNull(keyIdentifier12);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants.Event event0 = org.apache.xml.security.stax.securityEvent.SecurityEventConstants.AlgorithmSuite;
        java.lang.String str1 = event0.getName();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties2 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties2.setSignaturePositionStart(false);
        xMLSecurityProperties2.setSignatureGenerateIds(true);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties7 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties7.setSignaturePositionStart(false);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties10 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean11 = xMLSecurityProperties10.isDisableSchemaValidation();
        java.security.Key key12 = xMLSecurityProperties10.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment14 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName19 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray20 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList21 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList21, xMLSecAttributeArray20);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace25 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray26 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace25 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList27 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList27, xMLSecNamespaceArray26);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement29 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName19, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList21, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList27);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl30 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement29);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray31 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment14, xMLSecCharactersImpl30 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue32 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue32, xMLSecEventArray31);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor34 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties10, xMLSecEventQueue32);
        xMLSecurityProperties7.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor34);
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain36 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent37 = internalReplayProcessor34.processHeaderEvent(inputProcessorChain36);
        xMLSecurityProperties2.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor34);
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain39 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent40 = internalReplayProcessor34.processEvent(inputProcessorChain39);
        boolean boolean41 = event0.equals((java.lang.Object) inputProcessorChain39);
        org.junit.Assert.assertNotNull(event0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AlgorithmSuite" + "'", str1, "AlgorithmSuite");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(key12);
        org.junit.Assert.assertNotNull(xMLSecComment14);
        org.junit.Assert.assertNotNull(qName19);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace25);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement29);
        org.junit.Assert.assertNotNull(xMLSecEventArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(xMLSecEvent37);
        org.junit.Assert.assertNotNull(xMLSecEvent40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.xml.security.binding.xmldsig.SignaturePropertiesType signaturePropertiesType0 = new org.apache.xml.security.binding.xmldsig.SignaturePropertiesType();
        java.util.List<org.apache.xml.security.binding.xmldsig.SignaturePropertyType> signaturePropertyTypeList1 = signaturePropertiesType0.getSignatureProperty();
        signaturePropertiesType0.setId("http://www.w3.org/2001/04/xmlenc#ripemd160");
        org.junit.Assert.assertNotNull(signaturePropertyTypeList1);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.io.OutputStream outputStream0 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor2 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(outputStream0, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties3 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties3.setSignaturePositionStart(false);
        java.security.Key key6 = xMLSecurityProperties3.getSignatureKey();
        java.lang.String str7 = xMLSecurityProperties3.getEncryptionKeyTransportAlgorithm();
        java.security.Key key8 = xMLSecurityProperties3.getEncryptionTransportKey();
        finalOutputProcessor2.setXMLSecurityProperties(xMLSecurityProperties3);
        javax.xml.namespace.QName qName10 = xMLSecurityProperties3.getSignaturePositionQName();
        xMLSecurityProperties3.setEncryptionKeyTransportMGFAlgorithm("http://www.w3.org/2002/06/xmldsig-filter2");
        org.junit.Assert.assertNull(key6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(key8);
        org.junit.Assert.assertNull(qName10);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverSameDocument resolverSameDocument1 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverSameDocument("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
        javax.xml.namespace.QName qName2 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter3 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor4 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter3);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters6 = finalOutputProcessor4.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet7 = finalOutputProcessor4.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties8 = finalOutputProcessor4.getSecurityProperties();
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute11 = finalOutputProcessor4.createAttribute(qName9, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray12 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute11 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList13 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList13, xMLSecAttributeArray12);
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
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName2, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList13, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList23, xMLSecStartElement47);
        java.util.Iterator<javax.xml.stream.events.Attribute> attributeItor51 = xMLSecStartElementImpl50.getAttributes();
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken52 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray54 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList55 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList55, contentTypeArray54);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent57 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken52, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList55);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement62 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl63 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement62);
        java.util.List<javax.xml.namespace.QName> qNameList64 = xMLSecCharactersImpl63.getElementPath();
        signedElementSecurityEvent57.setElementPath(qNameList64);
        xMLSecStartElementImpl50.getElementPath(qNameList64);
        boolean boolean67 = resolverSameDocument1.matches((org.apache.xml.security.stax.ext.stax.XMLSecStartElement) xMLSecStartElementImpl50);
        org.apache.xml.security.stax.ext.ResourceResolverLookup resourceResolverLookup70 = resolverSameDocument1.canResolve("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", "http://www.w3.org/2009/xmlenc11#rsa-oaep");
        org.apache.xml.security.stax.ext.ResourceResolver resourceResolver73 = resolverSameDocument1.newInstance("xmlns", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(xMLSecCharacters6);
        org.junit.Assert.assertNotNull(wildcardClassSet7);
        org.junit.Assert.assertNull(xMLSecurityProperties8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(xMLSecAttribute11);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
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
        org.junit.Assert.assertNotNull(attributeItor51);
        org.junit.Assert.assertNotNull(contentTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(qNameList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(resourceResolverLookup70);
        org.junit.Assert.assertNotNull(resourceResolver73);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType0 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        org.apache.xml.security.binding.xmlenc.ReferenceList referenceList1 = encryptedKeyType0.getReferenceList();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory2 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement4 = objectFactory2.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.TransformType transformType5 = objectFactory2.createTransformType();
        org.apache.xml.security.binding.xmldsig.PGPDataType pGPDataType6 = objectFactory2.createPGPDataType();
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory7 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType8 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray9 = dSAKeyValueType8.getG();
        byte[] byteArray10 = new byte[] {};
        java.io.OutputStream outputStream11 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray10, outputStream11);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream13 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray10);
        dSAKeyValueType8.setG(byteArray10);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement15 = objectFactory7.createOCSPResponse(byteArray10);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement16 = objectFactory2.createX509DataTypeX509CRL(byteArray10);
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType17 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray18 = dSAKeyValueType17.getG();
        byte[] byteArray19 = new byte[] {};
        java.io.OutputStream outputStream20 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray19, outputStream20);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream22 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray19);
        dSAKeyValueType17.setG(byteArray19);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement24 = objectFactory2.createPGPDataTypePGPKeyPacket(byteArray19);
        org.apache.xml.security.binding.xmldsig.KeyInfoType keyInfoType25 = objectFactory2.createKeyInfoType();
        encryptedKeyType0.setKeyInfo(keyInfoType25);
        org.junit.Assert.assertNull(referenceList1);
        org.junit.Assert.assertNotNull(strJAXBElement4);
        org.junit.Assert.assertNotNull(transformType5);
        org.junit.Assert.assertNotNull(pGPDataType6);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement15);
        org.junit.Assert.assertNotNull(byteArrayJAXBElement16);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement24);
        org.junit.Assert.assertNotNull(keyInfoType25);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream6 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream1);
        signerOutputStream1.close();
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.xml.security.stax.impl.stax.XMLSecEndDocumentImpl xMLSecEndDocumentImpl0 = new org.apache.xml.security.stax.impl.stax.XMLSecEndDocumentImpl();
        boolean boolean1 = xMLSecEndDocumentImpl0.isEntityReference();
        int int2 = xMLSecEndDocumentImpl0.getEventType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.xml.security.binding.xmldsig11.ECParametersType eCParametersType0 = new org.apache.xml.security.binding.xmldsig11.ECParametersType();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType1 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray2 = dSAKeyValueType1.getG();
        byte[] byteArray3 = new byte[] {};
        java.io.OutputStream outputStream4 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray3, outputStream4);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray3);
        dSAKeyValueType1.setG(byteArray3);
        byte[] byteArray8 = new byte[] {};
        java.io.OutputStream outputStream9 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray8, outputStream9);
        dSAKeyValueType1.setPgenCounter(byteArray8);
        byte[] byteArray12 = dSAKeyValueType1.getPgenCounter();
        java.lang.String str14 = org.apache.xml.security.utils.Base64.encode(byteArray12, 6);
        eCParametersType0.setBase(byteArray12);
        byte[] byteArray16 = eCParametersType0.getOrder();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(byteArray16);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.xml.security.binding.xmlenc11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmlenc11.ObjectFactory();
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType1 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        java.math.BigInteger bigInteger2 = pBKDF2ParameterType1.getKeyLength();
        java.math.BigInteger bigInteger3 = pBKDF2ParameterType1.getKeyLength();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType> pBKDF2ParameterTypeJAXBElement4 = objectFactory0.createPBKDF2Params(pBKDF2ParameterType1);
        org.apache.xml.security.binding.xmlenc11.PRFAlgorithmIdentifierType pRFAlgorithmIdentifierType5 = objectFactory0.createPRFAlgorithmIdentifierType();
        org.apache.xml.security.binding.xmlenc11.KeyDerivationMethodType keyDerivationMethodType6 = objectFactory0.createKeyDerivationMethodType();
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(pBKDF2ParameterTypeJAXBElement4);
        org.junit.Assert.assertNotNull(pRFAlgorithmIdentifierType5);
        org.junit.Assert.assertNotNull(keyDerivationMethodType6);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory1 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType2 = objectFactory1.createSignatureValueType();
        org.apache.xml.security.binding.xmldsig.PGPDataType pGPDataType3 = new org.apache.xml.security.binding.xmldsig.PGPDataType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.PGPDataType> pGPDataTypeJAXBElement4 = objectFactory1.createPGPData(pGPDataType3);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory5 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement7 = objectFactory5.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType8 = objectFactory5.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement9 = objectFactory1.createRSAKeyValue(rSAKeyValueType8);
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext10 = null;
        org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken rsaKeyValueSecurityToken11 = new org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken(rSAKeyValueType8, inboundSecurityContext10);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType12 = rsaKeyValueSecurityToken11.getTokenType();
        java.security.Key key13 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken14 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("org.apache.xml.security.exceptions.XMLSecurityRuntimeException: Missing message ID to locate message string in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.stax.ext.UncheckedXMLSecurityException and message http://www.w3.org/2009/xmlenc11#mgf1sha1\nOriginal Exception was org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1", tokenType12, key13);
        org.junit.Assert.assertNotNull(signatureValueType2);
        org.junit.Assert.assertNotNull(pGPDataTypeJAXBElement4);
        org.junit.Assert.assertNotNull(strJAXBElement7);
        org.junit.Assert.assertNotNull(rSAKeyValueType8);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement9);
        org.junit.Assert.assertNotNull(tokenType12);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory16 = abstractSecurityContextImpl0.remove("http://www.w3.org/2000/09/xmldsig#Object");
        java.io.FilterOutputStream filterOutputStream18 = abstractSecurityContextImpl0.remove("http://www.w3.org/2001/04/xmlenc#aes128-cbc");
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException20 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException21 = new org.apache.xml.security.keys.storage.StorageResolverException((java.lang.Exception) uncheckedXMLSecurityException20);
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment23 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent> exceptionKeyValue24 = new org.apache.xml.security.stax.impl.util.KeyValue<java.lang.Exception, javax.xml.stream.events.XMLEvent>((java.lang.Exception) uncheckedXMLSecurityException20, (javax.xml.stream.events.XMLEvent) xMLSecComment23);
        java.util.List<org.apache.jcp.xml.dsig.internal.SignerOutputStream> signerOutputStreamList25 = abstractSecurityContextImpl0.getAsList((java.lang.Object) exceptionKeyValue24);
        org.apache.xml.security.stax.impl.OutboundSecurityContextImpl outboundSecurityContextImpl26 = new org.apache.xml.security.stax.impl.OutboundSecurityContextImpl();
        org.apache.xml.security.stax.impl.OutboundSecurityContextImpl outboundSecurityContextImpl27 = new org.apache.xml.security.stax.impl.OutboundSecurityContextImpl();
        outboundSecurityContextImpl26.addSecurityEventListener((org.apache.xml.security.stax.securityEvent.SecurityEventListener) outboundSecurityContextImpl27);
        org.apache.xml.security.stax.securityToken.SecurityTokenProvider<org.apache.xml.security.stax.securityToken.OutboundSecurityToken> outboundSecurityTokenSecurityTokenProvider30 = outboundSecurityContextImpl27.getSecurityTokenProvider("propagateDefaultNamespace");
        abstractSecurityContextImpl0.addSecurityEventListener((org.apache.xml.security.stax.securityEvent.SecurityEventListener) outboundSecurityContextImpl27);
        org.junit.Assert.assertNull(throwableMap2);
        org.junit.Assert.assertNotNull(qNameList10);
        org.junit.Assert.assertNull(abstractInboundSecurityTokenMap14);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(filterOutputStream18);
        org.junit.Assert.assertNotNull(xMLSecComment23);
        org.junit.Assert.assertNull(signerOutputStreamList25);
        org.junit.Assert.assertNull(outboundSecurityTokenSecurityTokenProvider30);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.xml.security.binding.xmlenc.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmlenc.ObjectFactory();
        org.apache.xml.security.binding.xmlenc.ReferenceType referenceType1 = new org.apache.xml.security.binding.xmlenc.ReferenceType();
        referenceType1.setURI("http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
        java.util.List<java.lang.Object> objList4 = referenceType1.getAny();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc.ReferenceType> referenceTypeJAXBElement5 = objectFactory0.createReferenceListDataReference(referenceType1);
        referenceType1.setURI("http://santuario.apache.org/c14n/physical");
        java.lang.String str8 = referenceType1.getURI();
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(referenceTypeJAXBElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://santuario.apache.org/c14n/physical" + "'", str8, "http://santuario.apache.org/c14n/physical");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.security.Signature signature0 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream1 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature0);
        javax.crypto.Cipher cipher2 = null;
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream5 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream1, cipher2, key3, 0);
        boolean boolean6 = iVSplittingOutputStream5.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream7 = null;
        iVSplittingOutputStream5.setParentOutputStream(replaceableOuputStream7);
        byte[] byteArray9 = iVSplittingOutputStream5.getIv();
        java.security.Signature signature10 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream11 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature10);
        javax.crypto.Cipher cipher12 = null;
        java.security.Key key13 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream15 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream11, cipher12, key13, 0);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream16 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) signerOutputStream11);
        unsyncBufferedOutputStream16.flush();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream18 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) unsyncBufferedOutputStream16);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory19 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement21 = objectFactory19.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType22 = objectFactory19.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType23 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement24 = objectFactory19.createSignatureMethod(signatureMethodType23);
        byte[] byteArray25 = new byte[] {};
        java.io.OutputStream outputStream26 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray25, outputStream26);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream28 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray25);
        byte[] byteArray29 = new byte[] {};
        java.io.OutputStream outputStream30 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray29, outputStream30);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream32 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray29);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream33 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray29);
        int int34 = unsyncByteArrayInputStream28.read(byteArray29);
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement35 = objectFactory19.createDigestValue(byteArray29);
        byte[] byteArray36 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray29);
        replaceableOuputStream18.write(byteArray36);
        iVSplittingOutputStream5.setParentOutputStream(replaceableOuputStream18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(strJAXBElement21);
        org.junit.Assert.assertNotNull(rSAKeyValueType22);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArrayJAXBElement35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.xml.security.configuration.ObjectFactory objectFactory0 = new org.apache.xml.security.configuration.ObjectFactory();
        org.apache.xml.security.configuration.PropertyType propertyType1 = objectFactory0.createPropertyType();
        org.apache.xml.security.configuration.HandlerType handlerType2 = objectFactory0.createHandlerType();
        java.lang.String str3 = handlerType2.getURI();
        java.lang.String str4 = handlerType2.getURI();
        org.junit.Assert.assertNotNull(propertyType1);
        org.junit.Assert.assertNotNull(handlerType2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.xml.security.stax.impl.SignaturePartDef signaturePartDef0 = new org.apache.xml.security.stax.impl.SignaturePartDef();
        java.lang.String[] strArray4 = new java.lang.String[] { "http://www.w3.org/2006/12/xml-c14n11#WithComments", "Missing message ID", "DerivedKeyToken" };
        signaturePartDef0.setTransforms(strArray4);
        java.lang.String str6 = signaturePartDef0.getInclusiveNamespacesPrefixes();
        java.lang.String[] strArray13 = new java.lang.String[] { "Encryption", "http://www.w3.org/2002/06/xmldsig-filter2", "propagateDefaultNamespace", "propagateDefaultNamespace", "http://www.w3.org/TR/1999/REC-xpath-19991116", "pss" };
        signaturePartDef0.setTransforms(strArray13);
        signaturePartDef0.setExcludeVisibleC14Nprefixes(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        xMLSecurityStreamWriter1.writeEmptyElement("PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        java.lang.String str5 = xMLSecurityStreamWriter1.getPrefix("");
        org.apache.xml.security.stax.ext.SecurePart securePart6 = xMLSecurityStreamWriter1.getEncryptEntireRequestPart();
        xMLSecurityStreamWriter1.setDefaultNamespace("org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1:http://www.w3.org/2000/09/xmldsig#Object");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(securePart6);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage algorithmUsage1 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.AlgorithmUsage("http://www.w3.org/2001/04/xmldsig-more#");
        java.lang.String str2 = algorithmUsage1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#" + "'", str2, "http://www.w3.org/2001/04/xmldsig-more#");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        javax.xml.namespace.QName qName2 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter3 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor4 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter3);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters6 = finalOutputProcessor4.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet7 = finalOutputProcessor4.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties8 = finalOutputProcessor4.getSecurityProperties();
        javax.xml.namespace.QName qName9 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute11 = finalOutputProcessor4.createAttribute(qName9, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter12 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor13 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter12);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters15 = finalOutputProcessor13.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet16 = finalOutputProcessor13.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties17 = finalOutputProcessor13.getSecurityProperties();
        javax.xml.namespace.QName qName18 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute20 = finalOutputProcessor13.createAttribute(qName18, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray21 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute11, xMLSecAttribute20 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList22 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList22, xMLSecAttributeArray21);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace26 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace29 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace32 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray33 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace26, xMLSecNamespace29, xMLSecNamespace32 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList34 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList34, xMLSecNamespaceArray33);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl36 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName2, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList22, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList34);
        javax.xml.namespace.QName qName37 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter38 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor39 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter38);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters41 = finalOutputProcessor39.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet42 = finalOutputProcessor39.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties43 = finalOutputProcessor39.getSecurityProperties();
        javax.xml.namespace.QName qName44 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute46 = finalOutputProcessor39.createAttribute(qName44, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter47 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor48 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter47);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters50 = finalOutputProcessor48.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet51 = finalOutputProcessor48.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties52 = finalOutputProcessor48.getSecurityProperties();
        javax.xml.namespace.QName qName53 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute55 = finalOutputProcessor48.createAttribute(qName53, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray56 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute46, xMLSecAttribute55 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList57 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList57, xMLSecAttributeArray56);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace61 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace64 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace67 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray68 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace61, xMLSecNamespace64, xMLSecNamespace67 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList69 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList69, xMLSecNamespaceArray68);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl71 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName37, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList57, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList69);
        xMLSecStartElementImpl36.getNamespacesFromCurrentScope((java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList69);
        java.util.Iterator<javax.xml.stream.events.Attribute> attributeItor73 = xMLSecStartElementImpl36.getAttributes();
        boolean boolean74 = xMLSecStartElementImpl36.isStartElement();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement75 = xMLSecStartElementImpl36.asStartElement();
        org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl xMLSecProcessingInstructionImpl76 = new org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl("http://www.w3.org/2001/04/xmldsig-more#", "", (org.apache.xml.security.stax.ext.stax.XMLSecStartElement) xMLSecStartElementImpl36);
        java.lang.String str77 = xMLSecProcessingInstructionImpl76.getData();
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(xMLSecCharacters6);
        org.junit.Assert.assertNotNull(wildcardClassSet7);
        org.junit.Assert.assertNull(xMLSecurityProperties8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(xMLSecAttribute11);
        org.junit.Assert.assertNotNull(xMLSecCharacters15);
        org.junit.Assert.assertNotNull(wildcardClassSet16);
        org.junit.Assert.assertNull(xMLSecurityProperties17);
        org.junit.Assert.assertNotNull(qName18);
        org.junit.Assert.assertNotNull(xMLSecAttribute20);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xMLSecNamespace26);
        org.junit.Assert.assertNotNull(xMLSecNamespace29);
        org.junit.Assert.assertNotNull(xMLSecNamespace32);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertNotNull(xMLSecCharacters41);
        org.junit.Assert.assertNotNull(wildcardClassSet42);
        org.junit.Assert.assertNull(xMLSecurityProperties43);
        org.junit.Assert.assertNotNull(qName44);
        org.junit.Assert.assertNotNull(xMLSecAttribute46);
        org.junit.Assert.assertNotNull(xMLSecCharacters50);
        org.junit.Assert.assertNotNull(wildcardClassSet51);
        org.junit.Assert.assertNull(xMLSecurityProperties52);
        org.junit.Assert.assertNotNull(qName53);
        org.junit.Assert.assertNotNull(xMLSecAttribute55);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xMLSecNamespace61);
        org.junit.Assert.assertNotNull(xMLSecNamespace64);
        org.junit.Assert.assertNotNull(xMLSecNamespace67);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(attributeItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent0 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        java.lang.String str1 = signatureValueSecurityEvent0.getCorrelationID();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType2 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray3 = dSAKeyValueType2.getG();
        byte[] byteArray4 = new byte[] {};
        java.io.OutputStream outputStream5 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray4, outputStream5);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream7 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray4);
        dSAKeyValueType2.setG(byteArray4);
        byte[] byteArray9 = new byte[] {};
        java.io.OutputStream outputStream10 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray9, outputStream10);
        dSAKeyValueType2.setPgenCounter(byteArray9);
        byte[] byteArray13 = dSAKeyValueType2.getPgenCounter();
        java.security.Signature signature14 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream15 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature14);
        javax.crypto.Cipher cipher16 = null;
        java.security.Key key17 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream19 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream15, cipher16, key17, 0);
        boolean boolean20 = iVSplittingOutputStream19.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream21 = null;
        iVSplittingOutputStream19.setParentOutputStream(replaceableOuputStream21);
        byte[] byteArray23 = iVSplittingOutputStream19.getIv();
        dSAKeyValueType2.setG(byteArray23);
        signatureValueSecurityEvent0.setSignatureValue(byteArray23);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        org.apache.xml.security.binding.xmldsig11.FieldIDType fieldIDType58 = new org.apache.xml.security.binding.xmldsig11.FieldIDType();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType59 = fieldIDType58.getTnB();
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType60 = fieldIDType58.getPrime();
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl62 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str63 = xMLSecEntityDeclarationImpl62.getBaseURI();
        java.lang.String str64 = xMLSecEntityDeclarationImpl62.getSystemId();
        fieldIDType58.setAny((java.lang.Object) xMLSecEntityDeclarationImpl62);
        xMLSecEventQueue22.push((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecEntityDeclarationImpl62);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent67 = xMLSecEventQueue22.pollFirst();
        int int68 = xMLSecEventQueue22.size();
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue69 = xMLSecEventQueue22.clone();
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent70 = xMLSecEventQueue22.poll();
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
        org.junit.Assert.assertNull(tnBFieldParamsType59);
        org.junit.Assert.assertNull(primeFieldParamsType60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(xMLSecEvent67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(xMLSecEventQueue69);
        org.junit.Assert.assertNotNull(xMLSecEvent70);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        javax.xml.namespace.QName qName39 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyValue;
        org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl xMLSecAttributeImpl41 = new org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl(qName39, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        boolean boolean42 = xMLSecAttributeImpl41.isSpecified();
        boolean boolean43 = xMLSecEventQueue22.contains((java.lang.Object) xMLSecAttributeImpl41);
        org.apache.xml.security.configuration.AlgorithmType algorithmType44 = new org.apache.xml.security.configuration.AlgorithmType();
        java.lang.String str45 = algorithmType44.getDescription();
        java.lang.String str46 = algorithmType44.getURI();
        algorithmType44.setRequiredKey("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
        algorithmType44.setValue("http://www.w3.org/2006/12/xml-c14n11");
        boolean boolean51 = xMLSecEventQueue22.removeFirstOccurrence((java.lang.Object) algorithmType44);
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
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType3 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key4 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken5 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType3, key4);
        java.lang.String str6 = tokenType3.getName();
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken7 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2001/04/xmldsig-more#", tokenType3);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType10 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
        java.security.Key key11 = null;
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType12 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext13 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken14 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType12, inboundSecurityContext13);
        java.util.List<javax.xml.namespace.QName> qNameList15 = dsaKeyValueSecurityToken14.getElementPath();
        java.security.cert.X509Certificate[] x509CertificateArray16 = new java.security.cert.X509Certificate[] {};
        dsaKeyValueSecurityToken14.setX509Certificates(x509CertificateArray16);
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken18 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#mgf1sha224", tokenType10, key11, x509CertificateArray16);
        genericOutboundSecurityToken7.setTokenType(tokenType10);
        java.security.Key key21 = genericOutboundSecurityToken7.getSecretKey("http://www.w3.org/2000/09/xmldsig#SignatureProperties");
        org.w3c.dom.Element element22 = genericOutboundSecurityToken7.getCustomTokenReference();
        javax.xml.stream.XMLStreamWriter xMLStreamWriter23 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor24 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter23);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters26 = finalOutputProcessor24.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet27 = finalOutputProcessor24.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties28 = finalOutputProcessor24.getSecurityProperties();
        javax.xml.namespace.QName qName29 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute31 = finalOutputProcessor24.createAttribute(qName29, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties32 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier33 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier_KeyName;
        xMLSecurityProperties32.setEncryptionKeyIdentifier(keyIdentifier33);
        finalOutputProcessor24.setXMLSecurityProperties(xMLSecurityProperties32);
        genericOutboundSecurityToken7.setProcessor((org.apache.xml.security.stax.ext.OutputProcessor) finalOutputProcessor24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://www.w3.org/2007/05/xmldsig-more#MGF1" + "'", str6, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.junit.Assert.assertNull(qNameList15);
        org.junit.Assert.assertNotNull(x509CertificateArray16);
        org.junit.Assert.assertNull(key21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(xMLSecCharacters26);
        org.junit.Assert.assertNotNull(wildcardClassSet27);
        org.junit.Assert.assertNull(xMLSecurityProperties28);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(xMLSecAttribute31);
        org.junit.Assert.assertNotNull(keyIdentifier33);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        java.lang.Object obj47 = xMLSecurityStreamReader45.getProperty("http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
        int int48 = xMLSecurityStreamReader45.getTextStart();
        java.lang.String str49 = xMLSecurityStreamReader45.getCharacterEncodingScheme();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = xMLSecurityStreamReader45.getAttributeLocalName(11);
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
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.xml.security.binding.xmlenc11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmlenc11.ObjectFactory();
        org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType concatKDFParamsType1 = new org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType();
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent2 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray3 = new byte[] {};
        java.io.OutputStream outputStream4 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray3, outputStream4);
        signatureValueSecurityEvent2.setSignatureValue(byteArray3);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream9 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray3, (int) (short) 10, 10);
        concatKDFParamsType1.setPartyUInfo(byteArray3);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory11 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement13 = objectFactory11.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType14 = objectFactory11.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.DigestMethodType digestMethodType15 = new org.apache.xml.security.binding.xmldsig.DigestMethodType();
        java.lang.String str16 = digestMethodType15.getAlgorithm();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.DigestMethodType> digestMethodTypeJAXBElement17 = objectFactory11.createDigestMethod(digestMethodType15);
        concatKDFParamsType1.setDigestMethod(digestMethodType15);
        byte[] byteArray19 = concatKDFParamsType1.getSuppPrivInfo();
        byte[] byteArray20 = concatKDFParamsType1.getSuppPubInfo();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmlenc11.ConcatKDFParamsType> concatKDFParamsTypeJAXBElement21 = objectFactory0.createConcatKDFParams(concatKDFParamsType1);
        byte[] byteArray22 = concatKDFParamsType1.getSuppPrivInfo();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(strJAXBElement13);
        org.junit.Assert.assertNotNull(rSAKeyValueType14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(digestMethodTypeJAXBElement17);
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNotNull(concatKDFParamsTypeJAXBElement21);
        org.junit.Assert.assertNull(byteArray22);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        java.lang.Object obj47 = xMLSecurityStreamReader45.getProperty("http://www.w3.org/2001/10/xml-exc-c14n#WithCommentsd336eee8-c63c-495e-aede-bd83dcf0a8a7");
        int int48 = xMLSecurityStreamReader45.getTextStart();
        java.lang.String str49 = xMLSecurityStreamReader45.getCharacterEncodingScheme();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = xMLSecurityStreamReader45.getAttributeLocalName(1);
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
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace37 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        xMLSecStartElementImpl34.addNamespace(xMLSecNamespace37);
        java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList39 = xMLSecStartElementImpl34.getOnElementDeclaredNamespaces();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement40 = xMLSecStartElementImpl34.asStartElement();
        javax.xml.namespace.QName qName41 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ATT_NULL_MimeType;
        javax.xml.stream.events.Attribute attribute42 = xMLSecStartElementImpl34.getAttributeByName(qName41);
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
        org.junit.Assert.assertNotNull(xMLSecNamespace37);
        org.junit.Assert.assertNotNull(xMLSecNamespaceList39);
        org.junit.Assert.assertNotNull(xMLSecStartElement40);
        org.junit.Assert.assertNotNull(qName41);
        org.junit.Assert.assertNull(attribute42);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.xml.security.configuration.TransformAlgorithmType transformAlgorithmType0 = new org.apache.xml.security.configuration.TransformAlgorithmType();
        java.lang.String str1 = transformAlgorithmType0.getURI();
        org.apache.xml.security.configuration.InOutAttrType inOutAttrType2 = transformAlgorithmType0.getINOUT();
        java.lang.String str3 = transformAlgorithmType0.getURI();
        java.lang.String str4 = transformAlgorithmType0.getJAVACLASS();
        transformAlgorithmType0.setURI("ContentEncrypted");
        transformAlgorithmType0.setURI("CDATA");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(inOutAttrType2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType2 = new org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType("http://www.w3.org/2007/05/xmldsig-more#MGF1");
        java.security.Key key3 = null;
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken4 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#aes192-gcm", tokenType2, key3);
        java.security.PublicKey publicKey5 = null;
        genericOutboundSecurityToken4.setPublicKey(publicKey5);
        java.security.PublicKey publicKey7 = genericOutboundSecurityToken4.getPublicKey();
        java.util.List<? extends org.apache.xml.security.stax.securityToken.SecurityToken> wildcardList8 = genericOutboundSecurityToken4.getWrappedTokens();
        org.junit.Assert.assertNull(publicKey7);
        org.junit.Assert.assertNotNull(wildcardList8);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        org.apache.xml.security.binding.xmldsig.CanonicalizationMethodType canonicalizationMethodType22 = objectFactory0.createCanonicalizationMethodType();
        org.apache.xml.security.binding.xmldsig.TransformType transformType23 = objectFactory0.createTransformType();
        org.apache.xml.security.binding.xmldsig.CanonicalizationMethodType canonicalizationMethodType24 = objectFactory0.createCanonicalizationMethodType();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement26 = objectFactory0.createKeyName("org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType27 = objectFactory0.createSignatureValueType();
        org.apache.xml.security.binding.xmldsig.RetrievalMethodType retrievalMethodType28 = new org.apache.xml.security.binding.xmldsig.RetrievalMethodType();
        retrievalMethodType28.setURI("PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        java.lang.String str31 = retrievalMethodType28.getURI();
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType32 = retrievalMethodType28.getTransforms();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RetrievalMethodType> retrievalMethodTypeJAXBElement33 = objectFactory0.createRetrievalMethod(retrievalMethodType28);
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
        org.junit.Assert.assertNotNull(canonicalizationMethodType22);
        org.junit.Assert.assertNotNull(transformType23);
        org.junit.Assert.assertNotNull(canonicalizationMethodType24);
        org.junit.Assert.assertNotNull(strJAXBElement26);
        org.junit.Assert.assertNotNull(signatureValueType27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE" + "'", str31, "PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        org.junit.Assert.assertNull(transformsType32);
        org.junit.Assert.assertNotNull(retrievalMethodTypeJAXBElement33);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.xml.security.configuration.AlgorithmType algorithmType0 = new org.apache.xml.security.configuration.AlgorithmType();
        algorithmType0.setDescription("encryptionParts");
        algorithmType0.setKeyLength((java.lang.Integer) 14);
        algorithmType0.setValue("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
        java.lang.String str7 = algorithmType0.getValue();
        algorithmType0.setRequirementLevel("KeyValueToken");
        java.lang.String str10 = algorithmType0.getAlgorithmClass();
        algorithmType0.setSpecificationURL("http://www.w3.org/2009/xmlenc11#mgf1sha5126fef5759-e8c1-4016-9dad-1a63fb21c6a6");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library." + "'", str7, "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.xml.security.binding.xmldsig.SignatureType signatureType0 = new org.apache.xml.security.binding.xmldsig.SignatureType();
        java.util.List<org.apache.xml.security.binding.xmldsig.ObjectType> objectTypeList1 = signatureType0.getObject();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory2 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType3 = objectFactory2.createSignatureValueType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory4 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement6 = objectFactory4.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType7 = objectFactory4.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement8 = objectFactory2.createRSAKeyValue(rSAKeyValueType7);
        org.apache.xml.security.binding.xmldsig.ObjectType objectType9 = new org.apache.xml.security.binding.xmldsig.ObjectType();
        java.util.List<java.lang.Object> objList10 = objectType9.getContent();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.ObjectType> objectTypeJAXBElement11 = objectFactory2.createObject(objectType9);
        org.apache.xml.security.binding.xmldsig.TransformsType transformsType12 = objectFactory2.createTransformsType();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory13 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement15 = objectFactory13.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.SignatureValueType signatureValueType16 = objectFactory13.createSignatureValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureValueType> signatureValueTypeJAXBElement17 = objectFactory2.createSignatureValue(signatureValueType16);
        java.lang.String str18 = signatureValueType16.getId();
        signatureType0.setSignatureValue(signatureValueType16);
        signatureType0.setId("http://www.w3.org/2000/09/xmldsig#PGPData");
        java.lang.String str22 = signatureType0.getId();
        java.lang.String str23 = signatureType0.getId();
        org.junit.Assert.assertNotNull(objectTypeList1);
        org.junit.Assert.assertNotNull(signatureValueType3);
        org.junit.Assert.assertNotNull(strJAXBElement6);
        org.junit.Assert.assertNotNull(rSAKeyValueType7);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement8);
        org.junit.Assert.assertNotNull(objList10);
        org.junit.Assert.assertNotNull(objectTypeJAXBElement11);
        org.junit.Assert.assertNotNull(transformsType12);
        org.junit.Assert.assertNotNull(strJAXBElement15);
        org.junit.Assert.assertNotNull(signatureValueType16);
        org.junit.Assert.assertNotNull(signatureValueTypeJAXBElement17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://www.w3.org/2000/09/xmldsig#PGPData" + "'", str22, "http://www.w3.org/2000/09/xmldsig#PGPData");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://www.w3.org/2000/09/xmldsig#PGPData" + "'", str23, "http://www.w3.org/2000/09/xmldsig#PGPData");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        xMLSecurityStreamWriter1.writeEmptyElement("PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor4 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor((javax.xml.stream.XMLStreamWriter) xMLSecurityStreamWriter1);
        javax.xml.namespace.QName qName6 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray7 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList8 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList8, xMLSecAttributeArray7);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace12 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray13 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace12 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList14 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList14, xMLSecNamespaceArray13);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement16 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName6, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList8, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList14);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier18 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart19 = new org.apache.xml.security.stax.ext.SecurePart(qName6, true, modifier18);
        org.apache.xml.security.stax.ext.SecurePart securePart20 = new org.apache.xml.security.stax.ext.SecurePart("hi!", modifier18);
        javax.xml.namespace.QName qName21 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray22 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList23 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList23, xMLSecAttributeArray22);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace27 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray28 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace27 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList29 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList29, xMLSecNamespaceArray28);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement31 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName21, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList23, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList29);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier33 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart34 = new org.apache.xml.security.stax.ext.SecurePart(qName21, true, modifier33);
        securePart20.setName(qName21);
        java.lang.String str36 = securePart20.getDigestMethod();
        xMLSecurityStreamWriter1.setEncryptEntireRequestPart(securePart20);
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor38 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor((javax.xml.stream.XMLStreamWriter) xMLSecurityStreamWriter1);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties39 = finalOutputProcessor38.getSecurityProperties();
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace12);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement16);
        org.junit.Assert.assertTrue("'" + modifier18 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier18.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNotNull(qName21);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace27);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement31);
        org.junit.Assert.assertTrue("'" + modifier33 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier33.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(xMLSecurityProperties39);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.xml.security.stax.impl.SignaturePartDef signaturePartDef0 = new org.apache.xml.security.stax.impl.SignaturePartDef();
        signaturePartDef0.setExcludeVisibleC14Nprefixes(true);
        javax.xml.namespace.QName qName3 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray4 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList5 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList5, xMLSecAttributeArray4);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace9 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray10 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace9 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList11 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList11, xMLSecNamespaceArray10);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement13 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName3, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList5, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList11);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier15 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart16 = new org.apache.xml.security.stax.ext.SecurePart(qName3, true, modifier15);
        boolean boolean17 = securePart16.isSecureEntireRequest();
        java.lang.String str18 = securePart16.getIdToSign();
        javax.xml.namespace.QName qName19 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeCollection20 = null;
        javax.xml.namespace.QName qName21 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsigmore_RSAPSSPARAMS;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter22 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor23 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter22);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters25 = finalOutputProcessor23.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet26 = finalOutputProcessor23.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties27 = finalOutputProcessor23.getSecurityProperties();
        javax.xml.namespace.QName qName28 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute30 = finalOutputProcessor23.createAttribute(qName28, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray31 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute30 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList32 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList32, xMLSecAttributeArray31);
        javax.xml.namespace.QName qName34 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray35 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList36 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, xMLSecAttributeArray35);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace40 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray41 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace40 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList42 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList42, xMLSecNamespaceArray41);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement44 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName34, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList36, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList42);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement49 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl50 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement49);
        int int51 = xMLSecCharactersImpl50.getEventType();
        javax.xml.namespace.QName qName56 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray57 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList58 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList58, xMLSecAttributeArray57);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace62 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray63 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace62 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList64 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList64, xMLSecNamespaceArray63);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement66 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName56, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList58, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList64);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl67 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement66);
        xMLSecCharactersImpl50.setParentXMLSecStartElement(xMLSecStartElement66);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl69 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName21, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList32, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList42, xMLSecStartElement66);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement70 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName19, xMLSecAttributeCollection20, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList42);
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute72 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecAttribute(qName19, "inclusiveNamespacePrefixList");
        org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl xMLSecAttributeImpl74 = new org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl(qName19, "http://www.w3.org/2000/09/xmldsig#RSAKeyValue");
        securePart16.setName(qName19);
        signaturePartDef0.setSecurePart(securePart16);
        securePart16.setIdToSecure("http://www.w3.org/2009/xmlenc11#mgf1sha256");
        org.junit.Assert.assertNotNull(qName3);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace9);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement13);
        org.junit.Assert.assertTrue("'" + modifier15 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier15.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(qName19);
        org.junit.Assert.assertNotNull(qName21);
        org.junit.Assert.assertNotNull(xMLSecCharacters25);
        org.junit.Assert.assertNotNull(wildcardClassSet26);
        org.junit.Assert.assertNull(xMLSecurityProperties27);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNotNull(xMLSecAttribute30);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace40);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(qName56);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace62);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement66);
        org.junit.Assert.assertNotNull(xMLSecStartElement70);
        org.junit.Assert.assertNotNull(xMLSecAttribute72);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.xml.security.binding.xmlenc.EncryptedKeyType encryptedKeyType0 = new org.apache.xml.security.binding.xmlenc.EncryptedKeyType();
        encryptedKeyType0.setRecipient("http://www.w3.org/2000/xmlns/");
        encryptedKeyType0.setEncoding("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
        org.apache.xml.security.binding.xmlenc.CipherDataType cipherDataType5 = encryptedKeyType0.getCipherData();
        java.lang.String str6 = encryptedKeyType0.getId();
        org.junit.Assert.assertNull(cipherDataType5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.xml.security.configuration.ObjectFactory objectFactory0 = new org.apache.xml.security.configuration.ObjectFactory();
        org.apache.xml.security.configuration.TransformAlgorithmType transformAlgorithmType1 = objectFactory0.createTransformAlgorithmType();
        org.apache.xml.security.configuration.HandlerType handlerType2 = objectFactory0.createHandlerType();
        org.apache.xml.security.configuration.ConfigurationType configurationType3 = new org.apache.xml.security.configuration.ConfigurationType();
        org.apache.xml.security.configuration.SecurityHeaderHandlersType securityHeaderHandlersType4 = configurationType3.getSecurityHeaderHandlers();
        org.apache.xml.security.configuration.TransformAlgorithmsType transformAlgorithmsType5 = null;
        configurationType3.setTransformAlgorithms(transformAlgorithmsType5);
        org.apache.xml.security.configuration.JCEAlgorithmMappingsType jCEAlgorithmMappingsType7 = configurationType3.getJCEAlgorithmMappings();
        org.apache.xml.security.configuration.ResourceResolversType resourceResolversType8 = new org.apache.xml.security.configuration.ResourceResolversType();
        configurationType3.setResourceResolvers(resourceResolversType8);
        org.apache.xml.security.configuration.SecurityHeaderHandlersType securityHeaderHandlersType10 = configurationType3.getSecurityHeaderHandlers();
        javax.xml.bind.JAXBElement<org.apache.xml.security.configuration.ConfigurationType> configurationTypeJAXBElement11 = objectFactory0.createConfiguration(configurationType3);
        org.junit.Assert.assertNotNull(transformAlgorithmType1);
        org.junit.Assert.assertNotNull(handlerType2);
        org.junit.Assert.assertNull(securityHeaderHandlersType4);
        org.junit.Assert.assertNull(jCEAlgorithmMappingsType7);
        org.junit.Assert.assertNull(securityHeaderHandlersType10);
        org.junit.Assert.assertNotNull(configurationTypeJAXBElement11);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties0.setSignaturePositionStart(false);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier3 = null;
        xMLSecurityProperties0.setSignatureKeyIdentifier(keyIdentifier3);
        java.security.Key key6 = null;
        xMLSecurityProperties0.addKeyNameMapping("dsig11", key6);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.KeyIdentifier keyIdentifier8 = xMLSecurityProperties0.getSignatureKeyIdentifier();
        boolean boolean9 = xMLSecurityProperties0.isSignaturePositionStart();
        xMLSecurityProperties0.setSkipDocumentEvents(false);
        java.security.Key key12 = null;
        xMLSecurityProperties0.setEncryptionKey(key12);
        org.junit.Assert.assertNull(keyIdentifier8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        java.math.BigInteger bigInteger1 = pBKDF2ParameterType0.getKeyLength();
        org.apache.xml.security.binding.xmlenc11.PRFAlgorithmIdentifierType pRFAlgorithmIdentifierType2 = null;
        pBKDF2ParameterType0.setPRF(pRFAlgorithmIdentifierType2);
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt4 = pBKDF2ParameterType0.getSalt();
        java.math.BigInteger bigInteger5 = pBKDF2ParameterType0.getKeyLength();
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType6 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        java.math.BigInteger bigInteger7 = pBKDF2ParameterType6.getKeyLength();
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt8 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray9 = salt8.getSpecified();
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
        salt8.setSpecified(byteArray17);
        byte[] byteArray26 = new byte[] {};
        java.io.OutputStream outputStream27 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray26, outputStream27);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream29 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray26);
        salt8.setSpecified(byteArray26);
        pBKDF2ParameterType6.setSalt(salt8);
        pBKDF2ParameterType0.setSalt(salt8);
        java.math.BigInteger bigInteger33 = null;
        pBKDF2ParameterType0.setKeyLength(bigInteger33);
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt35 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray36 = new byte[] {};
        java.io.OutputStream outputStream37 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray36, outputStream37);
        byte[] byteArray39 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray36);
        salt35.setSpecified(byteArray36);
        pBKDF2ParameterType0.setSalt(salt35);
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType42 = salt35.getOtherSource();
        org.junit.Assert.assertNull(bigInteger1);
        org.junit.Assert.assertNull(salt4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNull(algorithmIdentifierType42);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties1 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        xMLSecurityProperties1.setSignaturePositionStart(false);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties4 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean5 = xMLSecurityProperties4.isDisableSchemaValidation();
        java.security.Key key6 = xMLSecurityProperties4.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment8 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
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
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray25 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment8, xMLSecCharactersImpl24 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue26 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue26, xMLSecEventArray25);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor28 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties4, xMLSecEventQueue26);
        xMLSecurityProperties1.addInputProcessor((org.apache.xml.security.stax.ext.InputProcessor) internalReplayProcessor28);
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain30 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent31 = internalReplayProcessor28.processHeaderEvent(inputProcessorChain30);
        org.apache.xml.security.stax.ext.InputProcessorChain inputProcessorChain32 = null;
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent33 = internalReplayProcessor28.processHeaderEvent(inputProcessorChain32);
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl36 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str37 = xMLSecEntityDeclarationImpl36.getPublicId();
        javax.xml.namespace.QName qName38 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_xenc_DataReference;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter39 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor40 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter39);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters42 = finalOutputProcessor40.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet43 = finalOutputProcessor40.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties44 = finalOutputProcessor40.getSecurityProperties();
        javax.xml.namespace.QName qName45 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute47 = finalOutputProcessor40.createAttribute(qName45, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        javax.xml.stream.XMLStreamWriter xMLStreamWriter48 = null;
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor49 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor(xMLStreamWriter48);
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters51 = finalOutputProcessor49.createCharacters("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        java.util.Set<java.lang.Class<? extends org.apache.xml.security.stax.ext.OutputProcessor>> wildcardClassSet52 = finalOutputProcessor49.getAfterProcessors();
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties53 = finalOutputProcessor49.getSecurityProperties();
        javax.xml.namespace.QName qName54 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_c14nExcl_InclusiveNamespaces;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute xMLSecAttribute56 = finalOutputProcessor49.createAttribute(qName54, "http://www.w3.org/2007/05/xmldsig-more#MGF1");
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray57 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] { xMLSecAttribute47, xMLSecAttribute56 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList58 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList58, xMLSecAttributeArray57);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace62 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace65 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace68 = org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl.getInstance("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", "http://www.w3.org/2001/04/xmlenc#sha512");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray69 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace62, xMLSecNamespace65, xMLSecNamespace68 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList70 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList70, xMLSecNamespaceArray69);
        org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl xMLSecStartElementImpl72 = new org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl(qName38, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList58, (java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList70);
        boolean boolean73 = xMLSecStartElementImpl72.isStartElement();
        org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl74 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl("http://www.w3.org/2000/09/xmldsig#Manifest", (javax.xml.stream.events.EntityDeclaration) xMLSecEntityDeclarationImpl36, (org.apache.xml.security.stax.ext.stax.XMLSecStartElement) xMLSecStartElementImpl72);
        javax.xml.stream.events.Attribute attribute75 = internalReplayProcessor28.getReferenceIDAttribute((org.apache.xml.security.stax.ext.stax.XMLSecStartElement) xMLSecStartElementImpl72);
        javax.xml.namespace.QName qName76 = xMLSecStartElementImpl72.getSchemaType();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement77 = xMLSecStartElementImpl72.asStartElement();
        org.apache.xml.security.stax.impl.stax.XMLSecDTDImpl xMLSecDTDImpl78 = new org.apache.xml.security.stax.impl.stax.XMLSecDTDImpl("xenc11", xMLSecStartElement77);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(key6);
        org.junit.Assert.assertNotNull(xMLSecComment8);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace19);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement23);
        org.junit.Assert.assertNotNull(xMLSecEventArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(xMLSecEvent31);
        org.junit.Assert.assertNull(xMLSecEvent33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(xMLSecCharacters42);
        org.junit.Assert.assertNotNull(wildcardClassSet43);
        org.junit.Assert.assertNull(xMLSecurityProperties44);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertNotNull(xMLSecAttribute47);
        org.junit.Assert.assertNotNull(xMLSecCharacters51);
        org.junit.Assert.assertNotNull(wildcardClassSet52);
        org.junit.Assert.assertNull(xMLSecurityProperties53);
        org.junit.Assert.assertNotNull(qName54);
        org.junit.Assert.assertNotNull(xMLSecAttribute56);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xMLSecNamespace62);
        org.junit.Assert.assertNotNull(xMLSecNamespace65);
        org.junit.Assert.assertNotNull(xMLSecNamespace68);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(attribute75);
        org.junit.Assert.assertNull(qName76);
        org.junit.Assert.assertNotNull(xMLSecStartElement77);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray1 = new byte[] {};
        java.io.OutputStream outputStream2 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray1, outputStream2);
        byte[] byteArray4 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray1);
        salt0.setSpecified(byteArray1);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream6 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray1);
        unsyncByteArrayInputStream6.reset();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp resolverHttp2 = new org.apache.xml.security.stax.impl.resourceResolvers.ResolverHttp("UTF-8", "org.apache.xml.security.stax.ext.UncheckedXMLSecurityException: http://www.w3.org/2009/xmlenc11#mgf1sha1");
        boolean boolean3 = resolverHttp2.isSameDocumentReference();
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
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement53 = xMLSecStartElementImpl52.asStartElement();
        javax.xml.namespace.NamespaceContext namespaceContext54 = xMLSecStartElementImpl52.getNamespaceContext();
        javax.xml.namespace.NamespaceContext namespaceContext55 = xMLSecStartElementImpl52.getNamespaceContext();
        boolean boolean56 = resolverHttp2.matches((org.apache.xml.security.stax.ext.stax.XMLSecStartElement) xMLSecStartElementImpl52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertNotNull(xMLSecStartElement53);
        org.junit.Assert.assertNotNull(namespaceContext54);
        org.junit.Assert.assertNotNull(namespaceContext55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        javax.crypto.Mac mac0 = null;
        org.apache.jcp.xml.dsig.internal.MacOutputStream macOutputStream1 = new org.apache.jcp.xml.dsig.internal.MacOutputStream(mac0);
        macOutputStream1.close();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream3 = new org.apache.xml.security.stax.impl.util.ReplaceableOuputStream((java.io.OutputStream) macOutputStream1);
        org.apache.xml.security.utils.UnsyncBufferedOutputStream unsyncBufferedOutputStream5 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream((java.io.OutputStream) replaceableOuputStream3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            replaceableOuputStream3.write(76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.xml.security.stax.impl.EncryptionPartDef encryptionPartDef0 = new org.apache.xml.security.stax.impl.EncryptionPartDef();
        encryptionPartDef0.setEncRefId("http://www.w3.org/2000/09/xmldsig#PGPData");
        java.lang.String str3 = encryptionPartDef0.getCipherReferenceId();
        java.lang.String str4 = encryptionPartDef0.getKeyId();
        java.security.Key key5 = null;
        encryptionPartDef0.setSymmetricKey(key5);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier7 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        encryptionPartDef0.setModifier(modifier7);
        encryptionPartDef0.setKeyId("Signature");
        java.lang.String str11 = encryptionPartDef0.getKeyId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + modifier7 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier7.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Signature" + "'", str11, "Signature");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyValue;
        org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl xMLSecAttributeImpl2 = new org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl(qName0, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        java.lang.String str3 = xMLSecAttributeImpl2.getValue();
        boolean boolean4 = xMLSecAttributeImpl2.isSpecified();
        javax.xml.namespace.QName qName5 = xMLSecAttributeImpl2.getName();
        boolean boolean7 = xMLSecAttributeImpl2.equals((java.lang.Object) (byte) 1);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement12 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl13 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, false, false, xMLSecStartElement12);
        int int14 = xMLSecCharactersImpl13.getEventType();
        boolean boolean15 = xMLSecCharactersImpl13.isEndElement();
        boolean boolean16 = xMLSecCharactersImpl13.isEntityReference();
        org.apache.xml.security.stax.ext.stax.XMLSecCharacters xMLSecCharacters17 = xMLSecCharactersImpl13.asCharacters();
        boolean boolean18 = xMLSecAttributeImpl2.equals((java.lang.Object) xMLSecCharactersImpl13);
        boolean boolean19 = xMLSecCharactersImpl13.isCData();
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://www.w3.org/2009/xmlenc11#aes192-gcm" + "'", str3, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xMLSecCharacters17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase.C14NStack<org.apache.xml.security.configuration.AlgorithmType> algorithmTypeQueue0 = new org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase.C14NStack<org.apache.xml.security.configuration.AlgorithmType>();
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        org.apache.xml.security.binding.xmldsig11.FieldIDType fieldIDType58 = new org.apache.xml.security.binding.xmldsig11.FieldIDType();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType59 = fieldIDType58.getTnB();
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType60 = fieldIDType58.getPrime();
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl62 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str63 = xMLSecEntityDeclarationImpl62.getBaseURI();
        java.lang.String str64 = xMLSecEntityDeclarationImpl62.getSystemId();
        fieldIDType58.setAny((java.lang.Object) xMLSecEntityDeclarationImpl62);
        xMLSecEventQueue22.push((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecEntityDeclarationImpl62);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent67 = xMLSecEventQueue22.pollFirst();
        int int68 = xMLSecEventQueue22.size();
        javax.xml.namespace.QName qName74 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray75 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList76 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, xMLSecAttributeArray75);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace80 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray81 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace80 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList82 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82, xMLSecNamespaceArray81);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement84 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName74, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList76, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList82);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl85 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement84);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl86 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", xMLSecStartElement84);
        boolean boolean87 = xMLSecCommentImpl86.isEndDocument();
        int int88 = xMLSecCommentImpl86.getEventType();
        int int89 = xMLSecCommentImpl86.getEventType();
        boolean boolean90 = xMLSecEventQueue22.contains((java.lang.Object) xMLSecCommentImpl86);
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue91 = xMLSecEventQueue22.clone();
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
        org.junit.Assert.assertNull(tnBFieldParamsType59);
        org.junit.Assert.assertNull(primeFieldParamsType60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(xMLSecEvent67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(qName74);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace80);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 5 + "'", int88 == 5);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 5 + "'", int89 == 5);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(xMLSecEventQueue91);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.Exception exception0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException1 = new org.apache.xml.security.exceptions.XMLSecurityException(exception0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt();
        byte[] byteArray1 = salt0.getSpecified();
        org.apache.xml.security.binding.xmldsig11.CurveType curveType2 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray3 = new byte[] {};
        java.io.OutputStream outputStream4 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray3, outputStream4);
        byte[] byteArray6 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray3);
        curveType2.setA(byteArray3);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent8 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray9 = new byte[] {};
        java.io.OutputStream outputStream10 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray9, outputStream10);
        signatureValueSecurityEvent8.setSignatureValue(byteArray9);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream15 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray9, (int) (short) 10, 10);
        curveType2.setA(byteArray9);
        salt0.setSpecified(byteArray9);
        byte[] byteArray18 = new byte[] {};
        java.io.OutputStream outputStream19 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray18, outputStream19);
        org.apache.xml.security.utils.UnsyncByteArrayInputStream unsyncByteArrayInputStream21 = new org.apache.xml.security.utils.UnsyncByteArrayInputStream(byteArray18);
        salt0.setSpecified(byteArray18);
        org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType algorithmIdentifierType23 = new org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType();
        algorithmIdentifierType23.setParameters((java.lang.Object) true);
        algorithmIdentifierType23.setAlgorithm("http://www.w3.org/2001/04/xmlenc#sha512");
        java.lang.String str28 = algorithmIdentifierType23.getAlgorithm();
        java.lang.Object obj29 = algorithmIdentifierType23.getParameters();
        salt0.setOtherSource(algorithmIdentifierType23);
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha512" + "'", str28, "http://www.w3.org/2001/04/xmlenc#sha512");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.xml.security.binding.xmldsig.pss.RSAPSSParamsType rSAPSSParamsType0 = new org.apache.xml.security.binding.xmldsig.pss.RSAPSSParamsType();
        rSAPSSParamsType0.setTrailerField((java.lang.Integer) 8);
        org.apache.xml.security.binding.xmldsig.pss.MaskGenerationFunctionType maskGenerationFunctionType3 = rSAPSSParamsType0.getMaskGenerationFunction();
        org.junit.Assert.assertNull(maskGenerationFunctionType3);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain0 = null;
        org.apache.xml.security.stax.impl.XMLSecurityStreamWriter xMLSecurityStreamWriter1 = new org.apache.xml.security.stax.impl.XMLSecurityStreamWriter(outputProcessorChain0);
        xMLSecurityStreamWriter1.writeEmptyElement("PROP_USE_THIS_TOKEN_ID_FOR_SIGNATURE");
        org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor finalOutputProcessor4 = new org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor((javax.xml.stream.XMLStreamWriter) xMLSecurityStreamWriter1);
        javax.xml.namespace.QName qName5 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray6 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList7 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList7, xMLSecAttributeArray6);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace11 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray12 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace11 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList13 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList13, xMLSecNamespaceArray12);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement15 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName5, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList7, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList13);
        org.apache.xml.security.stax.ext.SecurePart.Modifier modifier17 = org.apache.xml.security.stax.ext.SecurePart.Modifier.Content;
        org.apache.xml.security.stax.ext.SecurePart securePart18 = new org.apache.xml.security.stax.ext.SecurePart(qName5, true, modifier17);
        java.lang.String[] strArray19 = securePart18.getTransforms();
        java.lang.String str20 = securePart18.getIdToSign();
        securePart18.setSecureEntireRequest(true);
        xMLSecurityStreamWriter1.setSignEntireRequestPart(securePart18);
        org.apache.xml.security.stax.impl.XMLSecurityEventWriter xMLSecurityEventWriter24 = new org.apache.xml.security.stax.impl.XMLSecurityEventWriter((javax.xml.stream.XMLStreamWriter) xMLSecurityStreamWriter1);
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl25 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException27 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException("http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.apache.xml.security.keys.storage.StorageResolverException storageResolverException28 = new org.apache.xml.security.keys.storage.StorageResolverException((java.lang.Exception) uncheckedXMLSecurityException27);
        org.apache.xml.security.stax.ext.XMLSecurityConfigurationException xMLSecurityConfigurationException29 = new org.apache.xml.security.stax.ext.XMLSecurityConfigurationException((java.lang.Exception) storageResolverException28);
        org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent x509TokenSecurityEvent30 = new org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent();
        abstractSecurityContextImpl25.putAsList((java.lang.Object) storageResolverException28, x509TokenSecurityEvent30);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory32 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement34 = objectFactory32.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType35 = objectFactory32.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType36 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement37 = objectFactory32.createSignatureMethod(signatureMethodType36);
        org.apache.xml.security.binding.xmldsig.RetrievalMethodType retrievalMethodType38 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RetrievalMethodType> retrievalMethodTypeJAXBElement39 = objectFactory32.createRetrievalMethod(retrievalMethodType38);
        org.apache.xml.security.binding.xmldsig.SignaturePropertiesType signaturePropertiesType40 = new org.apache.xml.security.binding.xmldsig.SignaturePropertiesType();
        java.lang.String str41 = signaturePropertiesType40.getId();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignaturePropertiesType> signaturePropertiesTypeJAXBElement42 = objectFactory32.createSignatureProperties(signaturePropertiesType40);
        org.apache.xml.security.binding.xmldsig.KeyValueType keyValueType43 = objectFactory32.createKeyValueType();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType44 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        byte[] byteArray45 = dSAKeyValueType44.getG();
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory46 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement48 = objectFactory46.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType49 = objectFactory46.createRSAKeyValueType();
        org.apache.xml.security.binding.xmldsig.SignatureMethodType signatureMethodType50 = null;
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.SignatureMethodType> signatureMethodTypeJAXBElement51 = objectFactory46.createSignatureMethod(signatureMethodType50);
        org.apache.xml.security.binding.xmldsig.ObjectFactory objectFactory52 = new org.apache.xml.security.binding.xmldsig.ObjectFactory();
        javax.xml.bind.JAXBElement<java.lang.String> strJAXBElement54 = objectFactory52.createKeyName("http://www.w3.org/2000/09/xmldsig#sha1");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType55 = objectFactory52.createRSAKeyValueType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.RSAKeyValueType> rSAKeyValueTypeJAXBElement56 = objectFactory46.createRSAKeyValue(rSAKeyValueType55);
        java.security.Signature signature57 = null;
        org.apache.jcp.xml.dsig.internal.SignerOutputStream signerOutputStream58 = new org.apache.jcp.xml.dsig.internal.SignerOutputStream(signature57);
        javax.crypto.Cipher cipher59 = null;
        java.security.Key key60 = null;
        org.apache.xml.security.stax.impl.util.IVSplittingOutputStream iVSplittingOutputStream62 = new org.apache.xml.security.stax.impl.util.IVSplittingOutputStream((java.io.OutputStream) signerOutputStream58, cipher59, key60, 0);
        boolean boolean63 = iVSplittingOutputStream62.isIVComplete();
        org.apache.xml.security.stax.impl.util.ReplaceableOuputStream replaceableOuputStream64 = null;
        iVSplittingOutputStream62.setParentOutputStream(replaceableOuputStream64);
        byte[] byteArray66 = iVSplittingOutputStream62.getIv();
        javax.xml.bind.JAXBElement<byte[]> byteArrayJAXBElement67 = objectFactory46.createPGPDataTypePGPKeyPacket(byteArray66);
        dSAKeyValueType44.setSeed(byteArray66);
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig.DSAKeyValueType> dSAKeyValueTypeJAXBElement69 = objectFactory32.createDSAKeyValue(dSAKeyValueType44);
        org.w3c.dom.Node node70 = null;
        org.apache.xml.security.utils.DOMNamespaceContext dOMNamespaceContext71 = new org.apache.xml.security.utils.DOMNamespaceContext(node70);
        java.lang.String str73 = dOMNamespaceContext71.getPrefix("pss");
        org.w3c.dom.Node node74 = null;
        dOMNamespaceContext71.setContext(node74);
        org.apache.xml.security.binding.xmlenc.AgreementMethodType agreementMethodType76 = new org.apache.xml.security.binding.xmlenc.AgreementMethodType();
        java.lang.String str77 = agreementMethodType76.getAlgorithm();
        abstractSecurityContextImpl25.putAsMap((java.lang.Object) dSAKeyValueType44, dOMNamespaceContext71, agreementMethodType76);
        org.w3c.dom.Node node79 = null;
        dOMNamespaceContext71.setContext(node79);
        org.w3c.dom.Node node81 = null;
        dOMNamespaceContext71.setContext(node81);
        xMLSecurityEventWriter24.setNamespaceContext((javax.xml.namespace.NamespaceContext) dOMNamespaceContext71);
        javax.xml.namespace.NamespaceContext namespaceContext84 = xMLSecurityEventWriter24.getNamespaceContext();
        // The following exception was thrown during execution in test generation
        try {
            xMLSecurityEventWriter24.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName5);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace11);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement15);
        org.junit.Assert.assertTrue("'" + modifier17 + "' != '" + org.apache.xml.security.stax.ext.SecurePart.Modifier.Content + "'", modifier17.equals(org.apache.xml.security.stax.ext.SecurePart.Modifier.Content));
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strJAXBElement34);
        org.junit.Assert.assertNotNull(rSAKeyValueType35);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement37);
        org.junit.Assert.assertNotNull(retrievalMethodTypeJAXBElement39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(signaturePropertiesTypeJAXBElement42);
        org.junit.Assert.assertNotNull(keyValueType43);
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertNotNull(strJAXBElement48);
        org.junit.Assert.assertNotNull(rSAKeyValueType49);
        org.junit.Assert.assertNotNull(signatureMethodTypeJAXBElement51);
        org.junit.Assert.assertNotNull(strJAXBElement54);
        org.junit.Assert.assertNotNull(rSAKeyValueType55);
        org.junit.Assert.assertNotNull(rSAKeyValueTypeJAXBElement56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteArrayJAXBElement67);
        org.junit.Assert.assertNotNull(dSAKeyValueTypeJAXBElement69);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(namespaceContext84);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xop.Include> includeJAXBElement12 = objectFactory0.createInclude(include8);
        org.junit.Assert.assertNotNull(include2);
        org.junit.Assert.assertNotNull(includeJAXBElement5);
        org.junit.Assert.assertNotNull(include8);
        org.junit.Assert.assertNotNull(includeJAXBElement11);
        org.junit.Assert.assertNotNull(includeJAXBElement12);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.xml.security.configuration.HandlerType handlerType0 = new org.apache.xml.security.configuration.HandlerType();
        java.lang.String str1 = handlerType0.getNAME();
        java.lang.String str2 = handlerType0.getValue();
        handlerType0.setNAME("xenc");
        java.lang.String str5 = handlerType0.getJAVACLASS();
        java.lang.String str6 = handlerType0.getValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.xml.security.binding.xmlenc.AgreementMethodType agreementMethodType0 = new org.apache.xml.security.binding.xmlenc.AgreementMethodType();
        java.lang.String str1 = agreementMethodType0.getAlgorithm();
        agreementMethodType0.setAlgorithm("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
        java.lang.String str4 = agreementMethodType0.getAlgorithm();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384" + "'", str4, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.xml.security.c14n.CanonicalizationException canonicalizationException0 = new org.apache.xml.security.c14n.CanonicalizationException();
        org.apache.xml.security.stax.ext.UncheckedXMLSecurityException uncheckedXMLSecurityException1 = new org.apache.xml.security.stax.ext.UncheckedXMLSecurityException((java.lang.Throwable) canonicalizationException0);
        org.apache.xml.security.exceptions.XMLSecurityRuntimeException xMLSecurityRuntimeException2 = new org.apache.xml.security.exceptions.XMLSecurityRuntimeException((java.lang.Exception) uncheckedXMLSecurityException1);
        java.lang.Exception exception3 = xMLSecurityRuntimeException2.getOriginalException();
        java.lang.Exception exception4 = xMLSecurityRuntimeException2.getOriginalException();
        org.junit.Assert.assertNotNull(exception3);
        org.junit.Assert.assertNotNull(exception4);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken0 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray2 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList3 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3, contentTypeArray2);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent5 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken0, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList3);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList6 = signedElementSecurityEvent5.getProtectionOrder();
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl7 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants securityEventConstants8 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants();
        java.util.Map<java.lang.Throwable, org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer> throwableMap9 = abstractSecurityContextImpl7.getAsMap((java.lang.Object) securityEventConstants8);
        org.apache.xml.security.configuration.JCEAlgorithmMappingsType jCEAlgorithmMappingsType10 = new org.apache.xml.security.configuration.JCEAlgorithmMappingsType();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement15 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl16 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement15);
        java.util.List<javax.xml.namespace.QName> qNameList17 = xMLSecCharactersImpl16.getElementPath();
        org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments18 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
        abstractSecurityContextImpl7.putAsMap((java.lang.Object) jCEAlgorithmMappingsType10, qNameList17, (org.apache.xml.security.c14n.implementations.CanonicalizerBase) canonicalizer20010315ExclOmitComments18);
        java.lang.String str20 = canonicalizer20010315ExclOmitComments18.engineGetURI();
        org.apache.xml.security.stax.impl.util.KeyValue<org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent, org.apache.xml.security.c14n.CanonicalizerSpi> abstractElementSecurityEventKeyValue21 = new org.apache.xml.security.stax.impl.util.KeyValue<org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent, org.apache.xml.security.c14n.CanonicalizerSpi>((org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent) signedElementSecurityEvent5, (org.apache.xml.security.c14n.CanonicalizerSpi) canonicalizer20010315ExclOmitComments18);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList22 = signedElementSecurityEvent5.getProtectionOrder();
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType23 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext24 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken25 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType23, inboundSecurityContext24);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage26 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage_Encryption;
        dsaKeyValueSecurityToken25.addTokenUsage(tokenUsage26);
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType28 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext29 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken30 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType28, inboundSecurityContext29);
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage tokenUsage31 = org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenUsage_Encryption;
        dsaKeyValueSecurityToken30.addTokenUsage(tokenUsage31);
        dsaKeyValueSecurityToken25.setKeyWrappingToken((org.apache.xml.security.stax.securityToken.InboundSecurityToken) dsaKeyValueSecurityToken30);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken35 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray37 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList38 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList38, contentTypeArray37);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent40 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken35, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList38);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList41 = signedElementSecurityEvent40.getProtectionOrder();
        org.apache.xml.security.stax.impl.AbstractSecurityContextImpl abstractSecurityContextImpl42 = new org.apache.xml.security.stax.impl.AbstractSecurityContextImpl();
        org.apache.xml.security.stax.securityEvent.SecurityEventConstants securityEventConstants43 = new org.apache.xml.security.stax.securityEvent.SecurityEventConstants();
        java.util.Map<java.lang.Throwable, org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer> throwableMap44 = abstractSecurityContextImpl42.getAsMap((java.lang.Object) securityEventConstants43);
        org.apache.xml.security.configuration.JCEAlgorithmMappingsType jCEAlgorithmMappingsType45 = new org.apache.xml.security.configuration.JCEAlgorithmMappingsType();
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement50 = null;
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl51 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("hi!", false, true, false, xMLSecStartElement50);
        java.util.List<javax.xml.namespace.QName> qNameList52 = xMLSecCharactersImpl51.getElementPath();
        org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments53 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
        abstractSecurityContextImpl42.putAsMap((java.lang.Object) jCEAlgorithmMappingsType45, qNameList52, (org.apache.xml.security.c14n.implementations.CanonicalizerBase) canonicalizer20010315ExclOmitComments53);
        java.lang.String str55 = canonicalizer20010315ExclOmitComments53.engineGetURI();
        org.apache.xml.security.stax.impl.util.KeyValue<org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent, org.apache.xml.security.c14n.CanonicalizerSpi> abstractElementSecurityEventKeyValue56 = new org.apache.xml.security.stax.impl.util.KeyValue<org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent, org.apache.xml.security.c14n.CanonicalizerSpi>((org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent) signedElementSecurityEvent40, (org.apache.xml.security.c14n.CanonicalizerSpi) canonicalizer20010315ExclOmitComments53);
        java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList57 = signedElementSecurityEvent40.getProtectionOrder();
        org.apache.xml.security.stax.securityEvent.EncryptedElementSecurityEvent encryptedElementSecurityEvent58 = new org.apache.xml.security.stax.securityEvent.EncryptedElementSecurityEvent((org.apache.xml.security.stax.securityToken.InboundSecurityToken) dsaKeyValueSecurityToken30, false, contentTypeList57);
        signedElementSecurityEvent5.setProtectionOrder(contentTypeList57);
        org.junit.Assert.assertNotNull(contentTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contentTypeList6);
        org.junit.Assert.assertNull(throwableMap9);
        org.junit.Assert.assertNotNull(qNameList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str20, "http://www.w3.org/2001/10/xml-exc-c14n#");
        org.junit.Assert.assertNotNull(contentTypeList22);
        org.junit.Assert.assertNotNull(tokenUsage26);
        org.junit.Assert.assertNotNull(tokenUsage31);
        org.junit.Assert.assertNotNull(contentTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(contentTypeList41);
        org.junit.Assert.assertNull(throwableMap44);
        org.junit.Assert.assertNotNull(qNameList52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#" + "'", str55, "http://www.w3.org/2001/10/xml-exc-c14n#");
        org.junit.Assert.assertNotNull(contentTypeList57);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.xml.security.binding.xmldsig.DSAKeyValueType dSAKeyValueType0 = new org.apache.xml.security.binding.xmldsig.DSAKeyValueType();
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext1 = null;
        org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken dsaKeyValueSecurityToken2 = new org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken(dSAKeyValueType0, inboundSecurityContext1);
        org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent signatureValueSecurityEvent3 = new org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent();
        byte[] byteArray4 = new byte[] {};
        java.io.OutputStream outputStream5 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray4, outputStream5);
        signatureValueSecurityEvent3.setSignatureValue(byteArray4);
        byte[] byteArray8 = signatureValueSecurityEvent3.getSignatureValue();
        dSAKeyValueType0.setJ(byteArray8);
        byte[] byteArray10 = dSAKeyValueType0.getJ();
        byte[] byteArray11 = dSAKeyValueType0.getP();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNull(byteArray11);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType pBKDF2ParameterType0 = new org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType();
        org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt salt1 = pBKDF2ParameterType0.getSalt();
        org.junit.Assert.assertNull(salt1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        javax.xml.namespace.QName qName0 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_KeyValue;
        org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl xMLSecAttributeImpl2 = new org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl(qName0, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        java.lang.String str3 = xMLSecAttributeImpl2.getValue();
        boolean boolean4 = xMLSecAttributeImpl2.isSpecified();
        javax.xml.namespace.QName qName5 = xMLSecAttributeImpl2.getSchemaType();
        boolean boolean6 = xMLSecAttributeImpl2.isAttribute();
        java.lang.String str7 = xMLSecAttributeImpl2.getDTDType();
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://www.w3.org/2009/xmlenc11#aes192-gcm" + "'", str3, "http://www.w3.org/2009/xmlenc11#aes192-gcm");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CDATA" + "'", str7, "CDATA");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory0 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType pnBFieldParamsType1 = new org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType> pnBFieldParamsTypeJAXBElement2 = objectFactory0.createPnB(pnBFieldParamsType1);
        org.apache.xml.security.binding.xmldsig11.ECValidationDataType eCValidationDataType3 = objectFactory0.createECValidationDataType();
        org.apache.xml.security.binding.xmldsig11.X509DigestType x509DigestType4 = objectFactory0.createX509DigestType();
        org.apache.xml.security.binding.xmldsig11.ObjectFactory objectFactory5 = new org.apache.xml.security.binding.xmldsig11.ObjectFactory();
        org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType pnBFieldParamsType6 = new org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType> pnBFieldParamsTypeJAXBElement7 = objectFactory5.createPnB(pnBFieldParamsType6);
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType8 = new org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType();
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType> primeFieldParamsTypeJAXBElement9 = objectFactory5.createPrime(primeFieldParamsType8);
        javax.xml.bind.JAXBElement<org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType> primeFieldParamsTypeJAXBElement10 = objectFactory0.createPrime(primeFieldParamsType8);
        byte[] byteArray11 = primeFieldParamsType8.getP();
        org.junit.Assert.assertNotNull(pnBFieldParamsTypeJAXBElement2);
        org.junit.Assert.assertNotNull(eCValidationDataType3);
        org.junit.Assert.assertNotNull(x509DigestType4);
        org.junit.Assert.assertNotNull(pnBFieldParamsTypeJAXBElement7);
        org.junit.Assert.assertNotNull(primeFieldParamsTypeJAXBElement9);
        org.junit.Assert.assertNotNull(primeFieldParamsTypeJAXBElement10);
        org.junit.Assert.assertNull(byteArray11);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        byte[] byteArray1 = org.apache.xml.security.c14n.implementations.UtfHelpper.getStringInUtf8("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byteArray1);
        boolean boolean3 = xMLSignatureInput2.isNodeSet();
        java.io.InputStream inputStream4 = xMLSignatureInput2.getOctetStreamReal();
        org.w3c.dom.Node node5 = xMLSignatureInput2.getSubNode();
        org.w3c.dom.Node node6 = xMLSignatureInput2.getSubNode();
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType contentType7 = org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray8 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] { contentType7 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList9 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList9, contentTypeArray8);
        org.apache.xml.security.stax.securityToken.InboundSecurityToken inboundSecurityToken11 = null;
        org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] contentTypeArray13 = new org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType> contentTypeList14 = new java.util.ArrayList<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList14, contentTypeArray13);
        org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent signedElementSecurityEvent16 = new org.apache.xml.security.stax.securityEvent.SignedElementSecurityEvent(inboundSecurityToken11, true, (java.util.List<org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType>) contentTypeList14);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement17 = null;
        java.util.Set<java.lang.String> strSet19 = org.apache.xml.security.stax.ext.XMLSecurityUtils.getExcC14NInclusiveNamespacePrefixes(xMLSecStartElement17, true);
        boolean boolean20 = contentTypeList14.removeAll((java.util.Collection<java.lang.String>) strSet19);
        boolean boolean21 = contentTypeList9.containsAll((java.util.Collection<java.lang.String>) strSet19);
        org.apache.xml.security.signature.XMLSignatureInputDebugger xMLSignatureInputDebugger22 = new org.apache.xml.security.signature.XMLSignatureInputDebugger(xMLSignatureInput2, strSet19);
        boolean boolean23 = xMLSignatureInput2.isElement();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 50, 48, 48, 54, 47, 49, 50, 47, 120, 109, 108, 45, 99, 49, 52, 110, 49, 49, 35, 87, 105, 116, 104, 67, 111, 109, 109, 101, 110, 116, 115]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + contentType7 + "' != '" + org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION + "'", contentType7.equals(org.apache.xml.security.stax.ext.XMLSecurityConstants.ContentType.ENCRYPTION));
        org.junit.Assert.assertNotNull(contentTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(contentTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition eCCurveDefinition9 = new org.apache.xml.security.algorithms.implementations.ECDSAUtils.ECCurveDefinition("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "encryptionParts", "http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2009/xmlenc11#mgf1sha384", "http://www.w3.org/2001/04/xmldsig-more#", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "hi!", "http://www.w3.org/2009/xmlenc11#mgf1sha1", (int) (byte) 1);
        int int10 = eCCurveDefinition9.getH();
        java.lang.String str11 = eCCurveDefinition9.getOid();
        int int12 = eCCurveDefinition9.getH();
        java.lang.String str13 = eCCurveDefinition9.getOid();
        java.lang.String str14 = eCCurveDefinition9.getX();
        java.lang.String str15 = eCCurveDefinition9.getN();
        java.lang.String str16 = eCCurveDefinition9.getN();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "encryptionParts" + "'", str11, "encryptionParts");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "encryptionParts" + "'", str13, "encryptionParts");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature" + "'", str14, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha1" + "'", str15, "http://www.w3.org/2009/xmlenc11#mgf1sha1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://www.w3.org/2009/xmlenc11#mgf1sha1" + "'", str16, "http://www.w3.org/2009/xmlenc11#mgf1sha1");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace68 = finalOutputProcessor1.createNamespace("http://www.w3.org/TR/1999/REC-xpath-19991116", "http://www.w3.org/2000/09/xmldsig#Object");
        org.apache.xml.security.stax.ext.OutputProcessorChain outputProcessorChain69 = null;
        javax.xml.namespace.QName qName70 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig11_NamedCurve;
        // The following exception was thrown during execution in test generation
        try {
            finalOutputProcessor1.createEndElementAndOutputAsEvent(outputProcessorChain69, qName70);
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
        org.junit.Assert.assertNotNull(xMLSecNamespace68);
        org.junit.Assert.assertNotNull(qName70);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties0 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList1 = xMLSecurityProperties0.getSignatureSecureParts();
        java.util.List<org.apache.xml.security.stax.ext.SecurePart> securePartList2 = xMLSecurityProperties0.getEncryptionSecureParts();
        org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec rSAPSSParameterSpec3 = new org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec();
        xMLSecurityProperties0.setAlgorithmParameterSpec((java.security.spec.AlgorithmParameterSpec) rSAPSSParameterSpec3);
        xMLSecurityProperties0.setUseSingleCert(true);
        org.apache.xml.security.stax.ext.XMLSecurityProperties xMLSecurityProperties7 = new org.apache.xml.security.stax.ext.XMLSecurityProperties();
        boolean boolean8 = xMLSecurityProperties7.isDisableSchemaValidation();
        java.security.Key key9 = xMLSecurityProperties7.getEncryptionKey();
        org.apache.xml.security.stax.ext.stax.XMLSecComment xMLSecComment11 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecComment("");
        javax.xml.namespace.QName qName16 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray17 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList18 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList18, xMLSecAttributeArray17);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace22 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray23 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace22 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList24 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList24, xMLSecNamespaceArray23);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement26 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName16, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList18, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList24);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl27 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement26);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent[] xMLSecEventArray28 = new org.apache.xml.security.stax.ext.stax.XMLSecEvent[] { xMLSecComment11, xMLSecCharactersImpl27 };
        java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent> xMLSecEventQueue29 = new java.util.ArrayDeque<org.apache.xml.security.stax.ext.stax.XMLSecEvent>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecEvent>) xMLSecEventQueue29, xMLSecEventArray28);
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor31 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties7, xMLSecEventQueue29);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType32 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray33 = new byte[] {};
        java.io.OutputStream outputStream34 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray33, outputStream34);
        byte[] byteArray36 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray33);
        curveType32.setA(byteArray33);
        org.apache.xml.security.binding.xmldsig11.CurveType curveType38 = new org.apache.xml.security.binding.xmldsig11.CurveType();
        byte[] byteArray39 = new byte[] {};
        java.io.OutputStream outputStream40 = null;
        org.apache.xml.security.utils.Base64.decode(byteArray39, outputStream40);
        byte[] byteArray42 = org.apache.xml.security.algorithms.implementations.ECDSAUtils.stripLeadingZeros(byteArray39);
        curveType38.setA(byteArray39);
        curveType32.setA(byteArray39);
        boolean boolean45 = xMLSecEventQueue29.removeFirstOccurrence((java.lang.Object) byteArray39);
        javax.xml.namespace.QName qName51 = org.apache.xml.security.stax.ext.XMLSecurityConstants.TAG_dsig_Transform;
        org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] xMLSecAttributeArray52 = new org.apache.xml.security.stax.ext.stax.XMLSecAttribute[] {};
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute> xMLSecAttributeList53 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList53, xMLSecAttributeArray52);
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace xMLSecNamespace57 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXMLSecNamespace("http://www.w3.org/2009/xmlenc11#mgf1sha1", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] xMLSecNamespaceArray58 = new org.apache.xml.security.stax.ext.stax.XMLSecNamespace[] { xMLSecNamespace57 };
        java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace> xMLSecNamespaceList59 = new java.util.ArrayList<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList59, xMLSecNamespaceArray58);
        org.apache.xml.security.stax.ext.stax.XMLSecStartElement xMLSecStartElement61 = org.apache.xml.security.stax.ext.stax.XMLSecEventFactory.createXmlSecStartElement(qName51, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecAttribute>) xMLSecAttributeList53, (java.util.List<org.apache.xml.security.stax.ext.stax.XMLSecNamespace>) xMLSecNamespaceList59);
        org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl xMLSecCharactersImpl62 = new org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl("http://www.w3.org/2000/09/xmldsig#enveloped-signature", false, true, true, xMLSecStartElement61);
        org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl xMLSecCommentImpl63 = new org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", xMLSecStartElement61);
        boolean boolean64 = xMLSecEventQueue29.add((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecStartElement61);
        org.apache.xml.security.binding.xmldsig11.FieldIDType fieldIDType65 = new org.apache.xml.security.binding.xmldsig11.FieldIDType();
        org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType tnBFieldParamsType66 = fieldIDType65.getTnB();
        org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType primeFieldParamsType67 = fieldIDType65.getPrime();
        org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl69 = new org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl("signatureParts");
        java.lang.String str70 = xMLSecEntityDeclarationImpl69.getBaseURI();
        java.lang.String str71 = xMLSecEntityDeclarationImpl69.getSystemId();
        fieldIDType65.setAny((java.lang.Object) xMLSecEntityDeclarationImpl69);
        xMLSecEventQueue29.push((org.apache.xml.security.stax.ext.stax.XMLSecEvent) xMLSecEntityDeclarationImpl69);
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent74 = xMLSecEventQueue29.getLast();
        boolean boolean75 = xMLSecEventQueue29.isEmpty();
        org.apache.xml.security.stax.ext.stax.XMLSecEvent xMLSecEvent76 = xMLSecEventQueue29.pop();
        org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor internalReplayProcessor77 = new org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor.InternalReplayProcessor(xMLSecurityProperties0, xMLSecEventQueue29);
        xMLSecurityProperties0.setEncryptionSymAlgorithm("http://www.w3.org/2001/04/xmlenc#aes256-cbc");
        org.junit.Assert.assertNotNull(securePartList1);
        org.junit.Assert.assertNotNull(securePartList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(key9);
        org.junit.Assert.assertNotNull(xMLSecComment11);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace22);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement26);
        org.junit.Assert.assertNotNull(xMLSecEventArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(qName51);
        org.junit.Assert.assertNotNull(xMLSecAttributeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(xMLSecNamespace57);
        org.junit.Assert.assertNotNull(xMLSecNamespaceArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xMLSecStartElement61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(tnBFieldParamsType66);
        org.junit.Assert.assertNull(primeFieldParamsType67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(xMLSecEvent74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(xMLSecEvent76);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.xml.security.binding.xmldsig.RSAKeyValueType rSAKeyValueType1 = null;
        org.apache.xml.security.stax.ext.InboundSecurityContext inboundSecurityContext2 = null;
        org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken rsaKeyValueSecurityToken3 = new org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken(rSAKeyValueType1, inboundSecurityContext2);
        boolean boolean4 = rsaKeyValueSecurityToken3.isAsymmetric();
        org.apache.xml.security.stax.securityToken.SecurityTokenConstants.TokenType tokenType5 = rsaKeyValueSecurityToken3.getTokenType();
        org.apache.xml.security.binding.xmlenc11.DerivedKeyType derivedKeyType6 = new org.apache.xml.security.binding.xmlenc11.DerivedKeyType();
        derivedKeyType6.setRecipient("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        derivedKeyType6.setDerivedKeyName("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
        org.apache.xml.security.binding.xmlenc.ReferenceList referenceList11 = derivedKeyType6.getReferenceList();
        derivedKeyType6.setMasterKeyName("http://www.w3.org/TR/1999/REC-xslt-19991116");
        boolean boolean14 = tokenType5.equals((java.lang.Object) "http://www.w3.org/TR/1999/REC-xslt-19991116");
        org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken genericOutboundSecurityToken15 = new org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken("http://www.w3.org/2009/xmlenc11#mgf1sha512", tokenType5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokenType5);
        org.junit.Assert.assertNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}


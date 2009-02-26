/*
 * An XML document type.
 * Localname: invalidInputMessageFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * A document containing one invalidInputMessageFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public interface InvalidInputMessageFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvalidInputMessageFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("invalidinputmessagefault871ddoctype");
    
    /**
     * Gets the "invalidInputMessageFault" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault getInvalidInputMessageFault();
    
    /**
     * Sets the "invalidInputMessageFault" element
     */
    void setInvalidInputMessageFault(com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault invalidInputMessageFault);
    
    /**
     * Appends and returns a new empty "invalidInputMessageFault" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault addNewInvalidInputMessageFault();
    
    /**
     * An XML invalidInputMessageFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public interface InvalidInputMessageFault extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvalidInputMessageFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("invalidinputmessagefaultf5b3elemtype");
        
        /**
         * Gets the "reason" element
         */
        java.lang.String getReason();
        
        /**
         * Gets (as xml) the "reason" element
         */
        org.apache.xmlbeans.XmlString xgetReason();
        
        /**
         * Sets the "reason" element
         */
        void setReason(java.lang.String reason);
        
        /**
         * Sets (as xml) the "reason" element
         */
        void xsetReason(org.apache.xmlbeans.XmlString reason);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault newInstance() {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

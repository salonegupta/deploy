/*
 * An XML document type.
 * Localname: getPipaResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * A document containing one getPipaResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public interface GetPipaResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPipaResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("getpiparesponse3fbedoctype");
    
    /**
     * Gets the "getPipaResponse" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse getGetPipaResponse();
    
    /**
     * Sets the "getPipaResponse" element
     */
    void setGetPipaResponse(com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse getPipaResponse);
    
    /**
     * Appends and returns a new empty "getPipaResponse" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse addNewGetPipaResponse();
    
    /**
     * An XML getPipaResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public interface GetPipaResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPipaResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("getpiparesponse97abelemtype");
        
        /**
         * Gets the "task" element
         */
        com.intalio.bpms.workflow.taskManagementServices20051109.Task getTask();
        
        /**
         * Sets the "task" element
         */
        void setTask(com.intalio.bpms.workflow.taskManagementServices20051109.Task task);
        
        /**
         * Appends and returns a new empty "task" element
         */
        com.intalio.bpms.workflow.taskManagementServices20051109.Task addNewTask();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse newInstance() {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

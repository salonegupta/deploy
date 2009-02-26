/*
 * An XML document type.
 * Localname: unavailableTaskFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * A document containing one unavailableTaskFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public interface UnavailableTaskFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnavailableTaskFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("unavailabletaskfault837cdoctype");
    
    /**
     * Gets the "unavailableTaskFault" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault getUnavailableTaskFault();
    
    /**
     * Sets the "unavailableTaskFault" element
     */
    void setUnavailableTaskFault(com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault unavailableTaskFault);
    
    /**
     * Appends and returns a new empty "unavailableTaskFault" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault addNewUnavailableTaskFault();
    
    /**
     * An XML unavailableTaskFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public interface UnavailableTaskFault extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnavailableTaskFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("unavailabletaskfaultfe53elemtype");
        
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
         * Gets array of all "unavailableTaskId" elements
         */
        java.lang.String[] getUnavailableTaskIdArray();
        
        /**
         * Gets ith "unavailableTaskId" element
         */
        java.lang.String getUnavailableTaskIdArray(int i);
        
        /**
         * Gets (as xml) array of all "unavailableTaskId" elements
         */
        org.apache.xmlbeans.XmlString[] xgetUnavailableTaskIdArray();
        
        /**
         * Gets (as xml) ith "unavailableTaskId" element
         */
        org.apache.xmlbeans.XmlString xgetUnavailableTaskIdArray(int i);
        
        /**
         * Returns number of "unavailableTaskId" element
         */
        int sizeOfUnavailableTaskIdArray();
        
        /**
         * Sets array of all "unavailableTaskId" element
         */
        void setUnavailableTaskIdArray(java.lang.String[] unavailableTaskIdArray);
        
        /**
         * Sets ith "unavailableTaskId" element
         */
        void setUnavailableTaskIdArray(int i, java.lang.String unavailableTaskId);
        
        /**
         * Sets (as xml) array of all "unavailableTaskId" element
         */
        void xsetUnavailableTaskIdArray(org.apache.xmlbeans.XmlString[] unavailableTaskIdArray);
        
        /**
         * Sets (as xml) ith "unavailableTaskId" element
         */
        void xsetUnavailableTaskIdArray(int i, org.apache.xmlbeans.XmlString unavailableTaskId);
        
        /**
         * Inserts the value as the ith "unavailableTaskId" element
         */
        void insertUnavailableTaskId(int i, java.lang.String unavailableTaskId);
        
        /**
         * Appends the value as the last "unavailableTaskId" element
         */
        void addUnavailableTaskId(java.lang.String unavailableTaskId);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "unavailableTaskId" element
         */
        org.apache.xmlbeans.XmlString insertNewUnavailableTaskId(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "unavailableTaskId" element
         */
        org.apache.xmlbeans.XmlString addNewUnavailableTaskId();
        
        /**
         * Removes the ith "unavailableTaskId" element
         */
        void removeUnavailableTaskId(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault newInstance() {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

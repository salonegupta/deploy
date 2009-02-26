/*
 * An XML document type.
 * Localname: getAvailableTasksResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * A document containing one getAvailableTasksResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public interface GetAvailableTasksResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAvailableTasksResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("getavailabletasksresponse90d9doctype");
    
    /**
     * Gets the "getAvailableTasksResponse" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse getGetAvailableTasksResponse();
    
    /**
     * Sets the "getAvailableTasksResponse" element
     */
    void setGetAvailableTasksResponse(com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse getAvailableTasksResponse);
    
    /**
     * Appends and returns a new empty "getAvailableTasksResponse" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse addNewGetAvailableTasksResponse();
    
    /**
     * An XML getAvailableTasksResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public interface GetAvailableTasksResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAvailableTasksResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("getavailabletasksresponse11e1elemtype");
        
        /**
         * Gets array of all "task" elements
         */
        com.intalio.bpms.workflow.taskManagementServices20051109.Task[] getTaskArray();
        
        /**
         * Gets ith "task" element
         */
        com.intalio.bpms.workflow.taskManagementServices20051109.Task getTaskArray(int i);
        
        /**
         * Returns number of "task" element
         */
        int sizeOfTaskArray();
        
        /**
         * Sets array of all "task" element
         */
        void setTaskArray(com.intalio.bpms.workflow.taskManagementServices20051109.Task[] taskArray);
        
        /**
         * Sets ith "task" element
         */
        void setTaskArray(int i, com.intalio.bpms.workflow.taskManagementServices20051109.Task task);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "task" element
         */
        com.intalio.bpms.workflow.taskManagementServices20051109.Task insertNewTask(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "task" element
         */
        com.intalio.bpms.workflow.taskManagementServices20051109.Task addNewTask();
        
        /**
         * Removes the ith "task" element
         */
        void removeTask(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse newInstance() {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

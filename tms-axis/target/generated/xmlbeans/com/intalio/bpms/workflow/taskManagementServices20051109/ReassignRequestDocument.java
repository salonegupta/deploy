/*
 * An XML document type.
 * Localname: reassignRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * A document containing one reassignRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public interface ReassignRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReassignRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("reassignrequest9f8adoctype");
    
    /**
     * Gets the "reassignRequest" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest getReassignRequest();
    
    /**
     * Sets the "reassignRequest" element
     */
    void setReassignRequest(com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest reassignRequest);
    
    /**
     * Appends and returns a new empty "reassignRequest" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest addNewReassignRequest();
    
    /**
     * An XML reassignRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public interface ReassignRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReassignRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("reassignrequest7c43elemtype");
        
        /**
         * Gets the "taskId" element
         */
        java.lang.String getTaskId();
        
        /**
         * Gets (as xml) the "taskId" element
         */
        org.apache.xmlbeans.XmlString xgetTaskId();
        
        /**
         * Sets the "taskId" element
         */
        void setTaskId(java.lang.String taskId);
        
        /**
         * Sets (as xml) the "taskId" element
         */
        void xsetTaskId(org.apache.xmlbeans.XmlString taskId);
        
        /**
         * Gets array of all "userOwner" elements
         */
        java.lang.String[] getUserOwnerArray();
        
        /**
         * Gets ith "userOwner" element
         */
        java.lang.String getUserOwnerArray(int i);
        
        /**
         * Gets (as xml) array of all "userOwner" elements
         */
        org.apache.xmlbeans.XmlString[] xgetUserOwnerArray();
        
        /**
         * Gets (as xml) ith "userOwner" element
         */
        org.apache.xmlbeans.XmlString xgetUserOwnerArray(int i);
        
        /**
         * Returns number of "userOwner" element
         */
        int sizeOfUserOwnerArray();
        
        /**
         * Sets array of all "userOwner" element
         */
        void setUserOwnerArray(java.lang.String[] userOwnerArray);
        
        /**
         * Sets ith "userOwner" element
         */
        void setUserOwnerArray(int i, java.lang.String userOwner);
        
        /**
         * Sets (as xml) array of all "userOwner" element
         */
        void xsetUserOwnerArray(org.apache.xmlbeans.XmlString[] userOwnerArray);
        
        /**
         * Sets (as xml) ith "userOwner" element
         */
        void xsetUserOwnerArray(int i, org.apache.xmlbeans.XmlString userOwner);
        
        /**
         * Inserts the value as the ith "userOwner" element
         */
        void insertUserOwner(int i, java.lang.String userOwner);
        
        /**
         * Appends the value as the last "userOwner" element
         */
        void addUserOwner(java.lang.String userOwner);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "userOwner" element
         */
        org.apache.xmlbeans.XmlString insertNewUserOwner(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "userOwner" element
         */
        org.apache.xmlbeans.XmlString addNewUserOwner();
        
        /**
         * Removes the ith "userOwner" element
         */
        void removeUserOwner(int i);
        
        /**
         * Gets array of all "roleOwner" elements
         */
        java.lang.String[] getRoleOwnerArray();
        
        /**
         * Gets ith "roleOwner" element
         */
        java.lang.String getRoleOwnerArray(int i);
        
        /**
         * Gets (as xml) array of all "roleOwner" elements
         */
        org.apache.xmlbeans.XmlString[] xgetRoleOwnerArray();
        
        /**
         * Gets (as xml) ith "roleOwner" element
         */
        org.apache.xmlbeans.XmlString xgetRoleOwnerArray(int i);
        
        /**
         * Returns number of "roleOwner" element
         */
        int sizeOfRoleOwnerArray();
        
        /**
         * Sets array of all "roleOwner" element
         */
        void setRoleOwnerArray(java.lang.String[] roleOwnerArray);
        
        /**
         * Sets ith "roleOwner" element
         */
        void setRoleOwnerArray(int i, java.lang.String roleOwner);
        
        /**
         * Sets (as xml) array of all "roleOwner" element
         */
        void xsetRoleOwnerArray(org.apache.xmlbeans.XmlString[] roleOwnerArray);
        
        /**
         * Sets (as xml) ith "roleOwner" element
         */
        void xsetRoleOwnerArray(int i, org.apache.xmlbeans.XmlString roleOwner);
        
        /**
         * Inserts the value as the ith "roleOwner" element
         */
        void insertRoleOwner(int i, java.lang.String roleOwner);
        
        /**
         * Appends the value as the last "roleOwner" element
         */
        void addRoleOwner(java.lang.String roleOwner);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "roleOwner" element
         */
        org.apache.xmlbeans.XmlString insertNewRoleOwner(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "roleOwner" element
         */
        org.apache.xmlbeans.XmlString addNewRoleOwner();
        
        /**
         * Removes the ith "roleOwner" element
         */
        void removeRoleOwner(int i);
        
        /**
         * Gets the "taskState" element
         */
        java.lang.String getTaskState();
        
        /**
         * Gets (as xml) the "taskState" element
         */
        org.apache.xmlbeans.XmlString xgetTaskState();
        
        /**
         * Sets the "taskState" element
         */
        void setTaskState(java.lang.String taskState);
        
        /**
         * Sets (as xml) the "taskState" element
         */
        void xsetTaskState(org.apache.xmlbeans.XmlString taskState);
        
        /**
         * Gets the "participantToken" element
         */
        java.lang.String getParticipantToken();
        
        /**
         * Gets (as xml) the "participantToken" element
         */
        org.apache.xmlbeans.XmlString xgetParticipantToken();
        
        /**
         * Sets the "participantToken" element
         */
        void setParticipantToken(java.lang.String participantToken);
        
        /**
         * Sets (as xml) the "participantToken" element
         */
        void xsetParticipantToken(org.apache.xmlbeans.XmlString participantToken);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest newInstance() {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

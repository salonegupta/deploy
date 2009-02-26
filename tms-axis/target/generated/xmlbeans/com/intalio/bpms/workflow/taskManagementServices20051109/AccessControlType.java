/*
 * XML Type:  accessControlType
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * An XML accessControlType(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public interface AccessControlType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessControlType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("accesscontroltypee040type");
    
    /**
     * Gets array of all "user" elements
     */
    java.lang.String[] getUserArray();
    
    /**
     * Gets ith "user" element
     */
    java.lang.String getUserArray(int i);
    
    /**
     * Gets (as xml) array of all "user" elements
     */
    org.apache.xmlbeans.XmlString[] xgetUserArray();
    
    /**
     * Gets (as xml) ith "user" element
     */
    org.apache.xmlbeans.XmlString xgetUserArray(int i);
    
    /**
     * Returns number of "user" element
     */
    int sizeOfUserArray();
    
    /**
     * Sets array of all "user" element
     */
    void setUserArray(java.lang.String[] userArray);
    
    /**
     * Sets ith "user" element
     */
    void setUserArray(int i, java.lang.String user);
    
    /**
     * Sets (as xml) array of all "user" element
     */
    void xsetUserArray(org.apache.xmlbeans.XmlString[] userArray);
    
    /**
     * Sets (as xml) ith "user" element
     */
    void xsetUserArray(int i, org.apache.xmlbeans.XmlString user);
    
    /**
     * Inserts the value as the ith "user" element
     */
    void insertUser(int i, java.lang.String user);
    
    /**
     * Appends the value as the last "user" element
     */
    void addUser(java.lang.String user);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "user" element
     */
    org.apache.xmlbeans.XmlString insertNewUser(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "user" element
     */
    org.apache.xmlbeans.XmlString addNewUser();
    
    /**
     * Removes the ith "user" element
     */
    void removeUser(int i);
    
    /**
     * Gets array of all "role" elements
     */
    java.lang.String[] getRoleArray();
    
    /**
     * Gets ith "role" element
     */
    java.lang.String getRoleArray(int i);
    
    /**
     * Gets (as xml) array of all "role" elements
     */
    org.apache.xmlbeans.XmlString[] xgetRoleArray();
    
    /**
     * Gets (as xml) ith "role" element
     */
    org.apache.xmlbeans.XmlString xgetRoleArray(int i);
    
    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "role" element
     */
    void setRoleArray(java.lang.String[] roleArray);
    
    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, java.lang.String role);
    
    /**
     * Sets (as xml) array of all "role" element
     */
    void xsetRoleArray(org.apache.xmlbeans.XmlString[] roleArray);
    
    /**
     * Sets (as xml) ith "role" element
     */
    void xsetRoleArray(int i, org.apache.xmlbeans.XmlString role);
    
    /**
     * Inserts the value as the ith "role" element
     */
    void insertRole(int i, java.lang.String role);
    
    /**
     * Appends the value as the last "role" element
     */
    void addRole(java.lang.String role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    org.apache.xmlbeans.XmlString insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    org.apache.xmlbeans.XmlString addNewRole();
    
    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);
    
    /**
     * Gets the "authorized" element
     */
    java.lang.String getAuthorized();
    
    /**
     * Gets (as xml) the "authorized" element
     */
    org.apache.xmlbeans.XmlString xgetAuthorized();
    
    /**
     * True if has "authorized" element
     */
    boolean isSetAuthorized();
    
    /**
     * Sets the "authorized" element
     */
    void setAuthorized(java.lang.String authorized);
    
    /**
     * Sets (as xml) the "authorized" element
     */
    void xsetAuthorized(org.apache.xmlbeans.XmlString authorized);
    
    /**
     * Unsets the "authorized" element
     */
    void unsetAuthorized();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  taskMetadata
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109;


/**
 * An XML taskMetadata(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public interface TaskMetadata extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaskMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC1C034CAE851EDE080B9FEF6099224B").resolveHandle("taskmetadata7fd3type");
    
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
     * Gets the "taskState" element
     */
    java.lang.String getTaskState();
    
    /**
     * Gets (as xml) the "taskState" element
     */
    org.apache.xmlbeans.XmlToken xgetTaskState();
    
    /**
     * True if has "taskState" element
     */
    boolean isSetTaskState();
    
    /**
     * Sets the "taskState" element
     */
    void setTaskState(java.lang.String taskState);
    
    /**
     * Sets (as xml) the "taskState" element
     */
    void xsetTaskState(org.apache.xmlbeans.XmlToken taskState);
    
    /**
     * Unsets the "taskState" element
     */
    void unsetTaskState();
    
    /**
     * Gets the "taskType" element
     */
    java.lang.String getTaskType();
    
    /**
     * Gets (as xml) the "taskType" element
     */
    org.apache.xmlbeans.XmlToken xgetTaskType();
    
    /**
     * Sets the "taskType" element
     */
    void setTaskType(java.lang.String taskType);
    
    /**
     * Sets (as xml) the "taskType" element
     */
    void xsetTaskType(org.apache.xmlbeans.XmlToken taskType);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "processId" element
     */
    java.lang.String getProcessId();
    
    /**
     * Gets (as xml) the "processId" element
     */
    org.apache.xmlbeans.XmlString xgetProcessId();
    
    /**
     * True if has "processId" element
     */
    boolean isSetProcessId();
    
    /**
     * Sets the "processId" element
     */
    void setProcessId(java.lang.String processId);
    
    /**
     * Sets (as xml) the "processId" element
     */
    void xsetProcessId(org.apache.xmlbeans.XmlString processId);
    
    /**
     * Unsets the "processId" element
     */
    void unsetProcessId();
    
    /**
     * Gets the "creationDate" element
     */
    java.util.Calendar getCreationDate();
    
    /**
     * Gets (as xml) the "creationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreationDate();
    
    /**
     * True if has "creationDate" element
     */
    boolean isSetCreationDate();
    
    /**
     * Sets the "creationDate" element
     */
    void setCreationDate(java.util.Calendar creationDate);
    
    /**
     * Sets (as xml) the "creationDate" element
     */
    void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate);
    
    /**
     * Unsets the "creationDate" element
     */
    void unsetCreationDate();
    
    /**
     * Gets the "deadline" element
     */
    java.util.Calendar getDeadline();
    
    /**
     * Gets (as xml) the "deadline" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDeadline();
    
    /**
     * True if has "deadline" element
     */
    boolean isSetDeadline();
    
    /**
     * Sets the "deadline" element
     */
    void setDeadline(java.util.Calendar deadline);
    
    /**
     * Sets (as xml) the "deadline" element
     */
    void xsetDeadline(org.apache.xmlbeans.XmlDateTime deadline);
    
    /**
     * Unsets the "deadline" element
     */
    void unsetDeadline();
    
    /**
     * Gets the "priority" element
     */
    int getPriority();
    
    /**
     * Gets (as xml) the "priority" element
     */
    org.apache.xmlbeans.XmlInt xgetPriority();
    
    /**
     * Tests for nil "priority" element
     */
    boolean isNilPriority();
    
    /**
     * True if has "priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(int priority);
    
    /**
     * Sets (as xml) the "priority" element
     */
    void xsetPriority(org.apache.xmlbeans.XmlInt priority);
    
    /**
     * Nils the "priority" element
     */
    void setNilPriority();
    
    /**
     * Unsets the "priority" element
     */
    void unsetPriority();
    
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
     * Gets the "formUrl" element
     */
    java.lang.String getFormUrl();
    
    /**
     * Gets (as xml) the "formUrl" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetFormUrl();
    
    /**
     * Sets the "formUrl" element
     */
    void setFormUrl(java.lang.String formUrl);
    
    /**
     * Sets (as xml) the "formUrl" element
     */
    void xsetFormUrl(org.apache.xmlbeans.XmlAnyURI formUrl);
    
    /**
     * Gets the "failureCode" element
     */
    java.lang.String getFailureCode();
    
    /**
     * Gets (as xml) the "failureCode" element
     */
    org.apache.xmlbeans.XmlString xgetFailureCode();
    
    /**
     * True if has "failureCode" element
     */
    boolean isSetFailureCode();
    
    /**
     * Sets the "failureCode" element
     */
    void setFailureCode(java.lang.String failureCode);
    
    /**
     * Sets (as xml) the "failureCode" element
     */
    void xsetFailureCode(org.apache.xmlbeans.XmlString failureCode);
    
    /**
     * Unsets the "failureCode" element
     */
    void unsetFailureCode();
    
    /**
     * Gets the "failureReason" element
     */
    java.lang.String getFailureReason();
    
    /**
     * Gets (as xml) the "failureReason" element
     */
    org.apache.xmlbeans.XmlString xgetFailureReason();
    
    /**
     * True if has "failureReason" element
     */
    boolean isSetFailureReason();
    
    /**
     * Sets the "failureReason" element
     */
    void setFailureReason(java.lang.String failureReason);
    
    /**
     * Sets (as xml) the "failureReason" element
     */
    void xsetFailureReason(org.apache.xmlbeans.XmlString failureReason);
    
    /**
     * Unsets the "failureReason" element
     */
    void unsetFailureReason();
    
    /**
     * Gets the "userProcessCompleteSOAPAction" element
     */
    java.lang.String getUserProcessCompleteSOAPAction();
    
    /**
     * Gets (as xml) the "userProcessCompleteSOAPAction" element
     */
    org.apache.xmlbeans.XmlString xgetUserProcessCompleteSOAPAction();
    
    /**
     * True if has "userProcessCompleteSOAPAction" element
     */
    boolean isSetUserProcessCompleteSOAPAction();
    
    /**
     * Sets the "userProcessCompleteSOAPAction" element
     */
    void setUserProcessCompleteSOAPAction(java.lang.String userProcessCompleteSOAPAction);
    
    /**
     * Sets (as xml) the "userProcessCompleteSOAPAction" element
     */
    void xsetUserProcessCompleteSOAPAction(org.apache.xmlbeans.XmlString userProcessCompleteSOAPAction);
    
    /**
     * Unsets the "userProcessCompleteSOAPAction" element
     */
    void unsetUserProcessCompleteSOAPAction();
    
    /**
     * Gets the "processEndpoint" element
     */
    java.lang.String getProcessEndpoint();
    
    /**
     * Gets (as xml) the "processEndpoint" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetProcessEndpoint();
    
    /**
     * True if has "processEndpoint" element
     */
    boolean isSetProcessEndpoint();
    
    /**
     * Sets the "processEndpoint" element
     */
    void setProcessEndpoint(java.lang.String processEndpoint);
    
    /**
     * Sets (as xml) the "processEndpoint" element
     */
    void xsetProcessEndpoint(org.apache.xmlbeans.XmlAnyURI processEndpoint);
    
    /**
     * Unsets the "processEndpoint" element
     */
    void unsetProcessEndpoint();
    
    /**
     * Gets the "initMessageNamespaceURI" element
     */
    java.lang.String getInitMessageNamespaceURI();
    
    /**
     * Gets (as xml) the "initMessageNamespaceURI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetInitMessageNamespaceURI();
    
    /**
     * True if has "initMessageNamespaceURI" element
     */
    boolean isSetInitMessageNamespaceURI();
    
    /**
     * Sets the "initMessageNamespaceURI" element
     */
    void setInitMessageNamespaceURI(java.lang.String initMessageNamespaceURI);
    
    /**
     * Sets (as xml) the "initMessageNamespaceURI" element
     */
    void xsetInitMessageNamespaceURI(org.apache.xmlbeans.XmlAnyURI initMessageNamespaceURI);
    
    /**
     * Unsets the "initMessageNamespaceURI" element
     */
    void unsetInitMessageNamespaceURI();
    
    /**
     * Gets the "initOperationSOAPAction" element
     */
    java.lang.String getInitOperationSOAPAction();
    
    /**
     * Gets (as xml) the "initOperationSOAPAction" element
     */
    org.apache.xmlbeans.XmlString xgetInitOperationSOAPAction();
    
    /**
     * True if has "initOperationSOAPAction" element
     */
    boolean isSetInitOperationSOAPAction();
    
    /**
     * Sets the "initOperationSOAPAction" element
     */
    void setInitOperationSOAPAction(java.lang.String initOperationSOAPAction);
    
    /**
     * Sets (as xml) the "initOperationSOAPAction" element
     */
    void xsetInitOperationSOAPAction(org.apache.xmlbeans.XmlString initOperationSOAPAction);
    
    /**
     * Unsets the "initOperationSOAPAction" element
     */
    void unsetInitOperationSOAPAction();
    
    /**
     * Gets the "isChainedBefore" element
     */
    java.lang.String getIsChainedBefore();
    
    /**
     * Gets (as xml) the "isChainedBefore" element
     */
    org.apache.xmlbeans.XmlString xgetIsChainedBefore();
    
    /**
     * True if has "isChainedBefore" element
     */
    boolean isSetIsChainedBefore();
    
    /**
     * Sets the "isChainedBefore" element
     */
    void setIsChainedBefore(java.lang.String isChainedBefore);
    
    /**
     * Sets (as xml) the "isChainedBefore" element
     */
    void xsetIsChainedBefore(org.apache.xmlbeans.XmlString isChainedBefore);
    
    /**
     * Unsets the "isChainedBefore" element
     */
    void unsetIsChainedBefore();
    
    /**
     * Gets the "previousTaskId" element
     */
    java.lang.String getPreviousTaskId();
    
    /**
     * Gets (as xml) the "previousTaskId" element
     */
    org.apache.xmlbeans.XmlString xgetPreviousTaskId();
    
    /**
     * True if has "previousTaskId" element
     */
    boolean isSetPreviousTaskId();
    
    /**
     * Sets the "previousTaskId" element
     */
    void setPreviousTaskId(java.lang.String previousTaskId);
    
    /**
     * Sets (as xml) the "previousTaskId" element
     */
    void xsetPreviousTaskId(org.apache.xmlbeans.XmlString previousTaskId);
    
    /**
     * Unsets the "previousTaskId" element
     */
    void unsetPreviousTaskId();
    
    /**
     * Gets the "claimAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getClaimAction();
    
    /**
     * True if has "claimAction" element
     */
    boolean isSetClaimAction();
    
    /**
     * Sets the "claimAction" element
     */
    void setClaimAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType claimAction);
    
    /**
     * Appends and returns a new empty "claimAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewClaimAction();
    
    /**
     * Unsets the "claimAction" element
     */
    void unsetClaimAction();
    
    /**
     * Gets the "revokeAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getRevokeAction();
    
    /**
     * True if has "revokeAction" element
     */
    boolean isSetRevokeAction();
    
    /**
     * Sets the "revokeAction" element
     */
    void setRevokeAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType revokeAction);
    
    /**
     * Appends and returns a new empty "revokeAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewRevokeAction();
    
    /**
     * Unsets the "revokeAction" element
     */
    void unsetRevokeAction();
    
    /**
     * Gets the "saveAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getSaveAction();
    
    /**
     * True if has "saveAction" element
     */
    boolean isSetSaveAction();
    
    /**
     * Sets the "saveAction" element
     */
    void setSaveAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType saveAction);
    
    /**
     * Appends and returns a new empty "saveAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewSaveAction();
    
    /**
     * Unsets the "saveAction" element
     */
    void unsetSaveAction();
    
    /**
     * Gets the "completeAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getCompleteAction();
    
    /**
     * True if has "completeAction" element
     */
    boolean isSetCompleteAction();
    
    /**
     * Sets the "completeAction" element
     */
    void setCompleteAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType completeAction);
    
    /**
     * Appends and returns a new empty "completeAction" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewCompleteAction();
    
    /**
     * Unsets the "completeAction" element
     */
    void unsetCompleteAction();
    
    /**
     * Gets the "attachments" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.Attachments getAttachments();
    
    /**
     * True if has "attachments" element
     */
    boolean isSetAttachments();
    
    /**
     * Sets the "attachments" element
     */
    void setAttachments(com.intalio.bpms.workflow.taskManagementServices20051109.Attachments attachments);
    
    /**
     * Appends and returns a new empty "attachments" element
     */
    com.intalio.bpms.workflow.taskManagementServices20051109.Attachments addNewAttachments();
    
    /**
     * Unsets the "attachments" element
     */
    void unsetAttachments();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata newInstance() {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

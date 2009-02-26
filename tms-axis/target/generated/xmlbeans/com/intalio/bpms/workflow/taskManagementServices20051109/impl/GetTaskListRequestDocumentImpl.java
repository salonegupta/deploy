/*
 * An XML document type.
 * Localname: getTaskListRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getTaskListRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetTaskListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument
{
    
    public GetTaskListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTaskListRequest");
    
    
    /**
     * Gets the "getTaskListRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest getGetTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest)get_store().find_element_user(GETTASKLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskListRequest" element
     */
    public void setGetTaskListRequest(com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest getTaskListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest)get_store().find_element_user(GETTASKLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest)get_store().add_element_user(GETTASKLISTREQUEST$0);
            }
            target.set(getTaskListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getTaskListRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest addNewGetTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest)get_store().add_element_user(GETTASKLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getTaskListRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetTaskListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListRequestDocument.GetTaskListRequest
    {
        
        public GetTaskListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        
        
        /**
         * Gets the "participantToken" element
         */
        public java.lang.String getParticipantToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "participantToken" element
         */
        public org.apache.xmlbeans.XmlString xgetParticipantToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "participantToken" element
         */
        public void setParticipantToken(java.lang.String participantToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$0);
                }
                target.setStringValue(participantToken);
            }
        }
        
        /**
         * Sets (as xml) the "participantToken" element
         */
        public void xsetParticipantToken(org.apache.xmlbeans.XmlString participantToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$0);
                }
                target.set(participantToken);
            }
        }
    }
}

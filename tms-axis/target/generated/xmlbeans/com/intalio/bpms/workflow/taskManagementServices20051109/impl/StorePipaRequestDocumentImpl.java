/*
 * An XML document type.
 * Localname: storePipaRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one storePipaRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class StorePipaRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument
{
    
    public StorePipaRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOREPIPAREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "storePipaRequest");
    
    
    /**
     * Gets the "storePipaRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest getStorePipaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest)get_store().find_element_user(STOREPIPAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "storePipaRequest" element
     */
    public void setStorePipaRequest(com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest storePipaRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest)get_store().find_element_user(STOREPIPAREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest)get_store().add_element_user(STOREPIPAREQUEST$0);
            }
            target.set(storePipaRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "storePipaRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest addNewStorePipaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest)get_store().add_element_user(STOREPIPAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML storePipaRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class StorePipaRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.StorePipaRequestDocument.StorePipaRequest
    {
        
        public StorePipaRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASK$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "task");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        
        
        /**
         * Gets the "task" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Task getTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Task target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "task" element
         */
        public void setTask(com.intalio.bpms.workflow.taskManagementServices20051109.Task task)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Task target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().add_element_user(TASK$0);
                }
                target.set(task);
            }
        }
        
        /**
         * Appends and returns a new empty "task" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Task addNewTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Task target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().add_element_user(TASK$0);
                return target;
            }
        }
        
        /**
         * Gets the "participantToken" element
         */
        public java.lang.String getParticipantToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$2);
                }
                target.set(participantToken);
            }
        }
    }
}

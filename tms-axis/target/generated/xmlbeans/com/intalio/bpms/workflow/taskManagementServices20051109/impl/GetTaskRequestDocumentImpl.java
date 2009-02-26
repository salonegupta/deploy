/*
 * An XML document type.
 * Localname: getTaskRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getTaskRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetTaskRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument
{
    
    public GetTaskRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTaskRequest");
    
    
    /**
     * Gets the "getTaskRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest getGetTaskRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest)get_store().find_element_user(GETTASKREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskRequest" element
     */
    public void setGetTaskRequest(com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest getTaskRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest)get_store().find_element_user(GETTASKREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest)get_store().add_element_user(GETTASKREQUEST$0);
            }
            target.set(getTaskRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getTaskRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest addNewGetTaskRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest)get_store().add_element_user(GETTASKREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getTaskRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetTaskRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskRequestDocument.GetTaskRequest
    {
        
        public GetTaskRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        
        
        /**
         * Gets the "taskId" element
         */
        public java.lang.String getTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskId" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taskId" element
         */
        public void setTaskId(java.lang.String taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKID$0);
                }
                target.setStringValue(taskId);
            }
        }
        
        /**
         * Sets (as xml) the "taskId" element
         */
        public void xsetTaskId(org.apache.xmlbeans.XmlString taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKID$0);
                }
                target.set(taskId);
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

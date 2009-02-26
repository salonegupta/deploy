/*
 * An XML document type.
 * Localname: addAttachmentRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one addAttachmentRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class AddAttachmentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument
{
    
    public AddAttachmentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "addAttachmentRequest");
    
    
    /**
     * Gets the "addAttachmentRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest getAddAttachmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest)get_store().find_element_user(ADDATTACHMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addAttachmentRequest" element
     */
    public void setAddAttachmentRequest(com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest addAttachmentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest)get_store().find_element_user(ADDATTACHMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest)get_store().add_element_user(ADDATTACHMENTREQUEST$0);
            }
            target.set(addAttachmentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "addAttachmentRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest addNewAddAttachmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest)get_store().add_element_user(ADDATTACHMENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML addAttachmentRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class AddAttachmentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.AddAttachmentRequestDocument.AddAttachmentRequest
    {
        
        public AddAttachmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
        private static final javax.xml.namespace.QName ATTACHMENT$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "attachment");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$4 = 
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
         * Gets the "attachment" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Attachment getAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().find_element_user(ATTACHMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "attachment" element
         */
        public void setAttachment(com.intalio.bpms.workflow.taskManagementServices20051109.Attachment attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().find_element_user(ATTACHMENT$2, 0);
                if (target == null)
                {
                    target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().add_element_user(ATTACHMENT$2);
                }
                target.set(attachment);
            }
        }
        
        /**
         * Appends and returns a new empty "attachment" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Attachment addNewAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().add_element_user(ATTACHMENT$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$4);
                }
                target.set(participantToken);
            }
        }
    }
}

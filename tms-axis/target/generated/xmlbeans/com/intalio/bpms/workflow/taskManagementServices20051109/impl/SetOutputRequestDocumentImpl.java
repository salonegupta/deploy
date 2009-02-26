/*
 * An XML document type.
 * Localname: setOutputRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one setOutputRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class SetOutputRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument
{
    
    public SetOutputRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETOUTPUTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "setOutputRequest");
    
    
    /**
     * Gets the "setOutputRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest getSetOutputRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest)get_store().find_element_user(SETOUTPUTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setOutputRequest" element
     */
    public void setSetOutputRequest(com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest setOutputRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest)get_store().find_element_user(SETOUTPUTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest)get_store().add_element_user(SETOUTPUTREQUEST$0);
            }
            target.set(setOutputRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "setOutputRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest addNewSetOutputRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest)get_store().add_element_user(SETOUTPUTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML setOutputRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class SetOutputRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest
    {
        
        public SetOutputRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
        private static final javax.xml.namespace.QName DATA$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "data");
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
         * Gets the "data" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data)get_store().add_element_user(DATA$2);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data)get_store().add_element_user(DATA$2);
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
        /**
         * An XML data(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.SetOutputRequestDocument.SetOutputRequest.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}

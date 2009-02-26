/*
 * An XML document type.
 * Localname: getAvailableTasksRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getAvailableTasksRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetAvailableTasksRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument
{
    
    public GetAvailableTasksRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAVAILABLETASKSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getAvailableTasksRequest");
    
    
    /**
     * Gets the "getAvailableTasksRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest getGetAvailableTasksRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest)get_store().find_element_user(GETAVAILABLETASKSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAvailableTasksRequest" element
     */
    public void setGetAvailableTasksRequest(com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest getAvailableTasksRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest)get_store().find_element_user(GETAVAILABLETASKSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest)get_store().add_element_user(GETAVAILABLETASKSREQUEST$0);
            }
            target.set(getAvailableTasksRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getAvailableTasksRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest addNewGetAvailableTasksRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest)get_store().add_element_user(GETAVAILABLETASKSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getAvailableTasksRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetAvailableTasksRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksRequestDocument.GetAvailableTasksRequest
    {
        
        public GetAvailableTasksRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        private static final javax.xml.namespace.QName TASKTYPE$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskType");
        private static final javax.xml.namespace.QName SUBQUERY$4 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "subQuery");
        
        
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
        
        /**
         * Gets the "taskType" element
         */
        public java.lang.String getTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskType" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taskType" element
         */
        public void setTaskType(java.lang.String taskType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKTYPE$2);
                }
                target.setStringValue(taskType);
            }
        }
        
        /**
         * Sets (as xml) the "taskType" element
         */
        public void xsetTaskType(org.apache.xmlbeans.XmlString taskType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKTYPE$2);
                }
                target.set(taskType);
            }
        }
        
        /**
         * Gets the "subQuery" element
         */
        public java.lang.String getSubQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBQUERY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subQuery" element
         */
        public org.apache.xmlbeans.XmlString xgetSubQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBQUERY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subQuery" element
         */
        public void setSubQuery(java.lang.String subQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBQUERY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBQUERY$4);
                }
                target.setStringValue(subQuery);
            }
        }
        
        /**
         * Sets (as xml) the "subQuery" element
         */
        public void xsetSubQuery(org.apache.xmlbeans.XmlString subQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBQUERY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBQUERY$4);
                }
                target.set(subQuery);
            }
        }
    }
}

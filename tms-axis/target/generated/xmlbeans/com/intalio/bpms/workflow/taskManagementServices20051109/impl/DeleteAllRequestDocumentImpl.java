/*
 * An XML document type.
 * Localname: deleteAllRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one deleteAllRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class DeleteAllRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument
{
    
    public DeleteAllRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEALLREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "deleteAllRequest");
    
    
    /**
     * Gets the "deleteAllRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest getDeleteAllRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest)get_store().find_element_user(DELETEALLREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteAllRequest" element
     */
    public void setDeleteAllRequest(com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest deleteAllRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest)get_store().find_element_user(DELETEALLREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest)get_store().add_element_user(DELETEALLREQUEST$0);
            }
            target.set(deleteAllRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "deleteAllRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest addNewDeleteAllRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest)get_store().add_element_user(DELETEALLREQUEST$0);
            return target;
        }
    }
    /**
     * An XML deleteAllRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class DeleteAllRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.DeleteAllRequestDocument.DeleteAllRequest
    {
        
        public DeleteAllRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKTYPE$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskType");
        private static final javax.xml.namespace.QName SUBQUERY$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "subQuery");
        private static final javax.xml.namespace.QName FAKEDELETE$4 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "fakeDelete");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$6 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        
        
        /**
         * Gets the "taskType" element
         */
        public java.lang.String getTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "taskType" element
         */
        public boolean isSetTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKTYPE$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKTYPE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKTYPE$0);
                }
                target.set(taskType);
            }
        }
        
        /**
         * Unsets the "taskType" element
         */
        public void unsetTaskType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKTYPE$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBQUERY$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBQUERY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "subQuery" element
         */
        public boolean isSetSubQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBQUERY$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBQUERY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBQUERY$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBQUERY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBQUERY$2);
                }
                target.set(subQuery);
            }
        }
        
        /**
         * Unsets the "subQuery" element
         */
        public void unsetSubQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBQUERY$2, 0);
            }
        }
        
        /**
         * Gets the "fakeDelete" element
         */
        public boolean getFakeDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAKEDELETE$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "fakeDelete" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetFakeDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FAKEDELETE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fakeDelete" element
         */
        public void setFakeDelete(boolean fakeDelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAKEDELETE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAKEDELETE$4);
                }
                target.setBooleanValue(fakeDelete);
            }
        }
        
        /**
         * Sets (as xml) the "fakeDelete" element
         */
        public void xsetFakeDelete(org.apache.xmlbeans.XmlBoolean fakeDelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FAKEDELETE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FAKEDELETE$4);
                }
                target.set(fakeDelete);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$6);
                }
                target.set(participantToken);
            }
        }
    }
}

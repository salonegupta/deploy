/*
 * An XML document type.
 * Localname: deleteRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one deleteRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class DeleteRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument
{
    
    public DeleteRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "deleteRequest");
    
    
    /**
     * Gets the "deleteRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest getDeleteRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest)get_store().find_element_user(DELETEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteRequest" element
     */
    public void setDeleteRequest(com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest deleteRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest)get_store().find_element_user(DELETEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest)get_store().add_element_user(DELETEREQUEST$0);
            }
            target.set(deleteRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "deleteRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest addNewDeleteRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest)get_store().add_element_user(DELETEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML deleteRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class DeleteRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.DeleteRequestDocument.DeleteRequest
    {
        
        public DeleteRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        
        
        /**
         * Gets array of all "taskId" elements
         */
        public java.lang.String[] getTaskIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKID$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "taskId" element
         */
        public java.lang.String getTaskIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "taskId" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetTaskIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKID$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "taskId" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "taskId" element
         */
        public int sizeOfTaskIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKID$0);
            }
        }
        
        /**
         * Sets array of all "taskId" element
         */
        public void setTaskIdArray(java.lang.String[] taskIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taskIdArray, TASKID$0);
            }
        }
        
        /**
         * Sets ith "taskId" element
         */
        public void setTaskIdArray(int i, java.lang.String taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(taskId);
            }
        }
        
        /**
         * Sets (as xml) array of all "taskId" element
         */
        public void xsetTaskIdArray(org.apache.xmlbeans.XmlString[]taskIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taskIdArray, TASKID$0);
            }
        }
        
        /**
         * Sets (as xml) ith "taskId" element
         */
        public void xsetTaskIdArray(int i, org.apache.xmlbeans.XmlString taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(taskId);
            }
        }
        
        /**
         * Inserts the value as the ith "taskId" element
         */
        public void insertTaskId(int i, java.lang.String taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TASKID$0, i);
                target.setStringValue(taskId);
            }
        }
        
        /**
         * Appends the value as the last "taskId" element
         */
        public void addTaskId(java.lang.String taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKID$0);
                target.setStringValue(taskId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taskId" element
         */
        public org.apache.xmlbeans.XmlString insertNewTaskId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TASKID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taskId" element
         */
        public org.apache.xmlbeans.XmlString addNewTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "taskId" element
         */
        public void removeTaskId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKID$0, i);
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

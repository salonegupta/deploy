/*
 * An XML document type.
 * Localname: reassignRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one reassignRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class ReassignRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument
{
    
    public ReassignRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REASSIGNREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "reassignRequest");
    
    
    /**
     * Gets the "reassignRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest getReassignRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest)get_store().find_element_user(REASSIGNREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reassignRequest" element
     */
    public void setReassignRequest(com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest reassignRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest)get_store().find_element_user(REASSIGNREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest)get_store().add_element_user(REASSIGNREQUEST$0);
            }
            target.set(reassignRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "reassignRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest addNewReassignRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest)get_store().add_element_user(REASSIGNREQUEST$0);
            return target;
        }
    }
    /**
     * An XML reassignRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class ReassignRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.ReassignRequestDocument.ReassignRequest
    {
        
        public ReassignRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
        private static final javax.xml.namespace.QName USEROWNER$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "userOwner");
        private static final javax.xml.namespace.QName ROLEOWNER$4 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "roleOwner");
        private static final javax.xml.namespace.QName TASKSTATE$6 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskState");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$8 = 
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
         * Gets array of all "userOwner" elements
         */
        public java.lang.String[] getUserOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(USEROWNER$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "userOwner" element
         */
        public java.lang.String getUserOwnerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEROWNER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "userOwner" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetUserOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(USEROWNER$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "userOwner" element
         */
        public org.apache.xmlbeans.XmlString xgetUserOwnerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEROWNER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "userOwner" element
         */
        public int sizeOfUserOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEROWNER$2);
            }
        }
        
        /**
         * Sets array of all "userOwner" element
         */
        public void setUserOwnerArray(java.lang.String[] userOwnerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(userOwnerArray, USEROWNER$2);
            }
        }
        
        /**
         * Sets ith "userOwner" element
         */
        public void setUserOwnerArray(int i, java.lang.String userOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEROWNER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(userOwner);
            }
        }
        
        /**
         * Sets (as xml) array of all "userOwner" element
         */
        public void xsetUserOwnerArray(org.apache.xmlbeans.XmlString[]userOwnerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(userOwnerArray, USEROWNER$2);
            }
        }
        
        /**
         * Sets (as xml) ith "userOwner" element
         */
        public void xsetUserOwnerArray(int i, org.apache.xmlbeans.XmlString userOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEROWNER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(userOwner);
            }
        }
        
        /**
         * Inserts the value as the ith "userOwner" element
         */
        public void insertUserOwner(int i, java.lang.String userOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(USEROWNER$2, i);
                target.setStringValue(userOwner);
            }
        }
        
        /**
         * Appends the value as the last "userOwner" element
         */
        public void addUserOwner(java.lang.String userOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEROWNER$2);
                target.setStringValue(userOwner);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "userOwner" element
         */
        public org.apache.xmlbeans.XmlString insertNewUserOwner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(USEROWNER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "userOwner" element
         */
        public org.apache.xmlbeans.XmlString addNewUserOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEROWNER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "userOwner" element
         */
        public void removeUserOwner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEROWNER$2, i);
            }
        }
        
        /**
         * Gets array of all "roleOwner" elements
         */
        public java.lang.String[] getRoleOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROLEOWNER$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "roleOwner" element
         */
        public java.lang.String getRoleOwnerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEOWNER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "roleOwner" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetRoleOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROLEOWNER$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "roleOwner" element
         */
        public org.apache.xmlbeans.XmlString xgetRoleOwnerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLEOWNER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "roleOwner" element
         */
        public int sizeOfRoleOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLEOWNER$4);
            }
        }
        
        /**
         * Sets array of all "roleOwner" element
         */
        public void setRoleOwnerArray(java.lang.String[] roleOwnerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roleOwnerArray, ROLEOWNER$4);
            }
        }
        
        /**
         * Sets ith "roleOwner" element
         */
        public void setRoleOwnerArray(int i, java.lang.String roleOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEOWNER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(roleOwner);
            }
        }
        
        /**
         * Sets (as xml) array of all "roleOwner" element
         */
        public void xsetRoleOwnerArray(org.apache.xmlbeans.XmlString[]roleOwnerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roleOwnerArray, ROLEOWNER$4);
            }
        }
        
        /**
         * Sets (as xml) ith "roleOwner" element
         */
        public void xsetRoleOwnerArray(int i, org.apache.xmlbeans.XmlString roleOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLEOWNER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(roleOwner);
            }
        }
        
        /**
         * Inserts the value as the ith "roleOwner" element
         */
        public void insertRoleOwner(int i, java.lang.String roleOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ROLEOWNER$4, i);
                target.setStringValue(roleOwner);
            }
        }
        
        /**
         * Appends the value as the last "roleOwner" element
         */
        public void addRoleOwner(java.lang.String roleOwner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLEOWNER$4);
                target.setStringValue(roleOwner);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "roleOwner" element
         */
        public org.apache.xmlbeans.XmlString insertNewRoleOwner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ROLEOWNER$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "roleOwner" element
         */
        public org.apache.xmlbeans.XmlString addNewRoleOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLEOWNER$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "roleOwner" element
         */
        public void removeRoleOwner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLEOWNER$4, i);
            }
        }
        
        /**
         * Gets the "taskState" element
         */
        public java.lang.String getTaskState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKSTATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskState" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKSTATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taskState" element
         */
        public void setTaskState(java.lang.String taskState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKSTATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKSTATE$6);
                }
                target.setStringValue(taskState);
            }
        }
        
        /**
         * Sets (as xml) the "taskState" element
         */
        public void xsetTaskState(org.apache.xmlbeans.XmlString taskState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKSTATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKSTATE$6);
                }
                target.set(taskState);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$8);
                }
                target.set(participantToken);
            }
        }
    }
}

/*
 * An XML document type.
 * Localname: getAvailableTasksResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getAvailableTasksResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetAvailableTasksResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument
{
    
    public GetAvailableTasksResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAVAILABLETASKSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getAvailableTasksResponse");
    
    
    /**
     * Gets the "getAvailableTasksResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse getGetAvailableTasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse)get_store().find_element_user(GETAVAILABLETASKSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAvailableTasksResponse" element
     */
    public void setGetAvailableTasksResponse(com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse getAvailableTasksResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse)get_store().find_element_user(GETAVAILABLETASKSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse)get_store().add_element_user(GETAVAILABLETASKSRESPONSE$0);
            }
            target.set(getAvailableTasksResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAvailableTasksResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse addNewGetAvailableTasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse)get_store().add_element_user(GETAVAILABLETASKSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getAvailableTasksResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetAvailableTasksResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetAvailableTasksResponseDocument.GetAvailableTasksResponse
    {
        
        public GetAvailableTasksResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASK$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "task");
        
        
        /**
         * Gets array of all "task" elements
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Task[] getTaskArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASK$0, targetList);
                com.intalio.bpms.workflow.taskManagementServices20051109.Task[] result = new com.intalio.bpms.workflow.taskManagementServices20051109.Task[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "task" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Task getTaskArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Task target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().find_element_user(TASK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "task" element
         */
        public int sizeOfTaskArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASK$0);
            }
        }
        
        /**
         * Sets array of all "task" element
         */
        public void setTaskArray(com.intalio.bpms.workflow.taskManagementServices20051109.Task[] taskArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taskArray, TASK$0);
            }
        }
        
        /**
         * Sets ith "task" element
         */
        public void setTaskArray(int i, com.intalio.bpms.workflow.taskManagementServices20051109.Task task)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Task target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().find_element_user(TASK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(task);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "task" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.Task insertNewTask(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.Task target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task)get_store().insert_element_user(TASK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "task" element
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
         * Removes the ith "task" element
         */
        public void removeTask(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASK$0, i);
            }
        }
    }
}

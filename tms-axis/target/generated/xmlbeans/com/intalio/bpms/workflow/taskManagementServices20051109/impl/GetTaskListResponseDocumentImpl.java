/*
 * An XML document type.
 * Localname: getTaskListResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getTaskListResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetTaskListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument
{
    
    public GetTaskListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTaskListResponse");
    
    
    /**
     * Gets the "getTaskListResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse getGetTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse)get_store().find_element_user(GETTASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskListResponse" element
     */
    public void setGetTaskListResponse(com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse getTaskListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse)get_store().find_element_user(GETTASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse)get_store().add_element_user(GETTASKLISTRESPONSE$0);
            }
            target.set(getTaskListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getTaskListResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse addNewGetTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse)get_store().add_element_user(GETTASKLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getTaskListResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetTaskListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskListResponseDocument.GetTaskListResponse
    {
        
        public GetTaskListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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

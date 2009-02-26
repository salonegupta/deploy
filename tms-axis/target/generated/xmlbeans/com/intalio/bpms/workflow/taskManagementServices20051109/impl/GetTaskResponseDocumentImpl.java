/*
 * An XML document type.
 * Localname: getTaskResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getTaskResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetTaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument
{
    
    public GetTaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTaskResponse");
    
    
    /**
     * Gets the "getTaskResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse getGetTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse)get_store().find_element_user(GETTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTaskResponse" element
     */
    public void setGetTaskResponse(com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse getTaskResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse)get_store().find_element_user(GETTASKRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse)get_store().add_element_user(GETTASKRESPONSE$0);
            }
            target.set(getTaskResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getTaskResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse addNewGetTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse)get_store().add_element_user(GETTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getTaskResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetTaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetTaskResponseDocument.GetTaskResponse
    {
        
        public GetTaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASK$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "task");
        
        
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
    }
}

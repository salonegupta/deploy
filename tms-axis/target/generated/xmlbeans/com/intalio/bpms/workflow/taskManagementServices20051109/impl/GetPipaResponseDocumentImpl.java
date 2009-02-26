/*
 * An XML document type.
 * Localname: getPipaResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getPipaResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetPipaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument
{
    
    public GetPipaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPIPARESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getPipaResponse");
    
    
    /**
     * Gets the "getPipaResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse getGetPipaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse)get_store().find_element_user(GETPIPARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPipaResponse" element
     */
    public void setGetPipaResponse(com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse getPipaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse)get_store().find_element_user(GETPIPARESPONSE$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse)get_store().add_element_user(GETPIPARESPONSE$0);
            }
            target.set(getPipaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getPipaResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse addNewGetPipaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse)get_store().add_element_user(GETPIPARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getPipaResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class GetPipaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetPipaResponseDocument.GetPipaResponse
    {
        
        public GetPipaResponseImpl(org.apache.xmlbeans.SchemaType sType)
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

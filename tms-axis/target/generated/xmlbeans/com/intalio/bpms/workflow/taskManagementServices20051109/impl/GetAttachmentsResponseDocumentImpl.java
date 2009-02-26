/*
 * An XML document type.
 * Localname: getAttachmentsResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.GetAttachmentsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one getAttachmentsResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class GetAttachmentsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.GetAttachmentsResponseDocument
{
    
    public GetAttachmentsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETATTACHMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getAttachmentsResponse");
    
    
    /**
     * Gets the "getAttachmentsResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachments getGetAttachmentsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachments target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().find_element_user(GETATTACHMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAttachmentsResponse" element
     */
    public void setGetAttachmentsResponse(com.intalio.bpms.workflow.taskManagementServices20051109.Attachments getAttachmentsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachments target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().find_element_user(GETATTACHMENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().add_element_user(GETATTACHMENTSRESPONSE$0);
            }
            target.set(getAttachmentsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAttachmentsResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachments addNewGetAttachmentsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachments target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().add_element_user(GETATTACHMENTSRESPONSE$0);
            return target;
        }
    }
}

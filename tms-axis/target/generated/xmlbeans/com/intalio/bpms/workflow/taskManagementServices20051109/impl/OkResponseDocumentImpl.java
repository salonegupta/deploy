/*
 * An XML document type.
 * Localname: okResponse
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one okResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class OkResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument
{
    
    public OkResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "okResponse");
    
    
    /**
     * Gets the "okResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse getOkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse)get_store().find_element_user(OKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "okResponse" element
     */
    public void setOkResponse(com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse okResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse)get_store().find_element_user(OKRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse)get_store().add_element_user(OKRESPONSE$0);
            }
            target.set(okResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "okResponse" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse addNewOkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse)get_store().add_element_user(OKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML okResponse(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class OkResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.OkResponseDocument.OkResponse
    {
        
        public OkResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}

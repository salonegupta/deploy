/*
 * An XML document type.
 * Localname: invalidInputMessageFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one invalidInputMessageFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class InvalidInputMessageFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument
{
    
    public InvalidInputMessageFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDINPUTMESSAGEFAULT$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "invalidInputMessageFault");
    
    
    /**
     * Gets the "invalidInputMessageFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault getInvalidInputMessageFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault)get_store().find_element_user(INVALIDINPUTMESSAGEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "invalidInputMessageFault" element
     */
    public void setInvalidInputMessageFault(com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault invalidInputMessageFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault)get_store().find_element_user(INVALIDINPUTMESSAGEFAULT$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault)get_store().add_element_user(INVALIDINPUTMESSAGEFAULT$0);
            }
            target.set(invalidInputMessageFault);
        }
    }
    
    /**
     * Appends and returns a new empty "invalidInputMessageFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault addNewInvalidInputMessageFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault)get_store().add_element_user(INVALIDINPUTMESSAGEFAULT$0);
            return target;
        }
    }
    /**
     * An XML invalidInputMessageFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class InvalidInputMessageFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InvalidInputMessageFaultDocument.InvalidInputMessageFault
    {
        
        public InvalidInputMessageFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REASON$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "reason");
        
        
        /**
         * Gets the "reason" element
         */
        public java.lang.String getReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "reason" element
         */
        public org.apache.xmlbeans.XmlString xgetReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "reason" element
         */
        public void setReason(java.lang.String reason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$0);
                }
                target.setStringValue(reason);
            }
        }
        
        /**
         * Sets (as xml) the "reason" element
         */
        public void xsetReason(org.apache.xmlbeans.XmlString reason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$0);
                }
                target.set(reason);
            }
        }
    }
}

/*
 * An XML document type.
 * Localname: unavailableAttachmentFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one unavailableAttachmentFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class UnavailableAttachmentFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument
{
    
    public UnavailableAttachmentFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNAVAILABLEATTACHMENTFAULT$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "unavailableAttachmentFault");
    
    
    /**
     * Gets the "unavailableAttachmentFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault getUnavailableAttachmentFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault)get_store().find_element_user(UNAVAILABLEATTACHMENTFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unavailableAttachmentFault" element
     */
    public void setUnavailableAttachmentFault(com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault unavailableAttachmentFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault)get_store().find_element_user(UNAVAILABLEATTACHMENTFAULT$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault)get_store().add_element_user(UNAVAILABLEATTACHMENTFAULT$0);
            }
            target.set(unavailableAttachmentFault);
        }
    }
    
    /**
     * Appends and returns a new empty "unavailableAttachmentFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault addNewUnavailableAttachmentFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault)get_store().add_element_user(UNAVAILABLEATTACHMENTFAULT$0);
            return target;
        }
    }
    /**
     * An XML unavailableAttachmentFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class UnavailableAttachmentFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableAttachmentFaultDocument.UnavailableAttachmentFault
    {
        
        public UnavailableAttachmentFaultImpl(org.apache.xmlbeans.SchemaType sType)
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

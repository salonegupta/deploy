/*
 * An XML document type.
 * Localname: accessDeniedFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one accessDeniedFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class AccessDeniedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument
{
    
    public AccessDeniedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSDENIEDFAULT$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "accessDeniedFault");
    
    
    /**
     * Gets the "accessDeniedFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault getAccessDeniedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault)get_store().find_element_user(ACCESSDENIEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "accessDeniedFault" element
     */
    public void setAccessDeniedFault(com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault accessDeniedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault)get_store().find_element_user(ACCESSDENIEDFAULT$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault)get_store().add_element_user(ACCESSDENIEDFAULT$0);
            }
            target.set(accessDeniedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "accessDeniedFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault addNewAccessDeniedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault)get_store().add_element_user(ACCESSDENIEDFAULT$0);
            return target;
        }
    }
    /**
     * An XML accessDeniedFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class AccessDeniedFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.AccessDeniedFaultDocument.AccessDeniedFault
    {
        
        public AccessDeniedFaultImpl(org.apache.xmlbeans.SchemaType sType)
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

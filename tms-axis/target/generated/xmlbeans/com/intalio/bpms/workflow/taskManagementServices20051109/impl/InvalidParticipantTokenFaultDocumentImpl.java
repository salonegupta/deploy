/*
 * An XML document type.
 * Localname: invalidParticipantTokenFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one invalidParticipantTokenFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class InvalidParticipantTokenFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument
{
    
    public InvalidParticipantTokenFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDPARTICIPANTTOKENFAULT$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "invalidParticipantTokenFault");
    
    
    /**
     * Gets the "invalidParticipantTokenFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault getInvalidParticipantTokenFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault)get_store().find_element_user(INVALIDPARTICIPANTTOKENFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "invalidParticipantTokenFault" element
     */
    public void setInvalidParticipantTokenFault(com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault invalidParticipantTokenFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault)get_store().find_element_user(INVALIDPARTICIPANTTOKENFAULT$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault)get_store().add_element_user(INVALIDPARTICIPANTTOKENFAULT$0);
            }
            target.set(invalidParticipantTokenFault);
        }
    }
    
    /**
     * Appends and returns a new empty "invalidParticipantTokenFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault addNewInvalidParticipantTokenFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault)get_store().add_element_user(INVALIDPARTICIPANTTOKENFAULT$0);
            return target;
        }
    }
    /**
     * An XML invalidParticipantTokenFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class InvalidParticipantTokenFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InvalidParticipantTokenFaultDocument.InvalidParticipantTokenFault
    {
        
        public InvalidParticipantTokenFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REASON$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "reason");
        private static final javax.xml.namespace.QName INVALIDTOKEN$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "invalidToken");
        
        
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
        
        /**
         * Gets the "invalidToken" element
         */
        public java.lang.String getInvalidToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDTOKEN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "invalidToken" element
         */
        public org.apache.xmlbeans.XmlString xgetInvalidToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDTOKEN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "invalidToken" element
         */
        public void setInvalidToken(java.lang.String invalidToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDTOKEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDTOKEN$2);
                }
                target.setStringValue(invalidToken);
            }
        }
        
        /**
         * Sets (as xml) the "invalidToken" element
         */
        public void xsetInvalidToken(org.apache.xmlbeans.XmlString invalidToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDTOKEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVALIDTOKEN$2);
                }
                target.set(invalidToken);
            }
        }
    }
}

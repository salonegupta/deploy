/*
 * An XML document type.
 * Localname: deletePipaRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one deletePipaRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class DeletePipaRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument
{
    
    public DeletePipaRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEPIPAREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "deletePipaRequest");
    
    
    /**
     * Gets the "deletePipaRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest getDeletePipaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest)get_store().find_element_user(DELETEPIPAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deletePipaRequest" element
     */
    public void setDeletePipaRequest(com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest deletePipaRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest)get_store().find_element_user(DELETEPIPAREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest)get_store().add_element_user(DELETEPIPAREQUEST$0);
            }
            target.set(deletePipaRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "deletePipaRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest addNewDeletePipaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest)get_store().add_element_user(DELETEPIPAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML deletePipaRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class DeletePipaRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.DeletePipaRequestDocument.DeletePipaRequest
    {
        
        public DeletePipaRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PIPAURL$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "pipaurl");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        
        
        /**
         * Gets the "pipaurl" element
         */
        public java.lang.String getPipaurl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIPAURL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pipaurl" element
         */
        public org.apache.xmlbeans.XmlString xgetPipaurl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PIPAURL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "pipaurl" element
         */
        public void setPipaurl(java.lang.String pipaurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIPAURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PIPAURL$0);
                }
                target.setStringValue(pipaurl);
            }
        }
        
        /**
         * Sets (as xml) the "pipaurl" element
         */
        public void xsetPipaurl(org.apache.xmlbeans.XmlString pipaurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PIPAURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PIPAURL$0);
                }
                target.set(pipaurl);
            }
        }
        
        /**
         * Gets the "participantToken" element
         */
        public java.lang.String getParticipantToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "participantToken" element
         */
        public org.apache.xmlbeans.XmlString xgetParticipantToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "participantToken" element
         */
        public void setParticipantToken(java.lang.String participantToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$2);
                }
                target.setStringValue(participantToken);
            }
        }
        
        /**
         * Sets (as xml) the "participantToken" element
         */
        public void xsetParticipantToken(org.apache.xmlbeans.XmlString participantToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$2);
                }
                target.set(participantToken);
            }
        }
    }
}

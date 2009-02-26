/*
 * XML Type:  attachment
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.Attachment
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * An XML attachment(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public class AttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.Attachment
{
    
    public AttachmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "attachmentMetadata");
    private static final javax.xml.namespace.QName PAYLOADURL$2 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "payloadUrl");
    
    
    /**
     * Gets the "attachmentMetadata" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata getAttachmentMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata)get_store().find_element_user(ATTACHMENTMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attachmentMetadata" element
     */
    public void setAttachmentMetadata(com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata attachmentMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata)get_store().find_element_user(ATTACHMENTMETADATA$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata)get_store().add_element_user(ATTACHMENTMETADATA$0);
            }
            target.set(attachmentMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "attachmentMetadata" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata addNewAttachmentMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AttachmentMetadata)get_store().add_element_user(ATTACHMENTMETADATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "payloadUrl" element
     */
    public java.lang.String getPayloadUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYLOADURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "payloadUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetPayloadUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYLOADURL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "payloadUrl" element
     */
    public void setPayloadUrl(java.lang.String payloadUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYLOADURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYLOADURL$2);
            }
            target.setStringValue(payloadUrl);
        }
    }
    
    /**
     * Sets (as xml) the "payloadUrl" element
     */
    public void xsetPayloadUrl(org.apache.xmlbeans.XmlString payloadUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYLOADURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAYLOADURL$2);
            }
            target.set(payloadUrl);
        }
    }
}

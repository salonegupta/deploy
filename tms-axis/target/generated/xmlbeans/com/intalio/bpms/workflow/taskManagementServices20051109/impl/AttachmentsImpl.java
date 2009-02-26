/*
 * XML Type:  attachments
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.Attachments
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * An XML attachments(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public class AttachmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.Attachments
{
    
    public AttachmentsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "attachment");
    
    
    /**
     * Gets array of all "attachment" elements
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachment[] getAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENT$0, targetList);
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachment[] result = new com.intalio.bpms.workflow.taskManagementServices20051109.Attachment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attachment" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachment getAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().find_element_user(ATTACHMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attachment" element
     */
    public int sizeOfAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENT$0);
        }
    }
    
    /**
     * Sets array of all "attachment" element
     */
    public void setAttachmentArray(com.intalio.bpms.workflow.taskManagementServices20051109.Attachment[] attachmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentArray, ATTACHMENT$0);
        }
    }
    
    /**
     * Sets ith "attachment" element
     */
    public void setAttachmentArray(int i, com.intalio.bpms.workflow.taskManagementServices20051109.Attachment attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().find_element_user(ATTACHMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attachment" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachment insertNewAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().insert_element_user(ATTACHMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attachment" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachment addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachment target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachment)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attachment" element
     */
    public void removeAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENT$0, i);
        }
    }
}

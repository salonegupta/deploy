/*
 * XML Type:  taskMetadata
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * An XML taskMetadata(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public class TaskMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata
{
    
    public TaskMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKID$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
    private static final javax.xml.namespace.QName TASKSTATE$2 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskState");
    private static final javax.xml.namespace.QName TASKTYPE$4 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskType");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "description");
    private static final javax.xml.namespace.QName PROCESSID$8 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "processId");
    private static final javax.xml.namespace.QName CREATIONDATE$10 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "creationDate");
    private static final javax.xml.namespace.QName DEADLINE$12 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "deadline");
    private static final javax.xml.namespace.QName PRIORITY$14 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "priority");
    private static final javax.xml.namespace.QName USEROWNER$16 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "userOwner");
    private static final javax.xml.namespace.QName ROLEOWNER$18 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "roleOwner");
    private static final javax.xml.namespace.QName FORMURL$20 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "formUrl");
    private static final javax.xml.namespace.QName FAILURECODE$22 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "failureCode");
    private static final javax.xml.namespace.QName FAILUREREASON$24 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "failureReason");
    private static final javax.xml.namespace.QName USERPROCESSCOMPLETESOAPACTION$26 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "userProcessCompleteSOAPAction");
    private static final javax.xml.namespace.QName PROCESSENDPOINT$28 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "processEndpoint");
    private static final javax.xml.namespace.QName INITMESSAGENAMESPACEURI$30 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "initMessageNamespaceURI");
    private static final javax.xml.namespace.QName INITOPERATIONSOAPACTION$32 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "initOperationSOAPAction");
    private static final javax.xml.namespace.QName ISCHAINEDBEFORE$34 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "isChainedBefore");
    private static final javax.xml.namespace.QName PREVIOUSTASKID$36 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "previousTaskId");
    private static final javax.xml.namespace.QName CLAIMACTION$38 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "claimAction");
    private static final javax.xml.namespace.QName REVOKEACTION$40 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "revokeAction");
    private static final javax.xml.namespace.QName SAVEACTION$42 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "saveAction");
    private static final javax.xml.namespace.QName COMPLETEACTION$44 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "completeAction");
    private static final javax.xml.namespace.QName ATTACHMENTS$46 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "attachments");
    
    
    /**
     * Gets the "taskId" element
     */
    public java.lang.String getTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taskId" element
     */
    public org.apache.xmlbeans.XmlString xgetTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "taskId" element
     */
    public void setTaskId(java.lang.String taskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKID$0);
            }
            target.setStringValue(taskId);
        }
    }
    
    /**
     * Sets (as xml) the "taskId" element
     */
    public void xsetTaskId(org.apache.xmlbeans.XmlString taskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKID$0);
            }
            target.set(taskId);
        }
    }
    
    /**
     * Gets the "taskState" element
     */
    public java.lang.String getTaskState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taskState" element
     */
    public org.apache.xmlbeans.XmlToken xgetTaskState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(TASKSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "taskState" element
     */
    public boolean isSetTaskState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKSTATE$2) != 0;
        }
    }
    
    /**
     * Sets the "taskState" element
     */
    public void setTaskState(java.lang.String taskState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKSTATE$2);
            }
            target.setStringValue(taskState);
        }
    }
    
    /**
     * Sets (as xml) the "taskState" element
     */
    public void xsetTaskState(org.apache.xmlbeans.XmlToken taskState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(TASKSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(TASKSTATE$2);
            }
            target.set(taskState);
        }
    }
    
    /**
     * Unsets the "taskState" element
     */
    public void unsetTaskState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKSTATE$2, 0);
        }
    }
    
    /**
     * Gets the "taskType" element
     */
    public java.lang.String getTaskType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taskType" element
     */
    public org.apache.xmlbeans.XmlToken xgetTaskType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(TASKTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "taskType" element
     */
    public void setTaskType(java.lang.String taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKTYPE$4);
            }
            target.setStringValue(taskType);
        }
    }
    
    /**
     * Sets (as xml) the "taskType" element
     */
    public void xsetTaskType(org.apache.xmlbeans.XmlToken taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(TASKTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(TASKTYPE$4);
            }
            target.set(taskType);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "processId" element
     */
    public java.lang.String getProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "processId" element
     */
    public org.apache.xmlbeans.XmlString xgetProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "processId" element
     */
    public boolean isSetProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSID$8) != 0;
        }
    }
    
    /**
     * Sets the "processId" element
     */
    public void setProcessId(java.lang.String processId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSID$8);
            }
            target.setStringValue(processId);
        }
    }
    
    /**
     * Sets (as xml) the "processId" element
     */
    public void xsetProcessId(org.apache.xmlbeans.XmlString processId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESSID$8);
            }
            target.set(processId);
        }
    }
    
    /**
     * Unsets the "processId" element
     */
    public void unsetProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSID$8, 0);
        }
    }
    
    /**
     * Gets the "creationDate" element
     */
    public java.util.Calendar getCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "creationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "creationDate" element
     */
    public boolean isSetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATIONDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "creationDate" element
     */
    public void setCreationDate(java.util.Calendar creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATE$10);
            }
            target.setCalendarValue(creationDate);
        }
    }
    
    /**
     * Sets (as xml) the "creationDate" element
     */
    public void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONDATE$10);
            }
            target.set(creationDate);
        }
    }
    
    /**
     * Unsets the "creationDate" element
     */
    public void unsetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATIONDATE$10, 0);
        }
    }
    
    /**
     * Gets the "deadline" element
     */
    public java.util.Calendar getDeadline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "deadline" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeadline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DEADLINE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "deadline" element
     */
    public boolean isSetDeadline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEADLINE$12) != 0;
        }
    }
    
    /**
     * Sets the "deadline" element
     */
    public void setDeadline(java.util.Calendar deadline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEADLINE$12);
            }
            target.setCalendarValue(deadline);
        }
    }
    
    /**
     * Sets (as xml) the "deadline" element
     */
    public void xsetDeadline(org.apache.xmlbeans.XmlDateTime deadline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DEADLINE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DEADLINE$12);
            }
            target.set(deadline);
        }
    }
    
    /**
     * Unsets the "deadline" element
     */
    public void unsetDeadline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEADLINE$12, 0);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public int getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" element
     */
    public org.apache.xmlbeans.XmlInt xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "priority" element
     */
    public boolean isNilPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$14) != 0;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$14);
            }
            target.setIntValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIORITY$14);
            }
            target.set(priority);
        }
    }
    
    /**
     * Nils the "priority" element
     */
    public void setNilPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIORITY$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$14, 0);
        }
    }
    
    /**
     * Gets array of all "userOwner" elements
     */
    public java.lang.String[] getUserOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEROWNER$16, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "userOwner" element
     */
    public java.lang.String getUserOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEROWNER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "userOwner" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetUserOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEROWNER$16, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "userOwner" element
     */
    public org.apache.xmlbeans.XmlString xgetUserOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEROWNER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "userOwner" element
     */
    public int sizeOfUserOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEROWNER$16);
        }
    }
    
    /**
     * Sets array of all "userOwner" element
     */
    public void setUserOwnerArray(java.lang.String[] userOwnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userOwnerArray, USEROWNER$16);
        }
    }
    
    /**
     * Sets ith "userOwner" element
     */
    public void setUserOwnerArray(int i, java.lang.String userOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEROWNER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(userOwner);
        }
    }
    
    /**
     * Sets (as xml) array of all "userOwner" element
     */
    public void xsetUserOwnerArray(org.apache.xmlbeans.XmlString[]userOwnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userOwnerArray, USEROWNER$16);
        }
    }
    
    /**
     * Sets (as xml) ith "userOwner" element
     */
    public void xsetUserOwnerArray(int i, org.apache.xmlbeans.XmlString userOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEROWNER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(userOwner);
        }
    }
    
    /**
     * Inserts the value as the ith "userOwner" element
     */
    public void insertUserOwner(int i, java.lang.String userOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(USEROWNER$16, i);
            target.setStringValue(userOwner);
        }
    }
    
    /**
     * Appends the value as the last "userOwner" element
     */
    public void addUserOwner(java.lang.String userOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEROWNER$16);
            target.setStringValue(userOwner);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "userOwner" element
     */
    public org.apache.xmlbeans.XmlString insertNewUserOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(USEROWNER$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "userOwner" element
     */
    public org.apache.xmlbeans.XmlString addNewUserOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEROWNER$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "userOwner" element
     */
    public void removeUserOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEROWNER$16, i);
        }
    }
    
    /**
     * Gets array of all "roleOwner" elements
     */
    public java.lang.String[] getRoleOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEOWNER$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "roleOwner" element
     */
    public java.lang.String getRoleOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "roleOwner" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRoleOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEOWNER$18, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "roleOwner" element
     */
    public org.apache.xmlbeans.XmlString xgetRoleOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLEOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "roleOwner" element
     */
    public int sizeOfRoleOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEOWNER$18);
        }
    }
    
    /**
     * Sets array of all "roleOwner" element
     */
    public void setRoleOwnerArray(java.lang.String[] roleOwnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleOwnerArray, ROLEOWNER$18);
        }
    }
    
    /**
     * Sets ith "roleOwner" element
     */
    public void setRoleOwnerArray(int i, java.lang.String roleOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(roleOwner);
        }
    }
    
    /**
     * Sets (as xml) array of all "roleOwner" element
     */
    public void xsetRoleOwnerArray(org.apache.xmlbeans.XmlString[]roleOwnerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleOwnerArray, ROLEOWNER$18);
        }
    }
    
    /**
     * Sets (as xml) ith "roleOwner" element
     */
    public void xsetRoleOwnerArray(int i, org.apache.xmlbeans.XmlString roleOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLEOWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(roleOwner);
        }
    }
    
    /**
     * Inserts the value as the ith "roleOwner" element
     */
    public void insertRoleOwner(int i, java.lang.String roleOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ROLEOWNER$18, i);
            target.setStringValue(roleOwner);
        }
    }
    
    /**
     * Appends the value as the last "roleOwner" element
     */
    public void addRoleOwner(java.lang.String roleOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLEOWNER$18);
            target.setStringValue(roleOwner);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "roleOwner" element
     */
    public org.apache.xmlbeans.XmlString insertNewRoleOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ROLEOWNER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "roleOwner" element
     */
    public org.apache.xmlbeans.XmlString addNewRoleOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLEOWNER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "roleOwner" element
     */
    public void removeRoleOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEOWNER$18, i);
        }
    }
    
    /**
     * Gets the "formUrl" element
     */
    public java.lang.String getFormUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMURL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formUrl" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFormUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FORMURL$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "formUrl" element
     */
    public void setFormUrl(java.lang.String formUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMURL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMURL$20);
            }
            target.setStringValue(formUrl);
        }
    }
    
    /**
     * Sets (as xml) the "formUrl" element
     */
    public void xsetFormUrl(org.apache.xmlbeans.XmlAnyURI formUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FORMURL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(FORMURL$20);
            }
            target.set(formUrl);
        }
    }
    
    /**
     * Gets the "failureCode" element
     */
    public java.lang.String getFailureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILURECODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "failureCode" element
     */
    public org.apache.xmlbeans.XmlString xgetFailureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILURECODE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "failureCode" element
     */
    public boolean isSetFailureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURECODE$22) != 0;
        }
    }
    
    /**
     * Sets the "failureCode" element
     */
    public void setFailureCode(java.lang.String failureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILURECODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAILURECODE$22);
            }
            target.setStringValue(failureCode);
        }
    }
    
    /**
     * Sets (as xml) the "failureCode" element
     */
    public void xsetFailureCode(org.apache.xmlbeans.XmlString failureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILURECODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAILURECODE$22);
            }
            target.set(failureCode);
        }
    }
    
    /**
     * Unsets the "failureCode" element
     */
    public void unsetFailureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURECODE$22, 0);
        }
    }
    
    /**
     * Gets the "failureReason" element
     */
    public java.lang.String getFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILUREREASON$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "failureReason" element
     */
    public org.apache.xmlbeans.XmlString xgetFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILUREREASON$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "failureReason" element
     */
    public boolean isSetFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILUREREASON$24) != 0;
        }
    }
    
    /**
     * Sets the "failureReason" element
     */
    public void setFailureReason(java.lang.String failureReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILUREREASON$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAILUREREASON$24);
            }
            target.setStringValue(failureReason);
        }
    }
    
    /**
     * Sets (as xml) the "failureReason" element
     */
    public void xsetFailureReason(org.apache.xmlbeans.XmlString failureReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILUREREASON$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAILUREREASON$24);
            }
            target.set(failureReason);
        }
    }
    
    /**
     * Unsets the "failureReason" element
     */
    public void unsetFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILUREREASON$24, 0);
        }
    }
    
    /**
     * Gets the "userProcessCompleteSOAPAction" element
     */
    public java.lang.String getUserProcessCompleteSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERPROCESSCOMPLETESOAPACTION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userProcessCompleteSOAPAction" element
     */
    public org.apache.xmlbeans.XmlString xgetUserProcessCompleteSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERPROCESSCOMPLETESOAPACTION$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "userProcessCompleteSOAPAction" element
     */
    public boolean isSetUserProcessCompleteSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERPROCESSCOMPLETESOAPACTION$26) != 0;
        }
    }
    
    /**
     * Sets the "userProcessCompleteSOAPAction" element
     */
    public void setUserProcessCompleteSOAPAction(java.lang.String userProcessCompleteSOAPAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERPROCESSCOMPLETESOAPACTION$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERPROCESSCOMPLETESOAPACTION$26);
            }
            target.setStringValue(userProcessCompleteSOAPAction);
        }
    }
    
    /**
     * Sets (as xml) the "userProcessCompleteSOAPAction" element
     */
    public void xsetUserProcessCompleteSOAPAction(org.apache.xmlbeans.XmlString userProcessCompleteSOAPAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERPROCESSCOMPLETESOAPACTION$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERPROCESSCOMPLETESOAPACTION$26);
            }
            target.set(userProcessCompleteSOAPAction);
        }
    }
    
    /**
     * Unsets the "userProcessCompleteSOAPAction" element
     */
    public void unsetUserProcessCompleteSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERPROCESSCOMPLETESOAPACTION$26, 0);
        }
    }
    
    /**
     * Gets the "processEndpoint" element
     */
    public java.lang.String getProcessEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSENDPOINT$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "processEndpoint" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetProcessEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROCESSENDPOINT$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "processEndpoint" element
     */
    public boolean isSetProcessEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSENDPOINT$28) != 0;
        }
    }
    
    /**
     * Sets the "processEndpoint" element
     */
    public void setProcessEndpoint(java.lang.String processEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSENDPOINT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSENDPOINT$28);
            }
            target.setStringValue(processEndpoint);
        }
    }
    
    /**
     * Sets (as xml) the "processEndpoint" element
     */
    public void xsetProcessEndpoint(org.apache.xmlbeans.XmlAnyURI processEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROCESSENDPOINT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROCESSENDPOINT$28);
            }
            target.set(processEndpoint);
        }
    }
    
    /**
     * Unsets the "processEndpoint" element
     */
    public void unsetProcessEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSENDPOINT$28, 0);
        }
    }
    
    /**
     * Gets the "initMessageNamespaceURI" element
     */
    public java.lang.String getInitMessageNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITMESSAGENAMESPACEURI$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "initMessageNamespaceURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetInitMessageNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INITMESSAGENAMESPACEURI$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "initMessageNamespaceURI" element
     */
    public boolean isSetInitMessageNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITMESSAGENAMESPACEURI$30) != 0;
        }
    }
    
    /**
     * Sets the "initMessageNamespaceURI" element
     */
    public void setInitMessageNamespaceURI(java.lang.String initMessageNamespaceURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITMESSAGENAMESPACEURI$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITMESSAGENAMESPACEURI$30);
            }
            target.setStringValue(initMessageNamespaceURI);
        }
    }
    
    /**
     * Sets (as xml) the "initMessageNamespaceURI" element
     */
    public void xsetInitMessageNamespaceURI(org.apache.xmlbeans.XmlAnyURI initMessageNamespaceURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INITMESSAGENAMESPACEURI$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(INITMESSAGENAMESPACEURI$30);
            }
            target.set(initMessageNamespaceURI);
        }
    }
    
    /**
     * Unsets the "initMessageNamespaceURI" element
     */
    public void unsetInitMessageNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITMESSAGENAMESPACEURI$30, 0);
        }
    }
    
    /**
     * Gets the "initOperationSOAPAction" element
     */
    public java.lang.String getInitOperationSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITOPERATIONSOAPACTION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "initOperationSOAPAction" element
     */
    public org.apache.xmlbeans.XmlString xgetInitOperationSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITOPERATIONSOAPACTION$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "initOperationSOAPAction" element
     */
    public boolean isSetInitOperationSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITOPERATIONSOAPACTION$32) != 0;
        }
    }
    
    /**
     * Sets the "initOperationSOAPAction" element
     */
    public void setInitOperationSOAPAction(java.lang.String initOperationSOAPAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITOPERATIONSOAPACTION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITOPERATIONSOAPACTION$32);
            }
            target.setStringValue(initOperationSOAPAction);
        }
    }
    
    /**
     * Sets (as xml) the "initOperationSOAPAction" element
     */
    public void xsetInitOperationSOAPAction(org.apache.xmlbeans.XmlString initOperationSOAPAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITOPERATIONSOAPACTION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INITOPERATIONSOAPACTION$32);
            }
            target.set(initOperationSOAPAction);
        }
    }
    
    /**
     * Unsets the "initOperationSOAPAction" element
     */
    public void unsetInitOperationSOAPAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITOPERATIONSOAPACTION$32, 0);
        }
    }
    
    /**
     * Gets the "isChainedBefore" element
     */
    public java.lang.String getIsChainedBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCHAINEDBEFORE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isChainedBefore" element
     */
    public org.apache.xmlbeans.XmlString xgetIsChainedBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISCHAINEDBEFORE$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "isChainedBefore" element
     */
    public boolean isSetIsChainedBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCHAINEDBEFORE$34) != 0;
        }
    }
    
    /**
     * Sets the "isChainedBefore" element
     */
    public void setIsChainedBefore(java.lang.String isChainedBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCHAINEDBEFORE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCHAINEDBEFORE$34);
            }
            target.setStringValue(isChainedBefore);
        }
    }
    
    /**
     * Sets (as xml) the "isChainedBefore" element
     */
    public void xsetIsChainedBefore(org.apache.xmlbeans.XmlString isChainedBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISCHAINEDBEFORE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISCHAINEDBEFORE$34);
            }
            target.set(isChainedBefore);
        }
    }
    
    /**
     * Unsets the "isChainedBefore" element
     */
    public void unsetIsChainedBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCHAINEDBEFORE$34, 0);
        }
    }
    
    /**
     * Gets the "previousTaskId" element
     */
    public java.lang.String getPreviousTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIOUSTASKID$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "previousTaskId" element
     */
    public org.apache.xmlbeans.XmlString xgetPreviousTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIOUSTASKID$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "previousTaskId" element
     */
    public boolean isSetPreviousTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSTASKID$36) != 0;
        }
    }
    
    /**
     * Sets the "previousTaskId" element
     */
    public void setPreviousTaskId(java.lang.String previousTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIOUSTASKID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIOUSTASKID$36);
            }
            target.setStringValue(previousTaskId);
        }
    }
    
    /**
     * Sets (as xml) the "previousTaskId" element
     */
    public void xsetPreviousTaskId(org.apache.xmlbeans.XmlString previousTaskId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIOUSTASKID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREVIOUSTASKID$36);
            }
            target.set(previousTaskId);
        }
    }
    
    /**
     * Unsets the "previousTaskId" element
     */
    public void unsetPreviousTaskId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSTASKID$36, 0);
        }
    }
    
    /**
     * Gets the "claimAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getClaimAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(CLAIMACTION$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "claimAction" element
     */
    public boolean isSetClaimAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIMACTION$38) != 0;
        }
    }
    
    /**
     * Sets the "claimAction" element
     */
    public void setClaimAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType claimAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(CLAIMACTION$38, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(CLAIMACTION$38);
            }
            target.set(claimAction);
        }
    }
    
    /**
     * Appends and returns a new empty "claimAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewClaimAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(CLAIMACTION$38);
            return target;
        }
    }
    
    /**
     * Unsets the "claimAction" element
     */
    public void unsetClaimAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIMACTION$38, 0);
        }
    }
    
    /**
     * Gets the "revokeAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getRevokeAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(REVOKEACTION$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "revokeAction" element
     */
    public boolean isSetRevokeAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVOKEACTION$40) != 0;
        }
    }
    
    /**
     * Sets the "revokeAction" element
     */
    public void setRevokeAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType revokeAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(REVOKEACTION$40, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(REVOKEACTION$40);
            }
            target.set(revokeAction);
        }
    }
    
    /**
     * Appends and returns a new empty "revokeAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewRevokeAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(REVOKEACTION$40);
            return target;
        }
    }
    
    /**
     * Unsets the "revokeAction" element
     */
    public void unsetRevokeAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVOKEACTION$40, 0);
        }
    }
    
    /**
     * Gets the "saveAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getSaveAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(SAVEACTION$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveAction" element
     */
    public boolean isSetSaveAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEACTION$42) != 0;
        }
    }
    
    /**
     * Sets the "saveAction" element
     */
    public void setSaveAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType saveAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(SAVEACTION$42, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(SAVEACTION$42);
            }
            target.set(saveAction);
        }
    }
    
    /**
     * Appends and returns a new empty "saveAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewSaveAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(SAVEACTION$42);
            return target;
        }
    }
    
    /**
     * Unsets the "saveAction" element
     */
    public void unsetSaveAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEACTION$42, 0);
        }
    }
    
    /**
     * Gets the "completeAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType getCompleteAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(COMPLETEACTION$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "completeAction" element
     */
    public boolean isSetCompleteAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEACTION$44) != 0;
        }
    }
    
    /**
     * Sets the "completeAction" element
     */
    public void setCompleteAction(com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType completeAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().find_element_user(COMPLETEACTION$44, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(COMPLETEACTION$44);
            }
            target.set(completeAction);
        }
    }
    
    /**
     * Appends and returns a new empty "completeAction" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType addNewCompleteAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType)get_store().add_element_user(COMPLETEACTION$44);
            return target;
        }
    }
    
    /**
     * Unsets the "completeAction" element
     */
    public void unsetCompleteAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEACTION$44, 0);
        }
    }
    
    /**
     * Gets the "attachments" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachments getAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachments target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().find_element_user(ATTACHMENTS$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attachments" element
     */
    public boolean isSetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTS$46) != 0;
        }
    }
    
    /**
     * Sets the "attachments" element
     */
    public void setAttachments(com.intalio.bpms.workflow.taskManagementServices20051109.Attachments attachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachments target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().find_element_user(ATTACHMENTS$46, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().add_element_user(ATTACHMENTS$46);
            }
            target.set(attachments);
        }
    }
    
    /**
     * Appends and returns a new empty "attachments" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Attachments addNewAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Attachments target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Attachments)get_store().add_element_user(ATTACHMENTS$46);
            return target;
        }
    }
    
    /**
     * Unsets the "attachments" element
     */
    public void unsetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTS$46, 0);
        }
    }
}

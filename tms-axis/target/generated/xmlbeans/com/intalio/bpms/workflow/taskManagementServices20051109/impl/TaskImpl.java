/*
 * XML Type:  task
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.Task
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * An XML task(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public class TaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.Task
{
    
    public TaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "metadata");
    private static final javax.xml.namespace.QName INPUT$2 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "input");
    private static final javax.xml.namespace.QName OUTPUT$4 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "output");
    
    
    /**
     * Gets the "metadata" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "metadata" element
     */
    public void setMetadata(com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata)get_store().add_element_user(METADATA$0);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Appends and returns a new empty "metadata" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata addNewMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.TaskMetadata)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "input" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input getInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input)get_store().find_element_user(INPUT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "input" element
     */
    public void setInput(com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input)get_store().find_element_user(INPUT$2, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input)get_store().add_element_user(INPUT$2);
            }
            target.set(input);
        }
    }
    
    /**
     * Appends and returns a new empty "input" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input)get_store().add_element_user(INPUT$2);
            return target;
        }
    }
    
    /**
     * Gets the "output" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output getOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output)get_store().find_element_user(OUTPUT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "output" element
     */
    public void setOutput(com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output)get_store().find_element_user(OUTPUT$4, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output)get_store().add_element_user(OUTPUT$4);
            }
            target.set(output);
        }
    }
    
    /**
     * Appends and returns a new empty "output" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output)get_store().add_element_user(OUTPUT$4);
            return target;
        }
    }
    /**
     * An XML input(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class InputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.Task.Input
    {
        
        public InputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML output(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class OutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.Task.Output
    {
        
        public OutputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}

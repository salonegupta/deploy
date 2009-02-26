/*
 * An XML document type.
 * Localname: initRequest
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one initRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class InitRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument
{
    
    public InitRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INITREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "initRequest");
    
    
    /**
     * Gets the "initRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest getInitRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest)get_store().find_element_user(INITREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "initRequest" element
     */
    public void setInitRequest(com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest initRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest)get_store().find_element_user(INITREQUEST$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest)get_store().add_element_user(INITREQUEST$0);
            }
            target.set(initRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "initRequest" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest addNewInitRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest)get_store().add_element_user(INITREQUEST$0);
            return target;
        }
    }
    /**
     * An XML initRequest(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class InitRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest
    {
        
        public InitRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "taskId");
        private static final javax.xml.namespace.QName INPUT$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "input");
        private static final javax.xml.namespace.QName PARTICIPANTTOKEN$4 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "participantToken");
        private static final javax.xml.namespace.QName FORMURL$6 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "formUrl");
        
        
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
         * Gets the "input" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input getInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input)get_store().find_element_user(INPUT$2, 0);
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
        public void setInput(com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input input)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input)get_store().find_element_user(INPUT$2, 0);
                if (target == null)
                {
                    target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input)get_store().add_element_user(INPUT$2);
                }
                target.set(input);
            }
        }
        
        /**
         * Appends and returns a new empty "input" element
         */
        public com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input addNewInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input target = null;
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input)get_store().add_element_user(INPUT$2);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTTOKEN$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTICIPANTTOKEN$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTICIPANTTOKEN$4);
                }
                target.set(participantToken);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMURL$6, 0);
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
        public org.apache.xmlbeans.XmlString xgetFormUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMURL$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "formUrl" element
         */
        public boolean isSetFormUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMURL$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMURL$6);
                }
                target.setStringValue(formUrl);
            }
        }
        
        /**
         * Sets (as xml) the "formUrl" element
         */
        public void xsetFormUrl(org.apache.xmlbeans.XmlString formUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMURL$6);
                }
                target.set(formUrl);
            }
        }
        
        /**
         * Unsets the "formUrl" element
         */
        public void unsetFormUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMURL$6, 0);
            }
        }
        /**
         * An XML input(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
         *
         * This is a complex type.
         */
        public static class InputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.InitRequestDocument.InitRequest.Input
        {
            
            public InputImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}

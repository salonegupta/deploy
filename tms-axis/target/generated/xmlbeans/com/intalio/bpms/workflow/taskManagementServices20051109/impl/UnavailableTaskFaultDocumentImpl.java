/*
 * An XML document type.
 * Localname: unavailableTaskFault
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * A document containing one unavailableTaskFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/) element.
 *
 * This is a complex type.
 */
public class UnavailableTaskFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument
{
    
    public UnavailableTaskFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNAVAILABLETASKFAULT$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "unavailableTaskFault");
    
    
    /**
     * Gets the "unavailableTaskFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault getUnavailableTaskFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault)get_store().find_element_user(UNAVAILABLETASKFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unavailableTaskFault" element
     */
    public void setUnavailableTaskFault(com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault unavailableTaskFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault)get_store().find_element_user(UNAVAILABLETASKFAULT$0, 0);
            if (target == null)
            {
                target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault)get_store().add_element_user(UNAVAILABLETASKFAULT$0);
            }
            target.set(unavailableTaskFault);
        }
    }
    
    /**
     * Appends and returns a new empty "unavailableTaskFault" element
     */
    public com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault addNewUnavailableTaskFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault target = null;
            target = (com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault)get_store().add_element_user(UNAVAILABLETASKFAULT$0);
            return target;
        }
    }
    /**
     * An XML unavailableTaskFault(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
     *
     * This is a complex type.
     */
    public static class UnavailableTaskFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.UnavailableTaskFaultDocument.UnavailableTaskFault
    {
        
        public UnavailableTaskFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REASON$0 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "reason");
        private static final javax.xml.namespace.QName UNAVAILABLETASKID$2 = 
            new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "unavailableTaskId");
        
        
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
         * Gets array of all "unavailableTaskId" elements
         */
        public java.lang.String[] getUnavailableTaskIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNAVAILABLETASKID$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "unavailableTaskId" element
         */
        public java.lang.String getUnavailableTaskIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNAVAILABLETASKID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "unavailableTaskId" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetUnavailableTaskIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNAVAILABLETASKID$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "unavailableTaskId" element
         */
        public org.apache.xmlbeans.XmlString xgetUnavailableTaskIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNAVAILABLETASKID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "unavailableTaskId" element
         */
        public int sizeOfUnavailableTaskIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNAVAILABLETASKID$2);
            }
        }
        
        /**
         * Sets array of all "unavailableTaskId" element
         */
        public void setUnavailableTaskIdArray(java.lang.String[] unavailableTaskIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unavailableTaskIdArray, UNAVAILABLETASKID$2);
            }
        }
        
        /**
         * Sets ith "unavailableTaskId" element
         */
        public void setUnavailableTaskIdArray(int i, java.lang.String unavailableTaskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNAVAILABLETASKID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(unavailableTaskId);
            }
        }
        
        /**
         * Sets (as xml) array of all "unavailableTaskId" element
         */
        public void xsetUnavailableTaskIdArray(org.apache.xmlbeans.XmlString[]unavailableTaskIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unavailableTaskIdArray, UNAVAILABLETASKID$2);
            }
        }
        
        /**
         * Sets (as xml) ith "unavailableTaskId" element
         */
        public void xsetUnavailableTaskIdArray(int i, org.apache.xmlbeans.XmlString unavailableTaskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNAVAILABLETASKID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(unavailableTaskId);
            }
        }
        
        /**
         * Inserts the value as the ith "unavailableTaskId" element
         */
        public void insertUnavailableTaskId(int i, java.lang.String unavailableTaskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNAVAILABLETASKID$2, i);
                target.setStringValue(unavailableTaskId);
            }
        }
        
        /**
         * Appends the value as the last "unavailableTaskId" element
         */
        public void addUnavailableTaskId(java.lang.String unavailableTaskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNAVAILABLETASKID$2);
                target.setStringValue(unavailableTaskId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "unavailableTaskId" element
         */
        public org.apache.xmlbeans.XmlString insertNewUnavailableTaskId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(UNAVAILABLETASKID$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "unavailableTaskId" element
         */
        public org.apache.xmlbeans.XmlString addNewUnavailableTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNAVAILABLETASKID$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "unavailableTaskId" element
         */
        public void removeUnavailableTaskId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNAVAILABLETASKID$2, i);
            }
        }
    }
}

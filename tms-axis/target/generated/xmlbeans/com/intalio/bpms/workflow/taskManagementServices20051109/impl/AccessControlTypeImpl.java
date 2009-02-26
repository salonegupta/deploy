/*
 * XML Type:  accessControlType
 * Namespace: http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
 * Java type: com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType
 *
 * Automatically generated - do not modify.
 */
package com.intalio.bpms.workflow.taskManagementServices20051109.impl;
/**
 * An XML accessControlType(@http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/).
 *
 * This is a complex type.
 */
public class AccessControlTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intalio.bpms.workflow.taskManagementServices20051109.AccessControlType
{
    
    public AccessControlTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "user");
    private static final javax.xml.namespace.QName ROLE$2 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "role");
    private static final javax.xml.namespace.QName AUTHORIZED$4 = 
        new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "authorized");
    
    
    /**
     * Gets array of all "user" elements
     */
    public java.lang.String[] getUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USER$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "user" element
     */
    public java.lang.String getUserArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "user" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USER$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "user" element
     */
    public org.apache.xmlbeans.XmlString xgetUserArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "user" element
     */
    public int sizeOfUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$0);
        }
    }
    
    /**
     * Sets array of all "user" element
     */
    public void setUserArray(java.lang.String[] userArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userArray, USER$0);
        }
    }
    
    /**
     * Sets ith "user" element
     */
    public void setUserArray(int i, java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(user);
        }
    }
    
    /**
     * Sets (as xml) array of all "user" element
     */
    public void xsetUserArray(org.apache.xmlbeans.XmlString[]userArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userArray, USER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "user" element
     */
    public void xsetUserArray(int i, org.apache.xmlbeans.XmlString user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(user);
        }
    }
    
    /**
     * Inserts the value as the ith "user" element
     */
    public void insertUser(int i, java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(USER$0, i);
            target.setStringValue(user);
        }
    }
    
    /**
     * Appends the value as the last "user" element
     */
    public void addUser(java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$0);
            target.setStringValue(user);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "user" element
     */
    public org.apache.xmlbeans.XmlString insertNewUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(USER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "user" element
     */
    public org.apache.xmlbeans.XmlString addNewUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "user" element
     */
    public void removeUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$0, i);
        }
    }
    
    /**
     * Gets array of all "role" elements
     */
    public java.lang.String[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public java.lang.String getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "role" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "role" element
     */
    public org.apache.xmlbeans.XmlString xgetRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$2);
        }
    }
    
    /**
     * Sets array of all "role" element
     */
    public void setRoleArray(java.lang.String[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$2);
        }
    }
    
    /**
     * Sets ith "role" element
     */
    public void setRoleArray(int i, java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) array of all "role" element
     */
    public void xsetRoleArray(org.apache.xmlbeans.XmlString[]roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "role" element
     */
    public void xsetRoleArray(int i, org.apache.xmlbeans.XmlString role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts the value as the ith "role" element
     */
    public void insertRole(int i, java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ROLE$2, i);
            target.setStringValue(role);
        }
    }
    
    /**
     * Appends the value as the last "role" element
     */
    public void addRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$2);
            target.setStringValue(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    public org.apache.xmlbeans.XmlString insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ROLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public org.apache.xmlbeans.XmlString addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$2, i);
        }
    }
    
    /**
     * Gets the "authorized" element
     */
    public java.lang.String getAuthorized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorized" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthorized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORIZED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "authorized" element
     */
    public boolean isSetAuthorized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORIZED$4) != 0;
        }
    }
    
    /**
     * Sets the "authorized" element
     */
    public void setAuthorized(java.lang.String authorized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORIZED$4);
            }
            target.setStringValue(authorized);
        }
    }
    
    /**
     * Sets (as xml) the "authorized" element
     */
    public void xsetAuthorized(org.apache.xmlbeans.XmlString authorized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORIZED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHORIZED$4);
            }
            target.set(authorized);
        }
    }
    
    /**
     * Unsets the "authorized" element
     */
    public void unsetAuthorized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORIZED$4, 0);
        }
    }
}

package com.horstmann.violet.product.diagram.activity.nodes;

import com.horstmann.violet.product.diagram.activity.edges.ActivityTransitionEdge;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * The bean info for the ActivityNodeBeanInfo type.
 */
public class ActivityNodeBeanInfo extends SimpleBeanInfo
{
    /*
     * (non-Javadoc)
     *
     * @see java.beans.BeanInfo#getPropertyDescriptors()
     */
    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor nameDescriptor = new PropertyDescriptor("name", ActivityNode.class);
            nameDescriptor.setValue("priority", new Integer(0));

            return new PropertyDescriptor[]
            {
                nameDescriptor,
            };
        }
        catch (IntrospectionException exception)
        {
            return null;
        }
    }
}

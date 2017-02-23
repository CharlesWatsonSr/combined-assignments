package com.cooksys.ftd.assignments.collections.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FatCat implements Capitalist {

    public FatCat(String name, int salary) {
        
    }

    public FatCat(String name, int salary, FatCat owner) {
        
    }

    /**
     * @return the name of the capitalist
     */
    @Override
    public String getName() {
        return getName();
    }

    /**
     * @return the salary of the capitalist, in dollars
     */
    @Override
    public int getSalary() {
        return getSalary();
    }

    /**
     * @return true if this element has a parent, or false otherwise
     */
    @Override
    public boolean hasParent() {
        if (hasParent())
        	return true;
		return false;
    }

    /**
     * @return the parent of this element, or null if this represents the top of a hierarchy
     */
    @Override
    public FatCat getParent() {
        if (getParent () == null)
        	return null;
        return getParent();
    }
}

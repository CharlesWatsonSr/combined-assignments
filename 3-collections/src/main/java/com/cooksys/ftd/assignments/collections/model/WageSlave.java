package com.cooksys.ftd.assignments.collections.model;

import static org.junit.Assert.assertEquals;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WageSlave implements Capitalist {

    private int salary;
	private String name;
	private FatCat owner;

	public WageSlave(String name, int salary) {
    	this.name = name;
    	this.salary = salary;
    }

    public WageSlave(String name, int salary, FatCat owner) {
    	this.name = name;
    	this.salary = salary;
    	this.owner = owner;
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
        if (hasParent() == true)
        	return true;
        else return false;
    }

    /**
     * @return the parent of this element, or null if this represents the top of a hierarchy
     */
    @Override
    public FatCat getParent() {
        if (getParent() == null)
        	return null;
        return getParent();
    }
}

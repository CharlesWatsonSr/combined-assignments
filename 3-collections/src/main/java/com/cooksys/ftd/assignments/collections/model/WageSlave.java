package com.cooksys.ftd.assignments.collections.model;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

public class WageSlave implements Capitalist {
	HashSet<Capitalist> hsS = new HashSet<>();
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
    	return this.name;
    }

    /**
     * @return the salary of the capitalist, in dollars
     */
    @Override
    public int getSalary() {
    	return this.salary;
    }

    /**
     * @return true if this element has a parent, or false otherwise
     */
    @Override
    public boolean hasParent() {
    	return (this.owner != null);
    }

    /**
     * @return the parent of this element, or null if this represents the top of a hierarchy
     */
    @Override
    public FatCat getParent() {
        	return this.owner;
    }
    
    @Override
    public boolean equals(Object other) {
    	if (!(other instanceof WageSlave))
    		return false;
    	
    	WageSlave that = (WageSlave) other;
    	return (this.name == that.name && this.salary == that.salary && this.owner == that.owner);
    }
    
}

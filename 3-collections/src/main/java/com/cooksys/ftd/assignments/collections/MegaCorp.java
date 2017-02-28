package com.cooksys.ftd.assignments.collections;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.RequestingUserName;

import com.cooksys.ftd.assignments.collections.hierarchy.Hierarchy;
import com.cooksys.ftd.assignments.collections.model.Capitalist;
import com.cooksys.ftd.assignments.collections.model.FatCat;
import com.cooksys.ftd.assignments.collections.model.WageSlave;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MegaCorp implements Hierarchy<Capitalist, FatCat> {
	
	HashSet<Capitalist> hs = new HashSet<Capitalist>();
	
	/**
     * Adds a given element to the hierarchy.
     * <p>
     * If the given element is already present in the hierarchy,
     * do not add it and return false
     * <p>
     * If the given element has a parent and the parent is not part of the hierarchy,
     * add the parent and then add the given element
     * <p>
     * If the given element has no parent but is a Parent itself,
     * add it to the hierarchy
     * <p>
     * If the given element has no parent and is not a Parent itself,
     * do not add it and return false
     *
     * @param capitalist the element to add to the hierarchy
     * @return true if the element was added successfully, false otherwise
     */
    @Override
    public boolean add(Capitalist capitalist) {
    	if(capitalist == null) {
    		return false;
    	}
        
    	if (this.has(capitalist))
    		return false;
    	
    	if (capitalist.hasParent() && !this.has(capitalist.getParent())) {
    		this.add(capitalist.getParent());
    		this.add(capitalist);
    	}
    	FatCat fc;
		if (capitalist instanceof FatCat) {
    		fc = (FatCat) capitalist;
    	if (!fc.hasParent() && !this.getChildren(fc).isEmpty())
    		this.add(fc);
    	}
		
		return false;
    }

    	
    

    /**
     * @param capitalist the element to search for
     * @return true if the element has been added to the hierarchy, false otherwise
     */
    @Override
    public boolean has(Capitalist capitalist) {
    		return hs.contains(capitalist);
    	
        
    }

    /**
     * @return all elements in the hierarchy,
     * or an empty set if no elements have been added to the hierarchy
     */
    @Override
    public Set<Capitalist> getElements() {
		Iterator<Capitalist> itr = hsM.iterator();
		while(itr.hasNext()){
	          System.out.println(itr.next());
	        }
		
    	return this.getElements();
        
    }

    /**
     * @return all parent elements in the hierarchy,
     * or an empty set if no parents have been added to the hierarchy
     */
    @Override
    public Set<FatCat> getParents() {
        return this.getParents();
    }

    
    /**
     * @param fatCat the parent whose children need to be returned
     * @return all elements in the hierarchy that have the given parent as a direct parent,
     * or an empty set if the parent is not present in the hierarchy or if there are no children
     * for the given parent
     */
    @Override
    public Set<Capitalist> getChildren(FatCat fatCat) {
    	if (fatCat == null)
        return this.getChildren(fatCat);//??
		return hs;
    }

    /**
     * @return a map in which the keys represent the parent elements in the hierarchy,
     * and the each value is a set of the direct children of the associate parent, or an
     * empty map if the hierarchy is empty.
     */
    @Override
    public Map<FatCat, Set<Capitalist>> getHierarchy() {
        return this.getHierarchy();
    }

    /**
     * @param capitalist
     * @return the parent chain of the given element, starting with its direct parent,
     * then its parent's parent, etc, or an empty list if the given element has no parent
     * or if its parent is not in the hierarchy
     */
    @Override
    public List<FatCat> getParentChain(Capitalist capitalist) {
        
		return this.getParentChain(capitalist);
    }
}

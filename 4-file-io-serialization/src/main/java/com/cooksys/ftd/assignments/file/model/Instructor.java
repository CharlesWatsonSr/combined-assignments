package com.cooksys.ftd.assignments.file.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Instructor {
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    @XmlElement
    void setContact(Contact contact) {
        this.contact = contact;
    }
}

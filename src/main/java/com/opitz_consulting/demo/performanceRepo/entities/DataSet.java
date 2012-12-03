package com.opitz_consulting.demo.performanceRepo.entities;

import org.jboss.resteasy.annotations.providers.NoJackson;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Mapped(namespaceMap = @XmlNsMap(jsonName = "atom", namespace = "http://www.w3.org/2005/Atom"))
@XmlRootElement
@NoJackson
@XmlAccessorType(XmlAccessType.NONE)
public class DataSet {
    @XmlElement
    private int clients;
    @XmlElement
    private Date recorded;

    public DataSet() {

    }

    public DataSet(int clients, Date recorded) {
        this.clients = clients;
        this.recorded = recorded;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public void setRecorded(Date recorded) {
        this.recorded = recorded;
    }

    public int getClients() {
        return clients;
    }

    public Date getRecorded() {
        return recorded;
    }
}

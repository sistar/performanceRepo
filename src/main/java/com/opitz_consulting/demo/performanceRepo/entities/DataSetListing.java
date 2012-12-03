package com.opitz_consulting.demo.performanceRepo.entities;

import org.jboss.resteasy.annotations.providers.NoJackson;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "listing")
@NoJackson
public class DataSetListing {
    @XmlElement(name = "DataSets")
    private List<DataSet> DataSets;

    public DataSetListing() {
    }

    public DataSetListing(List<DataSet> DataSets) {
        this.DataSets = DataSets;
    }


    public List<DataSet> getDataSets() {
        return DataSets;
    }
}
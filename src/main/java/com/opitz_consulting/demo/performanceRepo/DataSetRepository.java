package com.opitz_consulting.demo.performanceRepo;

import com.opitz_consulting.demo.performanceRepo.entities.DataSet;
import com.opitz_consulting.demo.performanceRepo.entities.DataSetListing;

import java.util.ArrayList;
import java.util.Date;

public class DataSetRepository {
    public DataSetListing findAllOrderedByName() {
        final ArrayList<DataSet> dataSets = new ArrayList<DataSet>();
        dataSets.add(new DataSet(10, new Date()));
        return new DataSetListing(dataSets);

    }
}

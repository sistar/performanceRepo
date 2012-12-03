package com.opitz_consulting.demo.performanceRepo.resources;

import com.opitz_consulting.demo.performanceRepo.DataSetRepository;
import com.opitz_consulting.demo.performanceRepo.entities.DataSet;
import com.opitz_consulting.demo.performanceRepo.entities.DataSetListing;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/datasets")
@RequestScoped
public class DataSetResource {
    @Inject
    private DataSetRepository repository;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DataSetListing listAllMembers() {
        return repository.findAllOrderedByName();
    }

    //@AddLinks
    //@LinkResource(value = DataSet.class)
    @GET
    @Path("/{id}")
    public DataSet getDataset(@PathParam("id") String id) {
        return new DataSet(500, new Date());
    }


}

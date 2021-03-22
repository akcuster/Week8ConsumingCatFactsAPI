package com.acuster.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.herokuapp.catfact.CatFact;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CatFactDao {

    String getCatFact(){
        Client client = ClientBuilder.newClient();
        //TODO read in the uri from a properties file
        WebTarget target =
                client.target("https://cat-fact.herokuapp.com/facts/591f98803b90f7150a19c229");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        CatFact fact = null;
        try {
            fact = mapper.readValue(response, CatFact.class);
        } catch (JsonProcessingException e) {
            //TODO set up logging and write this to log
            e.printStackTrace();
        }
        return fact.getText();
    }
}

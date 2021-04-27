package com.facens.poo.sistemas.sistemas.repositories;

import java.util.ArrayList;
import java.util.List;
import com.facens.poo.sistemas.sistemas.entities.Client;

import org.springframework.stereotype.Component;


@Component
public class ClientRepository {
    
    public List<Client> getClients(){
        Client c1 = new Client();
        c1.setId(1l);
        c1.setName("Lia Leme");
        c1.setAddress("Rua Abolição, 423");

        Client c2 = new Client();
        c2.setId(2l);
        c2.setName("Rodrigo Alfredo");
        c2.setAddress("Rua Pompeia, 43");

        List<Client> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        
        return list;         
    }
}

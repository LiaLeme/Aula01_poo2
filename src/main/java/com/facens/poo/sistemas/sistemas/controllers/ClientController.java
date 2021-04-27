package com.facens.poo.sistemas.sistemas.controllers;



import java.util.List;

import com.facens.poo.sistemas.sistemas.dto.ClientDTO;
import com.facens.poo.sistemas.sistemas.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getClient(){
        List <ClientDTO> list = service.getClients();
        return ResponseEntity.ok().body(list);
    }
}

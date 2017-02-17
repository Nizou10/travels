package com.travels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travels.dao.ClientRepository;
import com.travels.entities.Client;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAllClients() {
        // TODO Auto-generated method stub
        return clientRepository.findAll();
    }

}

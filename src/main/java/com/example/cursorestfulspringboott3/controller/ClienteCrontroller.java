package com.example.cursorestfulspringboott3.controller;

import java.util.List;

import com.example.cursorestfulspringboott3.model.Cliente;
import com.example.cursorestfulspringboott3.repositorio.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteCrontroller {

    @Autowired // Faz o new sozinho
    private ClienteRepository repositorio;
    
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return repositorio.getAllClientes();
    }

    @GetMapping("/clientes/{codigo}")
    public Cliente getCliente(@PathVariable int codigo){
        return repositorio.getClienteByCodigo(codigo);
    }

    @PostMapping("/clientes")
    public Cliente salvar(@RequestBody Cliente cliente){
        return repositorio.save(cliente);
    }
}
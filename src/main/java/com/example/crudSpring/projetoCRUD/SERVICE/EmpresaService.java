package com.example.crudSpring.projetoCRUD.SERVICE;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    //método construtor da classe EmpresaService
    //criando uma ligação com a Classe EmpresaRepository
    public EmpresaService(EmpresaRepository oEmpresaRepository){
    empresaRepository = oEmpresaRepository;
    
    }

}

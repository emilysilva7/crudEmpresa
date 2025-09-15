package com.example.crudSpring.projetoCRUD.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    //método construtor da classe EmpresaService
    //criando uma ligação com a Classe EmpresaRepository
    public EmpresaService(EmpresaRepository oEmpresaRepository){
    empresaRepository = oEmpresaRepository;
    
    }
public List<Empresa> findAll(){
    return empresaRepository.findAll();
}//select * from empresa

public Empresa cadastrarEmpresa(Empresa dadosEmpresa){
return empresaRepository.save(dadosEmpresa); 

}
public void deletarEmpresa(Empresa dadosEmpresa){
    empresaRepository.delete(dadosEmpresa);
}




public Optional<Empresa> buscaPorId(Long id){
    return empresaRepository.findById(id);
}
public Empresa editarDadoEmpresa(Long id, Empresa dadosAtualizados){
    return null;  
}


    //SELECTS OU INSERTS OU ALTER TABLE OU DELETE
    //SELECT * FROM EMPRESA 
    //where nome_empresa = ? (SELECT REALIZA LISTAGEM DE DADOS)
    //retoma todos o dados da empresa (*-Tudo da tabela)

}

package com.example.crudSpring.projetoCRUD.CONTROLLER;

import org.springframework.stereotype.Controller;

import com.example.crudSpring.projetoCRUD.SERVICE.EmpresaService;

@Controller
public class EmpresaController {
private final EmpresaService empresaService;
public EmpresaController(EmpresaService ligEmpresaService){
EmpresaService ligcaoEmpresaService;
this.empresaService = ligEmpresaService;
}

}


    


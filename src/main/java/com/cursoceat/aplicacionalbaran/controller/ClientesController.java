package com.cursoceat.aplicacionalbaran.controller;

import com.cursoceat.aplicacionalbaran.modell.Cliente;
import com.cursoceat.aplicacionalbaran.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClientesController {
    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping("/albaran")
    public String mostrarAlbaran(Model model) {
        model.addAttribute("clientes", new Cliente());
        return "albaran";
    }

    @GetMapping("/crud")
    public String mostrarCrud(Model model) {
        model.addAttribute("clientes", clientesRepository.findAll());
        return "crud";
    }

    @PostMapping("/crud")
    public String guardarClientes(@ModelAttribute Cliente cliente, Model model) {
        clientesRepository.save(cliente);
        return "redirect:/crud";
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio"; // archivo inicio.html
    }


}

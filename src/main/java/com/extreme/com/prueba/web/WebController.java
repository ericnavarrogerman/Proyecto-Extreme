package com.extreme.com.prueba.web;

import com.extreme.com.prueba.domain.Pqr;
import com.extreme.com.prueba.domain.Usuario;
import com.extreme.com.prueba.servicio.PqrService;
import com.extreme.com.prueba.servicio.UsuarioService;
import com.extreme.com.prueba.util.EncriptarPassword;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
public class WebController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PqrService pqrService;

    @GetMapping("/")
    public String inicio( Model model,@AuthenticationPrincipal User user) {

        var pqrs =pqrService.getAllPQR();

        model.addAttribute("totalPQR",pqrs.size());
        model.addAttribute("pqrs",pqrs);

        return "index";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Usuario usuario, Errors errores){

        if(errores.hasErrors()){
            return "index";
        }
        usuarioService.save(EncriptarPassword.encriptarPassword(usuario));
        return "redirect:/";
    }

    @PostMapping("/crearPQR")
    public String newPqr(@Valid Pqr pqr , Errors errores){

        System.out.println(errores);
        System.out.println(pqr);
        if(errores.hasErrors()){
            return "addpqr";
        }
        pqrService.save(pqr);

        return "redirect:/";
    }

}

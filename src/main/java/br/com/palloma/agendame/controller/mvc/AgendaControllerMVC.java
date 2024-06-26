package br.com.palloma.agendame.controller.mvc;

import br.com.palloma.agendame.model.reuniao.DadosAtualizarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosCadastrarReuniao;
import br.com.palloma.agendame.services.ReuniaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/agenda")
public class AgendaControllerMVC {

    @Autowired
    ReuniaoService reuniaoService;

    @GetMapping("/cadastrareuniao")
    public String paginaCadastrarCompromisso() {
        return "agenda/cadastrareuniao";
    }

    @GetMapping()
    public String paginaMostraAgenda(Model model) {

        model.addAttribute("lista_reunioes",reuniaoService.buscarListaReunioes());
        System.out.println(model);
        return "agenda/mostraragenda";
    }

    @GetMapping(value = "{id}/{action}")
    public String verReuniao (@PathVariable int id, @PathVariable String action, Model model) {

        model.addAttribute("reuniao",reuniaoService.mostrarReuniao(id));
        System.out.println(model);

        if(action.equals("visualizar")) {
            return "agenda/atualizareuniao";
        }

        return "agenda/mostrarreuniao";
    }

    @PostMapping("/cadastrareuniao")
    public String cadastraReuniao(DadosCadastrarReuniao dados) {
        System.out.println("cadastrar reuniao " + dados);

        reuniaoService.cadastrarReuniao(dados);

        System.out.println("Reunião Cadastrada");
        return "redirect:/agenda";
    }

    @PutMapping("/atualizareuniao")
    public void alterar(@RequestBody DadosAtualizarReuniao dados, Model model) {
        System.out.println();
    }

}

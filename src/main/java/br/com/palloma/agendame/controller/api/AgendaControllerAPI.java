package br.com.palloma.agendame.controller.api;

import br.com.palloma.agendame.model.reuniao.DadosAtualizarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosCadastrarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosMostrarReuniao;
import br.com.palloma.agendame.model.reuniao.Reuniao;
import br.com.palloma.agendame.services.ReuniaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("agendame/api")
public class AgendaControllerAPI {

    @Autowired
    ReuniaoService reuniaoService;

    @RequestMapping(value = "/reunioes", method = RequestMethod.POST)
    public ResponseEntity<HttpEntity> castrarReuniao (@RequestBody DadosCadastrarReuniao dados) {
        System.out.println("Processando reuniao com " + dados.nomeEmpresa());
        reuniaoService.cadastrarReuniao(dados);

        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/reunioes/{id}", method = RequestMethod.GET)
    public ResponseEntity<DadosMostrarReuniao> mostrarReuniao (@PathVariable int id) {

        System.out.println("Buscando reuniao " + id);
        DadosMostrarReuniao dados = reuniaoService.mostrarReuniao(id);
        if (dados != null) {
            return ResponseEntity.ok(dados);
        } else {
            System.out.println("Reuniao " + id + " não existe");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @RequestMapping(value = "/reunioes/listagem", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Reuniao>> listarReunioes () {

        System.out.println("Listando Reuniões");
        ArrayList<Reuniao> reunioes = new ArrayList<>(reuniaoService.buscarListaReunioes());

        return ResponseEntity.ok(reunioes);
    }

//    @RequestMapping(value = "/reunioes/atualizar", method = RequestMethod.PUT)
//    public ResponseEntity<HttpStatus> atualizarReuniao (@RequestBody DadosAtualizarReuniao dados) {
//
//        if (reuniaoService.atualizarReuniao(dados)) {
//            return ResponseEntity.ok(HttpStatus.CREATED);
//        } else {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }

    @RequestMapping(value = "/reunioes/{id}/excluir", method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> excluirReuniao(@PathVariable int id) {

        if (reuniaoService.excluirReuniao(id)) {
            return ResponseEntity.ok(HttpStatus.ACCEPTED);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

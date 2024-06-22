package br.com.palloma.agendame.services;

import br.com.palloma.agendame.model.reuniao.DadosAtualizarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosCadastrarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosMostrarReuniao;
import br.com.palloma.agendame.model.reuniao.Reuniao;
import br.com.palloma.agendame.repository.ReuniaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReuniaoService {

    @Autowired
    ReuniaoRepository reuniaoRepository;

    public void cadastrarReuniao(DadosCadastrarReuniao dados) {
        reuniaoRepository.salvarReuniao(dados);
    }

    public ArrayList<Reuniao> buscarListaReunioes() {
        return reuniaoRepository.listaReunioes();
    }

    public DadosMostrarReuniao mostrarReuniao(int id) {
        DadosMostrarReuniao reuniao = reuniaoRepository.buscarReuniao(id);

        if (reuniao != null) {
            return reuniao;
        }
        return null;
    }

    public Boolean atualizarReuniao(DadosAtualizarReuniao dados) {
        if(reuniaoRepository.atualizarReuniao(dados)) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean excluirReuniao(int id) {
        if (reuniaoRepository.excluirReuniao(id)) {
            return true;
        } else {
            return false;
        }
    }
}

package br.com.palloma.agendame.services;

import br.com.palloma.agendame.model.reuniao.DadosReuniao;
import br.com.palloma.agendame.model.reuniao.Reuniao;
import br.com.palloma.agendame.repository.ReuniaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReuniaoService {

    @Autowired
    ReuniaoRepository reuniaoRepository;

    public void cadastrarReuniao(DadosReuniao dados) {
        reuniaoRepository.salvarReuniao(dados);
    }

    public Object buscarListaReunioes() {
        return reuniaoRepository.listaReunioes();
    }

    public Object visualizarReuniao(int id) {
        Reuniao reuniao = reuniaoRepository.buscarReuniao(id);

        if (!(reuniao == null)) {
            return reuniao;
        }
        return null;
    }
}

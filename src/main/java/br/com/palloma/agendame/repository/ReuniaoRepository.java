package br.com.palloma.agendame.repository;

import br.com.palloma.agendame.model.reuniao.DadosAtualizarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosCadastrarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosMostrarReuniao;
import br.com.palloma.agendame.model.reuniao.Reuniao;
import br.com.palloma.agendame.utils.DataHora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@Repository
public class ReuniaoRepository {

    HashMap<Integer,Reuniao> reunioes = new HashMap<>();

    @Autowired
    DataHora dataHora;

    public void salvarReuniao(DadosCadastrarReuniao dados) {

        Random random = new Random();
        int id = random.nextInt(100000);

        reunioes.put(id, new Reuniao(id, dataHora.dataHoraAtual(), dados));

        System.out.println("Reunião com " + dados.nomeEmpresa() + " marcada");
        System.out.println(reunioes);
    }

    public DadosMostrarReuniao buscarReuniao (int id) {

        if (reunioes.containsKey(id)) {
            return new DadosMostrarReuniao(reunioes.get(id));
        }
        return null;
    }

    public ArrayList<Reuniao> listaReunioes() {
        return new ArrayList<>(reunioes.values());
    }

//    public boolean atualizarReuniao (DadosAtualizarReuniao dados) {
//       if (reunioes.containsKey(dados.id())) {
//           Reuniao reuniao = new Reuniao(dados.id())
//           reunioes.replace(dados.id(), reuniao);
//           return true;
//       } else {
//           return false;
//       }
//    }

    public Boolean excluirReuniao (int id) {
        if (reunioes.containsKey(id)) {
            reunioes.remove(id);
            return true;
        } else {
            return false;
        }
    }
}

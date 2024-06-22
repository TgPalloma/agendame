package br.com.palloma.agendame.repository;

import br.com.palloma.agendame.model.reuniao.DadosCadastrarReuniao;
import br.com.palloma.agendame.model.reuniao.DadosMostrarReuniao;
import br.com.palloma.agendame.model.reuniao.Reuniao;
import br.com.palloma.agendame.utils.DataHora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class ReuniaoRepository {

    List<Reuniao> reunioes = new ArrayList<>();

    @Autowired
    DataHora dataHora;

    public void salvarReuniao(DadosCadastrarReuniao dados) {

        Random random = new Random();
        int id = random.nextInt(100000);

        reunioes.add(new Reuniao(id, dataHora.dataHoraAtual(), dados));

        System.out.println("Reunião com " + dados.nomeEmpresa() + " marcada");
        System.out.println(reunioes);
    }

    public DadosMostrarReuniao buscarReuniao (int id) {
        for (Reuniao reuniao : reunioes) {
            if (reuniao.getId().equals(id)) {
                return new DadosMostrarReuniao(reuniao);
            }
        }
        return null;
    }

    public ArrayList<Reuniao> listaReunioes() {
        return new ArrayList<Reuniao>(reunioes);
    }
}

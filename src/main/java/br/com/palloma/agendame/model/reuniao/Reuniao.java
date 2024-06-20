package br.com.palloma.agendame.model.reuniao;

import lombok.Getter;

@Getter
public class Reuniao {
    private Integer id;
    private String dataHoraCriacao;
    private String data;
    private String hora;
    private String nomeEmpresa;
    private Integer numeroColaboradores;
    private String nomeConvidado;
    private String cargoConvidado;
    private String telefone;
    private String emailConvidado;
    private String vendedor;
    private String fonteLead;
    private String informacoes;

    public Reuniao (int id, String dataHoraCriacao , DadosReuniao dadosReuniao) {
        this.id = id;
        this.dataHoraCriacao = dataHoraCriacao;
        this.data = dadosReuniao.data();
        this.hora = dadosReuniao.hora();
        this.nomeEmpresa = dadosReuniao.nomeEmpresa();
        this.numeroColaboradores = dadosReuniao.numeroColaboradores();
        this.nomeConvidado = dadosReuniao.nomeConvidado();
        this.cargoConvidado = dadosReuniao.cargoConvidado();
        this.telefone = dadosReuniao.telefone();
        this.emailConvidado = dadosReuniao.emailConvidado();
        this.vendedor = dadosReuniao.vendedor();
        this.fonteLead = dadosReuniao.fonteLead();
        this.informacoes = dadosReuniao.informacoes();
    }

    @Override
    public String toString() {
        return "Reuniao{" +
                "id=" + id +
                ", dataHoraCriacao='" + dataHoraCriacao + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", numeroColaboradores=" + numeroColaboradores +
                ", nomeConvidado='" + nomeConvidado + '\'' +
                ", cargoConvidado='" + cargoConvidado + '\'' +
                ", telefone='" + telefone + '\'' +
                ", emailConvidado='" + emailConvidado + '\'' +
                ", vendedor='" + vendedor + '\'' +
                ", fonteLead='" + fonteLead + '\'' +
                ", informacoes='" + informacoes + '\'' +
                '}';
    }
}

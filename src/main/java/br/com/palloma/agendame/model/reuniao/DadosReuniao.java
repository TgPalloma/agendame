package br.com.palloma.agendame.model.reuniao;

import lombok.NonNull;

public record DadosReuniao(
        String dataHoraCriacao,
        String data,
        String hora,
        String nomeEmpresa,
        Integer numeroColaboradores,
        String nomeConvidado,
        String cargoConvidado,
        String telefone,
        String emailConvidado,
        String vendedor,
        String fonteLead,
        String informacoes
) {
//        public DadosReuniao (Reuniao reuniao) {
//                this.dataHoraCriacao = reuniao.getDataHoraCriacao();
//                this.data = reuniao.getData();
//                this.hora = reuniao.getHora();
//                this.nomeEmpresa = reuniao.getNomeEmpresa();
//                this.numeroColaboradores = reuniao.getNumeroColaboradores();
//                this.nomeConvidado = reuniao.getNomeConvidado();
//                this.cargoConvidado = reuniao.getCargoConvidado();
//                this.emailConvidado = reuniao.getEmailConvidado();
//                this.vendedor = reuniao.getVendedor();
//                this.fonteLead = reuniao.getFonteLead();
//                this.informacoes = reuniao.getInformacoes();
//        }
}

package br.com.palloma.agendame.model.reuniao;

public record DadosMostrarReuniao(
        Integer id,
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
){


    public DadosMostrarReuniao(Reuniao reuniao) {
        this(
                reuniao.getId(),
                reuniao.getDataHoraCriacao(),
                reuniao.getData(),
                reuniao.getHora(),
                reuniao.getNomeEmpresa(),
                reuniao.getNumeroColaboradores(),
                reuniao.getNomeConvidado(),
                reuniao.getCargoConvidado(),
                reuniao.getTelefone(),
                reuniao.getEmailConvidado(),
                reuniao.getVendedor(),
                reuniao.getFonteLead(),
                reuniao.getInformacoes()
        );
    }
}
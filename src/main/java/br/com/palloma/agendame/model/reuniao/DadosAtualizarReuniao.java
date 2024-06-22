package br.com.palloma.agendame.model.reuniao;

public record DadosAtualizarReuniao(
        Integer id,
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

    public DadosAtualizarReuniao(Reuniao reuniao) {
        this(
            reuniao.getId(),
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

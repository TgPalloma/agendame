package br.com.palloma.agendame.model.reuniao;

public record DadosCadastrarReuniao(
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
}

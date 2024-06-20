package br.com.palloma.agendame.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DataHora {

    public String dataHoraAtual() {
        return formatarData(LocalDateTime.parse(LocalDateTime.now().toString()));
    }

    public String formatarData (LocalDateTime data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        return dtf.format(data);
    }

}

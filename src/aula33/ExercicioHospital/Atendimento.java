package aula33.ExercicioHospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Atendimento {
    private LocalDate data;
    private String descricao;

    public Atendimento(LocalDate data, String descricao){
        this.data = data;
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }


    public LocalDate getData(){
        return data;

    }
    @Override
    public String toString() {
       DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String data = formatoBr.format(this.data);
       String retorno = "Data: "+data;
       retorno += "\nInformações: "+descricao;
       return retorno;
    }
}

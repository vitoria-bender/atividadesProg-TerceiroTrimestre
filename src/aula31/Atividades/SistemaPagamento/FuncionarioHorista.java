package aula31.Atividades.SistemaPagamento;

import aula31.Atividades.SistemaPagamento.Funcionario;

public class FuncionarioHorista extends Funcionario {
    private float valorHora;
    private float horasT;
    private float diasT;

    public FuncionarioHorista(){
        setNome("Rebeca");
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getHorasT() {
        return horasT;
    }

    public void setHorasT(float horasT) {
        this.horasT = horasT;
    }

    public float getDiasT() {
        return diasT;
    }

    public void setDiasT(float diasT) {
        this.diasT = diasT;
    }

    @Override
    public double calcularSalario() {
        return (valorHora*horasT)*diasT;
    }
}

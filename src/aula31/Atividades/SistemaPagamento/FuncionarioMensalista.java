package aula31.Atividades.SistemaPagamento;

import aula31.Atividades.SistemaPagamento.Funcionario;

public class FuncionarioMensalista extends Funcionario {

    public FuncionarioMensalista(){
        setNome("Jonas");
    }

    private float valorMensal;

    public float getValorMensal(){
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }

   @Override
    public double calcularSalario(){
        return valorMensal;
   }
}

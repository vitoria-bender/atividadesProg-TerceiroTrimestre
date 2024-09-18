package aula31.Atividades.SistemaPagamento;

import aula31.Atividades.SistemaPagamento.Funcionario;

public class FuncionarioComissionado extends Funcionario {

  public FuncionarioComissionado(){
      setNome("Carlos");
  }

    private float VendasMes;
    private float valorVenda;

    public float getVendasMes() {
        return VendasMes;
    }

    public void setVendasMes(int vendasMes) {
        VendasMes = vendasMes;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public double calcularSalario(){
        return (valorVenda*VendasMes);
    }

}

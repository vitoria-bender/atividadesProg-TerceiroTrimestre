package aula31.Atividades.SistemaPagamento;

public interface Pagamento {
    public static void main(String[] args) {
        FuncionarioComissionado c1 = new FuncionarioComissionado();
        c1.setValorVenda(100);
        c1.setVendasMes(15);
        System.out.println(c1);

        FuncionarioMensalista m1 = new FuncionarioMensalista();
        m1.setValorMensal(2000);
        System.out.println(m1);

        FuncionarioHorista h1 = new FuncionarioHorista();
        h1.setValorHora(12);
        h1.setHorasT(8);
        h1.setDiasT(22);
        System.out.println(h1);
    }
}

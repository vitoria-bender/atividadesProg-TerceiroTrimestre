package aula31.ExemploHerancaMult;

public interface VeiculoCarga extends Veiculo{
    void carregar();
    void descarregar();
    int obterCapacidadeCarga();
}

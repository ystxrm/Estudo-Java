public class Pessoa {
    private String nome;
    private Integer idade;

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
/*
 * Metodos Acessores:
 * Public:Indica que qualquer um pode acessar a elemento.
 * 
 * Private:Somente a classe pode acessar.
 * 
 * Protected: Indica que a classe e seus filhos podem acessar.
 * 
 * Defaut: Indica que a classe e seus filhos e a classe no mesmo peckage, podem
 * acessar.
 */

/*
 * : sao metados que a classe disponibiliza para quem quiser usar
 * do lado de fora para poder modificar ou obter informações desses atributos,
 * so que esses metados podem passar por alguma validação internamente dentro da
 * classe.
 */
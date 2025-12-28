
//#region Atributos
public class Carros {
    private String Modelo;
    private Integer ano;
    private String cor;
    // #endregion

    // #region Getters e Setters
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    //#endregion

    //#region Construtores
    public Carros() {

    }

    public Carros(String modelo, Integer ano, String cor) {
        this.Modelo = modelo;
        this.ano = ano;
        this.cor = cor;
//#endregion
    }
}

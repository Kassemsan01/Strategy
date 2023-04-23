public class Disciplina {
    private ICalcMedia Nota;

    public double m;
    private String nome;
    private double a;
    private double b;
    public String situacao;

    public ICalcMedia getNota(){
        return Nota;
    }

    public void setNota(ICalcMedia Nota){
        Nota = Nota;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(double m){
        this.nome = nome;

    public double getM(){
        return m;
    }

    public void setM(double m){
        this.m = m;
    }

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b = b;
    }

    public String getSituacao(){
        return situacao;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }

    public double calcular(){
        return this.Nota.calculo(this.a, this.b);
    }




}

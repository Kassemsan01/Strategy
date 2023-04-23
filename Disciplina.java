public class Disciplina {
    private ICalcMedia Nota;

    public double m;
    private String nome;
    private double a;
    private double b;
    public String situacao;

    public void setNota(ICalcMedia Nota){
        this.Nota = Nota;
    }

    public ICalcMedia getNota(){
        return Nota;
    }

    public void setM(double m){
        this.m = m;
    }

    public double getM(){
        return m;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getA(){
        return a;
    }

    public void setB(double b){
        this.b = b;
    }

    public double getB(){
        return b;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }

    public String getSituacao(){
        return situacao;
    }

    public double calcular()
    {
        return this.Nota.calculoMedia(this.a, this.b);
    }


}

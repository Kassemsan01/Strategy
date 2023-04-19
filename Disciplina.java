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




}

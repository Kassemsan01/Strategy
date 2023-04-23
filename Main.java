public class Main{
    public class public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();
        //Geometrica calculoo = new Geometrica();

        Disciplina d = new Disciplina(calculo);

        d.setNome("Padroes de desenvolvimento");
        d.setA(10); d.setB(5);
        d.calculoMedia();
        System.out.println(
            String.format("P1:%.2f  P2:%.2f  Media:%.2f  Situação: %s",
            d.getA(), d.getB(), d.getM(), d.getSituacao()));


    }
}
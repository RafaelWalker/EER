package EER;

/**
 *
 * @author Rafael Walker
 */

public class Eer {
   
   private double peso;
   private double altura;
   private int idade;
   private int pa;
   private double imc;
   
   public Eer(double peso, double altura, int idade, int pa, double imc){
       setPeso(peso);
       setAltura(altura);
       setIdade(idade);
       setPa(pa);
       setImc(imc);
   
   }
   
   public Eer(){}

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
   
    
}

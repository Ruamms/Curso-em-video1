

package aula04;


public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic", "vermelha", 0.4f);
        c1.status();
        
        System.out.println("");
        
        Caneta c2 = new Caneta("kk", "Azul", 0.5f);
        c2.status();
        
        //c1.setModelo("Bic");
        //c1.setPonta(0.5f);
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}

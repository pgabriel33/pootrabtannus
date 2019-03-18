package exer8;

public class exer8 {
    public static void main(String args[]) {
    
    numerocomplexo complex = new numerocomplexo(2,3,3,4);
    numerocomplexo complex1 = new numerocomplexo(2,3,5,5);
    numerocomplexo complex2 = new numerocomplexo(3,6,2,6);
    numerocomplexo complex3 = new numerocomplexo(3,6,2,6);
    numerocomplexo complex4 = new numerocomplexo(0,0,0,0);
    numerocomplexo complex5 = new numerocomplexo(0,0,0,0);
    complex.adicao();
    complex1.subtracao(); 
    complex2.multiplicacao();
    complex3.divisao();
    complex4.inicializa(8,7);
    complex4.eIgual();
    complex4.imprimenumero();
   
    }    
}
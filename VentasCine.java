import java.util.Scanner;
public class VentasCine {
 
    public static void main(String[] args ) {
                
	    double edad,monto;
	
	    char pago;
         
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();
        SalaCine sala1 = new SalaCine();
        //SalaCine sala2 = new SalaCine();
        SalaCine sala3 = new SalaCine();

	    System.out.println(" Ingrese su edad ");
	    Scanner teclado = new Scanner(System.in);
	    edad=sc.nextFloat();
	    System.out.println(" Ingrese el modo de pago : \n [E] = Efectivo o [T] = Tarjeta ");
	    pago = teclado.next().charAt(0);
 
        switch (pago) {
            case 'E':
                if(edad >=55){
                    monto= (( 15 * 0.18) + 15) ;
                    System.out.println("el precio correspondiente (Adulto Mayores) es $" + monto + " dolares "); }
 
                else if(edad < 55 && edad >= 18 ){
                    monto = ( 30 * 0.18) + 30  ;
                    System.out.println("el precio correspondiente (Adulto) es de $" + monto + " dolares ");}
 
                else if (edad >= 1 && edad < 12 ){
                    monto = ( 10 * 0.18) + 10 ;
                    System.out.println("el precio correspondiente (Menores de 12 años) es de $" + monto + " dolares ");}
 
                else if (edad >= 12 && edad <= 17 ){
                    monto = ( 20 * 0.18) + 20 ;
                    System.out.println("el precio correspondiente (De 13 para 17 años) es de $" + monto + " dolares ");}
                break;
 
            case 'T':
                if ( edad >=55){
                    monto = ( 15 * 0.035)* 0.18 + 15;
                    System.out.println("el precio correspondiente (Adulto Mayores) es de $" + monto + " dolares "); }
 
                else if (edad < 55 && edad >= 18 ){
                    monto = ( 30 * 0.035)* 0.18 + 30;
                    System.out.println("el precio correspondiente (Adulto) es de $" + monto + " dolares ");}
                else if (edad >= 1 && edad < 12 ){
                    monto = ( 10 * 0.035)*0.18 + 10 ;
                    System.out.println("el precio correspondiente (Menores de 12 años) es de $" + monto + " dolares ");}
                else if (edad >= 12 && edad <= 17 ){
                    monto = ( 20 * 0.035)*0.18 + 20 ;
                    System.out.println("el precio correspondiente (De 13 para 17 años) es de $" + monto + " dolares ");}
                default:
        }
        System.out.println("-----------------------------------------------------------------");
        sala1.setTituloPelicula("Actualmente se esta presentando el rey leon");
        sala3.setTituloPelicula("Se presentara la pelicula Venom");
        sala1.setAsientos(20);

        arbol.insertar (2,"aire acondicionado apagado");
        arbol.insertar(3,"pantalla en espera");
        arbol.insertar(1,"aire acondicionado encendido");
        arbol.insertar(1,"pantalla en proyeccion ");
        arbol.insertar(3,"aire acondicionado encendido");
        arbol.insertar(2,"pantalla apagada");
        arbol.insertar(1, sala1.getTituloPelicula());
        arbol.insertar(1, "se estan utilizando " + sala1.getAsientos() + " Asientos en la sala");
        arbol.insertar(2,"sala en mantenimiento"); 
        arbol.insertar(3,"sala en espera");
        arbol.insertar(3, sala3.getTituloPelicula());
 
        arbol.recorrer(arbol.raiz);
    }
}
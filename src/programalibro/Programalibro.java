/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programalibro;

/**
 *
 * @author Milagros
 */
public class Programalibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro(123, "Historia de un loco", "John Katzenbach", 599, "drama");
        
        Libro libro2 = new Libro(456, "Al calor del verano", "John Katzenbach", 80, "drama");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if(libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("El libro 1 tiene mas paginas");
        } else {
            System.out.println("El libro 2 tiene mas paginas");
        }
    }
    
}

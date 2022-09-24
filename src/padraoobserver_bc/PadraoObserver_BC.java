/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padraoobserver_bc;

/**
 *
 * @author onezi
 */
public class PadraoObserver_BC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BC bc = new BC();
        Crefisa crf = new Crefisa(bc);
        BB bb = new BB(bc);
        
        bc.registrarObserver(bb);
        bc.registrarObserver(crf);
        
        bc.mudancaValores(5.5f, 12f, 8f);
        
    }
    
}

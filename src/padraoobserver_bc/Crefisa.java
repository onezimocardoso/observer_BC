/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoobserver_bc;

/**
 *
 * @author onezi
 */
public class Crefisa implements Observer{
    
    private float cotacao;
    private float ipca;
    private float selic;
    private BC bc;
    
    public Crefisa(BC bc){
        this.bc = bc;
    }
    
    public void update(float cotacao,float ipca, float selic){
        this.cotacao=cotacao;
        this.ipca=ipca;
        this.selic=selic;
        display();
    }
    
    public void display(){
        System.out.println("CREFISA!!!!\n");
        System.out.println("IPCA: "+ipca);
        System.out.println("SELIC: "+selic);
        System.out.println("COTACAO: "+cotacao);
    }
}

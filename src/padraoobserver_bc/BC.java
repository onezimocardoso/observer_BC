/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoobserver_bc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onezi
 */
import java.util.ArrayList;
public class BC implements Subject{
    
    //variáveis de instância
    
    private List<Observer> observers;
    private float cotacao;
    private float ipca;
    private float selic;
    
    public BC(){
        observers = new ArrayList<Observer>();
    }
    
    public void teste(){
        System.out.println("TESTE!!!");
    }
    
    public void registrarObserver(Observer o){
        observers.add(o);
    }
    
    public void removerObserver(Observer o){
        observers.remove(o);
    }
    
    public void notificarObserver(){
       /* for(int i = 0; i<=observers.size();i++)
        {
            observers[i].update(cotacao,ipca,selic);
        } */
        for(Observer obj:observers){
            obj.update(cotacao, ipca, selic);
        }
    }
    
    public void mudancaValores(float cotacao, float ipca, float selic){
        this.cotacao=cotacao;
        this.ipca=ipca;
        this.selic=selic;
        notificarObserver();
    }
}

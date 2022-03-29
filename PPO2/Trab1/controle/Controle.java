package controle;


import java.util.*;
public class Controle
{
    private Comandos[] c = new Comandos[6];
    private ArrayList<Comandos> log = new ArrayList<Comandos>();
    
    public void setCommand(Comandos c, int i){
        this.c[i] = c;
    }
    
    public void pressionar(int i){
        this.c[i].execute();
        log.add(c[i]);
    }
    
    public void executa(Comandos c){
        c.execute();
        log.add(c);
        
    }    
    
    public void showLog(){
        for (Comandos c : log)
            System.out.println(c.toString());
    }    
    
    public void replay(){
        for (Comandos c : log)
            c.execute();
    }    
    
    
}

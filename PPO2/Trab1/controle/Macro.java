package controle;


import java.util.*;
public class Macro implements Comandos
{
    
    private ArrayList<Comandos> macro= new ArrayList<Comandos>(); 
    
    public void add(Comandos c){macro.add(c);}
    
    public void execute(){
        for (Comandos c : macro){
            c.execute();
        }     
    }    
    
}

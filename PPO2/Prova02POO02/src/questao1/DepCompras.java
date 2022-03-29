package questao1;

public class DepCompras
{
    private Command command;
    private Estoque est;
    
    public DepCompras(Estoque est) {
    	super();
    	this.est = est;
    }	
    
    public void setCommand(Command c){
        this.command = c;
    }
    
    public void pedidoReposicao(){
    	if (est.getQtd()< 20) {
    		command.execute();
			
		}else {
			command.fail();
		}
    }


     
    
}

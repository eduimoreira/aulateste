/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosalario;

/**
 *
 * @author eduim
 */
public class CalcularSalario {
    private Double jsalario;
    private Double jsalhora;
    private Double jinss;
    private Double conta;
    private Double liquido;
    
            

    public Double getJsalario() {
        
        
        return jsalario;
    }

    public Double getLiquido() {
        
        if(jsalario*jsalhora<=1751.81){
            Double desconto= (jsalario*jsalhora)*0.08; 
            
            liquido= (jsalario*jsalhora)-desconto;
        }
        
        else if(jsalario*jsalhora<=2919.72){
            Double desconto= (jsalario*jsalhora)*0.09; 
            liquido= (jsalario*jsalhora)-desconto;
        }
        
        else if(jsalario*jsalhora<=5840){
            Double desconto= (jsalario*jsalhora)*0.11;
            liquido= (jsalario*jsalhora)-desconto;
                     
            
        }else{
            Double desconto= (5840*0.11);
             liquido= (jsalario*jsalhora)-desconto;
        
        
        
        }
                return liquido;
    }

    public void setLiquido(Double liquido) {
        this.liquido = liquido;
    }

    public Double getConta() {
        conta = jsalario*jsalhora;
        return conta;
    }

    public void setConta(Double conta) {
        this.conta = conta;
    }

    public void setJsalario(Double jsalario) {
        this.jsalario = jsalario;
    }

    public Double getJsalhora() {
        return jsalhora;
    }

    public void setJsalhora(Double jsalhora) {
        this.jsalhora = jsalhora;
    }

    public Double getJinss() {
        return jinss;
    }

    public void setJinss(Double jinss) {
        this.jinss = jinss;
    }
    
    
}

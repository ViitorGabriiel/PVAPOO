/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.atividade2;

/**
 *
 * @author vitor
 */
public class ControlCalculator {
    boolean primary = true;
    private Double total;
    
    public ControlCalculator(){
        total = 0.00;
    }
    
    public Double realizaOperation(EnumOperation operation, Double value){
        
        if(operation.equals(EnumOperation.add)){
            total += value;
        }
        if(operation.equals(EnumOperation.subtraction)){
            if(primary){
                total = value;
                primary = false;
            }else{
                total = total - value;
                primary = true;
            }
        }
        if(operation.equals(EnumOperation.multiplication)){
            if(primary){
                total = value;
                primary = false;
            }else{
                total = total * value;
                primary = true;
            }
        }
        if(operation.equals(EnumOperation.division)){
            if(primary){
                total = value;
                primary = false;
            }else{
                total = total / value;
                primary = true;
            }
        }
        
        if(operation.equals(EnumOperation.elevation)){
            if(primary){
                total = value;
                primary = false;
            }else{
                total = Math.pow(total, value);
                primary = true;
            }
        }
        
        return total;
    }
    
    public Double getTotal(){
        return total;
    }
    
    public void zerar(){
        total = 0.00;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar velasco
 */
public class Supervisor {
    private String nombre;
    private String fabrica;

    public Supervisor(String nombre, String fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
    }
    
    public String FirmaHojaDiaria(String firma){
        return "firma";
    }
    
    public String FirmaHojaSemanal(String firma){
        return "firma";
    }
    
}

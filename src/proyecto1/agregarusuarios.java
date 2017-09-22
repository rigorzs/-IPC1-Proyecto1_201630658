/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Juan RigobertoZuñiga
 */
public class agregarusuarios {
    private String nombre;
    private String contra;
    private String usuario;
    private int saldo;
    private int montomax;
    private int estilo;
    private String empresa;
    
    public agregarusuarios(){
        nombre="";
        contra="";
        usuario="";
        saldo=0;
        montomax=0;
        empresa="";
        estilo=0;
    }
    public agregarusuarios(String n,String c,String u,int sa,int mo,int est,String emp){
        nombre=n;
        contra=c;
        usuario=u;
        saldo=sa;
        montomax=mo;
        empresa=emp;
        estilo=est;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setcontra(String contra){
        this.contra=contra;
    }
    public String getcontra(){
        return contra;
    }
    public void setusuario(String usuario){
        this.usuario=usuario;
    }
    public String getusuario(){
        return usuario;
    }
    public void setsaldo(int saldo){
        this.saldo=saldo;
    }
    public int getsaldo(){
        return saldo;
    }
    public void setmontomax(int montomax ){
        this.montomax=montomax;
    }
    public int getmontomax(){
        return montomax;
    }
    public void setempresa(String empresa){
        this.empresa=empresa;
    }
    public String getempresa(){
        return empresa;
    }
    public void setestilo(int estilo){
        this.estilo=estilo;
    }
    public int getestilo(){
        return estilo;
    }

}

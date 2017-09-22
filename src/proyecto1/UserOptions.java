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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.util.Date;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class UserOptions extends JFrame{
    JButton estado;
    JButton transferencia;
    JButton retiro;
    JButton reimpresion;
    JButton graficas;
    JButton cerraruser;
    JLabel est;
    JLabel transfe;
    JLabel ret;
    JLabel reimpre;
    JLabel graph;
    JPanel panel;
    int estiloo,poc;
    public UserOptions(int estilo,int pocicion){
        this.estiloo=estilo;
        this.poc=pocicion;
        setTitle("Usuario");
        //configuracin de botones
        estado=new JButton();
        estado.setText("");
        estado.setBounds(50, 50, 50, 30);
        estado.setBackground(Color.WHITE);
        estado.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                EstadoCuenta a=new EstadoCuenta(estiloo,poc);
                a.setVisible(true);
            }
        });
        
        transferencia=new JButton();
        transferencia.setText("");
        transferencia.setBounds(50, 100, 50, 30);
        transferencia.setBackground(Color.WHITE);
        transferencia.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llamar a jframe de asignar denominacion de billetes
                
            }
        });
        
        retiro=new JButton();
        retiro.setText("");
        retiro.setBounds(50, 150,50, 30);
        retiro.setBackground(Color.WHITE);
        retiro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llamar a jframe de asignar denominacion de billetes
                
            }
        });
        
        reimpresion=new JButton();
        reimpresion.setText("");
        reimpresion.setBounds(50, 200, 50, 30);
        reimpresion.setBackground(Color.WHITE);
        reimpresion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llamar a jframe de asignar denominacion de billetes
                
            }
        });
        
        graficas=new JButton();
        graficas.setText("");
        graficas.setBounds(50, 250, 50, 30);
        graficas.setBackground(Color.WHITE);
        graficas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llamar a jframe de asignar denominacion de billetes
                
            }
        });
        
        cerraruser=new JButton();
        cerraruser.setText("Cerrar Cesion");
        cerraruser.setBounds(50, 300, 300, 50);
        cerraruser.setBackground(Color.white);
        cerraruser.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                login jk=new login();
                //aca regersa al jframe de login y oculta el jframe acutal
                setVisible(false);
                jk.setVisible(true);
                //adminoptions.setVisible(false);
               // login.setVisible(true);
            }
        });
        //dconfiguracion de labels
        Font f = new Font( "Microsoft PhagsPa",Font.ITALIC,15 );
        Font g = new Font( "Calibri",Font.BOLD,15 );
        est=new JLabel();
        est.setText("Estado de Cuenta");
        if(this.estiloo==1){
          est.setFont(f);  
        }else{
        est.setFont(g);}
        est.setBounds(130, 50, 200, 30);
        
        transfe=new JLabel();
        transfe.setText("Transferencias");
        if(this.estiloo==1){
          transfe.setFont(f);  
        }else{
        transfe.setFont(g);}
        transfe.setBounds(130, 100, 100, 30);
        
        ret=new JLabel();
        ret.setText("Retiros");
        if(this.estiloo==1){
          ret.setFont(f);  
        }else{
        ret.setFont(g);}
        ret.setBounds(130, 150, 50, 30);
        
        reimpre=new JLabel();
        reimpre.setText("Reimprecion");
        if(this.estiloo==1){
          reimpre.setFont(f);  
        }else{
        reimpre.setFont(g);}
        reimpre.setBounds(130, 200, 100, 30);
        
        graph=new JLabel();
        graph.setText("Graficas");
        if(this.estiloo==1){
          graph.setFont(f);  
        }else{
        graph.setFont(g);}
        graph.setBounds(130, 250, 100, 30);
        //fin de configuracion de labels
        //agregacion al panel
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(estado);
        panel.add(transferencia);
        panel.add(retiro);
        panel.add(reimpresion);
        panel.add(graficas);
        panel.add(cerraruser);
        panel.add(est);
        panel.add(transfe);
        panel.add(ret);
        panel.add(reimpre);
        panel.add(graph);
        if(this.estiloo==1){
            panel.setBackground(Color.GRAY);
            
        }else{
            panel.setBackground(Color.getHSBColor(108, 75, 42));
        }
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //fin de agregacion alpanel
        
    }
}
class EstadoCuenta extends JFrame{
    JLabel nombre;
    JLabel saldo;
    JLabel fecha;
    JButton regresar;
    JLabel hora;
    JLabel nom;
    JLabel fec;
    JLabel sal;
    JLabel ho;
    JPanel panel;
    int est,pos;
    EstadoCuenta(int estilo,int pocicion){
       est=estilo;
       pos=pocicion;
       setTitle("Estado De Cuenta");
       //inicio configuracion de labels
       Font f = new Font( "Microsoft PhagsPa",Font.ITALIC,25 );
        Font g = new Font( "Calibri",Font.BOLD,25 );
        nombre=new JLabel();
        nombre.setText("Nombre");
        if(this.est==1){
          nombre.setFont(f);  
        }else{
        nombre.setFont(g);}
        nombre.setBounds(50, 50, 200, 30);
        
        saldo=new JLabel();
        saldo.setText("Saldo");
        if(this.est==1){
          saldo.setFont(f);  
        }else{
        saldo.setFont(g);}
        saldo.setBounds(50, 100, 200, 30);
        
        fecha=new JLabel();
        fecha.setText("Fecha");
        if(this.est==1){
          fecha.setFont(f);  
        }else{
        fecha.setFont(g);}
        fecha.setBounds(50, 150, 200, 30); 
        
        hora=new JLabel();
        hora.setText("Hora");
        if(this.est==1){
          hora.setFont(f);  
        }else{
        hora.setFont(g);}
        hora.setBounds(50, 200, 200, 30);
       //fin de configuracion de labels
       //configuracion de labels para obteer nombres y saldo etc
        nom=new JLabel();
        nom.setText(Proyecto1.usuarios[pos].getnombre());
        if(this.est==1){
          nom.setFont(f);  
          nom.setForeground(Color.green);
        }else{
        nom.setFont(g);}
        nom.setBounds(150, 50, 200, 30);
        
        sal=new JLabel();
        sal.setText(Integer.toString(Proyecto1.usuarios[pos].getsaldo()));
        if(this.est==1){
          sal.setFont(f);
          sal.setForeground(Color.green);
        }else{
        sal.setFont(g);}
        sal.setBounds(150, 100, 200, 30);
        Date dia = new Date(System.currentTimeMillis()); 

        fec=new JLabel();
        fec.setText("Fecha");
        fec.setText(dia.getDay() + "/" +dia.getMonth() + "/"+(dia.getYear()+1900) ) ;
        if(this.est==1){
          fec.setFont(f);
          fec.setForeground(Color.green);
        }else{
        fec.setFont(g);}
        fec.setBounds(150, 150, 200, 30); 
        
        ho=new JLabel();
        ho.setText(Long.toString(dia.getTime()));
        if(this.est==1){
          ho.setFont(f);  
          ho.setForeground(Color.green);
        }else{
        ho.setFont(g);}
        ho.setBounds(150, 200, 200, 30);
       //fin de configuracion de labels para obtener nombres saldos etc
       //configuracin de boton para regresar
        regresar=new JButton();
        regresar.setText("Inicio");
        regresar.setBounds(20, 10, 80, 20);
        regresar.setBackground(Color.white);
        regresar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            setVisible(false);     
            UserOptions jk= new UserOptions(est,pos);
            jk.setVisible(true);
            }
        });
       //fin configuracion de boton para regresar
       //agregacion al jpanel
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(nombre);
        panel.add(saldo);
        panel.add(fecha);
        panel.add(hora);
        panel.add(regresar);
        panel.add(nom);
        panel.add(sal);
        panel.add(fec);
        panel.add(ho);
      
        if(this.est==1){
            panel.setBackground(Color.GRAY);
            
        }else{
            panel.setBackground(Color.getHSBColor(108, 75, 42));
        }
        add(panel);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //fin de agregacion al jpanel
    }
}

class Retiros extends JFrame{
    
    public Retiros(){
        
    }
}

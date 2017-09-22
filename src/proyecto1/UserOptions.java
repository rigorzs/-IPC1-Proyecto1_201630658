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
    int estilo,poc;
    public UserOptions(int estilo,int pocicion){
        this.estilo=estilo;
        this.poc=pocicion;
        setTitle("Usuario");
        //configuracin de botones
        estado=new JButton();
        estado.setText("");
        estado.setBounds(50, 50, 50, 30);
        estado.setBackground(Color.WHITE);
        estado.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llamar a jframe de asignar denominacion de billetes
                
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
        if(this.estilo==1){
          est.setFont(f);  
        }else{
        est.setFont(g);}
        est.setBounds(130, 50, 200, 30);
        
        transfe=new JLabel();
        transfe.setText("Transferencias");
        if(this.estilo==1){
          transfe.setFont(f);  
        }else{
        transfe.setFont(g);}
        transfe.setBounds(130, 100, 100, 30);
        
        ret=new JLabel();
        ret.setText("Retiros");
        if(this.estilo==1){
          ret.setFont(f);  
        }else{
        ret.setFont(g);}
        ret.setBounds(130, 150, 50, 30);
        
        reimpre=new JLabel();
        reimpre.setText("Reimprecion");
        if(this.estilo==1){
          reimpre.setFont(f);  
        }else{
        reimpre.setFont(g);}
        reimpre.setBounds(130, 200, 100, 30);
        
        graph=new JLabel();
        graph.setText("Graficas");
        if(this.estilo==1){
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
        if(this.estilo==1){
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
    
    EstadoCuenta(int estilo,int pocicion){
        
    }
}

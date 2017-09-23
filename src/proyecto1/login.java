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


public class login extends JFrame{
    
    JButton login;
    static final int ancho=300, alto=300;
    JTextField textfield1;
    JPasswordField clave;
    JLabel nombre;
    JLabel contra;   
    JPanel panelogin;
    int pos,est;
    private String administrador="ipc1Admin";
    private String cont="aux1";
    
    public login(){
        //titulo del jframe
        setTitle("Log-in");
        //fin titulo de jframe
        //isertar una etiqueta y configurarla
        nombre=new JLabel();
        Font f = new Font( "Microsoft PhagsPa",Font.ITALIC,20 );
        nombre.setText("Usuario");
        nombre.setFont(f);
        nombre.setBounds(10,30,220,40);
        //fin etiqueta
        //insetar un textbox
        textfield1=new JTextField();
 	textfield1.setBounds(75,80,250,50);
        //fin textbox
        contra=new JLabel();
        contra.setText("contrse;a");
        contra.setFont(f);
        contra.setBounds(10,130,220,40);
        //contra.setBounds(alto, alto, WIDTH, HEIGHT);
        //insertar un pin o contrase;a
        clave=new JPasswordField();
        clave.setBounds(75, 180, 250, 50);
        //fin insertar clave y contrase;a
        //insertar un boton y configurarlo con un evento;
        login=new JButton();
        login.setText("Aceptar");
        login.setBounds(150, 250, 100, 40);
        login.setBackground(Color.white);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             //JOptionPane.showMessageDialog(null, "usuario no encontrado");
             if(administrador.equals(textfield1.getText())&& cont.equals(clave.getText())){ 
                  setVisible(false);
                  JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                  textfield1.setText("");
                  clave.setText("");
                  AdminOptions jk=new AdminOptions();
                  jk.setVisible(true);
               }else{
              for(int i=0;i<=30;i++){
                 // System.out.println(Proyecto1.usuarios[i].getnombre()+Proyecto1.usuarios[i].getcontra()+Proyecto1.usuarios[i].getusuario());
                  if(Proyecto1.usuarios[i].getusuario().equals(textfield1.getText()) && Proyecto1.usuarios[i].getcontra().equals(clave.getText())){
                      setVisible(false);
                      JOptionPane.showMessageDialog(null, "Bienvenido "+Proyecto1.usuarios[i].getnombre());
                      pos=i;
                      est=Proyecto1.usuarios[i].getestilo();
                      UserOptions pq;
                      pq = new UserOptions(est,pos);
                      pq.setVisible(true);
                  }
                //  System.out.println(Proyecto1.usuarios[i].getnombre()+Proyecto1.usuarios[i].getcontra()+Proyecto1.usuarios[i].getusuario());
              }
             }
              textfield1.setText("");
              clave.setText("");
             } 
        });
        //fin insetar boton y configuracion del evento
        //llamada de los componenetes anteriores para mostrarlos en el jframe
        panelogin=new JPanel();
        panelogin.setLayout(null);
        panelogin.add(nombre);
        panelogin.add(textfield1);
        panelogin.add(contra);
        panelogin.add(clave);
        panelogin.add(login);
        //panelogin.setBackground(Color.getHSBColor(187, 28, 68));
        panelogin.setBackground(Color.lightGray);
        //panelogin.setBackground(Color.getHSBColor(320, 57, 77));
        add(panelogin);
        setLocation(300, 100);
        this.setSize(400,400);
	this.setVisible(true);
        
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //fin de la llamada de los componentes al jframe
    }
}

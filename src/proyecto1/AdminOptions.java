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
public class AdminOptions extends JFrame{
    JButton denoadmin;
    JButton modadmin;
    JButton ceradmin;
    JPanel adminoptions;
    //final JFrame login;
    public AdminOptions(){
       /* login=ola1;
        login.setVisible(false);*/
        setTitle("Opciones de Administrador");
        denoadmin=new JButton();
        denoadmin.setText("Asignar Denominacion");
        denoadmin.setBounds(100, 50, 300, 50);
        denoadmin.setBackground(Color.WHITE);
        denoadmin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llamar a jframe de asignar denominacion de billetes
                setVisible(false);
                new denominacion(AdminOptions.this).setVisible(true);
            }
        });
        
        modadmin=new JButton();
        modadmin.setText("Modulo De Administracion");
        modadmin.setBounds(100, 130, 300, 50);
        modadmin.setBackground(Color.WHITE);
        modadmin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aca llama al jframe para ingresar mas usuarios
                setVisible(false);
                moduloadmin jk=new moduloadmin();
                jk.setVisible(true);
            
            }
        });
        
        ceradmin=new JButton();
        ceradmin.setText("Cerrar Cesion");
        ceradmin.setBounds(100, 250, 300, 50);
        ceradmin.setBackground(Color.white);
        ceradmin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                login jk=new login();
                //aca regersa al jframe de login y oculta el jframe acutal
                setVisible(false);
                jk.setVisible(true);
                //adminoptions.setVisible(false);
               // login.setVisible(true);
            }
        });
        
        adminoptions=new JPanel();
        adminoptions.add(ceradmin);
        adminoptions.setLayout(null);
        adminoptions.add(denoadmin);
        adminoptions.add(modadmin);
        adminoptions.setBackground(new Color(15,181,231));
        add(adminoptions);
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }      
}
//case para jframe que contedra en dise;o de 
class denominacion extends JFrame{
    JLabel billete;
    JLabel deno;
    JLabel b50;
    JLabel b100;
    JLabel b200;
    JTextField t50;
    JTextField t100;
    JTextField t200;
    JButton Asignar;
    JButton Regresar;
    JPanel Deno;
    int N50,N100,N200,Total;
    final JFrame AdminOptions;
    public denominacion(JFrame ola2){
        AdminOptions=ola2;
        AdminOptions.setVisible(false);
        setTitle("Asignacion de Denominacion");
        //inicio configuracion de labelbillete
        billete=new JLabel();
        Font f = new Font( "Microsoft PhagsPa",Font.ITALIC,20);
        billete.setFont(f);
        billete.setText("No. Billetes");
        billete.setBounds(20, 30, 220, 40);
        //fin configuracion de etiqueta 
        //configuacion textfields
        deno=new JLabel();
        deno.setFont(f);
        deno.setText("Denominacion");
        deno.setBounds(200, 30, 220, 40);
        //configuracion de labels de billetes
        b50=new JLabel();
        b50.setFont(f);
        b50.setText("Q.50.00 ");
        b50.setBounds(200, 100, 220, 40);
        
        b100=new JLabel();
        b100.setFont(f);
        b100.setText("Q.100.00");
        b100.setBounds(200, 200, 220, 40);
        
        b200=new JLabel();
        b200.setFont(f);
        b200.setText("Q.200.00");
        b200.setBounds(200, 300, 220, 40);
        //fin labels billetes
        //configuracion de textfields
        t50=new JTextField();
        t50.setBounds(20, 100,110, 40);
        
        t100=new JTextField();
        t100.setBounds(20, 200,110, 40);
        
        t200=new JTextField();
        t200.setBounds(20, 300,110, 40);
        //finc configuracion de texfields
        //configracion de botones
        Regresar=new JButton();
        Regresar.setText("Inicio");
        Regresar.setBounds(20, 10, 80, 20);
        Regresar.setBackground(Color.white);
        Regresar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            setVisible(false);     
            AdminOptions.setVisible(true);        
            }
        });
        
        Asignar=new JButton();
        Asignar.setText("Aceptar");
        Asignar.setBounds(130, 350, 100, 40);
        Asignar.setBackground(Color.white);
        Asignar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               N50=Integer.parseInt(t50.getText());
               N100=Integer.parseInt(t100.getText());
               N200=Integer.parseInt(t200.getText());
               Proyecto1.cant50=N50;
               Proyecto1.cant100=N100;
               Proyecto1.cant200=N200;
               Total=(N50*50)+(N100*100)+(N200*200);
               Proyecto1.motocajeto=Total;
               t50.setText("");
               t100.setText("");
               t200.setText("");
               setVisible(false);     
                AdminOptions.setVisible(true);
              //aca se agrega la configuacion global de el cajero a una variable
               
            }
        });
        
        //fin coonfiguracion de botones
        Deno=new JPanel();
        Deno.setLayout(null);
        Deno.add(billete);
        Deno.add(t50);
        Deno.add(t100);
        Deno.add(t200);
        Deno.add(deno);
        Deno.add(b50);
        Deno.add(b100);
        Deno.add(b200);
        Deno.add(Asignar);
        Deno.add(Regresar);
        add(Deno);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
//clase para jframe que contendra 
class moduloadmin extends JFrame{
    JLabel nombre;
    JLabel contra;
    JLabel user;
    JLabel saldo;
    JLabel banco;
    JRadioButton propisto;
    JRadioButton cashmoney;
    JRadioButtonMenuItem menu;
    JLabel montomax;
    JTextField textbox1;
    JTextField textbox2;
    JTextField textbox3;
    JTextField textbox4;
    JTextField textbox5;
    JButton aceptar;
    JButton regresar;
    JPanel panel;
    String empresa,nom,con,us;
    int sali,montmax;
    Proyecto1 vec=new Proyecto1();
    int contador=0,n;
   // final JFrame AdminOptions;
    public moduloadmin(){
       
       /* AdminOptions=ola3;
        AdminOptions.setVisible(false);*/
        
        //configuracion de Labels
        nombre=new JLabel();
        Font f = new Font( "Microsoft PhagsPa",Font.ITALIC,15 );
        nombre.setText("Ingrese Nombre");
        nombre.setFont(f);
        nombre.setBounds(20,50,220,20);
        
        contra=new JLabel();
        contra.setText("Ingrese contrase;a");
        contra.setFont(f);
        contra.setBounds(20,100,220,20);
        
        user=new JLabel();
        user.setText("Ingrese Usuario");
        user.setFont(f);
        user.setBounds(20,150,220,20);
        
        saldo=new JLabel();
        saldo.setText("Ingrese Saldo");
        saldo.setFont(f);
        saldo.setBounds(20,200,220,20);
        
        montomax=new JLabel();
        montomax.setText("Ingrese Monto Maximo");
        montomax.setFont(f);
        montomax.setBounds(20,250,220,20);
        
        banco=new JLabel();
        banco.setText("Seleccione Banco A Utilizar ");
        banco.setFont(f);
        banco.setBounds(20,300,220,20);
        //fin configuracion de labels
        //configuracion de textboxs
        textbox1=new JTextField();
 	textbox1.setBounds(30,70,300,30);
        
        textbox2=new JTextField();
 	textbox2.setBounds(30,120,300,30);
        
        textbox3=new JTextField();
 	textbox3.setBounds(30,170,300,30);
        
        textbox4=new JTextField();
 	textbox4.setBounds(30,220,300,30);
        
        textbox5=new JTextField();
 	textbox5.setBounds(30,270,300,30);
        //fin configuracion de textbox
        //inicio configuracion de botones
        regresar=new JButton();
        regresar.setText("Inicio");
        regresar.setBounds(20, 10, 80, 20);
        regresar.setBackground(Color.white);
        regresar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            setVisible(false);     
            //AdminOptions.setVisible(true); 
            AdminOptions jk= new AdminOptions();
            jk.setVisible(true);
           for(int i=0;i<=10;i++){
                System.out.println(vec.usuarios[i].getnombre()+" "+vec.usuarios[i].getcontra()+" "+vec.usuarios[i].getusuario());
            }
            }
        });
        //boton para ingresar usuarios
        aceptar=new JButton();
        aceptar.setText("Aceptar");
        aceptar.setBounds(130, 380, 100, 40);
        aceptar.setBackground(Color.white);
        aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nom=textbox1.getText();
                con=textbox2.getText();
                us=textbox3.getText();
                sali=Integer.parseInt(textbox4.getText());
                montmax=Integer.parseInt(textbox5.getText());
                agregar();
                //System.out.println(nom+con+us+sali+montmax+empresa+n);
                textbox1.setText("");
                textbox2.setText("");
                textbox3.setText("");
                textbox4.setText("");
                textbox5.setText("");
                propisto.setEnabled(true);
                cashmoney.setEnabled(true);
                
            }
        });
        //fin configuracion de botones
        //configuracion de radiobuttons
        //menu=new JRadioButtonMenuItem();
        cashmoney=new JRadioButton();
        cashmoney.setText("Cash Money");
        cashmoney.setBounds(20, 320, 100, 40);
        cashmoney.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                propisto.setEnabled(false);
                empresa="cashmoney";
                n=1;
            }
        });
        propisto=new JRadioButton();
        propisto.setText("Pro-Pisto");
        propisto.setBounds(150, 320, 100, 40);
        propisto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cashmoney.setEnabled(false);
                //cashmoney
                empresa="propisto";
                n=0;
            }
        });
        /*menu.add(cashmoney);
        menu.add(propisto);*/
        //fin configuracion de radiobuttons
        //agregar todo al panel y agregacion al jframe
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(nombre);
        panel.add(contra);
        panel.add(user);
        panel.add(saldo);
        panel.add(montomax);
        panel.add(banco);
        panel.add(textbox1);
        panel.add(textbox2);
        panel.add(textbox3);
        panel.add(textbox4);
        panel.add(textbox5);
        panel.add(cashmoney);
        panel.add(propisto);
        panel.add(regresar);
        panel.add(aceptar);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
    }
    public void agregar(){
        vec.usuarios[contador]=new agregarusuarios(nom,con,us,sali,montmax,n,empresa);
        contador++;
    }
}
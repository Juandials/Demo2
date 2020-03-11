package gui;

import animacion.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

public class recreacion extends JFrame {

    static Personaje personaje;

    static ArrayList <Personaje> personajetemp = new ArrayList<>();
    static ArrayList <Object> arreglo_personajes = new ArrayList<>();
    private final int AnchoVentana = 800;
    private final int AltoVentana = 600;
    Thread hilo;
    boolean inicio = false;
    BufferedImage bi;
    ArrayList <Image> img = new ArrayList<>();
    Toolkit h = Toolkit.getDefaultToolkit();
    Graphics2D g2d;
    int Incremento = 0;
    int incx = 50;
    int incy = 50;
    boolean arriba = true;
    boolean abajo = true;
    boolean izquierda = true;
    boolean derecha = true;
    boolean ataca = false;
    String[] posicion = {"null", "null"};
    public static String eleccion;
    public static boolean clonar = false;
    static Animacion animar = new Animacion();
    int i=0;
    
    public recreacion() {
        
        setSize(AnchoVentana, AltoVentana);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Recreación");
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
        for(i=0;i<arreglo_personajes.size();i++)
        {
            personajetemp.add((Personaje) arreglo_personajes.get(i));
            img.add(h.getImage(this.getClass().getResource(personajetemp.get(i).getDerecha())));
        }
        img.add(h.getImage(this.getClass().getResource(personaje.getDerecha())));
        inicio = true;

        addKeyListener(new KeyAdapter() {

            public Object clonar() throws CloneNotSupportedException{        
        return personaje.clone();
    }
            @Override
            public void keyPressed(KeyEvent e) {
                
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        posicion[0] = posicion[1];
                        posicion[1] = "arriba";
                        ataca = false;
                        img.add(h.getImage(this.getClass().getResource(personaje.getArriba())));
                        Incremento++;
                        if (Incremento > 4){
                            Incremento = 0;
                        }
                        if (arriba == true){
                            incy = incy - 4;
                            if (incy < 20){
                                incy = incy + 4;
                            }
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        posicion[0] = posicion[1];
                        posicion[1] = "abajo";
                        ataca = false;
                        img.add(h.getImage(this.getClass().getResource(personaje.getAbajo())));

                        Incremento++;

                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (abajo == true) {
                            incy = incy + 4;
                            if (incy > getHeight() - 40) {
                                incy = incy - 4;
                            }
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        posicion[0] = posicion[1];
                        posicion[1] = "derecha";
                        ataca = false;
                        img.add(h.getImage(this.getClass().getResource(personaje.getDerecha())));
                        Incremento++;

                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (derecha == true) {
                            incx = incx + 4;
                            if (incx > getWidth() - 15) {
                                incx = incx - 10;
                            }
                        }
                        break;

                    case KeyEvent.VK_LEFT:
                        posicion[0] = posicion[1];
                        posicion[1] = "izquierda";
                        ataca = false;
                        img.add(h.getImage(this.getClass().getResource(personaje.getIzquierda())));
                        Incremento++;

                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (izquierda = true) {
                            incx = incx - 4;
                            if (incx < -4) {
                                incx = incx + 4;
                            }
                        }
                    break;
                    
                    case KeyEvent.VK_D:                        
                        clonar = true;
                        try {
                            arreglo_personajes.add(this.clonar());
                            System.out.println("Clonado con éxito");
                        } catch (CloneNotSupportedException ex) {
                            Logger.getLogger(recreacion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        for(int j=0;j<=i;j++)
                        System.out.println(arreglo_personajes.get(j));
                        i++;
                        break;
                    case KeyEvent.VK_C:
                        posicion[0] = posicion[1];
                        switch (posicion[1]) {
                            case "arriba":
                                img.add(h.getImage(this.getClass().getResource(personaje.getAtacaArriba())));
                                break;
                            case "abajo":
                                img.add(h.getImage(this.getClass().getResource(personaje.getAtacaAbajo())));
                                break;
                            case "derecha":
                                img.add(h.getImage(this.getClass().getResource(personaje.getAtacaDerecha())));
                                break;
                            case "izquierda":
                                img.add(h.getImage(this.getClass().getResource(personaje.getAtacaIzquierda())));
                                break;
                        }
                        ataca = true;
                        Incremento = Incremento + 5;
                        if (Incremento > 5) {
                            Incremento = 0;
                        }
                        break;
                }
            }
        });
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g) {
        g2d = bi.createGraphics();
        int x=0;
        int y=10;
        int mxA;
        int myA;   
        for(i=0;i<img.size();i++)
        {  
            personajetemp.add((Personaje) arreglo_personajes.get(i));
            g.drawImage(bi, x, y, null);
           
                 
            g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
            if (ataca == true) {
                switch (posicion[0]) {
                    case "arriba":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaArribaX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaArribaY();
                        g2d.drawImage(img.get(i), incx - personajetemp.get(i).getIncxArribaUno(), incy - personajetemp.get(i).getIncyArribaUno(), personajetemp.get(i).getIncxArribaDos() + incx, personajetemp.get(i).getIncyArribaDos() + incy, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaArribaX(), myA + personajetemp.get(i).getSpriteAtacaArribaY(), this);
                        break;
                    case "abajo":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaAbajoX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaAbajoY();
                        g2d.drawImage(img.get(i), incx - personajetemp.get(i).getIncxAbajoUno(), incy - personajetemp.get(i).getIncyAbajoUno(), personajetemp.get(i).getIncxAbajoDos() + incx, personajetemp.get(i).getIncyAbajoDos() + incy, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaAbajoX(), myA + personajetemp.get(i).getSpriteAtacaAbajoY(), this);
                        break;
                    case "derecha":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaDerechaX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaDerechaY();
                        g2d.drawImage(img.get(i), incx - personajetemp.get(i).getIncxDerechaUno(), incy - personajetemp.get(i).getIncyDerechaUno(), personajetemp.get(i).getIncxDerechaDos() + incx, personajetemp.get(i).getIncyDerechaDos() + incy, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaDerechaX(), myA + personajetemp.get(i).getSpriteAtacaDerechaY(), this);
                        break;
                    case "izquierda":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaIzquierdaX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaIzquierdaY();
                        g2d.drawImage(img.get(i), incx - personajetemp.get(i).getIncxIzquierdaUno(), incy - personajetemp.get(i).getIncyIzquierdaUno(), personajetemp.get(i).getIncxIzquierdaDos() + incx, personajetemp.get(i).getIncyIzquierdaDos() + incy, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaIzquierdaX(), myA + personajetemp.get(i).getSpriteAtacaIzquierdaY(), this);
                        break;
                }
            } else {
                mxA = (Incremento % personajetemp.get(i).getNumSpritesMov()) * personajetemp.get(i).getSpriteMoverX();
                myA = (Incremento / personajetemp.get(i).getNumSpritesMov()) * personajetemp.get(i).getSpriteMoverY();
                g2d.drawImage(img.get(i), incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + personajetemp.get(i).getSpriteMoverX(), myA + personajetemp.get(i).getSpriteMoverY(), this);
            }
             y=y+30;
        }        
        
        repaint();
    }

    public static void inicia() {
        
        switch(eleccion){
            case "Elfo":
                animar.SetPersonajeBuilder(new ElfoBuilder());
                break;
            case "Enano":
                animar.SetPersonajeBuilder(new EnanoBuilder());
                break;
            case "Humano":
                animar.SetPersonajeBuilder(new HumanoBuilder());
                break;
            case "Orco":
                animar.SetPersonajeBuilder(new OrcoBuilder());
                break;
        }
        animar.moverse();
        personaje = animar.getPersonaje();
        arreglo_personajes.add(personaje);
        new recreacion().setVisible(true);
        
        
    }
    
    
}
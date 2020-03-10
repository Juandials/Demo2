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
    Personaje personajetemp;
    static ArrayList <Object> arreglo_personajes = new ArrayList<>();
    private final int AnchoVentana = 800;
    private final int AltoVentana = 600;
    Thread hilo;
    boolean inicio = false;
    BufferedImage bi;
    Image img,fondo;
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
        
        fondo = h.getImage(this.getClass().getResource("/assets/map22x15_claro.png"));
        setSize(AnchoVentana, AltoVentana);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Recreación");
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
        img = h.getImage(this.getClass().getResource(personaje.getDerecha()));
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
                        img = h.getImage(this.getClass().getResource(personaje.getArriba()));
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
                        img = h.getImage(this.getClass().getResource(personaje.getAbajo()));

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
                        img = h.getImage(this.getClass().getResource(personaje.getDerecha()));
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
                        img = h.getImage(this.getClass().getResource(personaje.getIzquierda()));
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
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaArriba()));
                                break;
                            case "abajo":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaAbajo()));
                                break;
                            case "derecha":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaDerecha()));
                                break;
                            case "izquierda":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaIzquierda()));
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
        for(i=0;i<arreglo_personajes.size();i++)
        {  
            personajetemp = (Personaje) arreglo_personajes.get(i);
            g.drawImage(bi, x, y, null);
            y=y+30;
            int mxA;
            int myA;        
            g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
            if (ataca == true) {
                switch (posicion[0]) {
                    case "arriba":
                        mxA = (Incremento % personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaArribaX();
                        myA = (Incremento / personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaArribaY();
                        g2d.drawImage(img, incx - personajetemp.getIncxArribaUno(), incy - personajetemp.getIncyArribaUno(), personajetemp.getIncxArribaDos() + incx, personajetemp.getIncyArribaDos() + incy, mxA, myA, mxA + personajetemp.getSpriteAtacaArribaX(), myA + personajetemp.getSpriteAtacaArribaY(), this);
                        break;
                    case "abajo":
                        mxA = (Incremento % personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaAbajoX();
                        myA = (Incremento / personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaAbajoY();
                        g2d.drawImage(img, incx - personajetemp.getIncxAbajoUno(), incy - personajetemp.getIncyAbajoUno(), personajetemp.getIncxAbajoDos() + incx, personajetemp.getIncyAbajoDos() + incy, mxA, myA, mxA + personajetemp.getSpriteAtacaAbajoX(), myA + personajetemp.getSpriteAtacaAbajoY(), this);
                        break;
                    case "derecha":
                        mxA = (Incremento % personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaDerechaX();
                        myA = (Incremento / personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaDerechaY();
                        g2d.drawImage(img, incx - personajetemp.getIncxDerechaUno(), incy - personajetemp.getIncyDerechaUno(), personajetemp.getIncxDerechaDos() + incx, personajetemp.getIncyDerechaDos() + incy, mxA, myA, mxA + personajetemp.getSpriteAtacaDerechaX(), myA + personajetemp.getSpriteAtacaDerechaY(), this);
                        break;
                    case "izquierda":
                        mxA = (Incremento % personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaIzquierdaX();
                        myA = (Incremento / personajetemp.getNumSpritesAtaque()) * personajetemp.getSpriteAtacaIzquierdaY();
                        g2d.drawImage(img, incx - personajetemp.getIncxIzquierdaUno(), incy - personajetemp.getIncyIzquierdaUno(), personajetemp.getIncxIzquierdaDos() + incx, personajetemp.getIncyIzquierdaDos() + incy, mxA, myA, mxA + personajetemp.getSpriteAtacaIzquierdaX(), myA + personajetemp.getSpriteAtacaIzquierdaY(), this);
                        break;
                }
            } else {
                mxA = (Incremento % personajetemp.getNumSpritesMov()) * personajetemp.getSpriteMoverX();
                myA = (Incremento / personajetemp.getNumSpritesMov()) * personajetemp.getSpriteMoverY();
                g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + personajetemp.getSpriteMoverX(), myA + personajetemp.getSpriteMoverY(), this);
            }
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
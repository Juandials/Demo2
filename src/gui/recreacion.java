package gui;

import decorator.HumanoDecorator;
import animacion.*;
import decorator.ElfoDecorator;
import decorator.EnanoDecorator;
import decorator.OrcoDecorator;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class recreacion extends JPanel {

    static Personaje personaje;
    JFrame ventana = new JFrame();
    static ArrayList<Personaje> personajetemp = new ArrayList<>();
    static ArrayList<Object> arreglo_personajes = new ArrayList<>();
    private final int AnchoVentana = 800;
    private final int AltoVentana = 600;
    Thread hilo;
    boolean inicio = false;
    BufferedImage bi;
    Image img, fondo, pocion;
    Toolkit h = Toolkit.getDefaultToolkit();
    Graphics2D g2d;
    int Incremento = 0;
    int incx = 340;
    int incy = 230;
    boolean arriba = true;
    boolean abajo = true;
    boolean izquierda = true;
    boolean derecha = true;
    boolean ataca = false;
    String[] posicion = {"derecha", "derecha"};
    public static String eleccion;
    public static String poblacion;
    public static boolean clonar = false;
    static Animacion animar = new Animacion();
    int i = 0;
    boolean colision = false;
    boolean colisionPocima = false;
    Rectangle rect = new Rectangle(403,423,30,20);
    Rectangle rectPj = new Rectangle(340,230,52,80);
    boolean entra = true;
    public recreacion() {

        fondo = h.getImage(this.getClass().getResource("/assets/map.png"));
        pocion = h.getImage(this.getClass().getResource("/assets/Pocion2.png"));
        ventana.setSize(AnchoVentana, AltoVentana);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Recreación");
        ventana.setVisible(true);
        ventana.getContentPane().add(this);
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
        img = h.getImage(this.getClass().getResource(personaje.getDerecha()));
        inicio = true;
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        posicion[0] = posicion[1];
                        posicion[1] = "arriba";
                        ataca = false;
                        img = h.getImage(this.getClass().getResource(personaje.getArriba()));
                        Incremento++;
                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (arriba == true) {
                            incy = incy - 4;
                            if (incy < 20) {
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
        g.drawImage(bi, 0, 0, null);
        int mxA;
        int myA;
        int y = 0;
        int aumentoSpriteY;
        g2d = bi.createGraphics();
        g2d.drawImage(fondo, 0, 0, AnchoVentana, AltoVentana, this);
        if(colisionPocima == false){
            g2d.drawImage(pocion, 390, 400, 60, 60, this);
        }
        if (poblacion.equals("Individual")) {
            aumentoSpriteY = 0;
        } else {
            aumentoSpriteY = 80;
        }
        for (i = 0; i < arreglo_personajes.size(); i++) {
            personajetemp.add((Personaje) arreglo_personajes.get(i));
            if (ataca == true) {
                switch (posicion[0]) {
                    case "arriba":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaArribaX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaArribaY();
                        g2d.drawImage(img, incx - personajetemp.get(i).getIncxArribaUno(), y + incy - personajetemp.get(i).getIncyArribaUno(), personajetemp.get(i).getIncxArribaDos() + incx, personajetemp.get(i).getIncyArribaDos() + incy + y, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaArribaX(), myA + personajetemp.get(i).getSpriteAtacaArribaY(), this);
                        break;
                    case "abajo":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaAbajoX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaAbajoY();
                        g2d.drawImage(img, incx - personajetemp.get(i).getIncxAbajoUno(), y + incy - personajetemp.get(i).getIncyAbajoUno(), personajetemp.get(i).getIncxAbajoDos() + incx, personajetemp.get(i).getIncyAbajoDos() + incy + y, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaAbajoX(), myA + personajetemp.get(i).getSpriteAtacaAbajoY(), this);
                        break;
                    case "derecha":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaDerechaX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaDerechaY();
                        g2d.drawImage(img, incx - personajetemp.get(i).getIncxDerechaUno(), y + incy - personajetemp.get(i).getIncyDerechaUno(), personajetemp.get(i).getIncxDerechaDos() + incx, personajetemp.get(i).getIncyDerechaDos() + incy + y, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaDerechaX(), myA + personajetemp.get(i).getSpriteAtacaDerechaY(), this);
                        break;
                    case "izquierda":
                        mxA = (Incremento % personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaIzquierdaX();
                        myA = (Incremento / personajetemp.get(i).getNumSpritesAtaque()) * personajetemp.get(i).getSpriteAtacaIzquierdaY();
                        g2d.drawImage(img, incx - personajetemp.get(i).getIncxIzquierdaUno(), y + incy - personajetemp.get(i).getIncyIzquierdaUno(), personajetemp.get(i).getIncxIzquierdaDos() + incx, personajetemp.get(i).getIncyIzquierdaDos() + incy + y, mxA, myA, mxA + personajetemp.get(i).getSpriteAtacaIzquierdaX(), myA + personajetemp.get(i).getSpriteAtacaIzquierdaY(), this);
                        break;
                }
            } else {
                mxA = (Incremento % personajetemp.get(i).getNumSpritesMov()) * personajetemp.get(i).getSpriteMoverX();
                myA = (Incremento / personajetemp.get(i).getNumSpritesMov()) * personajetemp.get(i).getSpriteMoverY();
                g2d.drawImage(img, incx - 25, incy - 25 + y, 50 + incx, y + 50 + incy, mxA, myA, mxA + personajetemp.get(i).getSpriteMoverX(), myA + personajetemp.get(i).getSpriteMoverY(), this);
                rectPj.setRect(incx-15, incy-30+y, 52, 78);
                colision = rect.intersects(rectPj);
                if (colision == true) {
                    if (entra == true) {
                        switch (eleccion) {
                            case "Orco":
                                personaje = new OrcoDecorator(personaje);
                                break;
                            case "Humano":
                                personaje = new HumanoDecorator(personaje);
                                break;
                            case "Elfo":
                                personaje = new ElfoDecorator(personaje);
                                break;
                            case "Enano":
                                personaje = new EnanoDecorator(personaje);
                                break;
                        }
                    }
                    entra = false;
                    colisionPocima = true;
                }
            }
            y = y + aumentoSpriteY;
        }
        repaint();
    }

    public static void inicia() {
        arreglo_personajes.clear();
        personajetemp.clear();
        switch (eleccion) {
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
        if (poblacion.equals("Población")) {
            Personaje personajeClonUno = (Personaje) personaje.clonar();
            Personaje personajeClonDos = (Personaje) personaje.clonar();
            arreglo_personajes.add(personajeClonUno);
            arreglo_personajes.add(personajeClonDos);
        }
        new recreacion().setVisible(true);
    }
}

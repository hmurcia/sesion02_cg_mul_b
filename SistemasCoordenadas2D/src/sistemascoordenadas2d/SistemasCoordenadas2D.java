package sistemascoordenadas2d;

/* Bajo el sistema de coordenadas cartesianas referir un punto en un plano 2D
   con sus respectivas propiedades y valores. Dicho valores deben asignarse
   como una entrada por teclado de parte del usuario
*/

public class SistemasCoordenadas2D {

    public static void main(String[] args) {
        Cartesiana2D punto = new Cartesiana2D();
        Polar punto2 = new Polar();
        // Agregar las instrucciones necesarias para que se presente
        // en pantalla la solicitud de los datos y posteriormente
        // el usuario los ingrese desde el teclado
        punto.setX(4);
    }
    
}

class Cartesiana2D {
    private int x, y;
    
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class Polar {
    private int radio;
    private float angulo;  //

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    } 
}
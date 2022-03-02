package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 *
 * @author alex
 */
public class Aro {

    /**
     * Valor minimo para o radio
     */
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Clase con controla as operacións sobre un aro
     */
    public Aro() {
    }

    /**
     * Parametros para o constructor da clase
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Compara co valor limite (0.0) para devolver sempre un minimo 0.0
     * @param valorRadio the radio to set
     */
    public void setRadio(double valorRadio) {

        radio = (valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    /**
     * Variable igual o minimo
     */
    public static final double LIMITERADIO = MINIMO;

    /**
     * Metodo que devolve o valor do diametro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Metodo que devolve o valor da circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Metodo que calcula a superficie do aro
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Metodo para mover o centro do aro
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}

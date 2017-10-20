/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class Kata3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram histogram=new Histogram();
        histogram.increment("google.com", 7);
        histogram.increment("upgc.es", 17);
        histogram.increment("uñll.es", 7);
        new HistogramDisplay(histogram).execute();
    }
}

package app.poderes.hechizos;

import app.poderes.Poder;

public class Hechizo extends Poder {

    public boolean esOscuro;
    public int nivelDanio;
    public int nivelCuracion;
    public int energiaMagicaHechizo;

    public Hechizo(String nombrePoder, String descripcionPoder, boolean esOscuro, int nivelDanio, int nivelCuracion,
            int energiaMagicaHechizo) {
        super(nombrePoder, descripcionPoder);
        this.esOscuro = esOscuro;
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.energiaMagicaHechizo = energiaMagicaHechizo;
    }
<<<<<<< HEAD
=======

>>>>>>> 4ca57012b3ef7eee1b2c0879b30dd846d46bb56c
}

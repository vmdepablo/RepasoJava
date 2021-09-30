
package EJ6;

/**
 *
 * @author Victor Manuel
 */
public class Tecnico extends Trabajador{

    Jefe trabajaPara;

    public Tecnico(Jefe trabajaPara,String empresa,String nombre) {
        super(empresa,nombre);
        this.trabajaPara = trabajaPara;
    }

    public Jefe getTrabajaPara() {
        return trabajaPara;
    }

    public void setTrabajaPara(Jefe trabajaPara) {
        this.trabajaPara = trabajaPara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoy un Tecnico y mi jefe/a es: " + trabajaPara.getNombre(nombre);
    }
    
    
    
}

package co.edu.eam.avanzada1.entidades;

import co.edu.eam.avanzada1.entidades.TipoDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-14T15:45:19")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> password;
    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile SingularAttribute<Persona, TipoDocumento> documento;
    public static volatile SingularAttribute<Persona, Long> numeroDocumento;
    public static volatile SingularAttribute<Persona, Long> telefono;
    public static volatile SingularAttribute<Persona, String> nombre;

}
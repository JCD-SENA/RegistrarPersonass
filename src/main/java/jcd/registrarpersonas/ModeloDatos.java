package jcd.registrarpersonas;

import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ModeloDatos {
	
	HashMap<String,Persona> personasMap;
	
	public ModeloDatos() {
		personasMap=new HashMap<String, Persona>();
	}
	
	public void registrarPersona(Persona p) {
		
		if (!personasMap.containsKey(p.getDocumento())) {
			personasMap.put(p.getDocumento(),p);
			System.out.println("Registro existoso de "+p.getNombre());
		}else {
			System.out.println("Ya existe la persona!");
		}
	
	}

	
	public Persona consultarPersona(String documento) {
		
		return personasMap.get(documento);
		
	}
        
        public void consultarPersonaIndividual(String documento) {
            if (documento.length() > 0) {
                if (personasMap.containsKey(documento)) {
                    Persona personaElegida = consultarPersona(documento);
                    System.out.println(documento+" - "+personaElegida);
                } else {
                    JOptionPane.showMessageDialog(null, "La persona con el documento\""+documento+"\" no está registrada.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se debe ingresar el documento", "Dato invalido", JOptionPane.ERROR_MESSAGE);
            }
        }
	
	public void consultarPersonas() {
		
		//System.out.println(personasMap);
		if (personasMap.size() > 0) {
                    Iterator<String> itera=personasMap.keySet().iterator();

                    while (itera.hasNext()) {
                            String documento = (String) itera.next();
                            System.out.println(documento+" - "+personasMap.get(documento));

                    }
                } else {
                    System.out.println("No hay personas registradas.");
                }
		
	}
	
	public String actualizarPersona(Persona p) {
		
		personasMap.put(p.getDocumento(), p);
		

		return "ok";
		
	}
	
	public String eliminarPersona(String doc) {
		if (personasMap.containsKey(doc)) {
                    personasMap.remove(doc);
                } else {
                    JOptionPane.showMessageDialog(null, "La persona con el documento\""+doc+"\" no está registrada.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                }
		
		return "ok";
		
	}
	
}

package Arreglo;
import clase.Equipo;
import java.util.ArrayList;
public class ArregloEquipos {
	private ArrayList<Equipo>alu;
public ArregloEquipos(){
	alu=new ArrayList<Equipo>();
}
public int tamaño(){
	return alu.size();
}
public Equipo obtener(int pos){
	return alu.get(pos);
}
/*-	Método adicionar que reciba la dirección de memoria de un nuevo Equipo y lo adicione al ArrayList. */
public void adicione(Equipo x){
	alu.add(x);
}
/*-	Método eliminarAlFinal que retire del ArrayList la última DirMem. - 
 * 	Método eliminarTodo que retire del ArrayList todas las DirMem. */
public void eliminarAlFinal() {
	 alu.remove(tamaño()-1);
}
public void eliminarTodo() {
    alu.clear(); 
}
/*-	Método buscar que reciba un código y retorne la DirMem del objeto Equipo que
 *  lo contiene. En caso no exista retorne null. */

public Equipo buscar(int codigo) {
    for (int i=0; i<tamaño(); i++)
        if (obtener(i).getCodigo() == codigo)
            return obtener(i);
    return null; 
}
/*-	Implemente la pulsación del botón Eliminar por código que busque un código y si existe retire al objeto del arreglo. */
public void eliminarCodigo() {
	for(int i=0;i<tamaño();i++)
		if(codigo==codigo){
		    alu.remove(0);

	
}

	
	   
}

}






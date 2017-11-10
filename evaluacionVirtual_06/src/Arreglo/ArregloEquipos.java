package Arreglo;
import clase.Equipo;
import java.util.ArrayList;
public class ArregloEquipos {
	private ArrayList<Equipo>alu;
public ArregloEquipos(){
	alu=new ArrayList<Equipo>();
}
public int tama�o(){
	return alu.size();
}
public Equipo obtener(int pos){
	return alu.get(pos);
}
/*-	M�todo adicionar que reciba la direcci�n de memoria de un nuevo Equipo y lo adicione al ArrayList. */
public void adicione(Equipo x){
	alu.add(x);
}
/*-	M�todo eliminarAlFinal que retire del ArrayList la �ltima DirMem. - 
 * 	M�todo eliminarTodo que retire del ArrayList todas las DirMem. */
public void eliminarAlFinal() {
	 alu.remove(tama�o()-1);
}
public void eliminarTodo() {
    alu.clear(); 
}
/*-	M�todo buscar que reciba un c�digo y retorne la DirMem del objeto Equipo que
 *  lo contiene. En caso no exista retorne null. */

public Equipo buscar(int codigo) {
    for (int i=0; i<tama�o(); i++)
        if (obtener(i).getCodigo() == codigo)
            return obtener(i);
    return null; 
}
/*-	Implemente la pulsaci�n del bot�n Eliminar por c�digo que busque un c�digo y si existe retire al objeto del arreglo. */
public void eliminarCodigo() {
	for(int i=0;i<tama�o();i++)
		if(codigo==codigo){
		    alu.remove(0);

	
}

	
	   
}

}






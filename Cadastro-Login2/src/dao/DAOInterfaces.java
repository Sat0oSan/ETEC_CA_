package dao;

import java.util.ArrayList;

/**
 *
 * @author attie
 */
public interface DAOInterfaces<ObjetoGenerico> {
    
        public void inserir(ObjetoGenerico objt);
        
        public ArrayList<ObjetoGenerico> consultar();
}

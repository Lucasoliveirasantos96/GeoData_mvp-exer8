package br.usjt.desmob.geodata.model.dao;

import java.io.IOException;

import br.usjt.desmob.geodata.model.entity.Pais;
import br.usjt.desmob.geodata.model.entity.Regiao;

/**
 * Created by Lucas Oliveira RA: 201513373
 */

public interface PaisDAO {
    Pais[] buscarPaises(Regiao regiao) throws IOException;
}

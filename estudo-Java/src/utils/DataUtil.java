package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public String converteDateParaDataEHora(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(data);
    }
}

// #region Classes Static é Abstract
/**
 * Abstract: é uma classe que serve simplismente para fazer uma abtração. Ela
 * não e um objeto concreto mas ela serve como referencia para que alguem use
 * essa classe como herança para obter os dados dela.
 * Static: Os metados estaticos sao metados que só servem para fazer conversoes
 * para fazer ou tomar alguma ação, eles nao armazenam valor. nenhum metado
 * estatico podem amarzenar valor em propriedades
 */

// #endregion

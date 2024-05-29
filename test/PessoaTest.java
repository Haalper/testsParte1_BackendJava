import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testFiltrarSexoFeminino() {
        List<Pessoa> listaFiltrada = Main.filtraPessoasPorSexo(Main.populaPessoas(), "Feminino");

        assertFalse(listaFiltrada.isEmpty(), "A lista filtrada não deve estar vazia");

        for (Pessoa pessoa : listaFiltrada) {
            assertEquals("Feminino", pessoa.getSexo(), "O sexo deve ser feminino para todas as pessoas na lista");
        }
    }
}

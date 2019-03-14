import java.util.HashMap;
import java.util.stream.Stream;
import java.time.*;
import java.math.BigDecimal;


public class Hello {
  public static void main(String[] args) {

    // Create a HashMap object called capitalCities
    HashMap<Long, Jogador> jogadores = new HashMap<Long, Jogador>();
    jogadores.put(Long.valueOf(1), new Jogador(Long.valueOf(1), Long.valueOf(1), "José", LocalDate.now(), 9001, new BigDecimal(3500.0)));
    jogadores.put(Long.valueOf(2), new Jogador(Long.valueOf(2), Long.valueOf(1), "José", LocalDate.now(), 32, new BigDecimal(3500.0)));
    jogadores.put(Long.valueOf(3), new Jogador(Long.valueOf(3), Long.valueOf(1), "José", LocalDate.now(), 4231, new BigDecimal(3500.0)));
    jogadores.put(Long.valueOf(4), new Jogador(Long.valueOf(4), Long.valueOf(1), "José", LocalDate.now(), 321, new BigDecimal(3500.0)));
    jogadores.put(Long.valueOf(5), new Jogador(Long.valueOf(5), Long.valueOf(1), "José", LocalDate.now(), 3213, new BigDecimal(3500.0)));

    // Add keys and values (Country, City)
    Stream<Jogador> iterador = jogadores.values().stream();
    iterador.sorted((i1, i2) -> i2.getNivelHabilidade().compareTo(i1.getNivelHabilidade())).limit(3).forEach(elementos -> System.out.println(elementos.getNivelHabilidade()));

  }
}
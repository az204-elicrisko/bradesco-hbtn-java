import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
    	Map<String, List<Pessoa>> pessoasPorCargo = pessoas.stream()
            .collect(Collectors.groupingBy(Pessoa::getCargo));
        return pessoasPorCargo;
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas) {
        Map<String, List<Integer>> idadesPorCargo = pessoas.stream()
            .collect(Collectors.groupingBy(Pessoa::getCargo,
                Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
        return idadesPorCargo;
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> pessoasAgrupadasPorCargoEmOrdemReversa = pessoas.stream()
        .collect(Collectors.groupingBy(Pessoa:getCargo, Collectors.mapping(Pessoa:getCargo, Collectors.))

        return pessoasAgrupadasPorCargoEmOrdemReversa;
    }
}

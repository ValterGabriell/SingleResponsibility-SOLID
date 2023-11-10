import java.util.List;

public class Main {
    public class SfromSolid {
        public static void main(String[] args) {
            //Gerar em XLS
            GerarRelatorioXLS gerarRelatorioXLS = new GerarRelatorioXLS();
            gerarRelatorio(gerarRelatorioXLS);
            System.out.println("---");
            //Gerar relatorio em JSON
            GerarRelatorioJSON gerarRelatorioJSON = new GerarRelatorioJSON();
            gerarRelatorioJSON.fazerAlgoRelacionadoAosRelatorios();
            gerarRelatorio(gerarRelatorioJSON);
        }
        private static void gerarRelatorio(IGerarRelatorio iGerarRelatorio){
            iGerarRelatorio.gerarRelatorio();
        }

        public static class RelatorioFinanceiro {
            public double calcularLucroAnual(List<Double> transacoes){
                //lógica do calculo das transações
                return 0.0;
            }
            public void gerarRelatorioAnual(){
                //geração de relatorio
            }
        }

        public static class CalculadoraFinanceira {
            public double calcularLucroAnual(List<Double> transacoes){
                //lógica do calculo das transações
                return 0.0;
            }
        }

        public static class GerarRelatorioXLS implements IGerarRelatorio {
            @Override
            public void gerarRelatorio() {
                System.out.println("Gerando relatorio em XLS");
            }
        }

        public static class GerarRelatorioJSON implements IGerarRelatorio{

            @Override
            public void gerarRelatorio() {
                System.out.println("Gerando relatorio JSON");
            }

            public void fazerAlgoRelacionadoAosRelatorios(){
                System.out.println("Transformando objeto em json");
            }
        }
        public interface IGerarRelatorio {
            void gerarRelatorio();
        }
    }

}
package calculadora;

public class Calculadora {

    private String valorAtual = "0";
    private double valorAnterior = 0;
    private String operador = "";
    private boolean limparVisor = false;

    public void adicionarNumero(String numero) {
        if (limparVisor) {
            valorAtual = numero;
            limparVisor = false;
        } else {
            valorAtual = valorAtual.equals("0") ? numero : valorAtual + numero;
        }
    }

    public void definirOperador(String op) {
        if (!valorAtual.isEmpty()) {
            valorAnterior = Double.parseDouble(valorAtual);
            valorAtual = "";
            operador = op;
            limparVisor = true;
        }
    }

    public void calcularResultado() {
        if (!valorAtual.isEmpty() && !operador.isEmpty()) {
            double valorAtualDouble = Double.parseDouble(valorAtual);
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = valorAnterior + valorAtualDouble;
                    break;
                case "-":
                    resultado = valorAnterior - valorAtualDouble;
                    break;
                case "*":
                    resultado = valorAnterior * valorAtualDouble;
                    break;
                case "/":
                    if (valorAtualDouble != 0) {
                        resultado = valorAnterior / valorAtualDouble;
                    } else {
                        valorAtual = "Erro";
                        return;
                    }
                    break;
            }

            valorAtual = String.valueOf(resultado);
            operador = "";
            limparVisor = true;
        }
    }

    public void inverterSinal() {
        if (!valorAtual.equals("0")) {
            double valor = Double.parseDouble(valorAtual);
            valorAtual = String.valueOf(valor * -1);
        }
    }

    public void limpar() {
        valorAtual = "0";
        valorAnterior = 0;
        operador = "";
        limparVisor = false;
    }

    public String getValorAtual() {
        return valorAtual;
    }
}



package controller;

public class Simbolo {

        private String identificador;
        private String tipo;
        private String valor;

        public Simbolo() {}

        public Simbolo(String identificador, String tipo, String valor) {
            this.identificador = identificador;
            this.tipo = tipo;
            this.valor = valor;
        }

        public String getIdentificador() {
            return identificador;
        }

        public void setIdentificador(String identifidor) {
            this.identificador = identifidor;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }


}

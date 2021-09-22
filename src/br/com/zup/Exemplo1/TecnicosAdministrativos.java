package br.com.zup.Exemplo1;

public class TecnicosAdministrativos extends Funcionario{
        private String departamento;

        public TecnicosAdministrativos(String nome, String cpf, double salario, String ctps, String departamento) {
                super(nome, cpf, salario, ctps);
                this.departamento = departamento;
        }

        public String getDepartamento() {
                return departamento;
        }

        public void setDepartamento(String departamento) {
                this.departamento = departamento;
        }
}

public abstract class Funcionario extends BancoX {

        private String funcionario;
        private String  nome ;
        private String cpf ;

        protected final double SALARIO_MINIMO = 1000.0 ;

    protected <string> Funcionario(string funcionario, string nome, string cpf) {
        this.funcionario = String.valueOf(funcionario);
        this.nome = (String) nome;
        this.cpf = (String) cpf;
    }

    public void funcionario (String  nome , String  cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public  abstract  double calcularSalario ();
    }






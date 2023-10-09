public class Usuario {
    // Atributos da classe.
    String nome; 
    String email;
    String senha;

    // Construtor.
    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Iprimir inormações do usuário.
    public void MostraNome () {
        System.out.println("Nome: " + this.nome);
    
    }
    public void MostraEmail () {
        System.out.println("Email: " + this.email);
    }

    // Método para Verificar se a enha fornecida é correta.
    boolean VerificarSenha(String senhaFornecida) {
        return this.senha.equals(senhaFornecida);
    }


    public static void main(String[] args) {
        Usuario user1 = new Usuario("João", "joao@email.com", "senhaSegura123");

        boolean senha1 = user1.VerificarSenha("senhaSegura123");
        boolean senha2 = user1.VerificarSenha("senhaErrada");

        user1.MostraEmail();
        user1.MostraNome();

        System.out.println("A senha está correta? " + senha1);
        System.out.println("A senha está correta? " + senha2);

        

    }
        
}   

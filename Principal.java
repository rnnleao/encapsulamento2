public class Principal {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Renan");
        System.out.println(pessoa.getNome());
        
        pessoa.setIdade(17);
        System.out.println(pessoa.getIdade());

        pessoa.setCelular("18996067907");
        System.out.println(pessoa.getCelular());

        pessoa.setCpf("12345678910");
        System.out.println(pessoa.getCpf());

    
    }
}

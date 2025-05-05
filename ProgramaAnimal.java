public class ProgramaAnimal {

    public static void main(String[] args) {
        Gato meuGato = new Gato();
        Cachorro meuCachorro = new Cachorro();

        meuGato.fazerSom();
        meuCachorro.fazerSom();
    }
}

// Classe base
class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Classe derivada
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }
}

// Classe derivada
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

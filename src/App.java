import java.util.List;

public class App {

    public static void main(String[] args) {
        // 1. Instantiate 3 pokemon (mutable objects)
        Pokemon squirtle = new Pokemon("Squirtle", 1, 12);
        Pokemon charmander = new Pokemon("Charmander", 1, 15);
        Pokemon ivysaur = new Pokemon("Ivysaur", 17, 46);

        // Instantiate Immutable List
        List<Pokemon> myImmutablePokemon = List.of(squirtle, charmander, ivysaur);
        myImmutablePokemon.add(new Pokemon("D. Pikachu", 100, 9001)); // throws error

        System.out.println(myImmutablePokemon); // print immutable list before mutations

        myImmutablePokemon.get(0).setName("Blastoise");
        myImmutablePokemon.get(0).setLevel(37);
        myImmutablePokemon.get(0).setHp(149);
        myImmutablePokemon.get(1).setName("Charizard");

        System.out.println(myImmutablePokemon); // print immutable list after mutations
    }

}
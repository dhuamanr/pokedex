package thiengo.com.br.pokdex.data

import thiengo.com.br.pokdex.R
import thiengo.com.br.pokdex.domain.Pokemon

/**
 * Created by viniciusthiengo on 27/08/17.
 */
class Mock {

    companion object {
        fun getPokemons() = listOf<Pokemon>(
            Pokemon(
                    1,
                    "Bulbasaur",
                    R.drawable.bulbasaur,
                    arrayOf("Grama", "Venenoso"),
                    "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.",
                    "0,7 m",
                    "6,9 kg",
                    "Masculino / feminino",
                    "Semente",
                    arrayOf("Overgrow"),
                    arrayOf("Fogo", "Voador", "Gelo", "Psíquico")),
            Pokemon(
                    2,
                    "Ivysaur",
                    R.drawable.ivysaur,
                    arrayOf("Grama", "Venenoso"),
                    "There is a bud on this Pokémon's back. To support its weight, Ivysaur's legs and trunk grow thick and strong. If it starts spending more time lying in the sunlight, it's a sign that the bud will bloom into a large flower soon.",
                    "1,0 m",
                    "13,0 kg",
                    "Masculino / feminino",
                    "Semente",
                    arrayOf("Overgrow"),
                    arrayOf("Fogo", "Voador", "Gelo", "Psíquico")),
            Pokemon(
                    3,
                    "Venusaur",
                    R.drawable.venusaur,
                    arrayOf("Grama", "Venenoso"),
                    "There is a large flower on Venusaur's back. The flower is said to take on vivid colors if it gets plenty of nutrition and sunlight. The flower's aroma soothes the emotions of people.",
                    "2,0 m",
                    "100,0 kg",
                    "Masculino / feminino",
                    "Semente",
                    arrayOf("Overgrow"),
                    arrayOf("Fogo", "Voador", "Gelo", "Psíquico")),
            Pokemon(
                    4,
                    "Charmander",
                    R.drawable.charmander,
                    arrayOf("Fogo"),
                    "The flame that burns at the tip of its tail is an indication of its emotions. The flame wavers when Charmander is enjoying itself. If the Pokémon becomes enraged, the flame burns fiercely.",
                    "0,6 m",
                    "8,5 kg",
                    "Masculino / feminino",
                    "Lagarto",
                    arrayOf("Blaze"),
                    arrayOf("Solo", "Pedra", "Água")),
            Pokemon(
                    5,
                    "Charmeleon",
                    R.drawable.charmeleon,
                    arrayOf("Fogo"),
                    "Charmeleon mercilessly destroys its foes using its sharp claws. If it encounters a strong foe, it turns aggressive. In this excited state, the flame at the tip of its tail flares with a bluish white color.",
                    "1,1 m",
                    "19,0 kg",
                    "Masculino / feminino",
                    "Chama",
                    arrayOf("Blaze"),
                    arrayOf("Solo", "Pedra", "Água")),
            Pokemon(
                    6,
                    "Charizard",
                    R.drawable.charizard,
                    arrayOf("Fogo", "Voador"),
                    "Charizard flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself.",
                    "1,7 m",
                    "90,5 kg",
                    "Masculino / feminino",
                    "Chama",
                    arrayOf("Blaze"),
                    arrayOf("Pedra", "Elétrico", "Água")),
            Pokemon(
                    7,
                    "Squirtle",
                    R.drawable.squirtle,
                    arrayOf("Água"),
                    "Squirtle's shell is not merely used for protection. The shell's rounded shape and the grooves on its surface help minimize resistance in water, enabling this Pokémon to swim at high speeds.",
                    "0,5 m",
                    "9,0 kg",
                    "Masculino / feminino",
                    "Tartaruga pequena",
                    arrayOf("Torrent"),
                    arrayOf("Elétrico", "Grama")),
            Pokemon(
                    8,
                    "Wartortle",
                    R.drawable.wartortle,
                    arrayOf("Água"),
                    "Its tail is large and covered with a rich, thick fur. The tail becomes increasingly deeper in color as Wartortle ages. The scratches on its shell are evidence of this Pokémon's toughness as a battler.",
                    "1,0 m",
                    "22,5 kg",
                    "Masculino / feminino",
                    "Tartaruga",
                    arrayOf("Torrent"),
                    arrayOf("Elétrico", "Grama")),
            Pokemon(
                    9,
                    "Blastoise",
                    R.drawable.blastoise,
                    arrayOf("Água"),
                    "Blastoise has water spouts that protrude from its shell. The water spouts are very accurate. They can shoot bullets of water with enough accuracy to strike empty cans from a distance of over 160 feet.",
                    "1,6 m",
                    "85,5 kg",
                    "Masculino / feminino",
                    "Marisco",
                    arrayOf("Torrent"),
                    arrayOf("Elétrico", "Grama")),
            Pokemon(
                    10,
                    "Caterpie",
                    R.drawable.caterpie,
                    arrayOf("Inseto"),
                    "Caterpie has a voracious appetite. It can devour leaves bigger than its body right before your eyes. From its antenna, this Pokémon releases a terrifically strong odor.",
                    "0,3 m",
                    "2,9 kg",
                    "Masculino / feminino",
                    "Minhoca",
                    arrayOf("Shield Dust"),
                    arrayOf("Fogo", "Voador", "Pedra")),
            Pokemon(
                    11,
                    "Metapod",
                    R.drawable.metapod,
                    arrayOf("Inseto"),
                    "The shell covering this Pokémon's body is as hard as an iron slab. Metapod does not move very much. It stays still because it is preparing its soft innards for evolution inside the hard shell.",
                    "0,7 m",
                    "9,9 kg",
                    "Masculino / feminino",
                    "Casulo",
                    arrayOf("Shed Skin"),
                    arrayOf("Fogo", "Voador", "Pedra")),
            Pokemon(
                    12,
                    "Butterfree",
                    R.drawable.butterfree,
                    arrayOf("Inseto", "Voador"),
                    "Butterfree has a superior ability to search for delicious honey from flowers. It can even search out, extract, and carry honey from flowers that are blooming over six miles from its nest.",
                    "1,1 m",
                    "32,0 kg",
                    "Masculino / feminino",
                    "Borboleta",
                    arrayOf("Compound Eyes"),
                    arrayOf("Fogo", "Voador", "Pedra", "Elétrico", "Gelo"))
        )
    }
}
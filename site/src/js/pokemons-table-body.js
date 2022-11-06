// Tableau contenant les pokémons
const pokemons = [
	{
		nom: 'Bulbizarre',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Salamèche',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Carapuce',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Pikachu',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Onix',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Roucool',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Chenipan',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Minidraco',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Feu'
	}, {
		nom: 'Rondoudou',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Dragon'
	}, {
		nom: 'Fantominus',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Tenèbres'
	}, {
		nom: 'Abra',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Spectre'
	}, {
		nom: 'Smogo',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Sol'
	}, {
		nom: 'Colossinge',
		habitat: 'Forêt',
		attaque: 50,
		defense: 40,
		type: 'Combat'
	},
];

// Element du dom destiné à lister les pokémons
const pokemons_table_dom = document.querySelector(".pokemons-table-body");

// Affichage de chaque pokémon dans la table
pokemons.forEach((pokemon, key) => {
	pokemons_table_dom.innerHTML += `
<tr>
	<th scope="row">${key}</th>
	<td>${pokemon.nom}</td>
	<td>${pokemon.habitat}</td>
	<td>${pokemon.attaque}</td>
	<td>${pokemon.defense}</td>
	<td>${pokemon.type}</td>
</tr>
`;
});

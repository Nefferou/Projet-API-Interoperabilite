// Element du dom destiné à lister les pokémons
const pokemons_table_dom = document.querySelector(".pokemons-table-body");

// Methode Fetch api, get les info des différents pokemons
fetch('http://127.0.0.1:8080/api/pokemons', {mode:'cors'})
	.then(res => {
		if (res.ok){
			console.log("Data retrieved");
			res.json().then(data => {
				console.log(data);
				// Affichage de chaque pokémon dans la table
				data.forEach((pokemon) => {
					pokemons_table_dom.innerHTML += `
					<tr>
						<th scope="row">${pokemon.id}</th>
						<td>${pokemon.nom}</td>
						<td>${pokemon.habitat}</td>
						<td>${pokemon.attaque}</td>
						<td>${pokemon.defense}</td>
						<td>${pokemon.type}</td>
					</tr>
					`;
				});
			});
		}
		else {
			console.log("Data not retrieved");
		}

	})

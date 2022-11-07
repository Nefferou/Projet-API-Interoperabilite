// Element du dom destiné à lister les pokémons
const pokemons_table_dom = document.querySelector(".pokemons-table-body");

// --------- SHOW ALL POKEMONS ---------

// Methode Fetch api, get les info des différents pokemons
function showAllPokemons(){
	fetch('http://127.0.0.1:8080/api/pokemons', {mode:'cors'})
		.then(res => {
			if (res.ok){
				console.log("Data retrieved");
				pokemons_table_dom.innerHTML=``;
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
}

showAllPokemons();

// --------- SEARCH POKEMON BY ID ---------

// Element du dom destiné à select l'id inputed
const idInputed = document.querySelector("#searchById");

// Element du dom destiné à select le bouton pour search by id un pokemon
const buttonSearchById = document.querySelector("#search-button");

buttonSearchById.addEventListener('click', function () {
	if (idInputed.value.length==0)
		alert("Please input a valid ID before searching.");
	else{
		fetch(`http://127.0.0.1:8080/api/pokemons/${idInputed.value}`, {mode:'cors'})
			.then(res => {
				if (res.ok){
					console.log("Pokemon found");
					res.json().then(data => {
						console.log(data);
						// Affichage du pokemon searched
						pokemons_table_dom.innerHTML = `
						<tr>
							<th scope="row">${data.id}</th>
							<td>${data.nom}</td>
							<td>${data.habitat}</td>
							<td>${data.attaque}</td>
							<td>${data.defense}</td>
							<td>${data.type}</td>
						</tr>
						`;
					});
				}
				else {
					alert("Pokemon not found")
				}
			})
	}
})

// --------- ADD A NEW POKEMON ---------

// Element du dom destiné à select les differents champs d'ajout de pokemon
const nameInputed = document.querySelector("#add-pokemon-name");
const habitatInputed = document.querySelector("#add-pokemon-habitat");
const atkInputed = document.querySelector("#add-pokemon-atk");
const defInputed = document.querySelector("#add-pokemon-def");
const typeInputed = document.querySelector("#add-pokemon-type");

// Element du dom destiné à select le bouton pour ajouter un pokemon
const buttonAddPokemon = document.querySelector("#add-button");

buttonAddPokemon.addEventListener('click', function (){
	if (nameInputed.value.length==0 || habitatInputed.value.length==0 || atkInputed.value.length==0 || defInputed.value.length==0 || typeInputed.value.length==0){
		alert("Please fill all fields to proceed.");
	}
	else{
		let addPokemonData={
			nom:nameInputed.value,
			habitat:habitatInputed.value,
			attaque:atkInputed.value,
			defense:defInputed.value,
			type:typeInputed.value,
		};

		let addPokemonHeaders={
			'Accept' : 'application/json',
			'Content-Type':'application/json'
		};

		fetch('http://127.0.0.1:8080/api/pokemons', {method:"POST",headers:addPokemonHeaders,body:JSON.stringify(addPokemonData)})
			.then(res => console.log(res))

		location.reload();
	}
})

// --------- DELETE POKEMON BY ID ---------

// Element du dom destiné à select l'id inputed
const idInputedForDeletion = document.querySelector("#deleteById");

// Element du dom destiné à select le bouton pour delete by id un pokemon
const buttonDeleteById = document.querySelector("#delete-button");

buttonDeleteById.addEventListener('click', function () {
	if (idInputedForDeletion.value.length==0)
		alert("Please input a valid ID before deleting.");
	else{
		fetch(`http://127.0.0.1:8080/api/pokemons/${idInputedForDeletion.value}`, {method:'DELETE',mode:'cors'})
			.then(res => console.log(res))

		location.reload();
	}
})

// --------- DELETE POKEMON BY ID ---------

const buttonReload = document.querySelector("#reload-button");

buttonReload.addEventListener('click', function (){
	//showAllPokemons();
	location.reload();
})














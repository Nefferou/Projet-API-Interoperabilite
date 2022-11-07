// Tableau contenant les types
const types = ['FEU', 'ACIER', 'ROCHE', 'PLANTE', 'EAU', 'FEE', 'LUMIERE', 'TENEBRES', 'ELECTRIQUE'];

// Element du dom destiné à lister les types
const types_list_dom = document.querySelector(".types-list");

// Element du dom destiné à lister les pokémons
const pokemons_table_dom = document.querySelector(".pokemons-table-body");

// Affichage de chaque type dans la liste
types.forEach((type) => {
	types_list_dom.innerHTML += `<li class="typeList">${type}</li>`;
})

// Element du dom destiné à select les types de la liste
const selectTypeList = document.querySelectorAll(".typeList");

// Affichage des pokemons en fonction du type selectionné
selectTypeList.forEach(function (element) {
	element.addEventListener('click', function () {
		pokemons_table_dom.innerHTML=``;
		fetch('http://127.0.0.1:8080/api/pokemons', {mode: 'cors'})
			.then(res => res.json()).then(data => {
			// Affichage de chaque pokémon dans la table
			data.forEach((pokemon) => {
				if (pokemon.type == element.innerText) {
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
				}
			});
		})
	})
})


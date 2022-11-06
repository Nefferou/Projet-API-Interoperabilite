// Tableau contenant les types
const types = ['Titi', 'Toto', 'Tata', 'Tete', 'Tutu'];

// Element du dom destiné à lister les types
const types_list_dom = document.querySelector(".types-list");

// Affichage de chaque type dans la liste
types.forEach((type) => {
	types_list_dom.innerHTML += `<li>${type}</li>`;
});

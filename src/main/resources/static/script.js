document.addEventListener("DOMContentLoaded", function () {
    loadPeople();

    document.getElementById('personForm').addEventListener('submit', function (e) {
        e.preventDefault();
        savePerson();
    });
});

// Carregar lista de pessoas
function loadPeople() {
    fetch('/people')
        .then(response => response.json())
        .then(data => {
            const peopleList = document.getElementById('peopleList');
            peopleList.innerHTML = '';

            data.forEach(person => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${person.id}</td>
                    <td>${person.name}</td>
                    <td>${person.phone}</td>
                    <td>${person.email}</td>
                    <td>${person.cpf}</td>
                    <td>${person.age}</td>
                    <td>
                        <button class="edit-btn" onclick="editPerson(${person.id})">Editar</button>
                        <button class="delete-btn" onclick="deletePerson(${person.id})">Excluir</button>
                    </td>
                `;
                peopleList.appendChild(row);
            });
        });
}

// Salvar ou atualizar pessoa
function savePerson() {
    const id = document.getElementById('id').value;
    const person = {
        name: document.getElementById('name').value,
        phone: document.getElementById('phone').value,
        email: document.getElementById('email').value,
        cpf: document.getElementById('cpf').value,
        password: document.getElementById('password').value,
        age: document.getElementById('age').value
    };

    const method = id ? 'PUT' : 'POST';
    const url = id ? `/people/${id}` : '/people';

    fetch(url, {
        method: method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(person)
    }).then(() => {
        loadPeople();
        document.getElementById('personForm').reset();
    });
}

// Editar pessoa
function editPerson(id) {
    fetch(`/people/${id}`)
        .then(response => response.json())
        .then(person => {
            document.getElementById('id').value = person.id;
            document.getElementById('name').value = person.name;
            document.getElementById('phone').value = person.phone;
            document.getElementById('email').value = person.email;
            document.getElementById('cpf').value = person.cpf;
            document.getElementById('password').value = person.password;
            document.getElementById('age').value = person.age;
        });
}

// Deletar pessoa
function deletePerson(id) {
    fetch(`/people/${id}`, {
        method: 'DELETE'
    }).then(() => {
        loadPeople();
    });
}
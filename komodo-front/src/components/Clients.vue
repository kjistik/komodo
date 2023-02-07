<template>
    <div class="container-sm">

        <table class="table table-dark table-striped">

            <thead>
                <tr scope="row">
                    <th scope="col">Nombre</th>
                    <th scope="col">Correo</th>
                    <th scope="col">Teléfono</th>
                    <th scope="col">Localidad</th>
                    <th scope="col">Dirección</th>
                </tr>
            </thead>

            <tbody>

                <tr v-for="client of clients" scope="row">

                    <td scope="col">{{ client.client_name }} {{ client.client_lastName }}</td>
                    <td scope="col">{{ client.client_mail }}</td>
                    <td scope="col">{{ client.client_phone }}</td>
                    <td scope="col">{{ client.client_city }}</td>
                    <td scope="col">{{ client.client_adress }}</td>
                    <button class="btn btn-secondary">Editar cliente</button>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<style>
table,
thead,
tr,
th,
td {
    color: white;
}

a {
    color: white;
    text-decoration: none;
}

a:hover {
    color: burlywood;
}
</style>

<script>


export default {
    
    name: 'clients',
    methods: {
        async getClients() {
            fetch('http://localhost:8080/api/clientes/todos')
                .then((response) => response.json())
                .then((data) => ((this.clients = data)));
        }
    },
    data() {
        return {
            clients: null,
            
        }
    },
    mounted() {
        this.getClients()
    }
}
</script>
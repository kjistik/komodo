<template>
    <div class="container-sm col-10 self-align-around">
        <h5 class="beginning">Clientes</h5>
        <router-link to=/clients/create><button scope="row" class="btn btn-secondary container col-2">Añadir
                cliente</button></router-link>
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
                    <td scope="col">{{ client.client_address }}</td>
                    <router-link :to="'/clients/edit/'+ client.id_clients"><button class="btn btn-secondary">Editar
                            cliente</button></router-link>
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

.beginning {
    margin-top: 50px;
}
</style>

<script>

import router from '@/router';

export default {

    name: 'clients',
    methods: {
        updateURL(id) {
            this.url = "/clients/edit/" + id
            router.replace(this.url)
        },
        createURL() {
            router.replace('/clients/create')
        },
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
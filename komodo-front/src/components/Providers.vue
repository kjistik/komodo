<template>
    <div class="container-sm col-10 self-align-around">
        <h5 class="beginning">Proveedores</h5>
        <router-link to=/clients/create><button scope="row" class="btn btn-secondary container col-2">Añadir
                proveedor</button></router-link>
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
                <tr v-for="p of providers" scope="row">
                    <td scope="col">{{ p.provider_name }}</td>
                    <td scope="col">{{ p.provider_mail }}</td>
                    <td scope="col">{{ p.provider_phone }}</td>
                    <td scope="col">{{ p.provider_city }}</td>
                    <td scope="col">{{ p.provider_address }}</td>
                    <router-link :to="'/clients/edit/'+ p.id_provider"><button class="btn btn-secondary">Editar
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

    name: 'providers',
    methods: {
        async getProviders() {
            fetch('http://localhost:8080/api/proveedores/todos')
                .then((response) => response.json())
                .then((data) => ((this.providers = data)));
        }
    },
    data() {
        return {
            providers: null,

        }
    },
    mounted() {
        this.getProviders()
    }
}
</script>
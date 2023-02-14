<template>
    <div class="container-fluid col-sm-6 self-align-around">

        <div class="row div">
            <h5>Nuevo cliente</h5>
            <form @submit.prevent="submit()" class="form-group form-group-sm">
                <label class="col-sm-1" for="nombre">Nombre: </label><input required v-model="client.client_name"
                    class="col-lg-3 form-control form-control-sm" type="text" placeholder="" id="nombre">
                <span> <label class="col-sm-1 input-item" for="apellido">Apellido: </label><input required
                        v-model="client.client_lastName" class="col-lg-3 form-control form-control-sm" type="text"
                        placeholder="" id="apellido"></span>
                <span> <label class="form-label input-item" for="correo">Correo: </label><input
                        v-model="client.client_mail" class="col-sm-3 form-control form-control-sm" type="email"
                        placeholder="correo@ejemplo.com" id="correo"></span>
                <span> <label class="form-label input-item" for="telefono">Teléfono: </label><input
                        v-model="client.client_phone" class="col-sm-3 form-control form-control-sm" type="text"
                        min-length="9" max-length="10" pattern="[0-9]{9,10}" placeholder="0000 000000"
                        id="telefono"></span>
                <span> <label class="form-label input-item" for="ciudad">Localidad: </label><input required
                        v-model="client.client_city" class="col-sm-3 form-control form-control-sm" type="text"
                        placeholder="ej: Los Quirquinchos" id="city"></span>
                <span> <label class="form-label input-item" for="direccion">Dirección: </label><input
                        v-model="client.client_adress" class="col-sm-3 form-control last form-control-sm" type="text"
                        placeholder="ej: Borgarino 126" id="direccion"></span>
                <button class="btn btn-secondary last" type="submit">Crear</button> <button
                    class="last btn btn-secondary" @click="back()">Volver</button>

            </form>

        </div>
    </div>
</template>

<script>

import router from '@/router';


export default {
    name: 'CreateClients',
    data() {
        return {
            client: {
                active: true,
                client_adress: null,
                client_city: null,
                client_lastName: null,
                client_mail: null,
                client_name: null,
                client_phone: null,
                id_clients: null
            },
            name: null,
            lastName: null,
            mail: null,
            phone: null,
            city: null,
            adress: null
        }
    },
    methods: {
        submit() {
            fetch('http://localhost:8080/api/clientes/nuevo', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(this.client)
            })
            this.back()
        },
        back() {
            router.back()

        }
    }
}
</script>
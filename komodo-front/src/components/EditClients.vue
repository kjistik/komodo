<template>
    <div class="container-fluid col-sm-6 self-align-start">
        <section class="row" v-if="client">
            <h5 class="beginning">Cliente</h5>
            <span>Nombre completo: {{ client.client_name }} {{ client.client_lastName }}</span>
            <span>Correo: {{ client.client_mail }}</span>
            <span>Teléfono: {{ client.client_phone }}</span>
            <span v-if="client.client_city && client.client_adress">Dirección: {{ client.client_city }},
                {{ client.client_adress }}</span>
            <span v-else-if="client.client_city && !client.client_adress">Localidad: {{ client.client_city }}</span>
        </section>

        <div class="row div">
            <h5>Editar</h5>
            <form @submit="edit()" class="form-group form-group-sm">
                <label class="col-sm-1" for="nombre">Nombre: </label><input v-model="name"
                    class="col-lg-3 form-control form-control-sm" type="text" placeholder="" id="nombre">
                <span> <label class="col-sm-1 input-item" for="apellido">Apellido: </label><input v-model="lastName"
                        class="col-lg-3 form-control form-control-sm" type="text" placeholder="" id="apellido"></span>
                <span> <label class="form-label input-item" for="correo">Correo: </label><input v-model="mail"
                        class="col-sm-3 form-control form-control-sm" type="email" placeholder="correo@ejemplo.com"
                        id="correo"></span>
                <span> <label class="form-label input-item" for="telefono">Teléfono: </label><input v-model="phone"
                        class="col-sm-3 form-control form-control-sm" type="text" placeholder="0000 000000"
                        id="telefono"></span>
                <span> <label class="form-label input-item" for="ciudad">Localidad: </label><input v-model="city"
                        class="col-sm-3 form-control form-control-sm" type="text" placeholder="ej: Los Quirquinchos"
                        id="city"></span>
                <span> <label class="form-label input-item" for="direccion">Dirección: </label><input v-model="adress"
                        class="col-sm-3 form-control last form-control-sm" type="text" placeholder="ej: Borgarino 126"
                        id="direccion"></span>
            </form>
        </div>
    </div>
</template>

<style>
.div {
    margin-top: 50px
}

.input-item {
    margin-top: 25px;
}

.beginning {
    margin-top: 50px;
}

.last {
    margin-bottom: 100px;
}
</style>

<script>

export default {
    name: 'EditClients',
    data() {
        return {
            id: 0,
            client: null,
            name: '',
            lastName: '',
            city: '',
            adress: '',
            mail: '',
            phone: '',
        }
    },
    methods: {
        async getClient(id) {
            fetch('http://localhost:8080/api/clientes/cliente/' + this.$route.params.id)
                .then((response) => response.json())
                .then((data) => ((this.client = data), (console.log(data))));
        },
        changeClient() {
            fetch('http://localhost:8080/api/clients/change/'+this.id)
        }
    },
    created() {
        this.id = this.$route.params.id;
    },
    mounted() {
        this.getClient()
    },
}
</script>
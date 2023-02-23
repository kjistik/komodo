<template>
    <div class="container-sm col-10 self-align-around">
        <h5 class="beginning">Productos</h5>
        <router-link to=/products/create><button scope="row" class="btn btn-secondary container col-2">Crear
                producto</button></router-link>
        <table class="table table-dark table-striped">
            <thead>
                <tr scope="row">
                    <th scope="col">Nombre</th>
                    <th scope="col">Precio</th>
                    <th scope="col">Cantidad</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="product of products" scope="row">
                    <td scope="col">{{ product.product_name }}</td>
                    <td scope="col">${{ product.product_ppu }}</td>
                    <td scope="col">{{ product.product_quantity }} {{ product.product_unit.unitsName }}</td>

                    <router-link :to="'/products/edit/' + product.id_product"><button class="btn btn-secondary">Editar
                            Producto</button></router-link>
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

    name: 'products',
    methods: {
        async getProducts() {
            fetch('http://localhost:8080/api/productos/todos')
                .then((response) => response.json())
                .then((data) => ((this.products = data)))

        }
    },
    data() {
        return {
            products: null,
        }
    },
    created() {
        this.getProducts()
    }
}
</script>
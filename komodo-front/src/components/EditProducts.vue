<template>
    <div class="container-fluid col-sm-6 self-align-around">
        <section class="row" v-if="product">
            <h5 class="beginning">Producto</h5>

            <span>Producto: {{ product.product_name }}</span>
            <span>Precio: {{ product.product_ppu }}</span>
            <span>Cantidad: {{ product.product_quantity }} {{ product.product_unit.unitsName }}</span>
        </section>

        <div class="row div">
            <h5>Editar</h5>
            <form @submit.prevent="edit()" class="form-group form-group-sm">
                <label class="col-sm-1" for="nombre">Producto: </label><input
                    placeholder='Perfume para ropa "Saphirus" lavanda x250ml' v-model="product_name"
                    class="col-lg-3 form-control form-control-sm" type="text" id="nombre">
                <span> <label class="form-label input-item" for="precio">Precio: </label><input placeholder="350.00"
                        v-model="product_ppu" class="col-sm-3 form-control form-control-sm" type="text"
                        id="precio"></span>
                <span> <label class="form-label input-item" for="cantidad">Cantidad: </label><input
                        v-model="product_quantity" class="col-sm-3 form-control form-control-sm" type="text"
                        min-length="9" max-length="10" pattern="[0-9]{1,10}" id="cantidad"></span>
                <span><label for="select" class="form-label input-item">Unidades:</label><select v-model="product_unit"
                        class="last col-sm-3 form-control-3 form-control-sm" id="select">
                        <option v-for="unit of units" :value="unit">{{ unit.unitsName }}</option>
                    </select>
                </span>
                <br>
                <button class="btn btn-secondary last" type="submit">Editar</button> <button
                    class="last btn btn-secondary" @click="back()">Volver</button>

            </form>
        </div>
    </div>
</template>

<style>
select {
    margin-left: 20px
}
</style>

<script>

import router from '@/router';

export default {
    name: 'EditProducts',
    created() {
        this.id = this.$route.params.id;
        this.getUnits()
        this.getProduct()
    },
    mounted() {
        this.id_product = this.id
    },
    methods: {
        async getProduct(id) {
            fetch('http://localhost:8080/api/productos/producto/' + this.$route.params.id)
                .then((response) => response.json())
                .then((data) => ((this.product = data), (console.log(data))));
        },
        async getUnits() {
            fetch('http://localhost:8080/api/unidades/todos')
                .then((response) => response.json())
                .then((data) => ((this.units = data), (console.log(data))));
        },
        edit() {
            if (this.product_name)
                this.product.product_name = this.product_name
            if (this.product_ppu)
                this.product.product_ppu = this.product_ppu
            if (this.product_quantity)
                this.product.product_quantity = this.product_quantity
            if (this.product_unit)
                this.product.product_unit = this.product_unit
            console.log(this.product)

            fetch('http://localhost:8080/api/productos/cambiar/' + this.id, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(this.product)
            })
            this.back()
        },
        back() {
            router.back()
        }
    },
    data() {
        return {
            product: undefined,
            product_name: null,
            product_ppu: null,
            product_quantity: null,
            product_unit: null,
            active: true,
            id_product: null,
            units: null
        }
    }
}

</script>
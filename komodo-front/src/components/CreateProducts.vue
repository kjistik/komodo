<script>
export default {
    name: 'CreateProducts',
    data() {
        return {
            product: {
                id_product: null,
                active: true,
                product_name: '',
                product_ppu: null,
                product_quantity: null,
                product_unit: null
            },
            units: null,
            product_unit: null
        }
    },
    methods: {
        getUnits() {
            fetch('http://localhost:8080/api/unidades/todos')
                .then((response) => response.json())
                .then((data) => ((this.units = data), (console.log(data))));
        },
        submit() {
            fetch('http://localhost:8080/api/productos/nuevo', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(this.product)
            })
        }
    },
    created() {
        this.getUnits()
    }
}
</script>
<template>

    <div class="container-fluid col-sm-6 self-align-around">

        <div class="row div">
            <h5>Nuevo cliente</h5>
            <form @submit="submit()" class="form-group form-group-sm">
                <label class="col-sm-1" for="nombre">Nombre: </label><input required v-model="product.product_name"
                    class="col-lg-3 form-control form-control-sm" type="text"
                    placeholder='Perfume para ropa "Saphirus" lavanda x250ml' id="nombre">
                <span> <label class="col-sm-1 input-item" for="cantidad">Cantidad: </label><input required
                        v-model="product.product_quantity" class="col-lg-3 form-control form-control-sm" type="text"
                        min-length="9" max-length="10" pattern="[0-9]{1,10}" placeholder="100" id="cantidad"></span>
                <span> <label class="form-label input-item" for="precio">Precio: </label><input
                        v-model="product.product_ppu" class="col-sm-3 form-control form-control-sm" type="text"
                        placeholder="350.0" id="precio"></span>
                <span><label for="select" class="form-label input-item">Unidades:</label><select required
                        v-model=product.product_unit class="last col-sm-3 form-control-3 form-control-sm" id="select">
                        <option v-for="unit of units" :value="unit">{{ unit.unitsName }}</option>
                    </select>
                </span>
                <br>
                <button class="btn btn-secondary last" type="submit">Crear</button> <button
                    class="last btn btn-secondary" @click="back()">Volver</button>

            </form>

        </div>
    </div>

</template>
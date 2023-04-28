<template>
    <div class="background">
        <nav>
            <div class="margin"></div>
            <RouterLink class="image" to="/home">
                <img src="@/assets/komodo-cropped.png" alt="project logo">
            </RouterLink>
            <ul>
                <RouterLink to="/asd" class="link">Clientes</RouterLink>
                <RouterLink to="/ayuda" class="link">Proveedores</RouterLink>
                <RouterLink to="/asd" class="link">Productos</RouterLink>
                <RouterLink to="/ayuda" class="link">Órdenes</RouterLink>
            </ul>
        </nav>
    </div>
</template>

<script>
export default {
    data() {
    },
    methods: {

    }
}
</script>

<style>
ul {
    display: flex;
    flex-wrap: wrap;
    flex-direction: row;
    align-items: center;
    justify-content: space-evenly;
    margin: 0;
    padding: 0;
    max-width: 70%;
    height: 100%;
}

nav {
    display: flex;
    justify-content: space-between;
    align-items: center;

}

.link {
    display: flex;
    padding: 20px 30px;
    height: 100%;
    justify-content: center;
    border-radius: 15%;
}

.link:hover {
    background-color: rgba(255, 255, 255, 0.377);
}

.link:active {
    background-color: cadetblue;
}

.selected {
    background-color: rgba(255, 255, 255, 0.377);
}

.image {
    max-width: 20%;
    flex: 0 0 auto;
    max-height: 100%;
}

img {
    width: 100%;
    height: 100%;
}

.link {
    color: white;
    text-decoration: none;
}


ul,
.background {
    width: 100%;
    height: 100%;

}

.background {
    background-color: #2C3E50;
}
</style>
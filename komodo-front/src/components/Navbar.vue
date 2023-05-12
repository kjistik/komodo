<template>
    <div class="nav">
        <div class=space></div>
        <a href="https://github.com/kjistik">
            <img src="../assets/komodo-logo.png" alt="logo">
        </a>
        <ul class="links">
            <div>
                <li>Clientes</li>
            </div>
            <div>
                <li>Productos</li>
            </div>
            <div>
                <li>Proveedores</li>
            </div>
            <div>
                <li>Pedidos</li>
            </div>
        </ul>
    </div>
</template>
<style>
a {
    height: 80px;
}

.space {
    width: 1vw;
}

ul {
    list-style: none;
}

.links {
    display: flex;
    min-height: 80px;
    height: 100%;
    width: 80%;
    justify-content: space-evenly;
    text-decoration: none;
    align-items: center;
}

img {
    height: 80px;
}

.nav {
    background-color: #000000;
    width: 100vw;
    min-height: 80px;
    display: flex;
    justify-content: space-between;

}
</style>

<script>
export default {
  name: 'Nav-bar'
}
</script>

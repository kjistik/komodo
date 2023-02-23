<template>




  <div class="bg-dark container-fluid text-white">

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        <router-link to="/clients" class="link navbar-brand">Komodo</router-link>
        <button class="navbar-toggler justify-self-right" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"><img src="./assets/icons/bars-solid.svg"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
          <ul class="navbar-nav">
            <li class="nav-item">
              <router-link class="nav-link link active" aria-current="page" to="/clients">Clientes</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link link" to="/products" >Productos</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link link" to="/providers" >Proveedores</router-link>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Ventas y pedidos
              </a>
              <ul class="dropdown-menu dropdown-menu-dark">
                <li><a class="dropdown-item" href="#">Ventas</a></li>
                <li><a class="dropdown-item" href="#">Movimientos</a></li>
                <li><a class="dropdown-item" href="#">Pedidos</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <router-view />
  </div>
</template>

<style>
span {
  color: white;
  text-decoration-line: none;
}
.link{
  color:white
}
</style>

import { createRouter, createWebHistory } from 'vue-router'
import ClientsView from '../views/ClientsView.vue'
import EditClientsView from '../views/EditClientsView.vue'
import CreateClientsView from '../views/CreateClientsView.vue'
import ProductsView from '../views/ProductsView.vue'
import EditProductsView from '../views/EditProductsView.vue'
import CreateProductsView from '../views/CreateProductsView.vue'
const routes = [
  {
    path: '/clients',
    name: 'clients',
    component: ClientsView
  },
  {
    path: '/clients/edit/:id',
    name: 'EditClients',
    component: EditClientsView
  },
  {
    path: '/products',
    name: 'products',
    component: ProductsView
  },
  {
    path: '/clients/create',
    name: 'CreateClient',
    component: CreateClientsView
  },
  {
    path: '/products/edit/:id',
    name: 'EditProducts',
    component: EditProductsView
  },
  {
    path: '/products/create',
    name: 'CreateProducts',
    component: CreateProductsView
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router

import { createRouter, createWebHistory } from 'vue-router'
import ClientsView from '../views/ClientsView.vue'
import EditClientsView from '../views/EditClientsView.vue'
import CreateClientsView from '../views/CreateClientsView.vue'
import ProductsView from '../views/ProductsView.vue'
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

  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router

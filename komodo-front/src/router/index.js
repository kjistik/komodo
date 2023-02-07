import { createRouter, createWebHistory } from 'vue-router'
import ClientsView from '../views/ClientsView.vue'
import EditClientsView from '../views/EditClientsView'
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
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router

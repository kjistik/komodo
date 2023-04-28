import { createRouter, createWebHashHistory } from 'vue-router'
import IntroComponent from '@/components/IntroComponent.vue'

const routes = [
  {
    path: '/home',
    name: 'home',
    component: IntroComponent
  }, {
    path: '',
    redirect: '/home'
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

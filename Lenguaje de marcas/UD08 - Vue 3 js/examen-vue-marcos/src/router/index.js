import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/ejercicio1',
      name: 'ejercicio1',
      component: () => import('../views/Ejercicio1View.vue')
    },
    {
      path: '/ejercicio2',
      name: 'ejercicio2',
      component: () => import('../views/ejercicioDosView.vue')
    },
    {
      path: '/ejercicio3',
      name: 'ejercicio3',
      component: () => import('../views/ejercicioTresView.vue')
    }
  ]
});

export default router;

<script setup>
import { ref } from 'vue';

const todos = ref([
  { id: 1, title: 'Tarea 1', completed: false },
  { id: 2, title: 'Tarea 2', completed: false },
  { id: 3, title: 'Tarea 3', completed: true }
]);

const toggleCompletion = (todo) => {
  todo.completed = !todo.completed;
};
</script>

<template>
  <div>
    <!-- Utiliza la directiva v-for para mostrar la lista de tareas en un ul -->
    <ul>
      <li v-for="todo in todos" :key="todo.id" class="mb-2">
        <span :class="{ completed: todo.completed }">{{ todo.title }}</span>
        <!-- Añade un botón a cada tarea que permita marcarla como completada o incompleta -->
        <button @click="toggleCompletion(todo)" class="btn btn-primary btn-sm ms-2">
          {{ todo.completed ? 'Marcar como incompleta' : 'Marcar como completada' }}
        </button>
      </li>
    </ul>
  </div>
</template>

<style scoped>
/* Estilo para las tareas completadas */
.completed {
  text-decoration: line-through;
}
</style>

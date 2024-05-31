<script setup>
    import axios from 'axios';
    import { ref, onMounted } from 'vue';
    import { RouterLink } from 'vue-router';
    import Spinner from '../components/Spinner.vue';

    const listaTareas = ref([]);
    const loading = ref(true);

    const getData = async () => {
        try {
            const { data } = await axios.get('https://jsonplaceholder.typicode.com/todos');
            console.log(data);
            listaTareas.value = data;
        } catch (error) {
            console.log(error);
        } finally {
            setTimeout(() => {
                loading.value = false;
            }, 2000);
        }
    }

    onMounted(() => {
        getData();
    });
</script>
<template>
    <div>
        <h1>Segunda Parte</h1>
        <div v-if="loading">
        <Spinner />
        </div>
            <div v-else>
            <ul>
                <li v-for="i in listaTareas" :key="i.id">
                <router-link :to="`/tareas/${i.id}`">{{ i.title }}</router-link>
                </li>
            </ul>
        </div>
    </div>
</template>

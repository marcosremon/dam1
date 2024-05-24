<script setup>
    // Importamos las funciones y componentes necesarios desde Vue y nuestros componentes personalizados.
    import { ref } from 'vue';
    import BlogPost from './components/BlogPost.vue';
    import ButtonCounter from './components/ButtonCounter.vue';
    import PaginatePost from './components/PaginatePost.vue';
    import LoadingSpinner from './components/LoadingSpinner.vue';

    // 1 - Creamos un array reactivo para almacenar los posts.
    const posts = ref([]);
    
    // No todas las variables tienen que ser reactivas. Aquí definimos cuántos posts mostrar por página.
    const postXPagina = 10;
    
    // Variables reactivas para manejar el rango de posts visibles (inicio y fin).
    const inicio = ref(0);
    const fin = ref(postXPagina);

    // Variable reactiva para manejar el estado de carga.
    const loading = ref(true);
    
    // Variable reactiva para almacenar el post favorito.
    const favorito = ref('');

    // Función para cambiar el post favorito.
    const cambiarFavorito = (post) => {
        favorito.value = post;
    }

    // Función para manejar la acción de ir a la página siguiente.
    const siguiente = () => {
        // Actualizamos el rango de inicio y fin.
        inicio.value = inicio.value + postXPagina;
        fin.value = fin.value + postXPagina;
    };
    
    // Función para manejar la acción de ir a la página anterior.
    const anterior = () => {
        // Actualizamos el rango de inicio y fin.
        inicio.value = inicio.value - postXPagina;
        fin.value = fin.value - postXPagina;
    };

    // Fetch para obtener los posts desde una API.
    fetch('https://jsonplaceholder.typicode.com/posts')
        .then(res => res.json())
        // Almacenamos los datos obtenidos en nuestro array reactivo de posts.
        .then((data) => posts.value = data)
        // Finalmente, actualizamos el estado de carga después de un pequeño retraso.
        .finally(() => {
        setTimeout(() => {
            loading.value = false;
        }, 1000)
        });
    // Como tenemos todos los posts en el componente principal, implementamos toda la lógica aquí (la de pulsar el botón, sumar, etc).
</script>

<template>
    <!-- Mostramos un spinner de carga mientras loading sea verdadero. -->
    <LoadingSpinner v-if="loading"/>
    <div class="container" v-else>
        <h1>Componentes</h1>
        <h2>Mi Post Favorito: {{ favorito }}</h2>

        <!-- Componente de paginación con métodos personalizados para manejar las acciones de siguiente y anterior. -->
        <PaginatePost class="mb-2" @siguiente="siguiente" @anterior="anterior" :inicio="inicio" :fin="fin" :tamanio="posts.length" />
        
        <!-- Usamos slice para mostrar solo los posts en el rango actual de inicio a fin. -->
        <BlogPost v-for="post in posts.slice(inicio, fin)" 
        :key="post.id" 
        :titulo="post.title" 
        :id="post.id" 
        :body="post.body"
        @cambiarNombreFavorito="cambiarFavorito"/>
    </div>
</template>
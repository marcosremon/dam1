<script setup>
import { ref } from 'vue';
import BlogPost from './components/BlogPost.vue';
import ButtonCounter from './components/ButtonCounter.vue';
    
    //este setup que falta ya hace la siguiente exportacion por defecto
    //export default {
    //    setup(){
    //        const contador = ref(0);
    //        const incrementar = () => contador.value++;
    //        return {
    //            contador, incrementar
    //        }        
    //    }
    //}

    //const contador = ref(0);
    //const incrementar = () => contador.value++;

    const posts = ref([
        { titulo:'Post 01', id: 1, body:'descripcion 01' },
        { titulo:'Post 02', id: 2, body:'descripcion 02' },
        { titulo:'Post 03', id: 3, body:'descripcion 03' },
        { titulo:'Post 04', id: 4, body:'descripcion 04' },
        { titulo:'Post 05', id: 5, body:'descripcion 05' },
        { titulo:'Post 06', id: 6,  },
    ]);
</script>
<template>
    <div class="container">
        <h1>Componentes</h1>
        <ButtonCounter />
        <!-- <BlogPost titulo="Post 01" :id="1" body="esto es mi descripcion 01" colorText="primary"/>
        <BlogPost titulo="Post 02" :id="2" body="esto es mi descripcion 02" colorText="warning"/>
        <BlogPost titulo="Post 03" :id="3" body="esto es mi descripcion 03" colorText="danger"/>
        <BlogPost titulo="Post 04" :id="4" /> -->
        <BlogPost v-for="post in posts" :key="post.id" :titulo="post.titulo" :id="post.id" :body="post.body"/>
    </div>    
    <!-- <button @click="incrementar">{{ contador }}</button> -->
</template>